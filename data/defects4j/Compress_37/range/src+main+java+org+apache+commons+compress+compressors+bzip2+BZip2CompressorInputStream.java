{
  "filepath": "/tmp/Compress-37b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
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
      "end_line": 1010,
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
      "begin_line": 127,
      "end_line": 133,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream.\n     *\n     * @param in the InputStream from which this object should be created\n     * @param decompressConcatenated\n     *                     if true, decompress until the end of the input;\n     *                     if false, stop after the first .bz2 stream and\n     *                     leave the input position to point to the next\n     *                     byte after the .bz2 stream\n     *\n     * @throws IOException\n     *             if {@code in \u003d\u003d null}, the stream content is malformed, or an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 21)",
        "(line 129,col 9)-(line 129,col 61)",
        "(line 131,col 9)-(line 131,col 19)",
        "(line 132,col 9)-(line 132,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 135,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 141,col 9)",
        "(line 142,col 9)-(line 142,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 150,
      "end_line": 180,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 34)",
        "(line 171,col 9)-(line 171,col 28)",
        "(line 172,col 9)-(line 172,col 14)",
        "(line 173,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 66)",
        "(line 179,col 9)-(line 179,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps()",
      "begin_line": 182,
      "end_line": 195,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 48)",
        "(line 184,col 9)-(line 184,col 55)",
        "(line 186,col 9)-(line 186,col 29)",
        "(line 188,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 197,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 225,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init(boolean)",
      "begin_line": 228,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 229,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 233,col 42)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 237,col 42)",
        "(line 238,col 9)-(line 238,col 42)",
        "(line 240,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 45)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 45)",
        "(line 253,col 9)-(line 253,col 24)",
        "(line 254,col 9)-(line 254,col 37)",
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 259,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 20)",
        "(line 261,col 9)-(line 261,col 20)",
        "(line 262,col 9)-(line 262,col 20)",
        "(line 263,col 9)-(line 263,col 20)",
        "(line 264,col 9)-(line 264,col 20)",
        "(line 265,col 9)-(line 265,col 20)",
        "(line 267,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 41)",
        "(line 301,col 9)-(line 301,col 43)",
        "(line 307,col 9)-(line 309,col 9)",
        "(line 312,col 9)-(line 312,col 34)",
        "(line 314,col 9)-(line 314,col 33)",
        "(line 315,col 9)-(line 315,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 318,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 55)",
        "(line 322,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 333,col 48)",
        "(line 334,col 9)-(line 334,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 337,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 44)",
        "(line 339,col 9)-(line 339,col 32)",
        "(line 340,col 9)-(line 340,col 25)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 348,col 9)-(line 348,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 351,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 45)",
        "(line 354,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 366,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 39)",
        "(line 368,col 9)-(line 368,col 39)",
        "(line 370,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 39)",
        "(line 387,col 9)-(line 387,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 390,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 398,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 405,
      "end_line": 441,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 425,col 9)-(line 428,col 9)",
        "(line 430,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 443,
      "end_line": 522,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 42)",
        "(line 445,col 9)-(line 445,col 49)",
        "(line 446,col 9)-(line 446,col 61)",
        "(line 447,col 9)-(line 447,col 52)",
        "(line 448,col 9)-(line 448,col 58)",
        "(line 450,col 9)-(line 450,col 24)",
        "(line 453,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 474,col 19)",
        "(line 475,col 9)-(line 475,col 46)",
        "(line 478,col 9)-(line 478,col 35)",
        "(line 479,col 9)-(line 479,col 39)",
        "(line 481,col 9)-(line 487,col 9)",
        "(line 490,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 504,col 9)",
        "(line 506,col 9)-(line 506,col 57)",
        "(line 509,col 9)-(line 518,col 9)",
        "(line 521,col 9)-(line 521,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 527,
      "end_line": 553,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 42)",
        "(line 530,col 9)-(line 530,col 57)",
        "(line 531,col 9)-(line 531,col 49)",
        "(line 532,col 9)-(line 532,col 47)",
        "(line 533,col 9)-(line 533,col 45)",
        "(line 534,col 9)-(line 534,col 45)",
        "(line 536,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 555,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 31)",
        "(line 557,col 9)-(line 557,col 29)",
        "(line 559,col 9)-(line 559,col 45)",
        "(line 560,col 9)-(line 560,col 42)",
        "(line 561,col 9)-(line 561,col 42)",
        "(line 562,col 9)-(line 562,col 49)",
        "(line 563,col 9)-(line 563,col 52)",
        "(line 564,col 9)-(line 564,col 56)",
        "(line 565,col 9)-(line 565,col 64)",
        "(line 566,col 9)-(line 566,col 49)",
        "(line 567,col 9)-(line 567,col 47)",
        "(line 568,col 9)-(line 568,col 45)",
        "(line 569,col 9)-(line 569,col 45)",
        "(line 570,col 9)-(line 570,col 58)",
        "(line 577,col 9)-(line 580,col 9)",
        "(line 582,col 9)-(line 582,col 24)",
        "(line 583,col 9)-(line 583,col 34)",
        "(line 584,col 9)-(line 584,col 40)",
        "(line 585,col 9)-(line 585,col 50)",
        "(line 586,col 9)-(line 586,col 39)",
        "(line 587,col 9)-(line 587,col 39)",
        "(line 588,col 9)-(line 588,col 28)",
        "(line 589,col 9)-(line 589,col 42)",
        "(line 590,col 9)-(line 590,col 33)",
        "(line 591,col 9)-(line 591,col 35)",
        "(line 592,col 9)-(line 592,col 33)",
        "(line 593,col 9)-(line 593,col 37)",
        "(line 595,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 735,col 31)",
        "(line 736,col 9)-(line 736,col 35)",
        "(line 737,col 9)-(line 737,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 740,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 45)",
        "(line 742,col 9)-(line 742,col 42)",
        "(line 743,col 9)-(line 743,col 59)",
        "(line 744,col 9)-(line 744,col 52)",
        "(line 745,col 9)-(line 745,col 40)",
        "(line 746,col 9)-(line 746,col 27)",
        "(line 747,col 9)-(line 747,col 39)",
        "(line 748,col 9)-(line 748,col 39)",
        "(line 750,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 766,col 35)",
        "(line 767,col 9)-(line 767,col 35)",
        "(line 769,col 9)-(line 769,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 772,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 773,col 9)-(line 775,col 9)",
        "(line 777,col 9)-(line 777,col 44)",
        "(line 778,col 9)-(line 778,col 57)",
        "(line 779,col 9)-(line 779,col 41)",
        "(line 780,col 9)-(line 780,col 21)",
        "(line 781,col 9)-(line 781,col 62)",
        "(line 783,col 9)-(line 786,col 9)",
        "(line 788,col 9)-(line 790,col 9)",
        "(line 792,col 9)-(line 794,col 9)",
        "(line 796,col 9)-(line 796,col 40)",
        "(line 797,col 9)-(line 797,col 26)",
        "(line 798,col 9)-(line 798,col 23)",
        "(line 799,col 9)-(line 799,col 26)",
        "(line 801,col 9)-(line 805,col 9)",
        "(line 806,col 9)-(line 806,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 809,
      "end_line": 831,
      "comment": "",
      "child_ranges": [
        "(line 810,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 19)",
        "(line 829,col 9)-(line 829,col 20)",
        "(line 830,col 9)-(line 830,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 833,
      "end_line": 848,
      "comment": "",
      "child_ranges": [
        "(line 834,col 9)-(line 843,col 9)",
        "(line 844,col 9)-(line 844,col 49)",
        "(line 845,col 9)-(line 845,col 19)",
        "(line 846,col 9)-(line 846,col 20)",
        "(line 847,col 9)-(line 847,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 850,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 851,col 9)-(line 875,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 878,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 879,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 46)",
        "(line 885,col 9)-(line 885,col 21)",
        "(line 886,col 9)-(line 886,col 26)",
        "(line 887,col 9)-(line 887,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 890,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 891,col 9)-(line 901,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 904,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 905,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 21)",
        "(line 913,col 9)-(line 913,col 26)",
        "(line 914,col 9)-(line 914,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 917,
      "end_line": 977,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 920,
      "end_line": 920,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 922,
      "end_line": 922,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 923,
      "end_line": 923,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 924,
      "end_line": 924,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 930,
      "end_line": 930,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 932,
      "end_line": 932,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 933,
      "end_line": 933,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 934,
      "end_line": 934,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 935,
      "end_line": 935,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 937,
      "end_line": 937,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 938,
      "end_line": 938,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 939,
      "end_line": 939,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 941,
      "end_line": 941,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 945,
      "end_line": 945,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 946,
      "end_line": 946,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 952,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 953,col 13)-(line 953,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 963,
      "end_line": 975,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 964,col 13)-(line 964,col 37)",
        "(line 970,col 13)-(line 972,col 13)",
        "(line 974,col 13)-(line 974,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byte[], int)",
      "begin_line": 990,
      "end_line": 1009,
      "comment": "\n     * Checks if the signature matches what is expected for a bzip2 file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a bzip2 compressed stream, false otherwise\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 992,col 9)-(line 994,col 9)",
        "(line 996,col 9)-(line 998,col 9)",
        "(line 1000,col 9)-(line 1002,col 9)",
        "(line 1004,col 9)-(line 1006,col 9)",
        "(line 1008,col 9)-(line 1008,col 20)"
      ]
    }
  ]
}