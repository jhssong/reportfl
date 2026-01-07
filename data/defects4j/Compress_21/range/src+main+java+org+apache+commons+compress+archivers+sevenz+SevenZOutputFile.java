{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZOutputFile",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 682,
      "comment": "\n * Writes a 7z file.\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "files"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numNonEmptyStreams"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc32"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressedCrc32"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileBytesWritten"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentOutputStream"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentCompression"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.SevenZOutputFile(java.io.File)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Opens file to write a 7z archive to.\n     *\n     * @param filename name of the file to write to\n     * @throws IOException if opening the file fails\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 52)",
        "(line 59,col 9)-(line 59,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setContentCompression(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 70,
      "end_line": 72,
      "comment": "\n     * Sets the compression method to use for entry contents - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close()",
      "begin_line": 79,
      "end_line": 84,
      "comment": "\n     * Closes the archive, calling {@link #finish} if necessary.\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 95,
      "end_line": 102,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile\n     * @param entryName \n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 66)",
        "(line 98,col 9)-(line 98,col 52)",
        "(line 99,col 9)-(line 99,col 33)",
        "(line 100,col 9)-(line 100,col 70)",
        "(line 101,col 9)-(line 101,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 113,
      "end_line": 116,
      "comment": "\n     * Records an archive entry to add.\n     *\n     * The caller must then write the content to the archive and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param archiveEntry describes the entry\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 75)",
        "(line 115,col 9)-(line 115,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry()",
      "begin_line": 122,
      "end_line": 147,
      "comment": "\n     * Closes the archive entry.\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 128,col 69)",
        "(line 129,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 35)",
        "(line 144,col 9)-(line 144,col 22)",
        "(line 145,col 9)-(line 145,col 32)",
        "(line 146,col 9)-(line 146,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(int)",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * Writes a byte to the current archive entry.\n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[])",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Writes a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[], int, int)",
      "begin_line": 174,
      "end_line": 178,
      "comment": "\n     * Writes part of a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @param off offset into the array to start writing from\n     * @param len number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish()",
      "begin_line": 185,
      "end_line": 224,
      "comment": "\n     * Finishes the addition of entries to this archive, without closing it.\n     * \n     * @throws IOException if archive is already closed.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 24)",
        "(line 191,col 9)-(line 191,col 58)",
        "(line 193,col 9)-(line 193,col 77)",
        "(line 194,col 9)-(line 194,col 73)",
        "(line 196,col 9)-(line 196,col 28)",
        "(line 197,col 9)-(line 197,col 23)",
        "(line 198,col 9)-(line 198,col 60)",
        "(line 199,col 9)-(line 199,col 32)",
        "(line 201,col 9)-(line 201,col 40)",
        "(line 204,col 9)-(line 204,col 21)",
        "(line 205,col 9)-(line 205,col 47)",
        "(line 207,col 9)-(line 207,col 22)",
        "(line 208,col 9)-(line 208,col 22)",
        "(line 211,col 9)-(line 211,col 82)",
        "(line 212,col 9)-(line 212,col 89)",
        "(line 213,col 9)-(line 213,col 106)",
        "(line 214,col 9)-(line 214,col 89)",
        "(line 215,col 9)-(line 215,col 22)",
        "(line 216,col 9)-(line 216,col 34)",
        "(line 217,col 9)-(line 217,col 80)",
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 219,col 70)",
        "(line 220,col 9)-(line 220,col 22)",
        "(line 221,col 9)-(line 221,col 39)",
        "(line 222,col 9)-(line 222,col 68)",
        "(line 223,col 9)-(line 223,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getCurrentOutputStream()",
      "begin_line": 231,
      "end_line": 236,
      "comment": "\n     * Creation of output stream is deferred until data is actually\n     * written as some codecs might write header information even for\n     * empty streams and directories otherwise.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 235,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setupFileOutputStream()",
      "begin_line": 238,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 53)",
        "(line 240,col 9)-(line 262,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-52bb20c6-b041-4c70-a6fb-0269c40fb0ad.write(int)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 246,col 17)-(line 246,col 31)",
        "(line 247,col 17)-(line 247,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-2decc2cd-21d9-474b-9983-7daf4c66e9f3.write(byte[])",
      "begin_line": 250,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 252,col 17)-(line 252,col 31)",
        "(line 253,col 17)-(line 253,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-0f0b8405-f0d5-448b-bb00-b2f264e72b51.write(byte[], int, int)",
      "begin_line": 256,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 259,col 17)-(line 259,col 41)",
        "(line 260,col 17)-(line 260,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(java.io.DataOutput)",
      "begin_line": 265,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 34)",
        "(line 268,col 9)-(line 268,col 43)",
        "(line 269,col 9)-(line 269,col 33)",
        "(line 270,col 9)-(line 270,col 31)",
        "(line 271,col 9)-(line 271,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(java.io.DataOutput)",
      "begin_line": 274,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 280,col 36)",
        "(line 282,col 9)-(line 282,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(java.io.DataOutput)",
      "begin_line": 285,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 36)",
        "(line 288,col 9)-(line 288,col 31)",
        "(line 289,col 9)-(line 289,col 62)",
        "(line 291,col 9)-(line 291,col 32)",
        "(line 292,col 9)-(line 296,col 9)",
        "(line 298,col 9)-(line 298,col 31)",
        "(line 299,col 9)-(line 299,col 24)",
        "(line 300,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 306,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(java.io.DataOutput)",
      "begin_line": 309,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 38)",
        "(line 312,col 9)-(line 312,col 34)",
        "(line 313,col 9)-(line 313,col 48)",
        "(line 314,col 9)-(line 314,col 24)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 319,col 44)",
        "(line 320,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 326,col 31)",
        "(line 327,col 9)-(line 327,col 24)",
        "(line 328,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 334,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(java.io.DataOutput)",
      "begin_line": 337,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 31)",
        "(line 340,col 9)-(line 340,col 47)",
        "(line 341,col 9)-(line 341,col 63)",
        "(line 343,col 9)-(line 343,col 35)",
        "(line 344,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 347,col 33)",
        "(line 348,col 9)-(line 348,col 25)",
        "(line 350,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(java.io.DataOutput)",
      "begin_line": 356,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 42)",
        "(line 367,col 9)-(line 367,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(java.io.DataOutput)",
      "begin_line": 370,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 37)",
        "(line 373,col 9)-(line 373,col 42)",
        "(line 375,col 9)-(line 375,col 38)",
        "(line 376,col 9)-(line 376,col 36)",
        "(line 377,col 9)-(line 377,col 35)",
        "(line 378,col 9)-(line 378,col 31)",
        "(line 379,col 9)-(line 379,col 32)",
        "(line 380,col 9)-(line 380,col 32)",
        "(line 381,col 9)-(line 381,col 32)",
        "(line 382,col 9)-(line 382,col 43)",
        "(line 383,col 9)-(line 383,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(java.io.DataOutput)",
      "begin_line": 386,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 40)",
        "(line 388,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(java.io.DataOutput)",
      "begin_line": 410,
      "end_line": 431,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 38)",
        "(line 412,col 9)-(line 412,col 35)",
        "(line 413,col 9)-(line 413,col 48)",
        "(line 414,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 430,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(java.io.DataOutput)",
      "begin_line": 433,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 37)",
        "(line 435,col 9)-(line 435,col 47)",
        "(line 436,col 9)-(line 436,col 32)",
        "(line 437,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(java.io.DataOutput)",
      "begin_line": 456,
      "end_line": 470,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 32)",
        "(line 459,col 9)-(line 459,col 71)",
        "(line 460,col 9)-(line 460,col 64)",
        "(line 461,col 9)-(line 461,col 21)",
        "(line 462,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 20)",
        "(line 467,col 9)-(line 467,col 51)",
        "(line 468,col 9)-(line 468,col 45)",
        "(line 469,col 9)-(line 469,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(java.io.DataOutput)",
      "begin_line": 472,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 33)",
        "(line 474,col 9)-(line 478,col 9)",
        "(line 479,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(java.io.DataOutput)",
      "begin_line": 508,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 31)",
        "(line 510,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(java.io.DataOutput)",
      "begin_line": 544,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 37)",
        "(line 546,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 577,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(java.io.DataOutput)",
      "begin_line": 580,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 37)",
        "(line 582,col 9)-(line 586,col 9)",
        "(line 587,col 9)-(line 612,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(java.io.DataOutput, long)",
      "begin_line": 615,
      "end_line": 632,
      "comment": "",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 26)",
        "(line 617,col 9)-(line 617,col 24)",
        "(line 618,col 9)-(line 618,col 14)",
        "(line 619,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 627,col 32)",
        "(line 628,col 9)-(line 631,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(java.io.DataOutput, java.util.BitSet, int)",
      "begin_line": 634,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 635,col 9)-(line 635,col 22)",
        "(line 636,col 9)-(line 636,col 22)",
        "(line 637,col 9)-(line 645,col 9)",
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