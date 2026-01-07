{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream",
        "org.apache.commons.compress.compressors.bzip2.BZip2Constants"
      ],
      "begin_line": 38,
      "end_line": 976,
      "comment": "\n * An input stream that decompresses from the BZip2 format (without the file\n * header chars) to be read as any other stream.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * Index of the last char in the block, so the block size \u003d\u003d last + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Index in zptr[] of original string after sorting.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize100k"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * always: in the range 0 .. 9. The current block size is 100000 * this\n     * number.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockRandomised"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsBuff"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsLive"
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
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nInUse"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
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
      "begin_line": 116,
      "end_line": 121,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes read from the\n     * specified stream.\n     * \n     * \u003cp\u003e\n     * Although BZip2 headers are marked with the magic \u003ctt\u003e\"Bz\"\u003c/tt\u003e this\n     * constructor expects the next byte in the stream to be the first one after\n     * the magic. Thus callers have to skip the first two bytes. Otherwise this\n     * constructor will throw an exception.\n     * \u003c/p\u003e\n     * \n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if \u003ctt\u003ein \u003d\u003d null\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 16)",
        "(line 119,col 9)-(line 119,col 21)",
        "(line 120,col 9)-(line 120,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 128,
      "end_line": 134,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read()\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 133,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 141,
      "end_line": 164,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 145,col 9)",
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 157,col 34)",
        "(line 158,col 9)-(line 158,col 28)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 163,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps()",
      "begin_line": 166,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 48)",
        "(line 168,col 9)-(line 168,col 55)",
        "(line 170,col 9)-(line 170,col 29)",
        "(line 172,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 180,
      "end_line": 217,
      "comment": "",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 45)",
        "(line 183,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 216,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init()",
      "begin_line": 219,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 37)",
        "(line 227,col 9)-(line 227,col 38)",
        "(line 228,col 9)-(line 228,col 37)",
        "(line 230,col 9)-(line 230,col 39)",
        "(line 231,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 45)",
        "(line 238,col 9)-(line 238,col 20)",
        "(line 239,col 9)-(line 239,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.checkMagicChar(char, java.lang.String)",
      "begin_line": 242,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 35)",
        "(line 245,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 252,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 35)",
        "(line 254,col 9)-(line 254,col 35)",
        "(line 255,col 9)-(line 255,col 35)",
        "(line 256,col 9)-(line 256,col 35)",
        "(line 257,col 9)-(line 257,col 35)",
        "(line 258,col 9)-(line 258,col 35)",
        "(line 260,col 9)-(line 289,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 292,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 55)",
        "(line 296,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 307,col 48)",
        "(line 308,col 9)-(line 308,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 311,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 44)",
        "(line 313,col 9)-(line 313,col 32)",
        "(line 314,col 9)-(line 314,col 25)",
        "(line 316,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 321,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 39)",
        "(line 323,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 335,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 39)",
        "(line 337,col 9)-(line 337,col 39)",
        "(line 339,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 355,col 39)",
        "(line 356,col 9)-(line 356,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 359,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 39)",
        "(line 361,col 9)-(line 361,col 39)",
        "(line 363,col 9)-(line 373,col 9)",
        "(line 375,col 9)-(line 375,col 39)",
        "(line 376,col 9)-(line 376,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 383,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 390,
      "end_line": 426,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 425,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 428,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 42)",
        "(line 430,col 9)-(line 430,col 49)",
        "(line 431,col 9)-(line 431,col 61)",
        "(line 432,col 9)-(line 432,col 52)",
        "(line 433,col 9)-(line 433,col 58)",
        "(line 435,col 9)-(line 435,col 24)",
        "(line 438,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 19)",
        "(line 460,col 9)-(line 460,col 46)",
        "(line 463,col 9)-(line 463,col 35)",
        "(line 464,col 9)-(line 464,col 39)",
        "(line 466,col 9)-(line 472,col 9)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 479,col 9)-(line 489,col 9)",
        "(line 491,col 9)-(line 491,col 57)",
        "(line 494,col 9)-(line 503,col 9)",
        "(line 506,col 9)-(line 506,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 512,
      "end_line": 538,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 42)",
        "(line 515,col 9)-(line 515,col 57)",
        "(line 516,col 9)-(line 516,col 49)",
        "(line 517,col 9)-(line 517,col 47)",
        "(line 518,col 9)-(line 518,col 45)",
        "(line 519,col 9)-(line 519,col 45)",
        "(line 521,col 9)-(line 537,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 540,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 31)",
        "(line 542,col 9)-(line 542,col 29)",
        "(line 544,col 9)-(line 544,col 45)",
        "(line 545,col 9)-(line 545,col 42)",
        "(line 546,col 9)-(line 546,col 42)",
        "(line 547,col 9)-(line 547,col 49)",
        "(line 548,col 9)-(line 548,col 52)",
        "(line 549,col 9)-(line 549,col 56)",
        "(line 550,col 9)-(line 550,col 64)",
        "(line 551,col 9)-(line 551,col 49)",
        "(line 552,col 9)-(line 552,col 47)",
        "(line 553,col 9)-(line 553,col 45)",
        "(line 554,col 9)-(line 554,col 45)",
        "(line 555,col 9)-(line 555,col 58)",
        "(line 562,col 9)-(line 565,col 9)",
        "(line 567,col 9)-(line 567,col 24)",
        "(line 568,col 9)-(line 568,col 34)",
        "(line 569,col 9)-(line 569,col 40)",
        "(line 570,col 9)-(line 570,col 50)",
        "(line 571,col 9)-(line 571,col 39)",
        "(line 572,col 9)-(line 572,col 39)",
        "(line 573,col 9)-(line 573,col 28)",
        "(line 574,col 9)-(line 574,col 42)",
        "(line 575,col 9)-(line 575,col 33)",
        "(line 576,col 9)-(line 576,col 35)",
        "(line 577,col 9)-(line 577,col 33)",
        "(line 578,col 9)-(line 578,col 37)",
        "(line 580,col 9)-(line 722,col 9)",
        "(line 724,col 9)-(line 724,col 31)",
        "(line 725,col 9)-(line 725,col 35)",
        "(line 726,col 9)-(line 726,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 729,
      "end_line": 760,
      "comment": "",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 45)",
        "(line 731,col 9)-(line 731,col 42)",
        "(line 732,col 9)-(line 732,col 59)",
        "(line 733,col 9)-(line 733,col 52)",
        "(line 734,col 9)-(line 734,col 40)",
        "(line 735,col 9)-(line 735,col 27)",
        "(line 736,col 9)-(line 736,col 39)",
        "(line 737,col 9)-(line 737,col 39)",
        "(line 739,col 9)-(line 754,col 9)",
        "(line 756,col 9)-(line 756,col 35)",
        "(line 757,col 9)-(line 757,col 35)",
        "(line 759,col 9)-(line 759,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 762,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 763,col 9)-(line 765,col 9)",
        "(line 767,col 9)-(line 767,col 44)",
        "(line 768,col 9)-(line 768,col 57)",
        "(line 769,col 9)-(line 769,col 41)",
        "(line 770,col 9)-(line 770,col 21)",
        "(line 771,col 9)-(line 771,col 62)",
        "(line 773,col 9)-(line 776,col 9)",
        "(line 778,col 9)-(line 780,col 9)",
        "(line 782,col 9)-(line 784,col 9)",
        "(line 786,col 9)-(line 786,col 40)",
        "(line 787,col 9)-(line 787,col 26)",
        "(line 788,col 9)-(line 788,col 23)",
        "(line 789,col 9)-(line 789,col 26)",
        "(line 791,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 800,
      "end_line": 823,
      "comment": "",
      "child_ranges": [
        "(line 801,col 9)-(line 822,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 825,
      "end_line": 841,
      "comment": "",
      "child_ranges": [
        "(line 826,col 9)-(line 840,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 843,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 844,col 9)-(line 868,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 871,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 872,col 9)-(line 881,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 884,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 885,col 9)-(line 895,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 898,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 899,col 9)-(line 909,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 912,
      "end_line": 974,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 915,
      "end_line": 915,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 917,
      "end_line": 917,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 918,
      "end_line": 918,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 919,
      "end_line": 919,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 925,
      "end_line": 925,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 927,
      "end_line": 927,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 928,
      "end_line": 928,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 929,
      "end_line": 929,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 930,
      "end_line": 930,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 932,
      "end_line": 932,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 933,
      "end_line": 933,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 934,
      "end_line": 934,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 936,
      "end_line": 936,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 940,
      "end_line": 940,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 941,
      "end_line": 941,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 947,
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 948,col 13)-(line 948,col 20)",
        "(line 950,col 13)-(line 950,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 960,
      "end_line": 972,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 961,col 13)-(line 961,col 37)",
        "(line 967,col 13)-(line 969,col 13)",
        "(line 971,col 13)-(line 971,col 28)"
      ]
    }
  ]
}