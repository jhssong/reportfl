{
  "filepath": "/tmp/Compress-36b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
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
      "end_line": 1012,
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
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 47)"
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
        "(line 180,col 9)-(line 180,col 66)",
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
        "(line 235,col 9)-(line 235,col 42)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 42)",
        "(line 240,col 9)-(line 240,col 42)",
        "(line 242,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 248,col 45)",
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
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 20)",
        "(line 263,col 9)-(line 263,col 20)",
        "(line 264,col 9)-(line 264,col 20)",
        "(line 265,col 9)-(line 265,col 20)",
        "(line 266,col 9)-(line 266,col 20)",
        "(line 267,col 9)-(line 267,col 20)",
        "(line 269,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 41)",
        "(line 303,col 9)-(line 303,col 43)",
        "(line 309,col 9)-(line 311,col 9)",
        "(line 314,col 9)-(line 314,col 34)",
        "(line 316,col 9)-(line 316,col 33)",
        "(line 317,col 9)-(line 317,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 320,
      "end_line": 337,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 55)",
        "(line 324,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 335,col 48)",
        "(line 336,col 9)-(line 336,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 339,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 44)",
        "(line 341,col 9)-(line 341,col 32)",
        "(line 342,col 9)-(line 342,col 25)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 350,col 9)-(line 350,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 353,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 45)",
        "(line 356,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 368,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 39)",
        "(line 370,col 9)-(line 370,col 39)",
        "(line 372,col 9)-(line 386,col 9)",
        "(line 388,col 9)-(line 388,col 39)",
        "(line 389,col 9)-(line 389,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 392,
      "end_line": 394,
      "comment": "",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 400,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 407,
      "end_line": 443,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 442,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 445,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 42)",
        "(line 447,col 9)-(line 447,col 49)",
        "(line 448,col 9)-(line 448,col 61)",
        "(line 449,col 9)-(line 449,col 52)",
        "(line 450,col 9)-(line 450,col 58)",
        "(line 452,col 9)-(line 452,col 24)",
        "(line 455,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 465,col 9)-(line 474,col 9)",
        "(line 476,col 9)-(line 476,col 19)",
        "(line 477,col 9)-(line 477,col 46)",
        "(line 480,col 9)-(line 480,col 35)",
        "(line 481,col 9)-(line 481,col 39)",
        "(line 483,col 9)-(line 489,col 9)",
        "(line 492,col 9)-(line 494,col 9)",
        "(line 496,col 9)-(line 506,col 9)",
        "(line 508,col 9)-(line 508,col 57)",
        "(line 511,col 9)-(line 520,col 9)",
        "(line 523,col 9)-(line 523,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 529,
      "end_line": 555,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 42)",
        "(line 532,col 9)-(line 532,col 57)",
        "(line 533,col 9)-(line 533,col 49)",
        "(line 534,col 9)-(line 534,col 47)",
        "(line 535,col 9)-(line 535,col 45)",
        "(line 536,col 9)-(line 536,col 45)",
        "(line 538,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 557,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 31)",
        "(line 559,col 9)-(line 559,col 29)",
        "(line 561,col 9)-(line 561,col 45)",
        "(line 562,col 9)-(line 562,col 42)",
        "(line 563,col 9)-(line 563,col 42)",
        "(line 564,col 9)-(line 564,col 49)",
        "(line 565,col 9)-(line 565,col 52)",
        "(line 566,col 9)-(line 566,col 56)",
        "(line 567,col 9)-(line 567,col 64)",
        "(line 568,col 9)-(line 568,col 49)",
        "(line 569,col 9)-(line 569,col 47)",
        "(line 570,col 9)-(line 570,col 45)",
        "(line 571,col 9)-(line 571,col 45)",
        "(line 572,col 9)-(line 572,col 58)",
        "(line 579,col 9)-(line 582,col 9)",
        "(line 584,col 9)-(line 584,col 24)",
        "(line 585,col 9)-(line 585,col 34)",
        "(line 586,col 9)-(line 586,col 40)",
        "(line 587,col 9)-(line 587,col 50)",
        "(line 588,col 9)-(line 588,col 39)",
        "(line 589,col 9)-(line 589,col 39)",
        "(line 590,col 9)-(line 590,col 28)",
        "(line 591,col 9)-(line 591,col 42)",
        "(line 592,col 9)-(line 592,col 33)",
        "(line 593,col 9)-(line 593,col 35)",
        "(line 594,col 9)-(line 594,col 33)",
        "(line 595,col 9)-(line 595,col 37)",
        "(line 597,col 9)-(line 735,col 9)",
        "(line 737,col 9)-(line 737,col 31)",
        "(line 738,col 9)-(line 738,col 35)",
        "(line 739,col 9)-(line 739,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 742,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 45)",
        "(line 744,col 9)-(line 744,col 42)",
        "(line 745,col 9)-(line 745,col 59)",
        "(line 746,col 9)-(line 746,col 52)",
        "(line 747,col 9)-(line 747,col 40)",
        "(line 748,col 9)-(line 748,col 27)",
        "(line 749,col 9)-(line 749,col 39)",
        "(line 750,col 9)-(line 750,col 39)",
        "(line 752,col 9)-(line 766,col 9)",
        "(line 768,col 9)-(line 768,col 35)",
        "(line 769,col 9)-(line 769,col 35)",
        "(line 771,col 9)-(line 771,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 774,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 777,col 9)",
        "(line 779,col 9)-(line 779,col 44)",
        "(line 780,col 9)-(line 780,col 57)",
        "(line 781,col 9)-(line 781,col 41)",
        "(line 782,col 9)-(line 782,col 21)",
        "(line 783,col 9)-(line 783,col 62)",
        "(line 785,col 9)-(line 788,col 9)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 794,col 9)-(line 796,col 9)",
        "(line 798,col 9)-(line 798,col 40)",
        "(line 799,col 9)-(line 799,col 26)",
        "(line 800,col 9)-(line 800,col 23)",
        "(line 801,col 9)-(line 801,col 26)",
        "(line 803,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 811,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 19)",
        "(line 831,col 9)-(line 831,col 20)",
        "(line 832,col 9)-(line 832,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 835,
      "end_line": 850,
      "comment": "",
      "child_ranges": [
        "(line 836,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 846,col 49)",
        "(line 847,col 9)-(line 847,col 19)",
        "(line 848,col 9)-(line 848,col 20)",
        "(line 849,col 9)-(line 849,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 852,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 853,col 9)-(line 877,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 880,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 881,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 46)",
        "(line 887,col 9)-(line 887,col 21)",
        "(line 888,col 9)-(line 888,col 26)",
        "(line 889,col 9)-(line 889,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 892,
      "end_line": 904,
      "comment": "",
      "child_ranges": [
        "(line 893,col 9)-(line 903,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 906,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 907,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 914,col 21)",
        "(line 915,col 9)-(line 915,col 26)",
        "(line 916,col 9)-(line 916,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 919,
      "end_line": 979,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 922,
      "end_line": 922,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 924,
      "end_line": 924,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 925,
      "end_line": 925,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 926,
      "end_line": 926,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 932,
      "end_line": 932,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 934,
      "end_line": 934,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 935,
      "end_line": 935,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 936,
      "end_line": 936,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 937,
      "end_line": 937,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 939,
      "end_line": 939,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 940,
      "end_line": 940,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 941,
      "end_line": 941,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 943,
      "end_line": 943,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 947,
      "end_line": 947,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 948,
      "end_line": 948,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 954,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 955,col 13)-(line 955,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 965,
      "end_line": 977,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 966,col 13)-(line 966,col 37)",
        "(line 972,col 13)-(line 974,col 13)",
        "(line 976,col 13)-(line 976,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byte[], int)",
      "begin_line": 992,
      "end_line": 1011,
      "comment": "\n     * Checks if the signature matches what is expected for a bzip2 file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a bzip2 compressed stream, false otherwise\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 996,col 9)",
        "(line 998,col 9)-(line 1000,col 9)",
        "(line 1002,col 9)-(line 1004,col 9)",
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1010,col 9)-(line 1010,col 20)"
      ]
    }
  ]
}