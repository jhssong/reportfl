{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/compressors/lz77support/LZ77Compressor.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LZ77Compressor",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 84,
      "end_line": 464,
      "comment": "\n * Helper class for compression algorithms that use the ideas of LZ77.\n *\n * \u003cp\u003eMost LZ77 derived algorithms split input data into blocks of\n * uncompressed data (called literal blocks) and back-references\n * (pairs of offsets and lengths) that state \"add \u003ccode\u003elength\u003c/code\u003e\n * bytes that are the same as those already written starting\n * \u003ccode\u003eoffset\u003c/code\u003e bytes before the current position. The details\n * of how those blocks and back-references are encoded are quite\n * different between the algorithms and some algorithms perform\n * additional steps (Huffman encoding in the case of DEFLATE for\n * example).\u003c/p\u003e\n *\n * \u003cp\u003eThis class attempts to extract the core logic - finding\n * back-references - so it can be re-used. It follows the algorithm\n * explained in section 4 of RFC 1951 (DEFLATE) and currently doesn\u0027t\n * implement the \"lazy match\" optimization. The three-byte hash\n * function used in this class is the same used by zlib and InfoZIP\u0027s\n * ZIP implementation of DEFLATE. Strongly inspired by InfoZIP\u0027s\n * implementation.\u003c/p\u003e\n *\n * \u003cp\u003eLZ77 is used vaguely here (as well as many other places that\n * talk about it :-), LZSS would likely be closer to the truth but\n * LZ77 has become the synonym for a whole family of algorithms.\u003c/p\u003e\n *\n * \u003cp\u003eThe API consists of a compressor that is fed \u003ccode\u003ebyte\u003c/code\u003es\n * and emits {@link Block}s to a registered callback where the blocks\n * represent either {@link LiteralBlock literal blocks}, {@link\n * BackReference back references} or {@link EOD end of data\n * markers}. In order to ensure the callback receives all information,\n * the {@code #finish} method must be used once all data has been fed\n * into the compressor.\u003c/p\u003e\n *\n * \u003cp\u003eSeveral parameters influence the outcome of the \"compression\":\u003c/p\u003e\n * \u003cdl\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003ewindowSize\u003c/code\u003e\u003c/dt\u003e \u003cdd\u003ethe size of the sliding\n *  window, must be a power of two - this determines the maximum\n *  offset a back-reference can take. The compressor maintains a\n *  buffer of twice of \u003ccode\u003ewindowSize\u003c/code\u003e - real world values are\n *  in the area of 32k.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003eminMatchLength\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMinimal length of a match found. A true minimum of 3 is\n *  hard-coded inside of this implemention but bigger lengths can be\n *  configured.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003emaxMatchLength\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMaximal length of a match found.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003emaxOffset\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMaximal offset of a back-reference.\u003c/dd\u003e\n *\n *  \u003cdt\u003e\u003ccode\u003emaxLiteralLength\u003c/code\u003e\u003c/dt\u003e\n *  \u003cdd\u003eMaximal length of a literal block.\u003c/dd\u003e\n * \u003c/dl\u003e\n *\n * @see \"https://tools.ietf.org/html/rfc1951#section-4\"\n * @since 1.14\n * @NotThreadSafe\n "
    },
    {
      "type": "class_interface",
      "name": "Block",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Base class representing things the compressor may emit.\n     "
    },
    {
      "type": "class_interface",
      "name": "LiteralBlock",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block"
      ],
      "begin_line": 98,
      "end_line": 135,
      "comment": "\n     * Represents a literal block of data.\n     *\n     * \u003cp\u003eFor performance reasons this encapsulates the real data, not\n     * a copy of it. Don\u0027t modify the data and process it inside of\n     * {@link Callback#accept} immediately as it will get overwritten\n     * sooner or later.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offset",
        "length"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.LiteralBlock(byte[], int, int)",
      "begin_line": 101,
      "end_line": 105,
      "comment": " package private for tests ",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 29)",
        "(line 103,col 13)-(line 103,col 33)",
        "(line 104,col 13)-(line 104,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getData()",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n         * The literal data.\n         *\n         * \u003cp\u003eThis returns a life view of the actual data in order to\n         * avoid copying, modify the array at your own risk.\u003c/p\u003e\n         * @return the data\n         ",
      "child_ranges": [
        "(line 114,col 13)-(line 114,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getOffset()",
      "begin_line": 120,
      "end_line": 122,
      "comment": "\n         * Offset into data where the literal block starts.\n         * @return the offset\n         ",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.getLength()",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n         * Length of literal block.\n         * @return the length\n         ",
      "child_ranges": [
        "(line 128,col 13)-(line 128,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock.toString()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BackReference",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block"
      ],
      "begin_line": 139,
      "end_line": 164,
      "comment": "\n     * Represents a back-reference to a match.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offset",
        "length"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.BackReference(int, int)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 142,col 13)-(line 142,col 33)",
        "(line 143,col 13)-(line 143,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.getOffset()",
      "begin_line": 149,
      "end_line": 151,
      "comment": "\n         * Provides the offset of the match.\n         * @return the offset\n         ",
      "child_ranges": [
        "(line 150,col 13)-(line 150,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.getLength()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n         * Provides the length of the match.\n         * @return the length\n         ",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.BackReference.toString()",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 83)"
      ]
    },
    {
      "type": "class_interface",
      "name": "EOD",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * A simple \"we are done\" marker.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "THE_EOD"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "Callback",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 179,
      "end_line": 186,
      "comment": "\n     * Callback invoked while the compressor processes data.\n     *\n     * \u003cp\u003eThe callback is invoked on the same thread that receives the\n     * bytes to compress and may be invoked multiple times during the\n     * execution of {@link #compress} or {@link #finish}.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback.accept(org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Block)",
      "begin_line": 185,
      "end_line": 185,
      "comment": "\n         * Consumes a block.\n         * @param b the block to consume\n         * @throws IOException in case of an error\n         ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "NUMBER_OF_BYTES_IN_HASH"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_MATCH"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "params"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "callback"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "window"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " the sliding window, twice as big as \"windowSize\" parameter"
    },
    {
      "type": "field",
      "varNames": [
        "head"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " the given hash."
    },
    {
      "type": "field",
      "varNames": [
        "prev"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " windowSize\"."
    },
    {
      "type": "field",
      "varNames": [
        "wMask"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " bit mask used when indexing into prev"
    },
    {
      "type": "field",
      "varNames": [
        "initialized"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentPosition"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " the position inside of window that shall be encoded right now"
    },
    {
      "type": "field",
      "varNames": [
        "lookahead"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " currentPosition"
    },
    {
      "type": "field",
      "varNames": [
        "insertHash"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " the hash of the three bytes stating at the current position"
    },
    {
      "type": "field",
      "varNames": [
        "blockStart"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " block starts (in case we are inside of a literal block)."
    },
    {
      "type": "field",
      "varNames": [
        "matchStart"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " position of the current match"
    },
    {
      "type": "field",
      "varNames": [
        "missedInserts"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " number of insertString calls for the up to three last bytes of the last match"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LZ77Compressor(org.apache.commons.compress.compressors.lz77support.Parameters, org.apache.commons.compress.compressors.lz77support.LZ77Compressor.Callback)",
      "begin_line": 231,
      "end_line": 249,
      "comment": "\n     * Initializes a compressor with parameters and a callback.\n     * @param params the parameters\n     * @param callback the callback\n     * @throws NullPointerException if either parameter is \u003ccode\u003enull\u003c/code\u003e\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 29)",
        "(line 239,col 9)-(line 239,col 33)",
        "(line 241,col 9)-(line 241,col 49)",
        "(line 242,col 9)-(line 242,col 37)",
        "(line 243,col 9)-(line 243,col 26)",
        "(line 244,col 9)-(line 244,col 34)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.compress(byte[])",
      "begin_line": 258,
      "end_line": 260,
      "comment": "\n     * Feeds bytes into the compressor which in turn may emit zero or\n     * more blocks to the callback during the execution of this\n     * method.\n     * @param data the data to compress - must not be null\n     * @throws IOException if the callback throws an exception\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.compress(byte[], int, int)",
      "begin_line": 271,
      "end_line": 281,
      "comment": "\n     * Feeds bytes into the compressor which in turn may emit zero or\n     * more blocks to the callback during the execution of this\n     * method.\n     * @param data the data to compress - must not be null\n     * @param off the start offset of the data\n     * @param len the number of bytes to compress\n     * @throws IOException if the callback throws an exception\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 49)",
        "(line 273,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 280,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.finish()",
      "begin_line": 292,
      "end_line": 298,
      "comment": "\n     * Tells the compressor to process all remaining data and signal\n     * end of data to the callback.\n     *\n     * \u003cp\u003eThe compressor will in turn emit at least one block ({@link\n     * EOD}) but potentially multiple blocks to the callback during\n     * the execution of this method.\u003c/p\u003e\n     * @throws IOException if the callback throws an exception\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 301,
      "end_line": 301,
      "comment": " we use a 15 bit hashcode as calculated in updateHash"
    },
    {
      "type": "field",
      "varNames": [
        "HASH_MASK"
      ],
      "begin_line": 302,
      "end_line": 302,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "H_SHIFT"
      ],
      "begin_line": 303,
      "end_line": 303,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.nextHash(int, byte)",
      "begin_line": 313,
      "end_line": 316,
      "comment": "\n     * Assumes we are calculating the hash for three consecutive bytes\n     * as a rolling hash, i.e. for bytes ABCD if H is the hash of ABC\n     * the new hash for BCD is nextHash(H, D).\n     *\n     * \u003cp\u003eThe hash is shifted by five bits on each update so all\n     * effects of A have been swapped after the third update.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 44)",
        "(line 315,col 9)-(line 315,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.doCompress(byte[], int, int)",
      "begin_line": 319,
      "end_line": 332,
      "comment": " performs the actual algorithm with the pre-condition len \u003c\u003d windowSize",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 68)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 78)",
        "(line 325,col 9)-(line 325,col 25)",
        "(line 326,col 9)-(line 328,col 9)",
        "(line 329,col 9)-(line 331,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.slide()",
      "begin_line": 334,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 49)",
        "(line 336,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 58)",
        "(line 341,col 9)-(line 341,col 33)",
        "(line 342,col 9)-(line 342,col 28)",
        "(line 343,col 9)-(line 343,col 28)",
        "(line 344,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.initialize()",
      "begin_line": 354,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.compress()",
      "begin_line": 361,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 56)",
        "(line 364,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.insertString(int)",
      "begin_line": 402,
      "end_line": 408,
      "comment": "\n     * Inserts the current three byte sequence into the dictionary and\n     * returns the previous previous head of the hash-chain.\n     *\n     * \u003cp\u003eUpdates \u003ccode\u003einsertHash\u003c/code\u003e and \u003ccode\u003eprev\u003c/code\u003e as a\n     * side effect.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 85)",
        "(line 404,col 9)-(line 404,col 40)",
        "(line 405,col 9)-(line 405,col 37)",
        "(line 406,col 9)-(line 406,col 31)",
        "(line 407,col 9)-(line 407,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.insertStringsInMatch(int)",
      "begin_line": 410,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 88)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.catchUpMissedInserts()",
      "begin_line": 421,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.flushBackReference(int)",
      "begin_line": 427,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.flushLiteralBlock()",
      "begin_line": 431,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.lz77support.LZ77Compressor.longestMatch(int)",
      "begin_line": 443,
      "end_line": 463,
      "comment": "\n     * Searches the hash chain for real matches and returns the length\n     * of the longest match (0 if none were found) that isn\u0027t too far\n     * away (WRT maxOffset).\n     *\n     * \u003cp\u003eSets matchStart to the index of the start position of the\n     * longest match as a side effect.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 57)",
        "(line 445,col 9)-(line 445,col 47)",
        "(line 446,col 9)-(line 446,col 86)",
        "(line 447,col 9)-(line 447,col 82)",
        "(line 448,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 462,col 34)"
      ]
    }
  ]
}