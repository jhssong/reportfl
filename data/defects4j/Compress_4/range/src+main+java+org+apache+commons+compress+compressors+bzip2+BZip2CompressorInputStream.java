{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorInputStream.java",
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
      "end_line": 968,
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
        "currentChar"
      ],
      "begin_line": 66,
      "end_line": 66,
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
      "begin_line": 108,
      "end_line": 113,
      "comment": "\n     * Constructs a new BZip2CompressorInputStream which decompresses bytes read from the\n     * specified stream.\n     * \n     * @throws IOException\n     *             if the stream content is malformed or an I/O error occurs.\n     * @throws NullPointerException\n     *             if \u003ctt\u003ein \u003d\u003d null\u003c/tt\u003e\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 16)",
        "(line 111,col 9)-(line 111,col 21)",
        "(line 112,col 9)-(line 112,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read()",
      "begin_line": 120,
      "end_line": 126,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read()\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read(byte[], int, int)",
      "begin_line": 133,
      "end_line": 156,
      "comment": "\n     * (non-Javadoc)\n     * \n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 144,col 9)",
        "(line 145,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 149,col 34)",
        "(line 150,col 9)-(line 150,col 28)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.makeMaps()",
      "begin_line": 158,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 48)",
        "(line 160,col 9)-(line 160,col 55)",
        "(line 162,col 9)-(line 162,col 29)",
        "(line 164,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.read0()",
      "begin_line": 172,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 45)",
        "(line 175,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.init()",
      "begin_line": 211,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 37)",
        "(line 219,col 9)-(line 219,col 38)",
        "(line 220,col 9)-(line 220,col 37)",
        "(line 222,col 9)-(line 222,col 39)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 45)",
        "(line 230,col 9)-(line 230,col 20)",
        "(line 231,col 9)-(line 231,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.checkMagicChar(char, java.lang.String)",
      "begin_line": 234,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 35)",
        "(line 237,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.initBlock()",
      "begin_line": 244,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 35)",
        "(line 246,col 9)-(line 246,col 35)",
        "(line 247,col 9)-(line 247,col 35)",
        "(line 248,col 9)-(line 248,col 35)",
        "(line 249,col 9)-(line 249,col 35)",
        "(line 250,col 9)-(line 250,col 35)",
        "(line 252,col 9)-(line 281,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.endBlock()",
      "begin_line": 284,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 55)",
        "(line 288,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 299,col 48)",
        "(line 300,col 9)-(line 300,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.complete()",
      "begin_line": 303,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 44)",
        "(line 305,col 9)-(line 305,col 32)",
        "(line 306,col 9)-(line 306,col 25)",
        "(line 308,col 9)-(line 310,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.close()",
      "begin_line": 313,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 39)",
        "(line 315,col 9)-(line 324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsR(int)",
      "begin_line": 327,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 39)",
        "(line 329,col 9)-(line 329,col 39)",
        "(line 331,col 9)-(line 345,col 9)",
        "(line 347,col 9)-(line 347,col 39)",
        "(line 348,col 9)-(line 348,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetBit()",
      "begin_line": 351,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 39)",
        "(line 353,col 9)-(line 353,col 39)",
        "(line 355,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 39)",
        "(line 368,col 9)-(line 368,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetUByte()",
      "begin_line": 371,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.bsGetInt()",
      "begin_line": 375,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.hbCreateDecodeTables(int[], int[], int[], char[], int, int, int)",
      "begin_line": 382,
      "end_line": 418,
      "comment": "\n     * Called by createHuffmanDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 385,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 396,col 9)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 402,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.recvDecodingTables()",
      "begin_line": 420,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 42)",
        "(line 422,col 9)-(line 422,col 49)",
        "(line 423,col 9)-(line 423,col 61)",
        "(line 424,col 9)-(line 424,col 52)",
        "(line 425,col 9)-(line 425,col 58)",
        "(line 427,col 9)-(line 427,col 24)",
        "(line 430,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 451,col 19)",
        "(line 452,col 9)-(line 452,col 46)",
        "(line 455,col 9)-(line 455,col 35)",
        "(line 456,col 9)-(line 456,col 39)",
        "(line 458,col 9)-(line 464,col 9)",
        "(line 467,col 9)-(line 469,col 9)",
        "(line 471,col 9)-(line 481,col 9)",
        "(line 483,col 9)-(line 483,col 57)",
        "(line 486,col 9)-(line 495,col 9)",
        "(line 498,col 9)-(line 498,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.createHuffmanDecodingTables(int, int)",
      "begin_line": 504,
      "end_line": 530,
      "comment": "\n     * Called by recvDecodingTables() exclusively.\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 42)",
        "(line 507,col 9)-(line 507,col 57)",
        "(line 508,col 9)-(line 508,col 49)",
        "(line 509,col 9)-(line 509,col 47)",
        "(line 510,col 9)-(line 510,col 45)",
        "(line 511,col 9)-(line 511,col 45)",
        "(line 513,col 9)-(line 529,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode()",
      "begin_line": 532,
      "end_line": 719,
      "comment": "",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 31)",
        "(line 534,col 9)-(line 534,col 29)",
        "(line 536,col 9)-(line 536,col 45)",
        "(line 537,col 9)-(line 537,col 42)",
        "(line 538,col 9)-(line 538,col 42)",
        "(line 539,col 9)-(line 539,col 49)",
        "(line 540,col 9)-(line 540,col 52)",
        "(line 541,col 9)-(line 541,col 56)",
        "(line 542,col 9)-(line 542,col 64)",
        "(line 543,col 9)-(line 543,col 49)",
        "(line 544,col 9)-(line 544,col 47)",
        "(line 545,col 9)-(line 545,col 45)",
        "(line 546,col 9)-(line 546,col 45)",
        "(line 547,col 9)-(line 547,col 58)",
        "(line 554,col 9)-(line 557,col 9)",
        "(line 559,col 9)-(line 559,col 24)",
        "(line 560,col 9)-(line 560,col 34)",
        "(line 561,col 9)-(line 561,col 40)",
        "(line 562,col 9)-(line 562,col 50)",
        "(line 563,col 9)-(line 563,col 39)",
        "(line 564,col 9)-(line 564,col 39)",
        "(line 565,col 9)-(line 565,col 28)",
        "(line 566,col 9)-(line 566,col 42)",
        "(line 567,col 9)-(line 567,col 33)",
        "(line 568,col 9)-(line 568,col 35)",
        "(line 569,col 9)-(line 569,col 33)",
        "(line 570,col 9)-(line 570,col 37)",
        "(line 572,col 9)-(line 714,col 9)",
        "(line 716,col 9)-(line 716,col 31)",
        "(line 717,col 9)-(line 717,col 35)",
        "(line 718,col 9)-(line 718,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.getAndMoveToFrontDecode0(int)",
      "begin_line": 721,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 45)",
        "(line 723,col 9)-(line 723,col 42)",
        "(line 724,col 9)-(line 724,col 59)",
        "(line 725,col 9)-(line 725,col 52)",
        "(line 726,col 9)-(line 726,col 40)",
        "(line 727,col 9)-(line 727,col 27)",
        "(line 728,col 9)-(line 728,col 39)",
        "(line 729,col 9)-(line 729,col 39)",
        "(line 731,col 9)-(line 746,col 9)",
        "(line 748,col 9)-(line 748,col 35)",
        "(line 749,col 9)-(line 749,col 35)",
        "(line 751,col 9)-(line 751,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupBlock()",
      "begin_line": 754,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 755,col 9)-(line 757,col 9)",
        "(line 759,col 9)-(line 759,col 44)",
        "(line 760,col 9)-(line 760,col 57)",
        "(line 761,col 9)-(line 761,col 41)",
        "(line 762,col 9)-(line 762,col 21)",
        "(line 763,col 9)-(line 763,col 62)",
        "(line 765,col 9)-(line 768,col 9)",
        "(line 770,col 9)-(line 772,col 9)",
        "(line 774,col 9)-(line 776,col 9)",
        "(line 778,col 9)-(line 778,col 40)",
        "(line 779,col 9)-(line 779,col 26)",
        "(line 780,col 9)-(line 780,col 23)",
        "(line 781,col 9)-(line 781,col 26)",
        "(line 783,col 9)-(line 789,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartA()",
      "begin_line": 792,
      "end_line": 815,
      "comment": "",
      "child_ranges": [
        "(line 793,col 9)-(line 814,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartA()",
      "begin_line": 817,
      "end_line": 833,
      "comment": "",
      "child_ranges": [
        "(line 818,col 9)-(line 832,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartB()",
      "begin_line": 835,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 836,col 9)-(line 860,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupRandPartC()",
      "begin_line": 863,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 864,col 9)-(line 873,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartB()",
      "begin_line": 876,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 877,col 9)-(line 887,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.setupNoRandPartC()",
      "begin_line": 890,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 891,col 9)-(line 901,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Data",
      "is_interface": false,
      "parent_types": [
        "java.lang.Object"
      ],
      "begin_line": 904,
      "end_line": 966,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 907,
      "end_line": 907,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 909,
      "end_line": 909,
      "comment": " 256 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 910,
      "end_line": 910,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 911,
      "end_line": 911,
      "comment": " 18002 byte"
    },
    {
      "type": "field",
      "varNames": [
        "unzftab"
      ],
      "begin_line": 917,
      "end_line": 917,
      "comment": " 1024 byte"
    },
    {
      "type": "field",
      "varNames": [
        "limit"
      ],
      "begin_line": 919,
      "end_line": 919,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "base"
      ],
      "begin_line": 920,
      "end_line": 920,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "perm"
      ],
      "begin_line": 921,
      "end_line": 921,
      "comment": " 6192 byte"
    },
    {
      "type": "field",
      "varNames": [
        "minLens"
      ],
      "begin_line": 922,
      "end_line": 922,
      "comment": " 24 byte"
    },
    {
      "type": "field",
      "varNames": [
        "cftab"
      ],
      "begin_line": 924,
      "end_line": 924,
      "comment": " 1028 byte"
    },
    {
      "type": "field",
      "varNames": [
        "getAndMoveToFrontDecode_yy"
      ],
      "begin_line": 925,
      "end_line": 925,
      "comment": " 512 byte"
    },
    {
      "type": "field",
      "varNames": [
        "temp_charArray2d"
      ],
      "begin_line": 926,
      "end_line": 926,
      "comment": " 3096"
    },
    {
      "type": "field",
      "varNames": [
        "recvDecodingTables_pos"
      ],
      "begin_line": 928,
      "end_line": 928,
      "comment": " 6 byte"
    },
    {
      "type": "field",
      "varNames": [
        "tt"
      ],
      "begin_line": 932,
      "end_line": 932,
      "comment": " 3600000 byte"
    },
    {
      "type": "field",
      "varNames": [
        "ll8"
      ],
      "begin_line": 933,
      "end_line": 933,
      "comment": " 900000 byte"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.Data(int)",
      "begin_line": 939,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 940,col 13)-(line 940,col 20)",
        "(line 942,col 13)-(line 942,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream.Data.initTT(int)",
      "begin_line": 952,
      "end_line": 964,
      "comment": "\n         * Initializes the {@link #tt} array.\n         * \n         * This method is called when the required length of the array is known.\n         * I don\u0027t initialize it at construction time to avoid unneccessary\n         * memory allocation when compressing small files.\n         ",
      "child_ranges": [
        "(line 953,col 13)-(line 953,col 37)",
        "(line 959,col 13)-(line 961,col 13)",
        "(line 963,col 13)-(line 963,col 28)"
      ]
    }
  ]
}