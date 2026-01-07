{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFile",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 70,
      "end_line": 929,
      "comment": "\n * Reads a 7z file, using RandomAccessFile under\n * the covers.\n * \u003cp\u003e\n * The 7z file format is a flexible container\n * that can contain many compression and\n * encryption types, but at the moment only\n * only Copy, LZMA2, BZIP2, and AES-256 + SHA-256\n * are supported, and archive header compression\n * (when it uses the unsupported LZMA\n * compression) isn\u0027t. So the only archives\n * that can be read are the following:\n * \u003cpre\u003e\n * 7z a -mhc\u003doff [-mhe\u003don] -mx\u003d0 [-ppassword] archive.7z files\n * 7z a -mhc\u003doff [-mhe\u003don] -m0\u003dLZMA2 [-ppassword] archive.7z files\n * 7z a -mhc\u003doff [-mhe\u003don] -m0\u003dBZIP2 [-ppassword] archive.7z files\n * \u003c/pre\u003e\n * \u003cp\u003e\n * The format is very Windows/Intel specific,\n * so it uses little-endian byte order,\n * doesn\u0027t store user/group or permission bits,\n * and represents times using NTFS timestamps\n * (100 nanosecond units since 1 January 1601).\n * Hence the official tools recommend against\n * using it for backup purposes on *nix, and\n * recommend .tar.7z or .tar.lzma or .tar.xz\n * instead.  \n * \u003cp\u003e\n * Both the header and file contents may be\n * compressed and/or encrypted. With both\n * encrypted, neither file names nor file\n * contents can be read, but the use of\n * encryption isn\u0027t plausibly deniable.\n * \n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "DEBUG"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIGNATURE_HEADER_SIZE"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryIndex"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderIndex"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderInputStream"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryInputStream"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "password"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sevenZSignature"
      ],
      "begin_line": 81,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File, java.lang.String)",
      "begin_line": 85,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 34)",
        "(line 87,col 9)-(line 87,col 33)",
        "(line 88,col 9)-(line 88,col 56)",
        "(line 89,col 9)-(line 96,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.close()",
      "begin_line": 103,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.debug(java.lang.String)",
      "begin_line": 113,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.debug(java.lang.String, java.lang.Object...)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 122,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getNextEntry()",
      "begin_line": 125,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 28)",
        "(line 130,col 9)-(line 130,col 74)",
        "(line 131,col 9)-(line 131,col 30)",
        "(line 132,col 9)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeaders()",
      "begin_line": 135,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 33)",
        "(line 138,col 9)-(line 138,col 45)",
        "(line 139,col 9)-(line 139,col 34)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 144,col 57)",
        "(line 145,col 9)-(line 145,col 57)",
        "(line 146,col 9)-(line 147,col 58)",
        "(line 148,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 72)",
        "(line 154,col 9)-(line 154,col 72)",
        "(line 156,col 9)-(line 156,col 71)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 72)",
        "(line 161,col 9)-(line 161,col 62)",
        "(line 162,col 9)-(line 162,col 35)",
        "(line 163,col 9)-(line 163,col 38)",
        "(line 164,col 9)-(line 164,col 31)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 85)",
        "(line 170,col 9)-(line 171,col 28)",
        "(line 172,col 9)-(line 172,col 40)",
        "(line 173,col 9)-(line 173,col 59)",
        "(line 174,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(int)",
      "begin_line": 188,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 58)",
        "(line 190,col 9)-(line 190,col 47)",
        "(line 191,col 9)-(line 202,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeader(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 205,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 24)",
        "(line 208,col 9)-(line 208,col 44)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 218,col 9)",
        "(line 220,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readArchiveProperties(java.io.DataInput)",
      "begin_line": 235,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 35)",
        "(line 239,col 9)-(line 239,col 44)",
        "(line 240,col 9)-(line 245,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readEncodedHeader(java.io.DataInputStream, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 248,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 31)",
        "(line 251,col 9)-(line 251,col 41)",
        "(line 254,col 9)-(line 254,col 49)",
        "(line 255,col 9)-(line 255,col 43)",
        "(line 256,col 9)-(line 257,col 18)",
        "(line 259,col 9)-(line 259,col 32)",
        "(line 260,col 9)-(line 261,col 57)",
        "(line 262,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 72)",
        "(line 273,col 9)-(line 273,col 92)",
        "(line 274,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 279,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 306,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 29)",
        "(line 309,col 9)-(line 309,col 44)",
        "(line 311,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readPackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 331,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 26)",
        "(line 334,col 9)-(line 334,col 45)",
        "(line 335,col 9)-(line 335,col 55)",
        "(line 336,col 9)-(line 336,col 55)",
        "(line 338,col 9)-(line 338,col 44)",
        "(line 339,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 358,col 9)",
        "(line 360,col 9)-(line 362,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUnpackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 365,
      "end_line": 414,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 28)",
        "(line 368,col 9)-(line 368,col 44)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 51)",
        "(line 373,col 9)-(line 373,col 46)",
        "(line 374,col 9)-(line 374,col 61)",
        "(line 375,col 9)-(line 375,col 34)",
        "(line 376,col 9)-(line 376,col 55)",
        "(line 377,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 385,col 40)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 40)",
        "(line 397,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 413,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readSubStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 416,
      "end_line": 499,
      "comment": "",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 32)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 56)",
        "(line 424,col 9)-(line 424,col 44)",
        "(line 425,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 67)",
        "(line 436,col 9)-(line 436,col 66)",
        "(line 437,col 9)-(line 437,col 63)",
        "(line 438,col 9)-(line 438,col 58)",
        "(line 440,col 9)-(line 440,col 33)",
        "(line 441,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 27)",
        "(line 460,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 496,col 9)",
        "(line 498,col 9)-(line 498,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.io.DataInput)",
      "begin_line": 501,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 43)",
        "(line 504,col 9)-(line 504,col 50)",
        "(line 505,col 9)-(line 505,col 57)",
        "(line 506,col 9)-(line 506,col 32)",
        "(line 507,col 9)-(line 507,col 33)",
        "(line 508,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 31)",
        "(line 548,col 9)-(line 548,col 50)",
        "(line 549,col 9)-(line 549,col 52)",
        "(line 551,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 54)",
        "(line 555,col 9)-(line 555,col 69)",
        "(line 556,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 562,col 37)",
        "(line 564,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 68)",
        "(line 568,col 9)-(line 568,col 69)",
        "(line 569,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 45)",
        "(line 587,col 9)-(line 587,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readAllOrBits(java.io.DataInput, int)",
      "begin_line": 590,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 60)",
        "(line 592,col 9)-(line 592,col 26)",
        "(line 593,col 9)-(line 600,col 9)",
        "(line 601,col 9)-(line 601,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readBits(java.io.DataInput, int)",
      "begin_line": 604,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 45)",
        "(line 606,col 9)-(line 606,col 21)",
        "(line 607,col 9)-(line 607,col 22)",
        "(line 608,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 616,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 619,
      "end_line": 784,
      "comment": "",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 27)",
        "(line 622,col 9)-(line 622,col 49)",
        "(line 623,col 9)-(line 623,col 81)",
        "(line 624,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 36)",
        "(line 628,col 9)-(line 628,col 34)",
        "(line 629,col 9)-(line 629,col 29)",
        "(line 630,col 9)-(line 762,col 9)",
        "(line 763,col 9)-(line 763,col 36)",
        "(line 764,col 9)-(line 764,col 33)",
        "(line 765,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 30)",
        "(line 783,col 9)-(line 783,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 786,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 787,col 9)-(line 787,col 52)",
        "(line 789,col 9)-(line 789,col 42)",
        "(line 790,col 9)-(line 790,col 86)",
        "(line 791,col 9)-(line 791,col 67)",
        "(line 792,col 9)-(line 795,col 9)",
        "(line 797,col 9)-(line 797,col 38)",
        "(line 798,col 9)-(line 798,col 92)",
        "(line 799,col 9)-(line 799,col 61)",
        "(line 800,col 9)-(line 803,col 9)",
        "(line 805,col 9)-(line 805,col 61)",
        "(line 806,col 9)-(line 806,col 66)",
        "(line 807,col 9)-(line 807,col 32)",
        "(line 808,col 9)-(line 808,col 44)",
        "(line 809,col 9)-(line 834,col 9)",
        "(line 836,col 9)-(line 836,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecodingStream()",
      "begin_line": 839,
      "end_line": 872,
      "comment": "",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 85)",
        "(line 841,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 861,col 9)",
        "(line 862,col 9)-(line 862,col 73)",
        "(line 863,col 9)-(line 864,col 58)",
        "(line 865,col 9)-(line 870,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.drainPreviousEntry()",
      "begin_line": 874,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 875,col 9)-(line 881,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder, long, int)",
      "begin_line": 884,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 32)",
        "(line 887,col 9)-(line 888,col 57)",
        "(line 889,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 900,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read()",
      "begin_line": 903,
      "end_line": 905,
      "comment": "",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[])",
      "begin_line": 907,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[], int, int)",
      "begin_line": 911,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUint64(java.io.DataInput)",
      "begin_line": 915,
      "end_line": 928,
      "comment": "",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 46)",
        "(line 917,col 9)-(line 917,col 24)",
        "(line 918,col 9)-(line 918,col 22)",
        "(line 919,col 9)-(line 926,col 9)",
        "(line 927,col 9)-(line 927,col 21)"
      ]
    }
  ]
}