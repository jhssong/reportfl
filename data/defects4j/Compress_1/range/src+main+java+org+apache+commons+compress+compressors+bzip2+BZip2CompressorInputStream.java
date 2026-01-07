{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2CompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream",
        "org.apache.commons.compress.compressors.bzip2.BZip2Constants"
      ],
      "begin_line": 36,
      "end_line": 974,
      "comment": "\n * An input stream that decompresses from the BZip2 format (without the file\n * header chars) to be read as any other stream.\n "
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Index of the last char in the block, so the block size \u003d\u003d last + 1.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": "\n     * Index in zptr[] of original string after sorting.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize100k"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": "\n     * always: in the range 0 .. 9. The current block size is 100000 * this\n     * number.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "blockRandomised"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsBuff"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsLive"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nInUse"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentChar"
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
      "begin_line": 114,
      "end_line": 119,
      "comment": "\n     * Constructs a new CBZip2InputStream which decompresses bytes read from the\n     * specified stream.\n     * \n     * \u003cp\u003e\n     * Although BZip2 headers are marked with the magic \u003ctt\u003e\"Bz\"\u003c/tt\u003e this\n     * constructor expects the next byte in the stream to be the first one after\n     * the magic. Thus callers have to skip the first two bytes. Otherwise this\n     * constructor will throw an exception.\n     * \u003c/p\u003e\n     * \n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if \u003ctt\u003ein \u003d\u003d null\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 16)",
        "(line 117,col 9)-(line 117,col 21)",
        "(line 118,col 9)-(line 118,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 126,
      "end_line": 132,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read()\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 131,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 139,
      "end_line": 162,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 34)",
        "(line 156,col 9)-(line 156,col 28)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps()",
      "begin_line": 164,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 48)",
        "(line 166,col 9)-(line 166,col 55)",
        "(line 168,col 9)-(line 168,col 29)",
        "(line 170,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 178,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 45)",
        "(line 181,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init()",
      "begin_line": 217,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 37)",
        "(line 225,col 9)-(line 225,col 38)",
        "(line 226,col 9)-(line 226,col 37)",
        "(line 228,col 9)-(line 228,col 39)",
        "(line 229,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 45)",
        "(line 236,col 9)-(line 236,col 20)",
        "(line 237,col 9)-(line 237,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.checkMagicChar(char, java.lang.String)",
      "begin_line": 240,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 35)",
        "(line 243,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 250,
      "end_line": 288,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 35)",
        "(line 252,col 9)-(line 252,col 35)",
        "(line 253,col 9)-(line 253,col 35)",
        "(line 254,col 9)-(line 254,col 35)",
        "(line 255,col 9)-(line 255,col 35)",
        "(line 256,col 9)-(line 256,col 35)",
        "(line 258,col 9)-(line 287,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 290,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 55)",
        "(line 294,col 9)-(line 302,col 9)",
        "(line 304,col 9)-(line 305,col 48)",
        "(line 306,col 9)-(line 306,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 309,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 44)",
        "(line 311,col 9)-(line 311,col 32)",
        "(line 312,col 9)-(line 312,col 25)",
        "(line 314,col 9)-(line 316,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 319,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 39)",
        "(line 321,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 333,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 39)",
        "(line 335,col 9)-(line 335,col 39)",
        "(line 337,col 9)-(line 351,col 9)",
        "(line 353,col 9)-(line 353,col 39)",
        "(line 354,col 9)-(line 354,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 357,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 39)",
        "(line 359,col 9)-(line 359,col 39)",
        "(line 361,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 39)",
        "(line 374,col 9)-(line 374,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 388,
      "end_line": 424,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 391,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 423,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 426,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 42)",
        "(line 428,col 9)-(line 428,col 49)",
        "(line 429,col 9)-(line 429,col 61)",
        "(line 430,col 9)-(line 430,col 52)",
        "(line 431,col 9)-(line 431,col 58)",
        "(line 433,col 9)-(line 433,col 24)",
        "(line 436,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 457,col 19)",
        "(line 458,col 9)-(line 458,col 46)",
        "(line 461,col 9)-(line 461,col 35)",
        "(line 462,col 9)-(line 462,col 39)",
        "(line 464,col 9)-(line 470,col 9)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 489,col 57)",
        "(line 492,col 9)-(line 501,col 9)",
        "(line 504,col 9)-(line 504,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 510,
      "end_line": 536,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 42)",
        "(line 513,col 9)-(line 513,col 57)",
        "(line 514,col 9)-(line 514,col 49)",
        "(line 515,col 9)-(line 515,col 47)",
        "(line 516,col 9)-(line 516,col 45)",
        "(line 517,col 9)-(line 517,col 45)",
        "(line 519,col 9)-(line 535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 538,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 31)",
        "(line 540,col 9)-(line 540,col 29)",
        "(line 542,col 9)-(line 542,col 45)",
        "(line 543,col 9)-(line 543,col 42)",
        "(line 544,col 9)-(line 544,col 42)",
        "(line 545,col 9)-(line 545,col 49)",
        "(line 546,col 9)-(line 546,col 52)",
        "(line 547,col 9)-(line 547,col 56)",
        "(line 548,col 9)-(line 548,col 64)",
        "(line 549,col 9)-(line 549,col 49)",
        "(line 550,col 9)-(line 550,col 47)",
        "(line 551,col 9)-(line 551,col 45)",
        "(line 552,col 9)-(line 552,col 45)",
        "(line 553,col 9)-(line 553,col 58)",
        "(line 560,col 9)-(line 563,col 9)",
        "(line 565,col 9)-(line 565,col 24)",
        "(line 566,col 9)-(line 566,col 34)",
        "(line 567,col 9)-(line 567,col 40)",
        "(line 568,col 9)-(line 568,col 50)",
        "(line 569,col 9)-(line 569,col 39)",
        "(line 570,col 9)-(line 570,col 39)",
        "(line 571,col 9)-(line 571,col 28)",
        "(line 572,col 9)-(line 572,col 42)",
        "(line 573,col 9)-(line 573,col 33)",
        "(line 574,col 9)-(line 574,col 35)",
        "(line 575,col 9)-(line 575,col 33)",
        "(line 576,col 9)-(line 576,col 37)",
        "(line 578,col 9)-(line 720,col 9)",
        "(line 722,col 9)-(line 722,col 31)",
        "(line 723,col 9)-(line 723,col 35)",
        "(line 724,col 9)-(line 724,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 727,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 45)",
        "(line 729,col 9)-(line 729,col 42)",
        "(line 730,col 9)-(line 730,col 59)",
        "(line 731,col 9)-(line 731,col 52)",
        "(line 732,col 9)-(line 732,col 40)",
        "(line 733,col 9)-(line 733,col 27)",
        "(line 734,col 9)-(line 734,col 39)",
        "(line 735,col 9)-(line 735,col 39)",
        "(line 737,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 754,col 35)",
        "(line 755,col 9)-(line 755,col 35)",
        "(line 757,col 9)-(line 757,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 760,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 761,col 9)-(line 763,col 9)",
        "(line 765,col 9)-(line 765,col 44)",
        "(line 766,col 9)-(line 766,col 57)",
        "(line 767,col 9)-(line 767,col 41)",
        "(line 768,col 9)-(line 768,col 21)",
        "(line 769,col 9)-(line 769,col 62)",
        "(line 771,col 9)-(line 774,col 9)",
        "(line 776,col 9)-(line 778,col 9)",
        "(line 780,col 9)-(line 782,col 9)",
        "(line 784,col 9)-(line 784,col 40)",
        "(line 785,col 9)-(line 785,col 26)",
        "(line 786,col 9)-(line 786,col 23)",
        "(line 787,col 9)-(line 787,col 26)",
        "(line 789,col 9)-(line 795,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 798,
      "end_line": 821,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 820,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 823,
      "end_line": 839,
      "comment": "",
      "child_ranges": [
        "(line 824,col 9)-(line 838,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 841,
      "end_line": 867,
      "comment": "",
      "child_ranges": [
        "(line 842,col 9)-(line 866,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 869,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 870,col 9)-(line 879,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 882,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 883,col 9)-(line 893,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 896,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 897,col 9)-(line 907,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 910,
      "end_line": 972,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 913,
      "end_line": 913,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 915,
      "end_line": 915,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 916,
      "end_line": 916,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 917,
      "end_line": 917,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 923,
      "end_line": 923,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 925,
      "end_line": 925,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 926,
      "end_line": 926,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 927,
      "end_line": 927,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 928,
      "end_line": 928,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 930,
      "end_line": 930,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 931,
      "end_line": 931,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 932,
      "end_line": 932,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 934,
      "end_line": 934,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 938,
      "end_line": 938,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 939,
      "end_line": 939,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 945,
      "end_line": 949,
      "comment": "",
      "child_ranges": [
        "(line 946,col 13)-(line 946,col 20)",
        "(line 948,col 13)-(line 948,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 958,
      "end_line": 970,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 959,col 13)-(line 959,col 37)",
        "(line 965,col 13)-(line 967,col 13)",
        "(line 969,col 13)-(line 969,col 28)"
      ]
    }
  ]
}