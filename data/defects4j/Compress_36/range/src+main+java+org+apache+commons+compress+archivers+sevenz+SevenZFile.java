{
  "filepath": "/tmp/Compress-36b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 69,
      "end_line": 1011,
      "comment": "\n * Reads a 7z file, using RandomAccessFile under\n * the covers.\n * \u003cp\u003e\n * The 7z file format is a flexible container\n * that can contain many compression and\n * encryption types, but at the moment only\n * only Copy, LZMA, LZMA2, BZIP2, Deflate and AES-256 + SHA-256\n * are supported.\n * \u003cp\u003e\n * The format is very Windows/Intel specific,\n * so it uses little-endian byte order,\n * doesn\u0027t store user/group or permission bits,\n * and represents times using NTFS timestamps\n * (100 nanosecond units since 1 January 1601).\n * Hence the official tools recommend against\n * using it for backup purposes on *nix, and\n * recommend .tar.7z or .tar.lzma or .tar.xz\n * instead.  \n * \u003cp\u003e\n * Both the header and file contents may be\n * compressed and/or encrypted. With both\n * encrypted, neither file names nor file\n * contents can be read, but the use of\n * encryption isn\u0027t plausibly deniable.\n * \n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIGNATURE_HEADER_SIZE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
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
        "password"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deferredBlockStreams"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sevenZSignature"
      ],
      "begin_line": 82,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File, byte[])",
      "begin_line": 95,
      "end_line": 113,
      "comment": "\n     * Reads a file as 7z archive\n     *\n     * @param filename the file to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 34)",
        "(line 97,col 9)-(line 97,col 56)",
        "(line 98,col 9)-(line 98,col 51)",
        "(line 99,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Reads a file as unencrypted 7z archive\n     *\n     * @param filename the file to read\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.close()",
      "begin_line": 129,
      "end_line": 142,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if closing the file fails\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getNextEntry()",
      "begin_line": 151,
      "end_line": 159,
      "comment": "\n     * Returns the next Archive Entry in this archive.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 28)",
        "(line 156,col 9)-(line 156,col 74)",
        "(line 157,col 9)-(line 157,col 30)",
        "(line 158,col 9)-(line 158,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getEntries()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Returns meta-data of all archive entries.\n     *\n     * \u003cp\u003eThis method only provides meta-data, the entries can not be\n     * used to read the contents, you still need to process all\n     * entries in order using {@link #getNextEntry} for that.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe content methods are only available for entries that have\n     * already been reached via {@link #getNextEntry}.\u003c/p\u003e\n     *\n     * @return meta-data of all archive entries.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeaders(byte[])",
      "begin_line": 178,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 45)",
        "(line 180,col 9)-(line 180,col 34)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 57)",
        "(line 186,col 9)-(line 186,col 57)",
        "(line 187,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 87)",
        "(line 193,col 9)-(line 193,col 72)",
        "(line 195,col 9)-(line 195,col 71)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 72)",
        "(line 200,col 9)-(line 200,col 62)",
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 202,col 38)",
        "(line 203,col 9)-(line 203,col 31)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 85)",
        "(line 209,col 9)-(line 210,col 28)",
        "(line 211,col 9)-(line 211,col 40)",
        "(line 212,col 9)-(line 212,col 59)",
        "(line 213,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(long)",
      "begin_line": 229,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 58)",
        "(line 231,col 9)-(line 231,col 47)",
        "(line 232,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeader(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 246,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 44)",
        "(line 249,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readArchiveProperties(java.io.DataInput)",
      "begin_line": 274,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 44)",
        "(line 277,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readEncodedHeader(java.io.DataInputStream, org.apache.commons.compress.archivers.sevenz.Archive, byte[])",
      "begin_line": 285,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 41)",
        "(line 290,col 9)-(line 290,col 49)",
        "(line 291,col 9)-(line 291,col 43)",
        "(line 292,col 9)-(line 293,col 18)",
        "(line 295,col 9)-(line 295,col 32)",
        "(line 296,col 9)-(line 297,col 57)",
        "(line 298,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 308,col 9)",
        "(line 309,col 9)-(line 309,col 72)",
        "(line 310,col 9)-(line 310,col 92)",
        "(line 311,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 319,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 44)",
        "(line 322,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readPackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 345,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 45)",
        "(line 347,col 9)-(line 347,col 55)",
        "(line 348,col 9)-(line 348,col 44)",
        "(line 349,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 367,col 9)",
        "(line 369,col 9)-(line 371,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUnpackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 374,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 44)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 51)",
        "(line 380,col 9)-(line 380,col 61)",
        "(line 381,col 9)-(line 381,col 34)",
        "(line 382,col 9)-(line 382,col 55)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 390,col 40)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 401,col 40)",
        "(line 402,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 418,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readSubStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 421,
      "end_line": 502,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 425,col 56)",
        "(line 427,col 9)-(line 427,col 44)",
        "(line 428,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 438,col 67)",
        "(line 439,col 9)-(line 439,col 66)",
        "(line 440,col 9)-(line 440,col 63)",
        "(line 441,col 9)-(line 441,col 59)",
        "(line 443,col 9)-(line 443,col 33)",
        "(line 444,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 462,col 27)",
        "(line 463,col 9)-(line 467,col 9)",
        "(line 469,col 9)-(line 495,col 9)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 501,col 9)-(line 501,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.io.DataInput)",
      "begin_line": 504,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 43)",
        "(line 507,col 9)-(line 507,col 50)",
        "(line 508,col 9)-(line 508,col 57)",
        "(line 509,col 9)-(line 509,col 32)",
        "(line 510,col 9)-(line 510,col 33)",
        "(line 511,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 31)",
        "(line 542,col 9)-(line 542,col 50)",
        "(line 543,col 9)-(line 543,col 52)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 54)",
        "(line 549,col 9)-(line 549,col 69)",
        "(line 550,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 37)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 68)",
        "(line 561,col 9)-(line 561,col 69)",
        "(line 562,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 45)",
        "(line 580,col 9)-(line 580,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readAllOrBits(java.io.DataInput, int)",
      "begin_line": 583,
      "end_line": 595,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 60)",
        "(line 585,col 9)-(line 585,col 26)",
        "(line 586,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readBits(java.io.DataInput, int)",
      "begin_line": 597,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 45)",
        "(line 599,col 9)-(line 599,col 21)",
        "(line 600,col 9)-(line 600,col 22)",
        "(line 601,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 612,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 49)",
        "(line 614,col 9)-(line 614,col 81)",
        "(line 615,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 618,col 36)",
        "(line 619,col 9)-(line 619,col 34)",
        "(line 620,col 9)-(line 620,col 29)",
        "(line 621,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 36)",
        "(line 748,col 9)-(line 748,col 33)",
        "(line 749,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 30)",
        "(line 767,col 9)-(line 767,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 770,
      "end_line": 821,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 52)",
        "(line 773,col 9)-(line 773,col 42)",
        "(line 774,col 9)-(line 774,col 84)",
        "(line 775,col 9)-(line 775,col 67)",
        "(line 776,col 9)-(line 779,col 9)",
        "(line 781,col 9)-(line 781,col 38)",
        "(line 782,col 9)-(line 782,col 90)",
        "(line 783,col 9)-(line 783,col 61)",
        "(line 784,col 9)-(line 787,col 9)",
        "(line 789,col 9)-(line 789,col 61)",
        "(line 790,col 9)-(line 790,col 66)",
        "(line 791,col 9)-(line 791,col 32)",
        "(line 792,col 9)-(line 792,col 44)",
        "(line 793,col 9)-(line 818,col 9)",
        "(line 820,col 9)-(line 820,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecodingStream()",
      "begin_line": 823,
      "end_line": 862,
      "comment": "",
      "child_ranges": [
        "(line 824,col 9)-(line 824,col 85)",
        "(line 825,col 9)-(line 830,col 9)",
        "(line 831,col 9)-(line 831,col 73)",
        "(line 832,col 9)-(line 854,col 9)",
        "(line 856,col 9)-(line 856,col 98)",
        "(line 857,col 9)-(line 859,col 9)",
        "(line 861,col 9)-(line 861,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder, long, int, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 864,
      "end_line": 888,
      "comment": "",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 32)",
        "(line 867,col 9)-(line 870,col 60)",
        "(line 871,col 9)-(line 871,col 106)",
        "(line 872,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 41)",
        "(line 883,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read()",
      "begin_line": 897,
      "end_line": 899,
      "comment": "\n     * Reads a byte of data.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getCurrentStream()",
      "begin_line": 901,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 902,col 9)-(line 904,col 9)",
        "(line 906,col 9)-(line 913,col 9)",
        "(line 915,col 9)-(line 915,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[])",
      "begin_line": 926,
      "end_line": 928,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[], int, int)",
      "begin_line": 940,
      "end_line": 942,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @param off offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 941,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUint64(java.io.DataInput)",
      "begin_line": 944,
      "end_line": 958,
      "comment": "",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 53)",
        "(line 947,col 9)-(line 947,col 24)",
        "(line 948,col 9)-(line 948,col 23)",
        "(line 949,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 957,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byte[], int)",
      "begin_line": 970,
      "end_line": 981,
      "comment": "\n     * Checks if the signature matches what is expected for a 7z file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this is the signature of a 7z archive.\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 973,col 9)",
        "(line 975,col 9)-(line 979,col 9)",
        "(line 980,col 9)-(line 980,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.skipBytesFully(java.io.DataInput, long)",
      "begin_line": 983,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 984,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 25)",
        "(line 988,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 1003,col 9)",
        "(line 1004,col 9)-(line 1004,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.toString()",
      "begin_line": 1007,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 7)-(line 1009,col 32)"
      ]
    }
  ]
}