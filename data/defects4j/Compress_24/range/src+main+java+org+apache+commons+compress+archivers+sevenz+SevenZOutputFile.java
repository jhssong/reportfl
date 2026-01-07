{
  "filepath": "/tmp/Compress-24b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZOutputFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 41,
      "end_line": 682,
      "comment": "\n * Writes a 7z file.\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "files"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numNonEmptyStreams"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc32"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressedCrc32"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileBytesWritten"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentOutputStream"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentCompression"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.SevenZOutputFile(java.io.File)",
      "begin_line": 58,
      "end_line": 61,
      "comment": "\n     * Opens file to write a 7z archive to.\n     *\n     * @param filename name of the file to write to\n     * @throws IOException if opening the file fails\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 52)",
        "(line 60,col 9)-(line 60,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setContentCompression(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Sets the compression method to use for entry contents - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close()",
      "begin_line": 80,
      "end_line": 85,
      "comment": "\n     * Closes the archive, calling {@link #finish} if necessary.\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 96,
      "end_line": 103,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile\n     * @param entryName \n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 66)",
        "(line 99,col 9)-(line 99,col 52)",
        "(line 100,col 9)-(line 100,col 33)",
        "(line 101,col 9)-(line 101,col 70)",
        "(line 102,col 9)-(line 102,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 114,
      "end_line": 117,
      "comment": "\n     * Records an archive entry to add.\n     *\n     * The caller must then write the content to the archive and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param archiveEntry describes the entry\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 75)",
        "(line 116,col 9)-(line 116,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry()",
      "begin_line": 123,
      "end_line": 148,
      "comment": "\n     * Closes the archive entry.\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 127,col 9)",
        "(line 129,col 9)-(line 129,col 69)",
        "(line 130,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 35)",
        "(line 145,col 9)-(line 145,col 22)",
        "(line 146,col 9)-(line 146,col 32)",
        "(line 147,col 9)-(line 147,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(int)",
      "begin_line": 155,
      "end_line": 157,
      "comment": "\n     * Writes a byte to the current archive entry.\n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[])",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Writes a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[], int, int)",
      "begin_line": 175,
      "end_line": 179,
      "comment": "\n     * Writes part of a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @param off offset into the array to start writing from\n     * @param len number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish()",
      "begin_line": 186,
      "end_line": 225,
      "comment": "\n     * Finishes the addition of entries to this archive, without closing it.\n     * \n     * @throws IOException if archive is already closed.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 24)",
        "(line 192,col 9)-(line 192,col 58)",
        "(line 194,col 9)-(line 194,col 77)",
        "(line 195,col 9)-(line 195,col 73)",
        "(line 197,col 9)-(line 197,col 28)",
        "(line 198,col 9)-(line 198,col 23)",
        "(line 199,col 9)-(line 199,col 60)",
        "(line 200,col 9)-(line 200,col 32)",
        "(line 202,col 9)-(line 202,col 40)",
        "(line 205,col 9)-(line 205,col 21)",
        "(line 206,col 9)-(line 206,col 47)",
        "(line 208,col 9)-(line 208,col 22)",
        "(line 209,col 9)-(line 209,col 22)",
        "(line 212,col 9)-(line 212,col 82)",
        "(line 213,col 9)-(line 213,col 89)",
        "(line 214,col 9)-(line 214,col 106)",
        "(line 215,col 9)-(line 215,col 89)",
        "(line 216,col 9)-(line 216,col 22)",
        "(line 217,col 9)-(line 217,col 34)",
        "(line 218,col 9)-(line 218,col 80)",
        "(line 219,col 9)-(line 219,col 34)",
        "(line 220,col 9)-(line 220,col 70)",
        "(line 221,col 9)-(line 221,col 22)",
        "(line 222,col 9)-(line 222,col 39)",
        "(line 223,col 9)-(line 223,col 68)",
        "(line 224,col 9)-(line 224,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getCurrentOutputStream()",
      "begin_line": 232,
      "end_line": 237,
      "comment": "\n     * Creation of output stream is deferred until data is actually\n     * written as some codecs might write header information even for\n     * empty streams and directories otherwise.\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setupFileOutputStream()",
      "begin_line": 239,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 53)",
        "(line 241,col 9)-(line 263,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-ad4bb147-432c-4c8c-9a81-6e1459e5f2e5.write(int)",
      "begin_line": 245,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 247,col 17)-(line 247,col 31)",
        "(line 248,col 17)-(line 248,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-121271f4-4729-4816-9268-b72a2e7ff951.write(byte[])",
      "begin_line": 251,
      "end_line": 255,
      "comment": "",
      "child_ranges": [
        "(line 253,col 17)-(line 253,col 31)",
        "(line 254,col 17)-(line 254,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-a05cf984-7bf0-4684-901a-4165cb95e667.write(byte[], int, int)",
      "begin_line": 257,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 260,col 17)-(line 260,col 41)",
        "(line 261,col 17)-(line 261,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(java.io.DataOutput)",
      "begin_line": 266,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 34)",
        "(line 269,col 9)-(line 269,col 43)",
        "(line 270,col 9)-(line 270,col 33)",
        "(line 271,col 9)-(line 271,col 31)",
        "(line 272,col 9)-(line 272,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(java.io.DataOutput)",
      "begin_line": 275,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 281,col 36)",
        "(line 283,col 9)-(line 283,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(java.io.DataOutput)",
      "begin_line": 286,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 36)",
        "(line 289,col 9)-(line 289,col 31)",
        "(line 290,col 9)-(line 290,col 62)",
        "(line 292,col 9)-(line 292,col 32)",
        "(line 293,col 9)-(line 297,col 9)",
        "(line 299,col 9)-(line 299,col 31)",
        "(line 300,col 9)-(line 300,col 24)",
        "(line 301,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(java.io.DataOutput)",
      "begin_line": 310,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 38)",
        "(line 313,col 9)-(line 313,col 34)",
        "(line 314,col 9)-(line 314,col 48)",
        "(line 315,col 9)-(line 315,col 24)",
        "(line 316,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 320,col 44)",
        "(line 321,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 327,col 31)",
        "(line 328,col 9)-(line 328,col 24)",
        "(line 329,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(java.io.DataOutput)",
      "begin_line": 338,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 31)",
        "(line 341,col 9)-(line 341,col 47)",
        "(line 342,col 9)-(line 342,col 63)",
        "(line 344,col 9)-(line 344,col 35)",
        "(line 345,col 9)-(line 347,col 9)",
        "(line 348,col 9)-(line 348,col 33)",
        "(line 349,col 9)-(line 349,col 25)",
        "(line 351,col 9)-(line 354,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(java.io.DataOutput)",
      "begin_line": 357,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 42)",
        "(line 368,col 9)-(line 368,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(java.io.DataOutput)",
      "begin_line": 371,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 37)",
        "(line 374,col 9)-(line 374,col 42)",
        "(line 376,col 9)-(line 376,col 38)",
        "(line 377,col 9)-(line 377,col 36)",
        "(line 378,col 9)-(line 378,col 35)",
        "(line 379,col 9)-(line 379,col 31)",
        "(line 380,col 9)-(line 380,col 32)",
        "(line 381,col 9)-(line 381,col 32)",
        "(line 382,col 9)-(line 382,col 32)",
        "(line 383,col 9)-(line 383,col 43)",
        "(line 384,col 9)-(line 384,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(java.io.DataOutput)",
      "begin_line": 387,
      "end_line": 409,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 40)",
        "(line 389,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(java.io.DataOutput)",
      "begin_line": 411,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 38)",
        "(line 413,col 9)-(line 413,col 35)",
        "(line 414,col 9)-(line 414,col 48)",
        "(line 415,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 431,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(java.io.DataOutput)",
      "begin_line": 434,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 37)",
        "(line 436,col 9)-(line 436,col 47)",
        "(line 437,col 9)-(line 437,col 32)",
        "(line 438,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 454,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(java.io.DataOutput)",
      "begin_line": 457,
      "end_line": 471,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 32)",
        "(line 460,col 9)-(line 460,col 71)",
        "(line 461,col 9)-(line 461,col 64)",
        "(line 462,col 9)-(line 462,col 21)",
        "(line 463,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 20)",
        "(line 468,col 9)-(line 468,col 51)",
        "(line 469,col 9)-(line 469,col 45)",
        "(line 470,col 9)-(line 470,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(java.io.DataOutput)",
      "begin_line": 473,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 33)",
        "(line 475,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 506,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(java.io.DataOutput)",
      "begin_line": 509,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 31)",
        "(line 511,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(java.io.DataOutput)",
      "begin_line": 545,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 37)",
        "(line 547,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 578,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(java.io.DataOutput)",
      "begin_line": 581,
      "end_line": 614,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 37)",
        "(line 583,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 613,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(java.io.DataOutput, long)",
      "begin_line": 616,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 26)",
        "(line 618,col 9)-(line 618,col 24)",
        "(line 619,col 9)-(line 619,col 14)",
        "(line 620,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 32)",
        "(line 629,col 9)-(line 632,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(java.io.DataOutput, java.util.BitSet, int)",
      "begin_line": 635,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 22)",
        "(line 637,col 9)-(line 637,col 22)",
        "(line 638,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 648,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamWrapper",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 651,
      "end_line": 681,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(int)",
      "begin_line": 652,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 654,col 13)-(line 654,col 26)",
        "(line 655,col 13)-(line 655,col 38)",
        "(line 656,col 13)-(line 656,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[])",
      "begin_line": 659,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 661,col 13)-(line 661,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[], int, int)",
      "begin_line": 664,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 667,col 13)-(line 667,col 36)",
        "(line 668,col 13)-(line 668,col 48)",
        "(line 669,col 13)-(line 669,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.flush()",
      "begin_line": 672,
      "end_line": 675,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.close()",
      "begin_line": 677,
      "end_line": 680,
      "comment": "",
      "child_ranges": []
    }
  ]
}