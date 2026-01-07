{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/lz77support/LZ77Compressor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZ77Compressor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 85,
      "end_line": 552,
      "comment": "\n * Helper class for compression algorithms that use the ideas of LZ77.\n *\n * \u003cp\u003eMost LZ77 derived algorithms split input data into blocks of\n * uncompressed data (called literal blocks) and back-references\n * (pairs of offsets and lengths) that state \"add \u003ccode\u003elength\u003c/code\u003e\n * bytes that are the same as those already written starting\n * \u003ccode\u003eoffset\u003c/code\u003e bytes before the current position. The details\n * of how those blocks and back-references are encoded are quite\n * different between the algorithms and some algorithms perform\n * additional steps (Huffman encoding in the case of DEFLATE for\n * example).\u003c/p\u003e\n *\n * \u003cp\u003eThis class attempts to extract the core logic - finding\n * back-references - so it can be re-used. It follows the algorithm\n * explained in section 4 of RFC 1951 (DEFLATE) and currently doesn\u0027t\n * implement the \"lazy match\" optimization. The three-byte hash\n * function used in this class is the same as the one used by zlib and\n * InfoZIP\u0027s ZIP implementation of DEFLATE. The whole class is\n * strongly inspired by InfoZIP\u0027s implementation.\u003c/p\u003e\n *\n * \u003cp\u003eLZ77 is used vaguely here (as well as many other places that\n * talk about it :-), LZSS would likely be closer to the truth but\n * LZ77 has become the synonym for a whole family of algorithms.\u003c/p\u003e\n *\n * \u003cp\u003eThe API consists of a compressor that is fed \u003ccode\u003ebyte\u003c/code\u003es\n * and emits {@link Block}s to a registered callback where the blocks\n * represent either {@link LiteralBlock literal blocks}, {@link\n * BackReference back-references} or {@link EOD end of data\n * markers}. In order to ensure the callback receives all information,\n * the {@code #finish} method must be used once all data has been fed\n * into the compressor.\u003c/p\u003e\n *\n * \u003cp\u003eSeveral parameters influence the outcome of the \"compression\":\u003c/p\u003e\n * \u003cdl\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003ewindowSize\u003c/code\u003e\u003c/dt\u003e \u003cdd\u003ethe size of the sliding\n *  window, must be a power of two - this determines the maximum\n *  offset a back-reference can take. The compressor maintains a\n *  buffer of twice of \u003ccode\u003ewindowSize\u003c/code\u003e - real world values are\n *  in the area of 32k.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003eminBackReferenceLength\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMinimal length of a back-reference found. A true minimum of 3 is\n *  hard-coded inside of this implemention but bigger lengths can be\n *  configured.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003emaxBackReferenceLength\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMaximal length of a back-reference found.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003emaxOffset\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMaximal offset of a back-reference.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003emaxLiteralLength\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMaximal length of a literal block.\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @see \"https://tools.ietf.org/html/rfc1951#section-4\"\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "class_interface",
      "name": "Block",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 88,
      "end_line": 94,
      "comment": " Base class representing blocks the compressor may emit. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block.getType()",
      "begin_line": 93,
      "end_line": 93,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "LiteralBlock",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block"
      ],
      "begin_line": 104,
      "end_line": 144,
      "comment": "\n     * Represents a literal block of data.\n     *\n     * \u003cp\u003eFor performance reasons this encapsulates the real data, not\n     * a copy of it. Don\u0027t modify the data and process it inside of\n     * {@link Callback#accept} immediately as it will get overwritten\n     * sooner or later.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset",
        "length"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.LiteralBlock(byte[], int, int)",
      "begin_line": 107,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 29)",
        "(line 109,col 13)-(line 109,col 33)",
        "(line 110,col 13)-(line 110,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getData()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n         * The literal data.\n         *\n         * \u003cp\u003eThis returns a life view of the actual data in order to\n         * avoid copying, modify the array at your own risk.\u003c/p\u003e\n         * @return the data\n         ",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getOffset()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n         * Offset into data where the literal block starts.\n         * @return the offset\n         ",
      "child_ranges": [
        "(line 127,col 13)-(line 127,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getLength()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n         * Length of literal block.\n         * @return the length\n         ",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getType()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.toString()",
      "begin_line": 140,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BackReference",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block"
      ],
      "begin_line": 149,
      "end_line": 177,
      "comment": "\n     * Represents a back-reference.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offset",
        "length"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.BackReference(int, int)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 152,col 13)-(line 152,col 33)",
        "(line 153,col 13)-(line 153,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.getOffset()",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n         * Provides the offset of the back-reference.\n         * @return the offset\n         ",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.getLength()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n         * Provides the length of the back-reference.\n         * @return the length\n         ",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.getType()",
      "begin_line": 169,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.toString()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EOD",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block"
      ],
      "begin_line": 180,
      "end_line": 185,
      "comment": " A simple \"we are done\" marker. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.EOD.getType()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "",
      "child_ranges": [
        "(line 183,col 13)-(line 183,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "THE_EOD"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 196,
      "end_line": 203,
      "comment": "\n     * Callback invoked while the compressor processes data.\n     *\n     * \u003cp\u003eThe callback is invoked on the same thread that receives the\n     * bytes to compress and may be invoked multiple times during the\n     * execution of {@link #compress} or {@link #finish}.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback.accept(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block)",
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n         * Consumes a block.\n         * @param b the block to consume\n         * @throws IOException in case of an error\n         ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_OF_BYTES_IN_HASH"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_MATCH"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "params"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "window"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " the sliding window, twice as big as \"windowSize\" parameter"
    },
    {
      "type": "field",
      "varNames": [
        "head"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " the given hash."
    },
    {
      "type": "field",
      "varNames": [
        "prev"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " windowSize\"."
    },
    {
      "type": "field",
      "varNames": [
        "wMask"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": " bit mask used when indexing into prev"
    },
    {
      "type": "field",
      "varNames": [
        "initialized"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPosition"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": " the position inside of window that shall be encoded right now"
    },
    {
      "type": "field",
      "varNames": [
        "lookahead"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": " currentPosition"
    },
    {
      "type": "field",
      "varNames": [
        "insertHash"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " the hash of the three bytes stating at the current position"
    },
    {
      "type": "field",
      "varNames": [
        "blockStart"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " block starts (in case we are inside of a literal block)."
    },
    {
      "type": "field",
      "varNames": [
        "matchStart"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " position of the current match"
    },
    {
      "type": "field",
      "varNames": [
        "missedInserts"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": " data has been read"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LZ77Compressor(org.apache.commons.compress.compressors.lz77support.Parameters, org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback)",
      "begin_line": 250,
      "end_line": 266,
      "comment": "\n     * Initializes a compressor with parameters and a callback.\n     * @param params the parameters\n     * @param callback the callback\n     * @throws NullPointerException if either parameter is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 257,col 9)-(line 257,col 29)",
        "(line 258,col 9)-(line 258,col 33)",
        "(line 260,col 9)-(line 260,col 49)",
        "(line 261,col 9)-(line 261,col 37)",
        "(line 262,col 9)-(line 262,col 26)",
        "(line 263,col 9)-(line 263,col 34)",
        "(line 264,col 9)-(line 264,col 36)",
        "(line 265,col 9)-(line 265,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.compress(byte[])",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Feeds bytes into the compressor which in turn may emit zero or\n     * more blocks to the callback during the execution of this\n     * method.\n     * @param data the data to compress - must not be null\n     * @throws IOException if the callback throws an exception\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.compress(byte[], int, int)",
      "begin_line": 288,
      "end_line": 298,
      "comment": "\n     * Feeds bytes into the compressor which in turn may emit zero or\n     * more blocks to the callback during the execution of this\n     * method.\n     * @param data the data to compress - must not be null\n     * @param off the start offset of the data\n     * @param len the number of bytes to compress\n     * @throws IOException if the callback throws an exception\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 49)",
        "(line 290,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 297,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.finish()",
      "begin_line": 309,
      "end_line": 315,
      "comment": "\n     * Tells the compressor to process all remaining data and signal\n     * end of data to the callback.\n     *\n     * \u003cp\u003eThe compressor will in turn emit at least one block ({@link\n     * EOD}) but potentially multiple blocks to the callback during\n     * the execution of this method.\u003c/p\u003e\n     * @throws IOException if the callback throws an exception\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.prefill(byte[])",
      "begin_line": 328,
      "end_line": 348,
      "comment": "\n     * Adds some initial data to fill the window with.\n     *\n     * \u003cp\u003eThis is used if the stream has been cut into blocks and\n     * back-references of one block may refer to data of the previous\n     * block(s). One such example is the LZ4 frame format using block\n     * dependency.\u003c/p\u003e\n     *\n     * @param data the data to fill the window with.\n     * @throws IllegalStateException if the compressor has already started to accept data\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 331,col 9)",
        "(line 334,col 9)-(line 334,col 70)",
        "(line 335,col 9)-(line 335,col 66)",
        "(line 337,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 43)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": " we use a 15 bit hashcode as calculated in updateHash"
    },
    {
      "type": "field",
      "varNames": [
        "HASH_MASK"
      ],
      "begin_line": 352,
      "end_line": 352,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "H_SHIFT"
      ],
      "begin_line": 353,
      "end_line": 353,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.nextHash(int, byte)",
      "begin_line": 363,
      "end_line": 366,
      "comment": "\n     * Assumes we are calculating the hash for three consecutive bytes\n     * as a rolling hash, i.e. for bytes ABCD if H is the hash of ABC\n     * the new hash for BCD is nextHash(H, D).\n     *\n     * \u003cp\u003eThe hash is shifted by five bits on each update so all\n     * effects of A have been swapped after the third update.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 44)",
        "(line 365,col 9)-(line 365,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.doCompress(byte[], int, int)",
      "begin_line": 369,
      "end_line": 382,
      "comment": " performs the actual algorithm with the pre-condition len \u003c\u003d windowSize",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 68)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 78)",
        "(line 375,col 9)-(line 375,col 25)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 381,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.slide()",
      "begin_line": 384,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 385,col 49)",
        "(line 386,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 58)",
        "(line 391,col 9)-(line 391,col 33)",
        "(line 392,col 9)-(line 392,col 28)",
        "(line 393,col 9)-(line 393,col 28)",
        "(line 394,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 401,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.initialize()",
      "begin_line": 404,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.compress()",
      "begin_line": 411,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 64)",
        "(line 413,col 9)-(line 413,col 54)",
        "(line 414,col 9)-(line 414,col 68)",
        "(line 416,col 9)-(line 449,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.insertString(int)",
      "begin_line": 459,
      "end_line": 465,
      "comment": "\n     * Inserts the current three byte sequence into the dictionary and\n     * returns the previous head of the hash-chain.\n     *\n     * \u003cp\u003eUpdates \u003ccode\u003einsertHash\u003c/code\u003e and \u003ccode\u003eprev\u003c/code\u003e as a\n     * side effect.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 85)",
        "(line 461,col 9)-(line 461,col 40)",
        "(line 462,col 9)-(line 462,col 37)",
        "(line 463,col 9)-(line 463,col 31)",
        "(line 464,col 9)-(line 464,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.longestMatchForNextPosition(int)",
      "begin_line": 467,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 46)",
        "(line 470,col 9)-(line 470,col 46)",
        "(line 472,col 9)-(line 472,col 20)",
        "(line 473,col 9)-(line 473,col 26)",
        "(line 474,col 9)-(line 474,col 53)",
        "(line 475,col 9)-(line 475,col 63)",
        "(line 476,col 9)-(line 476,col 49)",
        "(line 478,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.insertStringsInMatch(int)",
      "begin_line": 492,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 88)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 500,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.catchUpMissedInserts()",
      "begin_line": 503,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 504,col 9)-(line 506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.flushBackReference(int)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.flushLiteralBlock()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.longestMatch(int)",
      "begin_line": 525,
      "end_line": 551,
      "comment": "\n     * Searches the hash chain for real matches and returns the length\n     * of the longest match (0 if none were found) that isn\u0027t too far\n     * away (WRT maxOffset).\n     *\n     * \u003cp\u003eSets matchStart to the index of the start position of the\n     * longest match as a side effect.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 65)",
        "(line 527,col 9)-(line 527,col 47)",
        "(line 528,col 9)-(line 528,col 94)",
        "(line 529,col 9)-(line 529,col 82)",
        "(line 530,col 9)-(line 530,col 109)",
        "(line 531,col 9)-(line 531,col 60)",
        "(line 532,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 34)"
      ]
    }
  ]
}