{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream",
        "org.apache.commons.compress.compressors.bzip2.BZip2Constants"
      ],
      "begin_line": 37,
      "end_line": 995,
      "comment": "\n * An input stream that decompresses from the BZip2 format to be read as any other stream.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": "\n     * Index of the last char in the block, so the block size \u003d\u003d last + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": "\n     * Index in zptr[] of original string after sorting.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize100k"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * always: in the range 0 .. 9. The current block size is 100000 * this\n     * number.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockRandomised"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsBuff"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsLive"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nInUse"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentChar"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_BLOCK_STATE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RAND_PART_A_STATE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RAND_PART_B_STATE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RAND_PART_C_STATE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_RAND_PART_A_STATE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_RAND_PART_B_STATE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_RAND_PART_C_STATE"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentState"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "storedBlockCRC",
        "storedCombinedCRC"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "computedBlockCRC",
        "computedCombinedCRC"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_count"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_ch2"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_chPrev"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_i2"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_j2"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_rNToGo"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_rTPos"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_tPos"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_z"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * All memory intensive stuff. This field is initialized by initBlock().\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.BZip2CompressorInputStream(java.io.InputStream)",
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes read from the\n     * specified stream.\n     * \n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if \u003ctt\u003ein \u003d\u003d null\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 16)",
        "(line 111,col 9)-(line 111,col 21)",
        "(line 112,col 9)-(line 112,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 116,
      "end_line": 122,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 117,col 9)-(line 121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 129,
      "end_line": 152,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 34)",
        "(line 146,col 9)-(line 146,col 28)",
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 151,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps()",
      "begin_line": 154,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 48)",
        "(line 156,col 9)-(line 156,col 55)",
        "(line 158,col 9)-(line 158,col 29)",
        "(line 160,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 168,
      "end_line": 205,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 45)",
        "(line 171,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init()",
      "begin_line": 207,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 214,col 37)",
        "(line 215,col 9)-(line 215,col 38)",
        "(line 216,col 9)-(line 216,col 37)",
        "(line 218,col 9)-(line 218,col 39)",
        "(line 219,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 45)",
        "(line 226,col 9)-(line 226,col 20)",
        "(line 227,col 9)-(line 227,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.checkMagicChar(char, java.lang.String)",
      "begin_line": 230,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 35)",
        "(line 233,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 240,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 35)",
        "(line 242,col 9)-(line 242,col 35)",
        "(line 243,col 9)-(line 243,col 35)",
        "(line 244,col 9)-(line 244,col 35)",
        "(line 245,col 9)-(line 245,col 35)",
        "(line 246,col 9)-(line 246,col 35)",
        "(line 248,col 9)-(line 277,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 280,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 55)",
        "(line 284,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 295,col 48)",
        "(line 296,col 9)-(line 296,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 299,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 44)",
        "(line 301,col 9)-(line 301,col 32)",
        "(line 302,col 9)-(line 302,col 25)",
        "(line 304,col 9)-(line 306,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 309,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 39)",
        "(line 311,col 9)-(line 320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 323,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 39)",
        "(line 325,col 9)-(line 325,col 39)",
        "(line 327,col 9)-(line 341,col 9)",
        "(line 343,col 9)-(line 343,col 39)",
        "(line 344,col 9)-(line 344,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 347,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 39)",
        "(line 349,col 9)-(line 349,col 39)",
        "(line 351,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 363,col 39)",
        "(line 364,col 9)-(line 364,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 378,
      "end_line": 414,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 398,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 416,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 42)",
        "(line 418,col 9)-(line 418,col 49)",
        "(line 419,col 9)-(line 419,col 61)",
        "(line 420,col 9)-(line 420,col 52)",
        "(line 421,col 9)-(line 421,col 58)",
        "(line 423,col 9)-(line 423,col 24)",
        "(line 426,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 447,col 19)",
        "(line 448,col 9)-(line 448,col 46)",
        "(line 451,col 9)-(line 451,col 35)",
        "(line 452,col 9)-(line 452,col 39)",
        "(line 454,col 9)-(line 460,col 9)",
        "(line 463,col 9)-(line 465,col 9)",
        "(line 467,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 479,col 57)",
        "(line 482,col 9)-(line 491,col 9)",
        "(line 494,col 9)-(line 494,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 500,
      "end_line": 526,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 42)",
        "(line 503,col 9)-(line 503,col 57)",
        "(line 504,col 9)-(line 504,col 49)",
        "(line 505,col 9)-(line 505,col 47)",
        "(line 506,col 9)-(line 506,col 45)",
        "(line 507,col 9)-(line 507,col 45)",
        "(line 509,col 9)-(line 525,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 528,
      "end_line": 715,
      "comment": "",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 31)",
        "(line 530,col 9)-(line 530,col 29)",
        "(line 532,col 9)-(line 532,col 45)",
        "(line 533,col 9)-(line 533,col 42)",
        "(line 534,col 9)-(line 534,col 42)",
        "(line 535,col 9)-(line 535,col 49)",
        "(line 536,col 9)-(line 536,col 52)",
        "(line 537,col 9)-(line 537,col 56)",
        "(line 538,col 9)-(line 538,col 64)",
        "(line 539,col 9)-(line 539,col 49)",
        "(line 540,col 9)-(line 540,col 47)",
        "(line 541,col 9)-(line 541,col 45)",
        "(line 542,col 9)-(line 542,col 45)",
        "(line 543,col 9)-(line 543,col 58)",
        "(line 550,col 9)-(line 553,col 9)",
        "(line 555,col 9)-(line 555,col 24)",
        "(line 556,col 9)-(line 556,col 34)",
        "(line 557,col 9)-(line 557,col 40)",
        "(line 558,col 9)-(line 558,col 50)",
        "(line 559,col 9)-(line 559,col 39)",
        "(line 560,col 9)-(line 560,col 39)",
        "(line 561,col 9)-(line 561,col 28)",
        "(line 562,col 9)-(line 562,col 42)",
        "(line 563,col 9)-(line 563,col 33)",
        "(line 564,col 9)-(line 564,col 35)",
        "(line 565,col 9)-(line 565,col 33)",
        "(line 566,col 9)-(line 566,col 37)",
        "(line 568,col 9)-(line 710,col 9)",
        "(line 712,col 9)-(line 712,col 31)",
        "(line 713,col 9)-(line 713,col 35)",
        "(line 714,col 9)-(line 714,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 717,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 45)",
        "(line 719,col 9)-(line 719,col 42)",
        "(line 720,col 9)-(line 720,col 59)",
        "(line 721,col 9)-(line 721,col 52)",
        "(line 722,col 9)-(line 722,col 40)",
        "(line 723,col 9)-(line 723,col 27)",
        "(line 724,col 9)-(line 724,col 39)",
        "(line 725,col 9)-(line 725,col 39)",
        "(line 727,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 744,col 35)",
        "(line 745,col 9)-(line 745,col 35)",
        "(line 747,col 9)-(line 747,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 750,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 751,col 9)-(line 753,col 9)",
        "(line 755,col 9)-(line 755,col 44)",
        "(line 756,col 9)-(line 756,col 57)",
        "(line 757,col 9)-(line 757,col 41)",
        "(line 758,col 9)-(line 758,col 21)",
        "(line 759,col 9)-(line 759,col 62)",
        "(line 761,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 768,col 9)",
        "(line 770,col 9)-(line 772,col 9)",
        "(line 774,col 9)-(line 774,col 40)",
        "(line 775,col 9)-(line 775,col 26)",
        "(line 776,col 9)-(line 776,col 23)",
        "(line 777,col 9)-(line 777,col 26)",
        "(line 779,col 9)-(line 785,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 788,
      "end_line": 811,
      "comment": "",
      "child_ranges": [
        "(line 789,col 9)-(line 810,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 813,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 814,col 9)-(line 828,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 831,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 832,col 9)-(line 856,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 859,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 860,col 9)-(line 869,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 872,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 873,col 9)-(line 883,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 886,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 887,col 9)-(line 897,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 900,
      "end_line": 962,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 903,
      "end_line": 903,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 905,
      "end_line": 905,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 906,
      "end_line": 906,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 907,
      "end_line": 907,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 913,
      "end_line": 913,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 915,
      "end_line": 915,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 916,
      "end_line": 916,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 917,
      "end_line": 917,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 918,
      "end_line": 918,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 920,
      "end_line": 920,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 921,
      "end_line": 921,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 922,
      "end_line": 922,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 924,
      "end_line": 924,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 928,
      "end_line": 928,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 929,
      "end_line": 929,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 935,
      "end_line": 939,
      "comment": "",
      "child_ranges": [
        "(line 936,col 13)-(line 936,col 20)",
        "(line 938,col 13)-(line 938,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 948,
      "end_line": 960,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 949,col 13)-(line 949,col 37)",
        "(line 955,col 13)-(line 957,col 13)",
        "(line 959,col 13)-(line 959,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byte[], int)",
      "begin_line": 975,
      "end_line": 994,
      "comment": "\n     * Checks if the signature matches what is expected for a bzip2 file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a bzip2 compressed stream, false otherwise\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 979,col 9)",
        "(line 981,col 9)-(line 983,col 9)",
        "(line 985,col 9)-(line 987,col 9)",
        "(line 989,col 9)-(line 991,col 9)",
        "(line 993,col 9)-(line 993,col 20)"
      ]
    }
  ]
}