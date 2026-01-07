{
  "filepath": "/tmp/Compress-22b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
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
      "end_line": 1047,
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
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream. This doesn\u0027t suppprt decompressing\n     * concatenated .bz2 files.\n     * \n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if \u003ctt\u003ein \u003d\u003d null\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.BZip2CompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 129,
      "end_line": 136,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream.\n     *\n     * @param in the InputStream from which this object should be created\n     * @param decompressConcatenated\n     *                     if true, decompress until the end of the input;\n     *                     if false, stop after the first .bz2 stream and\n     *                     leave the input position to point to the next\n     *                     byte after the .bz2 stream\n     *\n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if \u003ctt\u003ein \u003d\u003d null\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 21)",
        "(line 131,col 9)-(line 131,col 61)",
        "(line 133,col 9)-(line 133,col 19)",
        "(line 134,col 9)-(line 134,col 20)",
        "(line 135,col 9)-(line 135,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 138,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 146,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 154,
      "end_line": 181,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 34)",
        "(line 172,col 9)-(line 172,col 28)",
        "(line 173,col 9)-(line 173,col 14)",
        "(line 174,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 60)",
        "(line 180,col 9)-(line 180,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps()",
      "begin_line": 183,
      "end_line": 196,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 48)",
        "(line 185,col 9)-(line 185,col 55)",
        "(line 187,col 9)-(line 187,col 29)",
        "(line 189,col 9)-(line 193,col 9)",
        "(line 195,col 9)-(line 195,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 198,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 45)",
        "(line 200,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init(boolean)",
      "begin_line": 235,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 36)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 36)",
        "(line 245,col 9)-(line 245,col 36)",
        "(line 247,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 39)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 45)",
        "(line 260,col 9)-(line 260,col 24)",
        "(line 261,col 9)-(line 261,col 37)",
        "(line 263,col 9)-(line 263,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 266,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 20)",
        "(line 268,col 9)-(line 268,col 20)",
        "(line 269,col 9)-(line 269,col 20)",
        "(line 270,col 9)-(line 270,col 20)",
        "(line 271,col 9)-(line 271,col 20)",
        "(line 272,col 9)-(line 272,col 20)",
        "(line 274,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 323,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 326,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 55)",
        "(line 330,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 341,col 48)",
        "(line 342,col 9)-(line 342,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 345,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 44)",
        "(line 347,col 9)-(line 347,col 32)",
        "(line 348,col 9)-(line 348,col 25)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 356,col 9)-(line 356,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 359,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 39)",
        "(line 362,col 9)-(line 371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 374,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 39)",
        "(line 376,col 9)-(line 376,col 39)",
        "(line 378,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 39)",
        "(line 395,col 9)-(line 395,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 398,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 39)",
        "(line 400,col 9)-(line 400,col 39)",
        "(line 402,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 39)",
        "(line 415,col 9)-(line 415,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 429,
      "end_line": 465,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 467,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 42)",
        "(line 469,col 9)-(line 469,col 49)",
        "(line 470,col 9)-(line 470,col 61)",
        "(line 471,col 9)-(line 471,col 52)",
        "(line 472,col 9)-(line 472,col 58)",
        "(line 474,col 9)-(line 474,col 24)",
        "(line 477,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 487,col 9)-(line 496,col 9)",
        "(line 498,col 9)-(line 498,col 19)",
        "(line 499,col 9)-(line 499,col 46)",
        "(line 502,col 9)-(line 502,col 35)",
        "(line 503,col 9)-(line 503,col 39)",
        "(line 505,col 9)-(line 511,col 9)",
        "(line 514,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 528,col 9)",
        "(line 530,col 9)-(line 530,col 57)",
        "(line 533,col 9)-(line 542,col 9)",
        "(line 545,col 9)-(line 545,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 551,
      "end_line": 577,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 42)",
        "(line 554,col 9)-(line 554,col 57)",
        "(line 555,col 9)-(line 555,col 49)",
        "(line 556,col 9)-(line 556,col 47)",
        "(line 557,col 9)-(line 557,col 45)",
        "(line 558,col 9)-(line 558,col 45)",
        "(line 560,col 9)-(line 576,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 579,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 31)",
        "(line 581,col 9)-(line 581,col 29)",
        "(line 583,col 9)-(line 583,col 45)",
        "(line 584,col 9)-(line 584,col 42)",
        "(line 585,col 9)-(line 585,col 42)",
        "(line 586,col 9)-(line 586,col 49)",
        "(line 587,col 9)-(line 587,col 52)",
        "(line 588,col 9)-(line 588,col 56)",
        "(line 589,col 9)-(line 589,col 64)",
        "(line 590,col 9)-(line 590,col 49)",
        "(line 591,col 9)-(line 591,col 47)",
        "(line 592,col 9)-(line 592,col 45)",
        "(line 593,col 9)-(line 593,col 45)",
        "(line 594,col 9)-(line 594,col 58)",
        "(line 601,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 606,col 24)",
        "(line 607,col 9)-(line 607,col 34)",
        "(line 608,col 9)-(line 608,col 40)",
        "(line 609,col 9)-(line 609,col 50)",
        "(line 610,col 9)-(line 610,col 39)",
        "(line 611,col 9)-(line 611,col 39)",
        "(line 612,col 9)-(line 612,col 28)",
        "(line 613,col 9)-(line 613,col 42)",
        "(line 614,col 9)-(line 614,col 33)",
        "(line 615,col 9)-(line 615,col 35)",
        "(line 616,col 9)-(line 616,col 33)",
        "(line 617,col 9)-(line 617,col 37)",
        "(line 619,col 9)-(line 761,col 9)",
        "(line 763,col 9)-(line 763,col 31)",
        "(line 764,col 9)-(line 764,col 35)",
        "(line 765,col 9)-(line 765,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 768,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 45)",
        "(line 770,col 9)-(line 770,col 42)",
        "(line 771,col 9)-(line 771,col 59)",
        "(line 772,col 9)-(line 772,col 52)",
        "(line 773,col 9)-(line 773,col 40)",
        "(line 774,col 9)-(line 774,col 27)",
        "(line 775,col 9)-(line 775,col 39)",
        "(line 776,col 9)-(line 776,col 39)",
        "(line 778,col 9)-(line 793,col 9)",
        "(line 795,col 9)-(line 795,col 35)",
        "(line 796,col 9)-(line 796,col 35)",
        "(line 798,col 9)-(line 798,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 801,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 802,col 9)-(line 804,col 9)",
        "(line 806,col 9)-(line 806,col 44)",
        "(line 807,col 9)-(line 807,col 57)",
        "(line 808,col 9)-(line 808,col 41)",
        "(line 809,col 9)-(line 809,col 21)",
        "(line 810,col 9)-(line 810,col 62)",
        "(line 812,col 9)-(line 815,col 9)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 821,col 9)-(line 823,col 9)",
        "(line 825,col 9)-(line 825,col 40)",
        "(line 826,col 9)-(line 826,col 26)",
        "(line 827,col 9)-(line 827,col 23)",
        "(line 828,col 9)-(line 828,col 26)",
        "(line 830,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 838,
      "end_line": 862,
      "comment": "",
      "child_ranges": [
        "(line 839,col 9)-(line 861,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 864,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 865,col 9)-(line 880,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 883,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 884,col 9)-(line 908,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 911,
      "end_line": 923,
      "comment": "",
      "child_ranges": [
        "(line 912,col 9)-(line 922,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 925,
      "end_line": 937,
      "comment": "",
      "child_ranges": [
        "(line 926,col 9)-(line 936,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 939,
      "end_line": 952,
      "comment": "",
      "child_ranges": [
        "(line 940,col 9)-(line 951,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 954,
      "end_line": 1014,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 957,
      "end_line": 957,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 959,
      "end_line": 959,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 960,
      "end_line": 960,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 967,
      "end_line": 967,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 969,
      "end_line": 969,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 970,
      "end_line": 970,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 971,
      "end_line": 971,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 972,
      "end_line": 972,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 976,
      "end_line": 976,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 978,
      "end_line": 978,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 983,
      "end_line": 983,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 989,
      "end_line": 991,
      "comment": "",
      "child_ranges": [
        "(line 990,col 13)-(line 990,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 1000,
      "end_line": 1012,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 1001,col 13)-(line 1001,col 37)",
        "(line 1007,col 13)-(line 1009,col 13)",
        "(line 1011,col 13)-(line 1011,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byte[], int)",
      "begin_line": 1027,
      "end_line": 1046,
      "comment": "\n     * Checks if the signature matches what is expected for a bzip2 file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a bzip2 compressed stream, false otherwise\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1031,col 9)",
        "(line 1033,col 9)-(line 1035,col 9)",
        "(line 1037,col 9)-(line 1039,col 9)",
        "(line 1041,col 9)-(line 1043,col 9)",
        "(line 1045,col 9)-(line 1045,col 20)"
      ]
    }
  ]
}