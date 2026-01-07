{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/compressors/bzip2/BZip2CompressorOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BZip2CompressorOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorOutputStream",
        "org.apache.commons.compress.compressors.bzip2.BZip2Constants"
      ],
      "begin_line": 30,
      "end_line": 1639,
      "comment": "\n * An output stream that compresses into the BZip2 format (without the file\n * header chars) into another stream. TODO: Update to BZip2 1.0.1\n "
    },
    {
      "type": "field",
      "varNames": [
        "SETMASK"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CLEARMASK"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "GREATER_ICOST"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LESSER_ICOST"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SMALL_THRESH"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEPTH_THRESH"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "QSORT_STACK_SIZE"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": "\n      If you are ever unlucky/improbable enough\n      to get a stack overflow whilst sorting,\n      increase the following constant and try\n      again.  In practice I have never seen the\n      stack go above 27 elems, so the following\n      limit seems very generous.\n    "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.panic()",
      "begin_line": 48,
      "end_line": 51,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.makeMaps()",
      "begin_line": 53,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 14)",
        "(line 55,col 9)-(line 55,col 19)",
        "(line 56,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbMakeCodeLengths(char[], int[], int, int)",
      "begin_line": 65,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 43)",
        "(line 72,col 9)-(line 72,col 25)",
        "(line 74,col 9)-(line 74,col 49)",
        "(line 75,col 9)-(line 75,col 51)",
        "(line 76,col 9)-(line 76,col 51)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 209,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "last"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n      index of the last char in the block, so\n      the block size \u003d\u003d last + 1.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "origPtr"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n      index in zptr[] of original string after sorting.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "blockSize100k"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": "\n      always: in the range 0 .. 9.\n      The current block size is 100000 * this number.\n    "
    },
    {
      "type": "field",
      "varNames": [
        "blockRandomised"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesOut"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsBuff"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bsLive"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mCrc"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inUse"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nInUse"
      ],
      "begin_line": 237,
      "end_line": 237,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "seqToUnseq"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "unseqToSeq"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "selector"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "selectorMtf"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "block"
      ],
      "begin_line": 245,
      "end_line": 245,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "quadrant"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zptr"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "szptr"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ftab"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nMTF"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "mtfFreq"
      ],
      "begin_line": 253,
      "end_line": 253,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "workFactor"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": "\n     * Used when sorting.  If too many long comparisons\n     * happen, we stop sorting, randomise the block\n     * slightly, and try again.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "workDone"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "workLimit"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "firstAttempt"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nBlocksRandomised"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentChar"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "runLength"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.BZip2CompressorOutputStream(java.io.OutputStream, int)",
      "begin_line": 273,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 21)",
        "(line 276,col 9)-(line 276,col 24)",
        "(line 277,col 9)-(line 277,col 20)",
        "(line 278,col 9)-(line 278,col 20)",
        "(line 280,col 9)-(line 280,col 30)",
        "(line 282,col 9)-(line 282,col 24)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 36)",
        "(line 290,col 9)-(line 290,col 37)",
        "(line 291,col 9)-(line 291,col 21)",
        "(line 292,col 9)-(line 292,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.write(int)",
      "begin_line": 300,
      "end_line": 319,
      "comment": "\n     *\n     * modified by Oliver Merkel, 010128\n     *\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 33)",
        "(line 302,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.writeRun()",
      "begin_line": 321,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 367,
      "end_line": 367,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finalize()",
      "begin_line": 369,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 16)",
        "(line 371,col 9)-(line 371,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.close()",
      "begin_line": 374,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 17)",
        "(line 379,col 9)-(line 379,col 22)",
        "(line 380,col 9)-(line 380,col 25)",
        "(line 381,col 9)-(line 381,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.finish()",
      "begin_line": 384,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 385,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 25)",
        "(line 393,col 9)-(line 393,col 19)",
        "(line 394,col 9)-(line 394,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.flush()",
      "begin_line": 397,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 22)",
        "(line 399,col 9)-(line 399,col 25)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "blockCRC",
        "combinedCRC"
      ],
      "begin_line": 402,
      "end_line": 402,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initialize()",
      "begin_line": 404,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 21)",
        "(line 406,col 9)-(line 406,col 30)",
        "(line 408,col 9)-(line 408,col 24)",
        "(line 409,col 9)-(line 409,col 24)",
        "(line 413,col 9)-(line 413,col 24)",
        "(line 414,col 9)-(line 414,col 40)",
        "(line 416,col 9)-(line 416,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "allowableBlockSize"
      ],
      "begin_line": 419,
      "end_line": 419,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.initBlock()",
      "begin_line": 421,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 29)",
        "(line 424,col 9)-(line 424,col 18)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 432,col 9)-(line 432,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endBlock()",
      "begin_line": 435,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 38)",
        "(line 437,col 9)-(line 437,col 64)",
        "(line 438,col 9)-(line 438,col 32)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 447,col 9)-(line 447,col 37)",
        "(line 462,col 9)-(line 462,col 25)",
        "(line 463,col 9)-(line 463,col 25)",
        "(line 464,col 9)-(line 464,col 25)",
        "(line 465,col 9)-(line 465,col 25)",
        "(line 466,col 9)-(line 466,col 25)",
        "(line 467,col 9)-(line 467,col 25)",
        "(line 470,col 9)-(line 470,col 27)",
        "(line 473,col 9)-(line 478,col 9)",
        "(line 481,col 9)-(line 481,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.endCompression()",
      "begin_line": 484,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 25)",
        "(line 493,col 9)-(line 493,col 25)",
        "(line 494,col 9)-(line 494,col 25)",
        "(line 495,col 9)-(line 495,col 25)",
        "(line 496,col 9)-(line 496,col 25)",
        "(line 497,col 9)-(line 497,col 25)",
        "(line 499,col 9)-(line 499,col 30)",
        "(line 501,col 9)-(line 501,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.hbAssignCodes(int[], char[], int, int, int)",
      "begin_line": 504,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 22)",
        "(line 508,col 9)-(line 508,col 16)",
        "(line 509,col 9)-(line 517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsSetStream(java.io.OutputStream)",
      "begin_line": 520,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 21)",
        "(line 522,col 9)-(line 522,col 19)",
        "(line 523,col 9)-(line 523,col 19)",
        "(line 524,col 9)-(line 524,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsFinishedWithStream()",
      "begin_line": 527,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 528,col 9)-(line 538,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsW(int, int)",
      "begin_line": 541,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 542,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 43)",
        "(line 554,col 9)-(line 554,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutUChar(int)",
      "begin_line": 557,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutint(int)",
      "begin_line": 561,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 33)",
        "(line 563,col 9)-(line 563,col 33)",
        "(line 564,col 9)-(line 564,col 33)",
        "(line 565,col 9)-(line 565,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.bsPutIntVS(int, int)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.sendMTFValues()",
      "begin_line": 572,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 58)",
        "(line 575,col 9)-(line 575,col 51)",
        "(line 576,col 9)-(line 576,col 62)",
        "(line 577,col 9)-(line 577,col 20)",
        "(line 579,col 9)-(line 579,col 31)",
        "(line 580,col 9)-(line 584,col 9)",
        "(line 587,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 601,col 9)",
        "(line 603,col 56)-(line 636,col 9)",
        "(line 638,col 9)-(line 638,col 58)",
        "(line 639,col 9)-(line 639,col 39)",
        "(line 640,col 9)-(line 640,col 43)",
        "(line 644,col 9)-(line 737,col 9)",
        "(line 739,col 9)-(line 739,col 21)",
        "(line 740,col 9)-(line 740,col 20)",
        "(line 741,col 9)-(line 741,col 20)",
        "(line 743,col 9)-(line 745,col 9)",
        "(line 746,col 9)-(line 748,col 9)",
        "(line 752,col 9)-(line 771,col 9)",
        "(line 773,col 9)-(line 773,col 57)",
        "(line 776,col 9)-(line 794,col 9)",
        "(line 797,col 9)-(line 829,col 9)",
        "(line 833,col 9)-(line 833,col 25)",
        "(line 834,col 9)-(line 834,col 29)",
        "(line 835,col 9)-(line 840,col 9)",
        "(line 845,col 9)-(line 859,col 9)",
        "(line 863,col 9)-(line 863,col 19)",
        "(line 864,col 9)-(line 864,col 15)",
        "(line 865,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 883,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.moveToFrontCodeAndSend()",
      "begin_line": 886,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 32)",
        "(line 888,col 9)-(line 888,col 28)",
        "(line 889,col 9)-(line 889,col 24)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "bsStream"
      ],
      "begin_line": 892,
      "end_line": 892,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.simpleSort(int, int, int)",
      "begin_line": 894,
      "end_line": 967,
      "comment": "",
      "child_ranges": [
        "(line 895,col 9)-(line 895,col 30)",
        "(line 896,col 9)-(line 896,col 14)",
        "(line 898,col 9)-(line 898,col 27)",
        "(line 899,col 9)-(line 901,col 9)",
        "(line 903,col 9)-(line 903,col 15)",
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 13)",
        "(line 909,col 9)-(line 966,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.vswap(int, int, int)",
      "begin_line": 969,
      "end_line": 979,
      "comment": "",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 21)",
        "(line 971,col 9)-(line 978,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.med3(char, char, char)",
      "begin_line": 981,
      "end_line": 995,
      "comment": "",
      "child_ranges": [
        "(line 982,col 9)-(line 982,col 15)",
        "(line 983,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 990,col 9)",
        "(line 991,col 9)-(line 993,col 9)",
        "(line 994,col 9)-(line 994,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "StackElem",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 997,
      "end_line": 1001,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "ll"
      ],
      "begin_line": 998,
      "end_line": 998,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hh"
      ],
      "begin_line": 999,
      "end_line": 999,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dd"
      ],
      "begin_line": 1000,
      "end_line": 1000,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.qSort3(int, int, int, org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.StackElem[])",
      "begin_line": 1003,
      "end_line": 1120,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 46)",
        "(line 1005,col 9)-(line 1005,col 26)",
        "(line 1007,col 9)-(line 1007,col 15)",
        "(line 1009,col 9)-(line 1009,col 28)",
        "(line 1010,col 9)-(line 1010,col 28)",
        "(line 1011,col 9)-(line 1011,col 27)",
        "(line 1012,col 9)-(line 1012,col 13)",
        "(line 1014,col 9)-(line 1119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.mainSort()",
      "begin_line": 1122,
      "end_line": 1321,
      "comment": "",
      "child_ranges": [
        "(line 1123,col 9)-(line 1123,col 25)",
        "(line 1124,col 9)-(line 1124,col 42)",
        "(line 1125,col 9)-(line 1125,col 34)",
        "(line 1126,col 9)-(line 1126,col 45)",
        "(line 1127,col 9)-(line 1127,col 19)",
        "(line 1128,col 9)-(line 1128,col 23)",
        "(line 1138,col 9)-(line 1140,col 9)",
        "(line 1141,col 9)-(line 1143,col 9)",
        "(line 1145,col 9)-(line 1145,col 35)",
        "(line 1147,col 9)-(line 1320,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.randomiseBlock()",
      "begin_line": 1323,
      "end_line": 1346,
      "comment": "",
      "child_ranges": [
        "(line 1324,col 9)-(line 1324,col 14)",
        "(line 1325,col 9)-(line 1325,col 23)",
        "(line 1326,col 9)-(line 1326,col 23)",
        "(line 1327,col 9)-(line 1329,col 9)",
        "(line 1331,col 9)-(line 1345,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.doReversibleTransformation()",
      "begin_line": 1348,
      "end_line": 1377,
      "comment": "",
      "child_ranges": [
        "(line 1349,col 9)-(line 1349,col 14)",
        "(line 1351,col 9)-(line 1351,col 38)",
        "(line 1352,col 9)-(line 1352,col 21)",
        "(line 1353,col 9)-(line 1353,col 32)",
        "(line 1354,col 9)-(line 1354,col 28)",
        "(line 1356,col 9)-(line 1356,col 19)",
        "(line 1358,col 9)-(line 1364,col 9)",
        "(line 1366,col 9)-(line 1366,col 21)",
        "(line 1367,col 9)-(line 1372,col 9)",
        "(line 1374,col 9)-(line 1376,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.fullGtU(int, int)",
      "begin_line": 1379,
      "end_line": 1501,
      "comment": "",
      "child_ranges": [
        "(line 1380,col 9)-(line 1380,col 14)",
        "(line 1381,col 9)-(line 1381,col 20)",
        "(line 1382,col 9)-(line 1382,col 19)",
        "(line 1384,col 9)-(line 1384,col 27)",
        "(line 1385,col 9)-(line 1385,col 27)",
        "(line 1386,col 9)-(line 1388,col 9)",
        "(line 1389,col 9)-(line 1389,col 13)",
        "(line 1390,col 9)-(line 1390,col 13)",
        "(line 1392,col 9)-(line 1392,col 27)",
        "(line 1393,col 9)-(line 1393,col 27)",
        "(line 1394,col 9)-(line 1396,col 9)",
        "(line 1397,col 9)-(line 1397,col 13)",
        "(line 1398,col 9)-(line 1398,col 13)",
        "(line 1400,col 9)-(line 1400,col 27)",
        "(line 1401,col 9)-(line 1401,col 27)",
        "(line 1402,col 9)-(line 1404,col 9)",
        "(line 1405,col 9)-(line 1405,col 13)",
        "(line 1406,col 9)-(line 1406,col 13)",
        "(line 1408,col 9)-(line 1408,col 27)",
        "(line 1409,col 9)-(line 1409,col 27)",
        "(line 1410,col 9)-(line 1412,col 9)",
        "(line 1413,col 9)-(line 1413,col 13)",
        "(line 1414,col 9)-(line 1414,col 13)",
        "(line 1416,col 9)-(line 1416,col 27)",
        "(line 1417,col 9)-(line 1417,col 27)",
        "(line 1418,col 9)-(line 1420,col 9)",
        "(line 1421,col 9)-(line 1421,col 13)",
        "(line 1422,col 9)-(line 1422,col 13)",
        "(line 1424,col 9)-(line 1424,col 27)",
        "(line 1425,col 9)-(line 1425,col 27)",
        "(line 1426,col 9)-(line 1428,col 9)",
        "(line 1429,col 9)-(line 1429,col 13)",
        "(line 1430,col 9)-(line 1430,col 13)",
        "(line 1432,col 9)-(line 1432,col 21)",
        "(line 1434,col 9)-(line 1498,col 25)",
        "(line 1500,col 9)-(line 1500,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "incs"
      ],
      "begin_line": 1509,
      "end_line": 1511,
      "comment": "\n      Knuth\u0027s increments seem to work better\n      than Incerpi-Sedgewick here.  Possibly\n      because the number of elems to sort is\n      usually small, typically \u003c\u003d 20.\n    "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.allocateCompressStructures()",
      "begin_line": 1513,
      "end_line": 1540,
      "comment": "",
      "child_ranges": [
        "(line 1514,col 9)-(line 1514,col 46)",
        "(line 1515,col 9)-(line 1515,col 56)",
        "(line 1516,col 9)-(line 1516,col 54)",
        "(line 1517,col 9)-(line 1517,col 26)",
        "(line 1518,col 9)-(line 1518,col 30)",
        "(line 1520,col 9)-(line 1524,col 9)",
        "(line 1539,col 9)-(line 1539,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream.generateMTFValues()",
      "begin_line": 1542,
      "end_line": 1638,
      "comment": "",
      "child_ranges": [
        "(line 1543,col 9)-(line 1543,col 34)",
        "(line 1544,col 9)-(line 1544,col 18)",
        "(line 1545,col 9)-(line 1545,col 17)",
        "(line 1546,col 9)-(line 1546,col 18)",
        "(line 1547,col 9)-(line 1547,col 18)",
        "(line 1548,col 9)-(line 1548,col 15)",
        "(line 1549,col 9)-(line 1549,col 16)",
        "(line 1551,col 9)-(line 1551,col 19)",
        "(line 1552,col 9)-(line 1552,col 25)",
        "(line 1554,col 9)-(line 1556,col 9)",
        "(line 1558,col 9)-(line 1558,col 15)",
        "(line 1559,col 9)-(line 1559,col 18)",
        "(line 1560,col 9)-(line 1562,col 9)",
        "(line 1565,col 9)-(line 1609,col 9)",
        "(line 1611,col 9)-(line 1631,col 9)",
        "(line 1633,col 9)-(line 1633,col 32)",
        "(line 1634,col 9)-(line 1634,col 13)",
        "(line 1635,col 9)-(line 1635,col 23)",
        "(line 1637,col 9)-(line 1637,col 18)"
      ]
    }
  ]
}