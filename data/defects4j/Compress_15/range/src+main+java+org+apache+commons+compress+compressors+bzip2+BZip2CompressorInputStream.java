{
  "filepath": "/tmp/Compress-15b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
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
      "end_line": 1053,
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
        "decompressConcatenated"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentChar"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EOF"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_BLOCK_STATE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RAND_PART_A_STATE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RAND_PART_B_STATE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RAND_PART_C_STATE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_RAND_PART_A_STATE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_RAND_PART_B_STATE"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_RAND_PART_C_STATE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentState"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "storedBlockCRC",
        "storedCombinedCRC"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "computedBlockCRC",
        "computedCombinedCRC"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_count"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_ch2"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_chPrev"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_i2"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_j2"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_rNToGo"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_rTPos"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_tPos"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_z"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * All memory intensive stuff. This field is initialized by initBlock().\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.BZip2CompressorInputStream(java.io.InputStream)",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream. This doesn\u0027t suppprt decompressing\n     * concatenated .bz2 files.\n     * \n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if \u003ctt\u003ein \u003d\u003d null\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.BZip2CompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 130,
      "end_line": 141,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream.\n     *\n     * @param in the InputStream from which this object should be created\n     * @param decompressConcatenated\n     *                     if true, decompress until the end of the input;\n     *                     if false, stop after the first .bz2 stream and\n     *                     leave the input position to point to the next\n     *                     byte after the .bz2 stream\n     *\n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if \u003ctt\u003ein \u003d\u003d null\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 16)",
        "(line 135,col 9)-(line 135,col 21)",
        "(line 136,col 9)-(line 136,col 61)",
        "(line 138,col 9)-(line 138,col 19)",
        "(line 139,col 9)-(line 139,col 20)",
        "(line 140,col 9)-(line 140,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 144,
      "end_line": 153,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 146,col 9)-(line 152,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 160,
      "end_line": 186,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 34)",
        "(line 178,col 9)-(line 178,col 28)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 183,col 9)-(line 183,col 60)",
        "(line 184,col 9)-(line 184,col 17)",
        "(line 185,col 9)-(line 185,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps()",
      "begin_line": 188,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 48)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 192,col 9)-(line 192,col 29)",
        "(line 194,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 203,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 45)",
        "(line 206,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init(boolean)",
      "begin_line": 242,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 36)",
        "(line 248,col 9)-(line 248,col 36)",
        "(line 249,col 9)-(line 249,col 36)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 260,col 39)",
        "(line 261,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 265,col 45)",
        "(line 267,col 9)-(line 267,col 24)",
        "(line 268,col 9)-(line 268,col 37)",
        "(line 270,col 9)-(line 270,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 273,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 20)",
        "(line 275,col 9)-(line 275,col 20)",
        "(line 276,col 9)-(line 276,col 20)",
        "(line 277,col 9)-(line 277,col 20)",
        "(line 278,col 9)-(line 278,col 20)",
        "(line 279,col 9)-(line 279,col 20)",
        "(line 281,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 333,
      "end_line": 350,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 55)",
        "(line 337,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 348,col 48)",
        "(line 349,col 9)-(line 349,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 352,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 44)",
        "(line 354,col 9)-(line 354,col 32)",
        "(line 355,col 9)-(line 355,col 25)",
        "(line 357,col 9)-(line 359,col 9)",
        "(line 363,col 9)-(line 363,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 366,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 39)",
        "(line 369,col 9)-(line 378,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 381,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 39)",
        "(line 383,col 9)-(line 383,col 39)",
        "(line 385,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 401,col 39)",
        "(line 402,col 9)-(line 402,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 405,
      "end_line": 423,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 39)",
        "(line 407,col 9)-(line 407,col 39)",
        "(line 409,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 421,col 39)",
        "(line 422,col 9)-(line 422,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 425,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 436,
      "end_line": 472,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 467,col 9)",
        "(line 469,col 9)-(line 471,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 474,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 42)",
        "(line 476,col 9)-(line 476,col 49)",
        "(line 477,col 9)-(line 477,col 61)",
        "(line 478,col 9)-(line 478,col 52)",
        "(line 479,col 9)-(line 479,col 58)",
        "(line 481,col 9)-(line 481,col 24)",
        "(line 484,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 505,col 19)",
        "(line 506,col 9)-(line 506,col 46)",
        "(line 509,col 9)-(line 509,col 35)",
        "(line 510,col 9)-(line 510,col 39)",
        "(line 512,col 9)-(line 518,col 9)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 535,col 9)",
        "(line 537,col 9)-(line 537,col 57)",
        "(line 540,col 9)-(line 549,col 9)",
        "(line 552,col 9)-(line 552,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 558,
      "end_line": 584,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 42)",
        "(line 561,col 9)-(line 561,col 57)",
        "(line 562,col 9)-(line 562,col 49)",
        "(line 563,col 9)-(line 563,col 47)",
        "(line 564,col 9)-(line 564,col 45)",
        "(line 565,col 9)-(line 565,col 45)",
        "(line 567,col 9)-(line 583,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 586,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 31)",
        "(line 588,col 9)-(line 588,col 29)",
        "(line 590,col 9)-(line 590,col 45)",
        "(line 591,col 9)-(line 591,col 42)",
        "(line 592,col 9)-(line 592,col 42)",
        "(line 593,col 9)-(line 593,col 49)",
        "(line 594,col 9)-(line 594,col 52)",
        "(line 595,col 9)-(line 595,col 56)",
        "(line 596,col 9)-(line 596,col 64)",
        "(line 597,col 9)-(line 597,col 49)",
        "(line 598,col 9)-(line 598,col 47)",
        "(line 599,col 9)-(line 599,col 45)",
        "(line 600,col 9)-(line 600,col 45)",
        "(line 601,col 9)-(line 601,col 58)",
        "(line 608,col 9)-(line 611,col 9)",
        "(line 613,col 9)-(line 613,col 24)",
        "(line 614,col 9)-(line 614,col 34)",
        "(line 615,col 9)-(line 615,col 40)",
        "(line 616,col 9)-(line 616,col 50)",
        "(line 617,col 9)-(line 617,col 39)",
        "(line 618,col 9)-(line 618,col 39)",
        "(line 619,col 9)-(line 619,col 28)",
        "(line 620,col 9)-(line 620,col 42)",
        "(line 621,col 9)-(line 621,col 33)",
        "(line 622,col 9)-(line 622,col 35)",
        "(line 623,col 9)-(line 623,col 33)",
        "(line 624,col 9)-(line 624,col 37)",
        "(line 626,col 9)-(line 768,col 9)",
        "(line 770,col 9)-(line 770,col 31)",
        "(line 771,col 9)-(line 771,col 35)",
        "(line 772,col 9)-(line 772,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 775,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 45)",
        "(line 777,col 9)-(line 777,col 42)",
        "(line 778,col 9)-(line 778,col 59)",
        "(line 779,col 9)-(line 779,col 52)",
        "(line 780,col 9)-(line 780,col 40)",
        "(line 781,col 9)-(line 781,col 27)",
        "(line 782,col 9)-(line 782,col 39)",
        "(line 783,col 9)-(line 783,col 39)",
        "(line 785,col 9)-(line 800,col 9)",
        "(line 802,col 9)-(line 802,col 35)",
        "(line 803,col 9)-(line 803,col 35)",
        "(line 805,col 9)-(line 805,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 808,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 809,col 9)-(line 811,col 9)",
        "(line 813,col 9)-(line 813,col 44)",
        "(line 814,col 9)-(line 814,col 57)",
        "(line 815,col 9)-(line 815,col 41)",
        "(line 816,col 9)-(line 816,col 21)",
        "(line 817,col 9)-(line 817,col 62)",
        "(line 819,col 9)-(line 822,col 9)",
        "(line 824,col 9)-(line 826,col 9)",
        "(line 828,col 9)-(line 830,col 9)",
        "(line 832,col 9)-(line 832,col 40)",
        "(line 833,col 9)-(line 833,col 26)",
        "(line 834,col 9)-(line 834,col 23)",
        "(line 835,col 9)-(line 835,col 26)",
        "(line 837,col 9)-(line 843,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 846,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 847,col 9)-(line 868,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 871,
      "end_line": 887,
      "comment": "",
      "child_ranges": [
        "(line 872,col 9)-(line 886,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 889,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 890,col 9)-(line 914,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 917,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 918,col 9)-(line 927,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 930,
      "end_line": 942,
      "comment": "",
      "child_ranges": [
        "(line 931,col 9)-(line 941,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 944,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 945,col 9)-(line 955,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 958,
      "end_line": 1020,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 963,
      "end_line": 963,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 965,
      "end_line": 965,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 971,
      "end_line": 971,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 973,
      "end_line": 973,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 976,
      "end_line": 976,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 978,
      "end_line": 978,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 979,
      "end_line": 979,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 980,
      "end_line": 980,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 986,
      "end_line": 986,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 987,
      "end_line": 987,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 993,
      "end_line": 997,
      "comment": "",
      "child_ranges": [
        "(line 994,col 13)-(line 994,col 20)",
        "(line 996,col 13)-(line 996,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 1006,
      "end_line": 1018,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 1007,col 13)-(line 1007,col 37)",
        "(line 1013,col 13)-(line 1015,col 13)",
        "(line 1017,col 13)-(line 1017,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byte[], int)",
      "begin_line": 1033,
      "end_line": 1052,
      "comment": "\n     * Checks if the signature matches what is expected for a bzip2 file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a bzip2 compressed stream, false otherwise\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1037,col 9)",
        "(line 1039,col 9)-(line 1041,col 9)",
        "(line 1043,col 9)-(line 1045,col 9)",
        "(line 1047,col 9)-(line 1049,col 9)",
        "(line 1051,col 9)-(line 1051,col 20)"
      ]
    }
  ]
}