{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
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
      "end_line": 1039,
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
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream. This doesn\u0027t suppprt decompressing\n     * concatenated .bz2 files.\n     * \n     * @param in the InputStream from which this object should be created\n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if {@code in \u003d\u003d null}\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.BZip2CompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 129,
      "end_line": 135,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream.\n     *\n     * @param in the InputStream from which this object should be created\n     * @param decompressConcatenated\n     *                     if true, decompress until the end of the input;\n     *                     if false, stop after the first .bz2 stream and\n     *                     leave the input position to point to the next\n     *                     byte after the .bz2 stream\n     *\n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if {@code in \u003d\u003d null}\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 21)",
        "(line 131,col 9)-(line 131,col 61)",
        "(line 133,col 9)-(line 133,col 19)",
        "(line 134,col 9)-(line 134,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 137,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 145,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 153,
      "end_line": 183,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 173,col 34)",
        "(line 174,col 9)-(line 174,col 28)",
        "(line 175,col 9)-(line 175,col 14)",
        "(line 176,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 60)",
        "(line 182,col 9)-(line 182,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps()",
      "begin_line": 185,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 48)",
        "(line 187,col 9)-(line 187,col 55)",
        "(line 189,col 9)-(line 189,col 29)",
        "(line 191,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 200,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 201,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init(boolean)",
      "begin_line": 231,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 36)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 36)",
        "(line 241,col 9)-(line 241,col 36)",
        "(line 243,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 39)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 45)",
        "(line 256,col 9)-(line 256,col 24)",
        "(line 257,col 9)-(line 257,col 37)",
        "(line 259,col 9)-(line 259,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 262,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 20)",
        "(line 264,col 9)-(line 264,col 20)",
        "(line 265,col 9)-(line 265,col 20)",
        "(line 266,col 9)-(line 266,col 20)",
        "(line 267,col 9)-(line 267,col 20)",
        "(line 268,col 9)-(line 268,col 20)",
        "(line 270,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 319,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 322,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 55)",
        "(line 326,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 337,col 48)",
        "(line 338,col 9)-(line 338,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 341,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 44)",
        "(line 343,col 9)-(line 343,col 32)",
        "(line 344,col 9)-(line 344,col 25)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 352,col 9)-(line 352,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 355,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 39)",
        "(line 358,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 370,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 39)",
        "(line 372,col 9)-(line 372,col 39)",
        "(line 374,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 390,col 39)",
        "(line 391,col 9)-(line 391,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 394,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 39)",
        "(line 396,col 9)-(line 396,col 39)",
        "(line 398,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 410,col 39)",
        "(line 411,col 9)-(line 411,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 414,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 418,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 425,
      "end_line": 461,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 460,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 463,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 42)",
        "(line 465,col 9)-(line 465,col 49)",
        "(line 466,col 9)-(line 466,col 61)",
        "(line 467,col 9)-(line 467,col 52)",
        "(line 468,col 9)-(line 468,col 58)",
        "(line 470,col 9)-(line 470,col 24)",
        "(line 473,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 19)",
        "(line 495,col 9)-(line 495,col 46)",
        "(line 498,col 9)-(line 498,col 35)",
        "(line 499,col 9)-(line 499,col 39)",
        "(line 501,col 9)-(line 507,col 9)",
        "(line 510,col 9)-(line 512,col 9)",
        "(line 514,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 526,col 57)",
        "(line 529,col 9)-(line 538,col 9)",
        "(line 541,col 9)-(line 541,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 547,
      "end_line": 573,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 549,col 9)-(line 549,col 42)",
        "(line 550,col 9)-(line 550,col 57)",
        "(line 551,col 9)-(line 551,col 49)",
        "(line 552,col 9)-(line 552,col 47)",
        "(line 553,col 9)-(line 553,col 45)",
        "(line 554,col 9)-(line 554,col 45)",
        "(line 556,col 9)-(line 572,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 575,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 31)",
        "(line 577,col 9)-(line 577,col 29)",
        "(line 579,col 9)-(line 579,col 45)",
        "(line 580,col 9)-(line 580,col 42)",
        "(line 581,col 9)-(line 581,col 42)",
        "(line 582,col 9)-(line 582,col 49)",
        "(line 583,col 9)-(line 583,col 52)",
        "(line 584,col 9)-(line 584,col 56)",
        "(line 585,col 9)-(line 585,col 64)",
        "(line 586,col 9)-(line 586,col 49)",
        "(line 587,col 9)-(line 587,col 47)",
        "(line 588,col 9)-(line 588,col 45)",
        "(line 589,col 9)-(line 589,col 45)",
        "(line 590,col 9)-(line 590,col 58)",
        "(line 597,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 24)",
        "(line 603,col 9)-(line 603,col 34)",
        "(line 604,col 9)-(line 604,col 40)",
        "(line 605,col 9)-(line 605,col 50)",
        "(line 606,col 9)-(line 606,col 39)",
        "(line 607,col 9)-(line 607,col 39)",
        "(line 608,col 9)-(line 608,col 28)",
        "(line 609,col 9)-(line 609,col 42)",
        "(line 610,col 9)-(line 610,col 33)",
        "(line 611,col 9)-(line 611,col 35)",
        "(line 612,col 9)-(line 612,col 33)",
        "(line 613,col 9)-(line 613,col 37)",
        "(line 615,col 9)-(line 757,col 9)",
        "(line 759,col 9)-(line 759,col 31)",
        "(line 760,col 9)-(line 760,col 35)",
        "(line 761,col 9)-(line 761,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 764,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 45)",
        "(line 766,col 9)-(line 766,col 42)",
        "(line 767,col 9)-(line 767,col 59)",
        "(line 768,col 9)-(line 768,col 52)",
        "(line 769,col 9)-(line 769,col 40)",
        "(line 770,col 9)-(line 770,col 27)",
        "(line 771,col 9)-(line 771,col 39)",
        "(line 772,col 9)-(line 772,col 39)",
        "(line 774,col 9)-(line 789,col 9)",
        "(line 791,col 9)-(line 791,col 35)",
        "(line 792,col 9)-(line 792,col 35)",
        "(line 794,col 9)-(line 794,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 797,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 798,col 9)-(line 800,col 9)",
        "(line 802,col 9)-(line 802,col 44)",
        "(line 803,col 9)-(line 803,col 57)",
        "(line 804,col 9)-(line 804,col 41)",
        "(line 805,col 9)-(line 805,col 21)",
        "(line 806,col 9)-(line 806,col 62)",
        "(line 808,col 9)-(line 811,col 9)",
        "(line 813,col 9)-(line 815,col 9)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 821,col 9)-(line 821,col 40)",
        "(line 822,col 9)-(line 822,col 26)",
        "(line 823,col 9)-(line 823,col 23)",
        "(line 824,col 9)-(line 824,col 26)",
        "(line 826,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 834,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 835,col 9)-(line 856,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 859,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 860,col 9)-(line 874,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 877,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 878,col 9)-(line 902,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 905,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 906,col 9)-(line 915,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 918,
      "end_line": 930,
      "comment": "",
      "child_ranges": [
        "(line 919,col 9)-(line 929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 932,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 933,col 9)-(line 943,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 946,
      "end_line": 1006,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 949,
      "end_line": 949,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 951,
      "end_line": 951,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 952,
      "end_line": 952,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 953,
      "end_line": 953,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 959,
      "end_line": 959,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 962,
      "end_line": 962,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 963,
      "end_line": 963,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 964,
      "end_line": 964,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 967,
      "end_line": 967,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 968,
      "end_line": 968,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 970,
      "end_line": 970,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 981,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 982,col 13)-(line 982,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 992,
      "end_line": 1004,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 993,col 13)-(line 993,col 37)",
        "(line 999,col 13)-(line 1001,col 13)",
        "(line 1003,col 13)-(line 1003,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byte[], int)",
      "begin_line": 1019,
      "end_line": 1038,
      "comment": "\n     * Checks if the signature matches what is expected for a bzip2 file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a bzip2 compressed stream, false otherwise\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 1021,col 9)-(line 1023,col 9)",
        "(line 1025,col 9)-(line 1027,col 9)",
        "(line 1029,col 9)-(line 1031,col 9)",
        "(line 1033,col 9)-(line 1035,col 9)",
        "(line 1037,col 9)-(line 1037,col 20)"
      ]
    }
  ]
}