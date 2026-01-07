{
  "filepath": "/tmp/Compress-32b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
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
      "end_line": 1038,
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
        "EOF"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "START_BLOCK_STATE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RAND_PART_A_STATE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RAND_PART_B_STATE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "RAND_PART_C_STATE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_RAND_PART_A_STATE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_RAND_PART_B_STATE"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NO_RAND_PART_C_STATE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentState"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "storedBlockCRC",
        "storedCombinedCRC"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "computedBlockCRC",
        "computedCombinedCRC"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_count"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_ch2"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_chPrev"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_i2"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_j2"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_rNToGo"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_rTPos"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_tPos"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "su_z"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * All memory intensive stuff. This field is initialized by initBlock().\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.BZip2CompressorInputStream(java.io.InputStream)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream. This doesn\u0027t suppprt decompressing\n     * concatenated .bz2 files.\n     * \n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if {@code in \u003d\u003d null}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.BZip2CompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream.\n     *\n     * @param in the InputStream from which this object should be created\n     * @param decompressConcatenated\n     *                     if true, decompress until the end of the input;\n     *                     if false, stop after the first .bz2 stream and\n     *                     leave the input position to point to the next\n     *                     byte after the .bz2 stream\n     *\n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if {@code in \u003d\u003d null}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 21)",
        "(line 130,col 9)-(line 130,col 61)",
        "(line 132,col 9)-(line 132,col 19)",
        "(line 133,col 9)-(line 133,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 136,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 152,
      "end_line": 182,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 34)",
        "(line 173,col 9)-(line 173,col 28)",
        "(line 174,col 9)-(line 174,col 14)",
        "(line 175,col 9)-(line 178,col 9)",
        "(line 180,col 9)-(line 180,col 60)",
        "(line 181,col 9)-(line 181,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps()",
      "begin_line": 184,
      "end_line": 197,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 48)",
        "(line 186,col 9)-(line 186,col 55)",
        "(line 188,col 9)-(line 188,col 29)",
        "(line 190,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 196,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 199,
      "end_line": 228,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init(boolean)",
      "begin_line": 230,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 235,col 36)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 36)",
        "(line 240,col 9)-(line 240,col 36)",
        "(line 242,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 39)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 45)",
        "(line 255,col 9)-(line 255,col 24)",
        "(line 256,col 9)-(line 256,col 37)",
        "(line 258,col 9)-(line 258,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 261,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 20)",
        "(line 263,col 9)-(line 263,col 20)",
        "(line 264,col 9)-(line 264,col 20)",
        "(line 265,col 9)-(line 265,col 20)",
        "(line 266,col 9)-(line 266,col 20)",
        "(line 267,col 9)-(line 267,col 20)",
        "(line 269,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 321,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 55)",
        "(line 325,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 336,col 48)",
        "(line 337,col 9)-(line 337,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 340,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 44)",
        "(line 342,col 9)-(line 342,col 32)",
        "(line 343,col 9)-(line 343,col 25)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 351,col 9)-(line 351,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 354,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 39)",
        "(line 357,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 369,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 39)",
        "(line 371,col 9)-(line 371,col 39)",
        "(line 373,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 389,col 39)",
        "(line 390,col 9)-(line 390,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 393,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 39)",
        "(line 395,col 9)-(line 395,col 39)",
        "(line 397,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 409,col 39)",
        "(line 410,col 9)-(line 410,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 413,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 424,
      "end_line": 460,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 459,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 462,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 42)",
        "(line 464,col 9)-(line 464,col 49)",
        "(line 465,col 9)-(line 465,col 61)",
        "(line 466,col 9)-(line 466,col 52)",
        "(line 467,col 9)-(line 467,col 58)",
        "(line 469,col 9)-(line 469,col 24)",
        "(line 472,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 491,col 9)",
        "(line 493,col 9)-(line 493,col 19)",
        "(line 494,col 9)-(line 494,col 46)",
        "(line 497,col 9)-(line 497,col 35)",
        "(line 498,col 9)-(line 498,col 39)",
        "(line 500,col 9)-(line 506,col 9)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 525,col 57)",
        "(line 528,col 9)-(line 537,col 9)",
        "(line 540,col 9)-(line 540,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 546,
      "end_line": 572,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 42)",
        "(line 549,col 9)-(line 549,col 57)",
        "(line 550,col 9)-(line 550,col 49)",
        "(line 551,col 9)-(line 551,col 47)",
        "(line 552,col 9)-(line 552,col 45)",
        "(line 553,col 9)-(line 553,col 45)",
        "(line 555,col 9)-(line 571,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 574,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 31)",
        "(line 576,col 9)-(line 576,col 29)",
        "(line 578,col 9)-(line 578,col 45)",
        "(line 579,col 9)-(line 579,col 42)",
        "(line 580,col 9)-(line 580,col 42)",
        "(line 581,col 9)-(line 581,col 49)",
        "(line 582,col 9)-(line 582,col 52)",
        "(line 583,col 9)-(line 583,col 56)",
        "(line 584,col 9)-(line 584,col 64)",
        "(line 585,col 9)-(line 585,col 49)",
        "(line 586,col 9)-(line 586,col 47)",
        "(line 587,col 9)-(line 587,col 45)",
        "(line 588,col 9)-(line 588,col 45)",
        "(line 589,col 9)-(line 589,col 58)",
        "(line 596,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 601,col 24)",
        "(line 602,col 9)-(line 602,col 34)",
        "(line 603,col 9)-(line 603,col 40)",
        "(line 604,col 9)-(line 604,col 50)",
        "(line 605,col 9)-(line 605,col 39)",
        "(line 606,col 9)-(line 606,col 39)",
        "(line 607,col 9)-(line 607,col 28)",
        "(line 608,col 9)-(line 608,col 42)",
        "(line 609,col 9)-(line 609,col 33)",
        "(line 610,col 9)-(line 610,col 35)",
        "(line 611,col 9)-(line 611,col 33)",
        "(line 612,col 9)-(line 612,col 37)",
        "(line 614,col 9)-(line 756,col 9)",
        "(line 758,col 9)-(line 758,col 31)",
        "(line 759,col 9)-(line 759,col 35)",
        "(line 760,col 9)-(line 760,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 763,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 764,col 9)-(line 764,col 45)",
        "(line 765,col 9)-(line 765,col 42)",
        "(line 766,col 9)-(line 766,col 59)",
        "(line 767,col 9)-(line 767,col 52)",
        "(line 768,col 9)-(line 768,col 40)",
        "(line 769,col 9)-(line 769,col 27)",
        "(line 770,col 9)-(line 770,col 39)",
        "(line 771,col 9)-(line 771,col 39)",
        "(line 773,col 9)-(line 788,col 9)",
        "(line 790,col 9)-(line 790,col 35)",
        "(line 791,col 9)-(line 791,col 35)",
        "(line 793,col 9)-(line 793,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 796,
      "end_line": 831,
      "comment": "",
      "child_ranges": [
        "(line 797,col 9)-(line 799,col 9)",
        "(line 801,col 9)-(line 801,col 44)",
        "(line 802,col 9)-(line 802,col 57)",
        "(line 803,col 9)-(line 803,col 41)",
        "(line 804,col 9)-(line 804,col 21)",
        "(line 805,col 9)-(line 805,col 62)",
        "(line 807,col 9)-(line 810,col 9)",
        "(line 812,col 9)-(line 814,col 9)",
        "(line 816,col 9)-(line 818,col 9)",
        "(line 820,col 9)-(line 820,col 40)",
        "(line 821,col 9)-(line 821,col 26)",
        "(line 822,col 9)-(line 822,col 23)",
        "(line 823,col 9)-(line 823,col 26)",
        "(line 825,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 833,
      "end_line": 856,
      "comment": "",
      "child_ranges": [
        "(line 834,col 9)-(line 855,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 858,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 859,col 9)-(line 873,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 876,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 877,col 9)-(line 901,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 904,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 905,col 9)-(line 914,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 917,
      "end_line": 929,
      "comment": "",
      "child_ranges": [
        "(line 918,col 9)-(line 928,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 931,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 932,col 9)-(line 942,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 945,
      "end_line": 1005,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 948,
      "end_line": 948,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 950,
      "end_line": 950,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 951,
      "end_line": 951,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 952,
      "end_line": 952,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 958,
      "end_line": 958,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 960,
      "end_line": 960,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 962,
      "end_line": 962,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 963,
      "end_line": 963,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 965,
      "end_line": 965,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 967,
      "end_line": 967,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 969,
      "end_line": 969,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 973,
      "end_line": 973,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 980,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 981,col 13)-(line 981,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 991,
      "end_line": 1003,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 992,col 13)-(line 992,col 37)",
        "(line 998,col 13)-(line 1000,col 13)",
        "(line 1002,col 13)-(line 1002,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byte[], int)",
      "begin_line": 1018,
      "end_line": 1037,
      "comment": "\n     * Checks if the signature matches what is expected for a bzip2 file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a bzip2 compressed stream, false otherwise\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1022,col 9)",
        "(line 1024,col 9)-(line 1026,col 9)",
        "(line 1028,col 9)-(line 1030,col 9)",
        "(line 1032,col 9)-(line 1034,col 9)",
        "(line 1036,col 9)-(line 1036,col 20)"
      ]
    }
  ]
}