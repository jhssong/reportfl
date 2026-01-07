{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream",
        "org.apache.commons.compress.compressors.bzip2.BZip2Constants"
      ],
      "begin_line": 41,
      "end_line": 976,
      "comment": "\n * An input stream that decompresses from the BZip2 format to be read as any other stream.\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Index of the last char in the block, so the block size \u003d\u003d last + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": "\n     * Index in zptr[] of original string after sorting.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize100k"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * always: in the range 0 .. 9. The current block size is 100000 * this\n     * number.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockRandomised"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nInUse"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bin"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
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
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream. This doesn\u0027t suppprt decompressing\n     * concatenated .bz2 files.\n     *\n     * @param in the InputStream from which this object should be created\n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if {@code in \u003d\u003d null}\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.BZip2CompressorInputStream(java.io.InputStream, boolean)",
      "begin_line": 129,
      "end_line": 136,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes\n     * read from the specified stream.\n     *\n     * @param in the InputStream from which this object should be created\n     * @param decompressConcatenated\n     *                     if true, decompress until the end of the input;\n     *                     if false, stop after the first .bz2 stream and\n     *                     leave the input position to point to the next\n     *                     byte after the .bz2 stream\n     *\n     * @throws IOException\n     *             if {@code in \u003d\u003d null}, the stream content is malformed, or an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 132,col 61)",
        "(line 134,col 9)-(line 134,col 19)",
        "(line 135,col 9)-(line 135,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 138,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 145,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 153,
      "end_line": 183,
      "comment": "\n     * (non-Javadoc)\n     *\n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
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
        "(line 181,col 9)-(line 181,col 66)",
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
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.readNextByte(org.apache.commons.compress.utils.BitInputStream)",
      "begin_line": 231,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 32)",
        "(line 233,col 9)-(line 233,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init(boolean)",
      "begin_line": 236,
      "end_line": 268,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 245,col 50)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 249,col 9)-(line 249,col 50)",
        "(line 250,col 9)-(line 250,col 50)",
        "(line 252,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 53)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 263,col 45)",
        "(line 265,col 9)-(line 265,col 37)",
        "(line 267,col 9)-(line 267,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 270,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 38)",
        "(line 272,col 9)-(line 272,col 20)",
        "(line 273,col 9)-(line 273,col 20)",
        "(line 274,col 9)-(line 274,col 20)",
        "(line 275,col 9)-(line 275,col 20)",
        "(line 276,col 9)-(line 276,col 20)",
        "(line 277,col 9)-(line 277,col 20)",
        "(line 279,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 44)",
        "(line 313,col 9)-(line 313,col 48)",
        "(line 319,col 9)-(line 321,col 9)",
        "(line 324,col 9)-(line 324,col 34)",
        "(line 326,col 9)-(line 326,col 33)",
        "(line 327,col 9)-(line 327,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 330,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 55)",
        "(line 334,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 345,col 48)",
        "(line 346,col 9)-(line 346,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 349,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 47)",
        "(line 351,col 9)-(line 351,col 32)",
        "(line 352,col 9)-(line 352,col 25)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 360,col 9)-(line 360,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 363,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 49)",
        "(line 366,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(org.apache.commons.compress.utils.BitInputStream, int)",
      "begin_line": 382,
      "end_line": 388,
      "comment": "\n     * read bits from the input stream\n     * @param n the number of bits to read, must not exceed 32?\n     * @return the requested bits combined into an int\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 37)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 387,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit(org.apache.commons.compress.utils.BitInputStream)",
      "begin_line": 390,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte(org.apache.commons.compress.utils.BitInputStream)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt(org.apache.commons.compress.utils.BitInputStream)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.checkBounds(int, int, java.lang.String)",
      "begin_line": 402,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 415,
      "end_line": 454,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 456,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 44)",
        "(line 458,col 9)-(line 458,col 42)",
        "(line 459,col 9)-(line 459,col 49)",
        "(line 460,col 9)-(line 460,col 61)",
        "(line 461,col 9)-(line 461,col 52)",
        "(line 462,col 9)-(line 462,col 58)",
        "(line 464,col 9)-(line 464,col 24)",
        "(line 467,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 473,col 34)",
        "(line 474,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 485,col 19)",
        "(line 486,col 9)-(line 486,col 46)",
        "(line 488,col 9)-(line 488,col 40)",
        "(line 489,col 9)-(line 489,col 44)",
        "(line 490,col 9)-(line 490,col 64)",
        "(line 491,col 9)-(line 491,col 54)",
        "(line 492,col 9)-(line 492,col 65)",
        "(line 494,col 9)-(line 500,col 9)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 507,col 9)-(line 518,col 9)",
        "(line 520,col 9)-(line 520,col 57)",
        "(line 523,col 9)-(line 532,col 9)",
        "(line 535,col 9)-(line 535,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 541,
      "end_line": 567,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 42)",
        "(line 544,col 9)-(line 544,col 57)",
        "(line 545,col 9)-(line 545,col 49)",
        "(line 546,col 9)-(line 546,col 47)",
        "(line 547,col 9)-(line 547,col 45)",
        "(line 548,col 9)-(line 548,col 45)",
        "(line 550,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 569,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 44)",
        "(line 571,col 9)-(line 571,col 36)",
        "(line 572,col 9)-(line 572,col 29)",
        "(line 574,col 9)-(line 574,col 42)",
        "(line 575,col 9)-(line 575,col 42)",
        "(line 576,col 9)-(line 576,col 49)",
        "(line 577,col 9)-(line 577,col 52)",
        "(line 578,col 9)-(line 578,col 56)",
        "(line 579,col 9)-(line 579,col 64)",
        "(line 580,col 9)-(line 580,col 49)",
        "(line 581,col 9)-(line 581,col 47)",
        "(line 582,col 9)-(line 582,col 45)",
        "(line 583,col 9)-(line 583,col 45)",
        "(line 584,col 9)-(line 584,col 58)",
        "(line 591,col 9)-(line 594,col 9)",
        "(line 596,col 9)-(line 596,col 24)",
        "(line 597,col 9)-(line 597,col 34)",
        "(line 598,col 9)-(line 598,col 40)",
        "(line 599,col 9)-(line 599,col 49)",
        "(line 600,col 9)-(line 600,col 28)",
        "(line 601,col 9)-(line 601,col 42)",
        "(line 602,col 9)-(line 602,col 40)",
        "(line 603,col 9)-(line 603,col 33)",
        "(line 604,col 9)-(line 604,col 35)",
        "(line 605,col 9)-(line 605,col 33)",
        "(line 606,col 9)-(line 606,col 37)",
        "(line 608,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 710,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0()",
      "begin_line": 713,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 42)",
        "(line 715,col 9)-(line 715,col 53)",
        "(line 716,col 9)-(line 716,col 40)",
        "(line 717,col 9)-(line 717,col 52)",
        "(line 718,col 9)-(line 718,col 40)",
        "(line 719,col 9)-(line 719,col 46)",
        "(line 720,col 9)-(line 720,col 32)",
        "(line 721,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 55)",
        "(line 726,col 9)-(line 726,col 49)",
        "(line 728,col 9)-(line 728,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 731,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 732,col 9)-(line 734,col 9)",
        "(line 736,col 9)-(line 736,col 44)",
        "(line 737,col 9)-(line 737,col 40)",
        "(line 738,col 9)-(line 738,col 49)",
        "(line 739,col 9)-(line 739,col 41)",
        "(line 740,col 9)-(line 740,col 21)",
        "(line 741,col 9)-(line 741,col 62)",
        "(line 743,col 9)-(line 746,col 9)",
        "(line 748,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 756,col 9)",
        "(line 758,col 9)-(line 758,col 40)",
        "(line 759,col 9)-(line 759,col 26)",
        "(line 760,col 9)-(line 760,col 23)",
        "(line 761,col 9)-(line 761,col 26)",
        "(line 763,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 771,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 772,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 19)",
        "(line 792,col 9)-(line 792,col 20)",
        "(line 793,col 9)-(line 793,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 796,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 797,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 49)",
        "(line 809,col 9)-(line 809,col 19)",
        "(line 810,col 9)-(line 810,col 20)",
        "(line 811,col 9)-(line 811,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 814,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 815,col 9)-(line 840,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 843,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 844,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 46)",
        "(line 850,col 9)-(line 850,col 21)",
        "(line 851,col 9)-(line 851,col 26)",
        "(line 852,col 9)-(line 852,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 855,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 867,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 870,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 871,col 9)-(line 877,col 9)",
        "(line 878,col 9)-(line 878,col 21)",
        "(line 879,col 9)-(line 879,col 26)",
        "(line 880,col 9)-(line 880,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 883,
      "end_line": 943,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 886,
      "end_line": 886,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 888,
      "end_line": 888,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 889,
      "end_line": 889,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 890,
      "end_line": 890,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 896,
      "end_line": 896,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 898,
      "end_line": 898,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 899,
      "end_line": 899,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 900,
      "end_line": 900,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 901,
      "end_line": 901,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 903,
      "end_line": 903,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 904,
      "end_line": 904,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 905,
      "end_line": 905,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 907,
      "end_line": 907,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 911,
      "end_line": 911,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 912,
      "end_line": 912,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 918,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 919,col 13)-(line 919,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 929,
      "end_line": 941,
      "comment": "\n         * Initializes the {@link #tt} array.\n         *\n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 930,col 13)-(line 930,col 37)",
        "(line 936,col 13)-(line 938,col 13)",
        "(line 940,col 13)-(line 940,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.matches(byte[], int)",
      "begin_line": 956,
      "end_line": 975,
      "comment": "\n     * Checks if the signature matches what is expected for a bzip2 file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a bzip2 compressed stream, false otherwise\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 958,col 9)-(line 960,col 9)",
        "(line 962,col 9)-(line 964,col 9)",
        "(line 966,col 9)-(line 968,col 9)",
        "(line 970,col 9)-(line 972,col 9)",
        "(line 974,col 9)-(line 974,col 20)"
      ]
    }
  ]
}