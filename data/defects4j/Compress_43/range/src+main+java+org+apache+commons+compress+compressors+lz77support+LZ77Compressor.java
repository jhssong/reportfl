{
  "filepath": "/tmp/Compress-43b/src/main/java/org/apache/commons/compress/compressors/lz77support/LZ77Compressor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZ77Compressor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 85,
      "end_line": 536,
      "comment": "\n * Helper class for compression algorithms that use the ideas of LZ77.\n *\n * \u003cp\u003eMost LZ77 derived algorithms split input data into blocks of\n * uncompressed data (called literal blocks) and back-references\n * (pairs of offsets and lengths) that state \"add \u003ccode\u003elength\u003c/code\u003e\n * bytes that are the same as those already written starting\n * \u003ccode\u003eoffset\u003c/code\u003e bytes before the current position. The details\n * of how those blocks and back-references are encoded are quite\n * different between the algorithms and some algorithms perform\n * additional steps (Huffman encoding in the case of DEFLATE for\n * example).\u003c/p\u003e\n *\n * \u003cp\u003eThis class attempts to extract the core logic - finding\n * back-references - so it can be re-used. It follows the algorithm\n * explained in section 4 of RFC 1951 (DEFLATE) and currently doesn\u0027t\n * implement the \"lazy match\" optimization. The three-byte hash\n * function used in this class is the same as the one used by zlib and\n * InfoZIP\u0027s ZIP implementation of DEFLATE. The whole class is\n * strongly inspired by InfoZIP\u0027s implementation.\u003c/p\u003e\n *\n * \u003cp\u003eLZ77 is used vaguely here (as well as many other places that\n * talk about it :-), LZSS would likely be closer to the truth but\n * LZ77 has become the synonym for a whole family of algorithms.\u003c/p\u003e\n *\n * \u003cp\u003eThe API consists of a compressor that is fed \u003ccode\u003ebyte\u003c/code\u003es\n * and emits {@link Block}s to a registered callback where the blocks\n * represent either {@link LiteralBlock literal blocks}, {@link\n * BackReference back-references} or {@link EOD end of data\n * markers}. In order to ensure the callback receives all information,\n * the {@code #finish} method must be used once all data has been fed\n * into the compressor.\u003c/p\u003e\n *\n * \u003cp\u003eSeveral parameters influence the outcome of the \"compression\":\u003c/p\u003e\n * \u003cdl\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003ewindowSize\u003c/code\u003e\u003c/dt\u003e \u003cdd\u003ethe size of the sliding\n *  window, must be a power of two - this determines the maximum\n *  offset a back-reference can take. The compressor maintains a\n *  buffer of twice of \u003ccode\u003ewindowSize\u003c/code\u003e - real world values are\n *  in the area of 32k.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003eminBackReferenceLength\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMinimal length of a back-reference found. A true minimum of 3 is\n *  hard-coded inside of this implemention but bigger lengths can be\n *  configured.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003emaxBackReferenceLength\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMaximal length of a back-reference found.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003emaxOffset\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMaximal offset of a back-reference.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003emaxLiteralLength\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMaximal length of a literal block.\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @see \"https://tools.ietf.org/html/rfc1951#section-4\"\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "class_interface",
      "name": "Block",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Base class representing things the compressor may emit.\n     "
    },
    {
      "type": "class_interface",
      "name": "LiteralBlock",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block"
      ],
      "begin_line": 99,
      "end_line": 136,
      "comment": "\n     * Represents a literal block of data.\n     *\n     * \u003cp\u003eFor performance reasons this encapsulates the real data, not\n     * a copy of it. Don\u0027t modify the data and process it inside of\n     * {@link Callback#accept} immediately as it will get overwritten\n     * sooner or later.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset",
        "length"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.LiteralBlock(byte[], int, int)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 29)",
        "(line 104,col 13)-(line 104,col 33)",
        "(line 105,col 13)-(line 105,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getData()",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n         * The literal data.\n         *\n         * \u003cp\u003eThis returns a life view of the actual data in order to\n         * avoid copying, modify the array at your own risk.\u003c/p\u003e\n         * @return the data\n         ",
      "child_ranges": [
        "(line 115,col 13)-(line 115,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getOffset()",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n         * Offset into data where the literal block starts.\n         * @return the offset\n         ",
      "child_ranges": [
        "(line 122,col 13)-(line 122,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getLength()",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n         * Length of literal block.\n         * @return the length\n         ",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.toString()",
      "begin_line": 132,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BackReference",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block"
      ],
      "begin_line": 140,
      "end_line": 165,
      "comment": "\n     * Represents a back-reference.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offset",
        "length"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.BackReference(int, int)",
      "begin_line": 142,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 33)",
        "(line 144,col 13)-(line 144,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.getOffset()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n         * Provides the offset of the back-reference.\n         * @return the offset\n         ",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.getLength()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n         * Provides the length of the back-reference.\n         * @return the length\n         ",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.toString()",
      "begin_line": 161,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 163,col 13)-(line 163,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EOD",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n     * A simple \"we are done\" marker.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THE_EOD"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 180,
      "end_line": 187,
      "comment": "\n     * Callback invoked while the compressor processes data.\n     *\n     * \u003cp\u003eThe callback is invoked on the same thread that receives the\n     * bytes to compress and may be invoked multiple times during the\n     * execution of {@link #compress} or {@link #finish}.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback.accept(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block)",
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n         * Consumes a block.\n         * @param b the block to consume\n         * @throws IOException in case of an error\n         ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_OF_BYTES_IN_HASH"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_MATCH"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "params"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "window"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " the sliding window, twice as big as \"windowSize\" parameter"
    },
    {
      "type": "field",
      "varNames": [
        "head"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " the given hash."
    },
    {
      "type": "field",
      "varNames": [
        "prev"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " windowSize\"."
    },
    {
      "type": "field",
      "varNames": [
        "wMask"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " bit mask used when indexing into prev"
    },
    {
      "type": "field",
      "varNames": [
        "initialized"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPosition"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " the position inside of window that shall be encoded right now"
    },
    {
      "type": "field",
      "varNames": [
        "lookahead"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " currentPosition"
    },
    {
      "type": "field",
      "varNames": [
        "insertHash"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " the hash of the three bytes stating at the current position"
    },
    {
      "type": "field",
      "varNames": [
        "blockStart"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": " block starts (in case we are inside of a literal block)."
    },
    {
      "type": "field",
      "varNames": [
        "matchStart"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": " position of the current match"
    },
    {
      "type": "field",
      "varNames": [
        "missedInserts"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " data has been read"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LZ77Compressor(org.apache.commons.compress.compressors.lz77support.Parameters, org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback)",
      "begin_line": 234,
      "end_line": 250,
      "comment": "\n     * Initializes a compressor with parameters and a callback.\n     * @param params the parameters\n     * @param callback the callback\n     * @throws NullPointerException if either parameter is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 241,col 29)",
        "(line 242,col 9)-(line 242,col 33)",
        "(line 244,col 9)-(line 244,col 49)",
        "(line 245,col 9)-(line 245,col 37)",
        "(line 246,col 9)-(line 246,col 26)",
        "(line 247,col 9)-(line 247,col 34)",
        "(line 248,col 9)-(line 248,col 36)",
        "(line 249,col 9)-(line 249,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.compress(byte[])",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Feeds bytes into the compressor which in turn may emit zero or\n     * more blocks to the callback during the execution of this\n     * method.\n     * @param data the data to compress - must not be null\n     * @throws IOException if the callback throws an exception\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.compress(byte[], int, int)",
      "begin_line": 272,
      "end_line": 282,
      "comment": "\n     * Feeds bytes into the compressor which in turn may emit zero or\n     * more blocks to the callback during the execution of this\n     * method.\n     * @param data the data to compress - must not be null\n     * @param off the start offset of the data\n     * @param len the number of bytes to compress\n     * @throws IOException if the callback throws an exception\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 49)",
        "(line 274,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.finish()",
      "begin_line": 293,
      "end_line": 299,
      "comment": "\n     * Tells the compressor to process all remaining data and signal\n     * end of data to the callback.\n     *\n     * \u003cp\u003eThe compressor will in turn emit at least one block ({@link\n     * EOD}) but potentially multiple blocks to the callback during\n     * the execution of this method.\u003c/p\u003e\n     * @throws IOException if the callback throws an exception\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 298,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.prefill(byte[])",
      "begin_line": 312,
      "end_line": 332,
      "comment": "\n     * Adds some initial data to fill the window with.\n     *\n     * \u003cp\u003eThis is used if the stream has been cut into blocks and\n     * back-references of one block may refer to data of the previous\n     * block(s). One such example is the LZ4 frame format using block\n     * dependency.\u003c/p\u003e\n     *\n     * @param data the data to fill the window with.\n     * @throws IllegalStateException if the compressor has already started to accept data\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 315,col 9)",
        "(line 318,col 9)-(line 318,col 70)",
        "(line 319,col 9)-(line 319,col 66)",
        "(line 321,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 335,
      "end_line": 335,
      "comment": " we use a 15 bit hashcode as calculated in updateHash"
    },
    {
      "type": "field",
      "varNames": [
        "HASH_MASK"
      ],
      "begin_line": 336,
      "end_line": 336,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "H_SHIFT"
      ],
      "begin_line": 337,
      "end_line": 337,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.nextHash(int, byte)",
      "begin_line": 347,
      "end_line": 350,
      "comment": "\n     * Assumes we are calculating the hash for three consecutive bytes\n     * as a rolling hash, i.e. for bytes ABCD if H is the hash of ABC\n     * the new hash for BCD is nextHash(H, D).\n     *\n     * \u003cp\u003eThe hash is shifted by five bits on each update so all\n     * effects of A have been swapped after the third update.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 44)",
        "(line 349,col 9)-(line 349,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.doCompress(byte[], int, int)",
      "begin_line": 353,
      "end_line": 366,
      "comment": " performs the actual algorithm with the pre-condition len \u003c\u003d windowSize",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 68)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 78)",
        "(line 359,col 9)-(line 359,col 25)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.slide()",
      "begin_line": 368,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 49)",
        "(line 370,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 58)",
        "(line 375,col 9)-(line 375,col 33)",
        "(line 376,col 9)-(line 376,col 28)",
        "(line 377,col 9)-(line 377,col 28)",
        "(line 378,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.initialize()",
      "begin_line": 388,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.compress()",
      "begin_line": 395,
      "end_line": 434,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 64)",
        "(line 397,col 9)-(line 397,col 54)",
        "(line 398,col 9)-(line 398,col 68)",
        "(line 400,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.insertString(int)",
      "begin_line": 443,
      "end_line": 449,
      "comment": "\n     * Inserts the current three byte sequence into the dictionary and\n     * returns the previous head of the hash-chain.\n     *\n     * \u003cp\u003eUpdates \u003ccode\u003einsertHash\u003c/code\u003e and \u003ccode\u003eprev\u003c/code\u003e as a\n     * side effect.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 85)",
        "(line 445,col 9)-(line 445,col 40)",
        "(line 446,col 9)-(line 446,col 37)",
        "(line 447,col 9)-(line 447,col 31)",
        "(line 448,col 9)-(line 448,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.longestMatchForNextPosition(int)",
      "begin_line": 451,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 46)",
        "(line 454,col 9)-(line 454,col 46)",
        "(line 456,col 9)-(line 456,col 20)",
        "(line 457,col 9)-(line 457,col 26)",
        "(line 458,col 9)-(line 458,col 53)",
        "(line 459,col 9)-(line 459,col 63)",
        "(line 460,col 9)-(line 460,col 49)",
        "(line 462,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.insertStringsInMatch(int)",
      "begin_line": 476,
      "end_line": 485,
      "comment": "",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 88)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.catchUpMissedInserts()",
      "begin_line": 487,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 488,col 9)-(line 490,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.flushBackReference(int)",
      "begin_line": 493,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.flushLiteralBlock()",
      "begin_line": 497,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.longestMatch(int)",
      "begin_line": 509,
      "end_line": 535,
      "comment": "\n     * Searches the hash chain for real matches and returns the length\n     * of the longest match (0 if none were found) that isn\u0027t too far\n     * away (WRT maxOffset).\n     *\n     * \u003cp\u003eSets matchStart to the index of the start position of the\n     * longest match as a side effect.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 65)",
        "(line 511,col 9)-(line 511,col 47)",
        "(line 512,col 9)-(line 512,col 94)",
        "(line 513,col 9)-(line 513,col 82)",
        "(line 514,col 9)-(line 514,col 109)",
        "(line 515,col 9)-(line 515,col 60)",
        "(line 516,col 9)-(line 533,col 9)",
        "(line 534,col 9)-(line 534,col 34)"
      ]
    }
  ]
}