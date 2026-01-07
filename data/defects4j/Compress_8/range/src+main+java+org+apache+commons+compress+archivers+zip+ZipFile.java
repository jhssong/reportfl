{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFile",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 699,
      "comment": "\n * Replacement for \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e.\n *\n * \u003cp\u003eThis class adds support for file name encodings other than UTF-8\n * (which is required to work on ZIP files created by native zip tools\n * and is able to skip a preamble like the one found in self\n * extracting archives.  Furthermore it returns instances of\n * \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n * instead of \u003ccode\u003ejava.util.zip.ZipEntry\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eIt doesn\u0027t extend \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e as it would\n * have to reimplement all methods anyway.  Like\n * \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e, it uses RandomAccessFile under the\n * covers and supports compressed and uncompressed entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe method signatures mimic the ones of\n * \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e, with a couple of exceptions:\n *\n * \u003cul\u003e\n *   \u003cli\u003eThere is no getName method.\u003c/li\u003e\n *   \u003cli\u003eentries has been renamed to getEntries.\u003c/li\u003e\n *   \u003cli\u003egetEntries and getEntry return\n *   \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n *   instances.\u003c/li\u003e\n *   \u003cli\u003eclose is allowed to throw IOException.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NIBLET_MASK"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_SHIFT"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_0"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_1"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_2"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_3"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Maps ZipArchiveEntrys to Longs, recording the offsets of the local\n     * file headers.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Maps String to ZipArchiveEntrys, name -\u003e actual entry.\n     "
    },
    {
      "type": "class_interface",
      "name": "OffsetEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 85,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerOffset"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataOffset"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * The actual data source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\" for file names.\n     *\n     * @param f the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\".\n     *\n     * @param name name of the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String, java.lang.String)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names, scanning unicode extra fields.\n     *\n     * @param name name of the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names and scanning for unicode extra fields.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String, boolean)",
      "begin_line": 176,
      "end_line": 196,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 33)",
        "(line 179,col 9)-(line 179,col 70)",
        "(line 180,col 9)-(line 180,col 59)",
        "(line 181,col 9)-(line 181,col 47)",
        "(line 182,col 9)-(line 182,col 32)",
        "(line 183,col 9)-(line 195,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEncoding()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.close()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if an error occurs closing the archive.\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)",
      "begin_line": 220,
      "end_line": 228,
      "comment": "\n     * close a zipfile quietly; throw no io fault, do nothing\n     * on a null parameter\n     * @param zipfile file to close, can be null\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 227,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Returns all entries.\n     *\n     * \u003cp\u003eEntries will be returned in the same order they appear\n     * within the archive\u0027s central directory.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder()",
      "begin_line": 252,
      "end_line": 256,
      "comment": "\n     * Returns all entries in physical order.\n     *\n     * \u003cp\u003eEntries will be returned in the same order their contents\n     * appear within the archive.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     *\n     * @since Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 57)",
        "(line 254,col 9)-(line 254,col 51)",
        "(line 255,col 9)-(line 255,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntry(java.lang.String)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Returns a named entry - or \u003ccode\u003enull\u003c/code\u003e if no entry by\n     * that name exists.\n     * @param name name of the entry.\n     * @return the ZipArchiveEntry corresponding to the given name - or\n     * \u003ccode\u003enull\u003c/code\u003e if not present.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.canReadEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 276,
      "end_line": 278,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 288,
      "end_line": 308,
      "comment": "\n     * Returns an InputStream for reading the contents of the given entry.\n     *\n     * @param ze the entry to get the stream for.\n     * @return a stream to read the entry from.\n     * @throws IOException if unable to create an input stream from the zipenty\n     * @throws ZipException if the zipentry uses an unsupported feature\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 64)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 43)",
        "(line 295,col 9)-(line 295,col 44)",
        "(line 296,col 9)-(line 297,col 66)",
        "(line 298,col 9)-(line 307,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 310,
      "end_line": 326,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory()",
      "begin_line": 340,
      "end_line": 439,
      "comment": "\n     * Reads the central directory of the given archive and populates\n     * the internal tables with ZipArchiveEntry instances.\n     *\n     * \u003cp\u003eThe ZipArchiveEntrys will know all data that can be obtained from\n     * the central directory alone, but not the data that requires the\n     * local file header or additional data to be read.\u003c/p\u003e\n     *\n     * @return a Map\u0026lt;ZipArchiveEntry, NameAndComment\u003e\u0026gt; of\n     * zipentries that didn\u0027t have the language encoding flag set when\n     * read.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 43)",
        "(line 344,col 9)-(line 344,col 37)",
        "(line 346,col 9)-(line 346,col 39)",
        "(line 348,col 9)-(line 348,col 47)",
        "(line 349,col 9)-(line 349,col 42)",
        "(line 350,col 9)-(line 350,col 52)",
        "(line 351,col 9)-(line 351,col 77)",
        "(line 352,col 9)-(line 355,col 9)",
        "(line 356,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 26)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EOCD_SIZE"
      ],
      "begin_line": 441,
      "end_line": 454,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EOCD_SIZE"
      ],
      "begin_line": 456,
      "end_line": 457,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 459,
      "end_line": 468,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory()",
      "begin_line": 475,
      "end_line": 509,
      "comment": "\n     * Searches for the \u0026quot;End of central dir record\u0026quot;, parses\n     * it and positions the stream at the first central directory\n     * record.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 30)",
        "(line 478,col 9)-(line 478,col 52)",
        "(line 479,col 9)-(line 479,col 76)",
        "(line 480,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 505,col 47)",
        "(line 506,col 9)-(line 506,col 42)",
        "(line 507,col 9)-(line 507,col 37)",
        "(line 508,col 9)-(line 508,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_OFFSET_FOR_FILENAME_LENGTH"
      ],
      "begin_line": 515,
      "end_line": 524,
      "comment": "\n     * Number of bytes in local file header up to the \u0026quot;length of\n     * filename\u0026quot; entry.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData(java.util.Map)",
      "begin_line": 533,
      "end_line": 576,
      "comment": "\n     * Walks through all recorded entries and adds the data available\n     * from the local file header.\n     *\n     * \u003cp\u003eAlso records the offsets for the data to read from the\n     * entries.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 37)",
        "(line 536,col 9)-(line 575,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader()",
      "begin_line": 582,
      "end_line": 592,
      "comment": "\n     * Checks whether the archive starts with a LFH.  If it doesn\u0027t,\n     * it may be an empty archive.\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 24)",
        "(line 584,col 9)-(line 584,col 44)",
        "(line 585,col 9)-(line 585,col 33)",
        "(line 586,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 599,
      "end_line": 659,
      "comment": "\n     * InputStream that delegates requests to the underlying\n     * RandomAccessFile, making sure that only bytes from a certain\n     * range can be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "remaining"
      ],
      "begin_line": 600,
      "end_line": 600,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loc"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 602,
      "end_line": 602,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.BoundedInputStream(long, long)",
      "begin_line": 604,
      "end_line": 607,
      "comment": "",
      "child_ranges": [
        "(line 605,col 13)-(line 605,col 39)",
        "(line 606,col 13)-(line 606,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read()",
      "begin_line": 609,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 610,col 13)-(line 616,col 13)",
        "(line 617,col 13)-(line 620,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 623,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 624,col 13)-(line 631,col 13)",
        "(line 633,col 13)-(line 635,col 13)",
        "(line 637,col 13)-(line 639,col 13)",
        "(line 640,col 13)-(line 640,col 25)",
        "(line 641,col 13)-(line 644,col 13)",
        "(line 645,col 13)-(line 648,col 13)",
        "(line 649,col 13)-(line 649,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.addDummy()",
      "begin_line": 656,
      "end_line": 658,
      "comment": "\n         * Inflater needs an extra dummy byte for nowrap - see\n         * Inflater\u0027s javadocs.\n         ",
      "child_ranges": [
        "(line 657,col 13)-(line 657,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameAndComment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 661,
      "end_line": 668,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 662,
      "end_line": 662,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 663,
      "end_line": 663,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.NameAndComment(byte[], byte[])",
      "begin_line": 664,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 665,col 13)-(line 665,col 29)",
        "(line 666,col 13)-(line 666,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "OFFSET_COMPARATOR"
      ],
      "begin_line": 678,
      "end_line": 698,
      "comment": "\n     * Compares two ZipArchiveEntries based on their offset within the archive.\n     *\n     * \u003cp\u003eWon\u0027t return any meaningful results if one of the entries\n     * isn\u0027t part of the archive at all.\u003c/p\u003e\n     *\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-51a1610a-1a93-4b59-b692-e18699777b0b.compare(java.lang.Object, java.lang.Object)",
      "begin_line": 680,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 681,col 17)-(line 682,col 29)",
        "(line 684,col 17)-(line 684,col 58)",
        "(line 685,col 17)-(line 685,col 58)",
        "(line 687,col 17)-(line 687,col 65)",
        "(line 688,col 17)-(line 688,col 65)",
        "(line 689,col 17)-(line 691,col 17)",
        "(line 692,col 17)-(line 694,col 17)",
        "(line 695,col 17)-(line 695,col 67)",
        "(line 696,col 17)-(line 696,col 56)"
      ]
    }
  ]
}