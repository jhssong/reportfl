{
  "filepath": "/tmp/Compress-14b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
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
      "end_line": 1048,
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
      "end_line": 200,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 48)",
        "(line 190,col 9)-(line 190,col 55)",
        "(line 192,col 9)-(line 192,col 29)",
        "(line 194,col 9)-(line 197,col 9)",
        "(line 199,col 9)-(line 199,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 202,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 45)",
        "(line 205,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 238,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init(boolean)",
      "begin_line": 241,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 36)",
        "(line 247,col 9)-(line 247,col 36)",
        "(line 248,col 9)-(line 248,col 36)",
        "(line 249,col 9)-(line 250,col 25)",
        "(line 252,col 9)-(line 255,col 60)",
        "(line 257,col 9)-(line 257,col 39)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 45)",
        "(line 264,col 9)-(line 264,col 24)",
        "(line 265,col 9)-(line 265,col 37)",
        "(line 267,col 9)-(line 267,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 270,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 20)",
        "(line 272,col 9)-(line 272,col 20)",
        "(line 273,col 9)-(line 273,col 20)",
        "(line 274,col 9)-(line 274,col 20)",
        "(line 275,col 9)-(line 275,col 20)",
        "(line 276,col 9)-(line 276,col 20)",
        "(line 278,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 328,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 55)",
        "(line 332,col 9)-(line 340,col 9)",
        "(line 342,col 9)-(line 343,col 48)",
        "(line 344,col 9)-(line 344,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 347,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 44)",
        "(line 349,col 9)-(line 349,col 32)",
        "(line 350,col 9)-(line 350,col 25)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 358,col 9)-(line 358,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 361,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 39)",
        "(line 364,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 376,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 39)",
        "(line 378,col 9)-(line 378,col 39)",
        "(line 380,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 39)",
        "(line 397,col 9)-(line 397,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 400,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 39)",
        "(line 402,col 9)-(line 402,col 39)",
        "(line 404,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 416,col 39)",
        "(line 417,col 9)-(line 417,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 420,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 424,
      "end_line": 426,
      "comment": "",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 431,
      "end_line": 467,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 466,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 469,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 42)",
        "(line 471,col 9)-(line 471,col 49)",
        "(line 472,col 9)-(line 472,col 61)",
        "(line 473,col 9)-(line 473,col 52)",
        "(line 474,col 9)-(line 474,col 58)",
        "(line 476,col 9)-(line 476,col 24)",
        "(line 479,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 498,col 9)",
        "(line 500,col 9)-(line 500,col 19)",
        "(line 501,col 9)-(line 501,col 46)",
        "(line 504,col 9)-(line 504,col 35)",
        "(line 505,col 9)-(line 505,col 39)",
        "(line 507,col 9)-(line 513,col 9)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 520,col 9)-(line 530,col 9)",
        "(line 532,col 9)-(line 532,col 57)",
        "(line 535,col 9)-(line 544,col 9)",
        "(line 547,col 9)-(line 547,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 553,
      "end_line": 579,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 42)",
        "(line 556,col 9)-(line 556,col 57)",
        "(line 557,col 9)-(line 557,col 49)",
        "(line 558,col 9)-(line 558,col 47)",
        "(line 559,col 9)-(line 559,col 45)",
        "(line 560,col 9)-(line 560,col 45)",
        "(line 562,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 581,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 31)",
        "(line 583,col 9)-(line 583,col 29)",
        "(line 585,col 9)-(line 585,col 45)",
        "(line 586,col 9)-(line 586,col 42)",
        "(line 587,col 9)-(line 587,col 42)",
        "(line 588,col 9)-(line 588,col 49)",
        "(line 589,col 9)-(line 589,col 52)",
        "(line 590,col 9)-(line 590,col 56)",
        "(line 591,col 9)-(line 591,col 64)",
        "(line 592,col 9)-(line 592,col 49)",
        "(line 593,col 9)-(line 593,col 47)",
        "(line 594,col 9)-(line 594,col 45)",
        "(line 595,col 9)-(line 595,col 45)",
        "(line 596,col 9)-(line 596,col 58)",
        "(line 603,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 608,col 24)",
        "(line 609,col 9)-(line 609,col 34)",
        "(line 610,col 9)-(line 610,col 40)",
        "(line 611,col 9)-(line 611,col 50)",
        "(line 612,col 9)-(line 612,col 39)",
        "(line 613,col 9)-(line 613,col 39)",
        "(line 614,col 9)-(line 614,col 28)",
        "(line 615,col 9)-(line 615,col 42)",
        "(line 616,col 9)-(line 616,col 33)",
        "(line 617,col 9)-(line 617,col 35)",
        "(line 618,col 9)-(line 618,col 33)",
        "(line 619,col 9)-(line 619,col 37)",
        "(line 621,col 9)-(line 763,col 9)",
        "(line 765,col 9)-(line 765,col 31)",
        "(line 766,col 9)-(line 766,col 35)",
        "(line 767,col 9)-(line 767,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 770,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 45)",
        "(line 772,col 9)-(line 772,col 42)",
        "(line 773,col 9)-(line 773,col 59)",
        "(line 774,col 9)-(line 774,col 52)",
        "(line 775,col 9)-(line 775,col 40)",
        "(line 776,col 9)-(line 776,col 27)",
        "(line 777,col 9)-(line 777,col 39)",
        "(line 778,col 9)-(line 778,col 39)",
        "(line 780,col 9)-(line 795,col 9)",
        "(line 797,col 9)-(line 797,col 35)",
        "(line 798,col 9)-(line 798,col 35)",
        "(line 800,col 9)-(line 800,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 803,
      "end_line": 839,
      "comment": "",
      "child_ranges": [
        "(line 804,col 9)-(line 806,col 9)",
        "(line 808,col 9)-(line 808,col 44)",
        "(line 809,col 9)-(line 809,col 57)",
        "(line 810,col 9)-(line 810,col 41)",
        "(line 811,col 9)-(line 811,col 21)",
        "(line 812,col 9)-(line 812,col 62)",
        "(line 814,col 9)-(line 817,col 9)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 823,col 9)-(line 825,col 9)",
        "(line 827,col 9)-(line 827,col 40)",
        "(line 828,col 9)-(line 828,col 26)",
        "(line 829,col 9)-(line 829,col 23)",
        "(line 830,col 9)-(line 830,col 26)",
        "(line 832,col 9)-(line 838,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 841,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 842,col 9)-(line 863,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 866,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 867,col 9)-(line 881,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 884,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 885,col 9)-(line 909,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 912,
      "end_line": 923,
      "comment": "",
      "child_ranges": [
        "(line 913,col 9)-(line 922,col 9)"
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
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 940,col 9)-(line 950,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 953,
      "end_line": 1015,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 956,
      "end_line": 956,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 958,
      "end_line": 958,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 959,
      "end_line": 959,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 960,
      "end_line": 960,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 968,
      "end_line": 968,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 969,
      "end_line": 969,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 970,
      "end_line": 970,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 971,
      "end_line": 971,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 973,
      "end_line": 973,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 977,
      "end_line": 977,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 981,
      "end_line": 981,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 988,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 989,col 13)-(line 989,col 20)",
        "(line 991,col 13)-(line 991,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 1001,
      "end_line": 1013,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 1002,col 13)-(line 1002,col 37)",
        "(line 1008,col 13)-(line 1010,col 13)",
        "(line 1012,col 13)-(line 1012,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byte[], int)",
      "begin_line": 1028,
      "end_line": 1047,
      "comment": "\n     * Checks if the signature matches what is expected for a bzip2 file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a bzip2 compressed stream, false otherwise\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1032,col 9)",
        "(line 1034,col 9)-(line 1036,col 9)",
        "(line 1038,col 9)-(line 1040,col 9)",
        "(line 1042,col 9)-(line 1044,col 9)",
        "(line 1046,col 9)-(line 1046,col 20)"
      ]
    }
  ]
}