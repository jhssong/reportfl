{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFile",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 78,
      "end_line": 1093,
      "comment": "\n * Replacement for \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e.\n *\n * \u003cp\u003eThis class adds support for file name encodings other than UTF-8\n * (which is required to work on ZIP files created by native zip tools\n * and is able to skip a preamble like the one found in self\n * extracting archives.  Furthermore it returns instances of\n * \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n * instead of \u003ccode\u003ejava.util.zip.ZipEntry\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eIt doesn\u0027t extend \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e as it would\n * have to reimplement all methods anyway.  Like\n * \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e, it uses RandomAccessFile under the\n * covers and supports compressed and uncompressed entries.  As of\n * Apache Commons Compress 1.3 it also transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe method signatures mimic the ones of\n * \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e, with a couple of exceptions:\n *\n * \u003cul\u003e\n *   \u003cli\u003eThere is no getName method.\u003c/li\u003e\n *   \u003cli\u003eentries has been renamed to getEntries.\u003c/li\u003e\n *   \u003cli\u003egetEntries and getEntry return\n *   \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n *   instances.\u003c/li\u003e\n *   \u003cli\u003eclose is allowed to throw IOException.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NIBLET_MASK"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_SHIFT"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_0"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_1"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_2"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_3"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 91,
      "end_line": 92,
      "comment": "\n     * List of entries in the order they appear inside the central\n     * directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 97,
      "end_line": 98,
      "comment": "\n     * Maps String to list of ZipArchiveEntrys, name -\u003e actual entries.\n     "
    },
    {
      "type": "class_interface",
      "name": "OffsetEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 100,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerOffset"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataOffset"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archiveName"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * File name of actual source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * The actual data source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Whether the file is closed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DWORD_BUF"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "WORD_BUF"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_BUF"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_BUF"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\" for file names.\n     *\n     * @param f the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String)",
      "begin_line": 163,
      "end_line": 165,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\".\n     *\n     * @param name name of the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String, java.lang.String)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names, scanning unicode extra fields.\n     *\n     * @param name name of the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String)",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names and scanning for unicode extra fields.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String, boolean)",
      "begin_line": 207,
      "end_line": 230,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 47)",
        "(line 210,col 9)-(line 210,col 33)",
        "(line 211,col 9)-(line 211,col 70)",
        "(line 212,col 9)-(line 212,col 59)",
        "(line 213,col 9)-(line 213,col 47)",
        "(line 214,col 9)-(line 214,col 32)",
        "(line 215,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEncoding()",
      "begin_line": 237,
      "end_line": 239,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.close()",
      "begin_line": 245,
      "end_line": 252,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if an error occurs closing the archive.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 22)",
        "(line 251,col 9)-(line 251,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)",
      "begin_line": 259,
      "end_line": 267,
      "comment": "\n     * close a zipfile quietly; throw no io fault, do nothing\n     * on a null parameter\n     * @param zipfile file to close, can be null\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Returns all entries.\n     *\n     * \u003cp\u003eEntries will be returned in the same order they appear\n     * within the archive\u0027s central directory.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder()",
      "begin_line": 291,
      "end_line": 295,
      "comment": "\n     * Returns all entries in physical order.\n     *\n     * \u003cp\u003eEntries will be returned in the same order their contents\n     * appear within the archive.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 79)",
        "(line 293,col 9)-(line 293,col 51)",
        "(line 294,col 9)-(line 294,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntry(java.lang.String)",
      "begin_line": 309,
      "end_line": 312,
      "comment": "\n     * Returns a named entry - or {@code null} if no entry by\n     * that name exists.\n     *\n     * \u003cp\u003eIf multiple entries with the same name exist the first entry\n     * in the archive\u0027s central directory by that name is\n     * returned.\u003c/p\u003e\n     *\n     * @param name name of the entry.\n     * @return the ZipArchiveEntry corresponding to the given name - or\n     * {@code null} if not present.\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 74)",
        "(line 311,col 9)-(line 311,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries(java.lang.String)",
      "begin_line": 323,
      "end_line": 327,
      "comment": "\n     * Returns all named entries in the same order they appear within\n     * the archive\u0027s central directory.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u003cZipArchiveEntry\u003e corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 68)",
        "(line 325,col 9)-(line 326,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder(java.lang.String)",
      "begin_line": 338,
      "end_line": 345,
      "comment": "\n     * Returns all named entries in the same order their contents\n     * appear within the archive.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u003cZipArchiveEntry\u003e corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 69)",
        "(line 340,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.canReadEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 354,
      "end_line": 356,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 366,
      "end_line": 399,
      "comment": "\n     * Returns an InputStream for reading the contents of the given entry.\n     *\n     * @param ze the entry to get the stream for.\n     * @return a stream to read the entry from.\n     * @throws IOException if unable to create an input stream from the zipentry\n     * @throws ZipException if the zipentry uses an unsupported feature\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 64)",
        "(line 373,col 9)-(line 373,col 43)",
        "(line 374,col 9)-(line 374,col 44)",
        "(line 375,col 9)-(line 376,col 66)",
        "(line 377,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-e7f68b1e-c216-4f1a-8d6c-506dc65f8d5e.close()",
      "begin_line": 389,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 391,col 25)-(line 391,col 38)",
        "(line 392,col 25)-(line 392,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getUnixSymlink(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 415,
      "end_line": 430,
      "comment": "\n     * \u003cp\u003e\n     * Convenience method to return the entry\u0027s content as a String if isUnixSymlink()\n     * returns true for it, otherwise returns null.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eThis method assumes the symbolic link\u0027s file name uses the\n     * same encoding that as been specified for this ZipFile.\u003c/p\u003e\n     *\n     * @param entry ZipArchiveEntry object that represents the symbolic link\n     * @return entry\u0027s content as a String\n     * @throws IOException problem with content\u0027s input stream\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 429,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.finalize()",
      "begin_line": 437,
      "end_line": 448,
      "comment": "\n     * Ensures that the close method of this zipfile is called when\n     * there are no more references to it.\n     * @see #close()\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 447,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 454,
      "end_line": 470,
      "comment": "\n     * Length of a \"central directory\" entry structure without file\n     * name, extra fields or comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 472,
      "end_line": 473,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory()",
      "begin_line": 486,
      "end_line": 507,
      "comment": "\n     * Reads the central directory of the given archive and populates\n     * the internal tables with ZipArchiveEntry instances.\n     *\n     * \u003cp\u003eThe ZipArchiveEntrys will know all data that can be obtained from\n     * the central directory alone, but not the data that requires the\n     * local file header or additional data to be read.\u003c/p\u003e\n     *\n     * @return a map of zipentries that didn\u0027t have the language\n     * encoding flag set when read.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 489,col 59)",
        "(line 491,col 9)-(line 491,col 37)",
        "(line 493,col 9)-(line 493,col 36)",
        "(line 494,col 9)-(line 494,col 46)",
        "(line 496,col 9)-(line 499,col 9)",
        "(line 501,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 506,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 518,
      "end_line": 596,
      "comment": "\n     * Reads an individual entry of the central directory, creats an\n     * ZipArchiveEntry from it and adds it to the global maps.\n     *\n     * @param noUTF8Flag map used to collect entries that don\u0027t have\n     * their UTF-8 flag set and whose name will be set by data read\n     * from the local file header later.  The current entry may be\n     * added to this map.\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 35)",
        "(line 522,col 9)-(line 522,col 20)",
        "(line 523,col 9)-(line 523,col 47)",
        "(line 524,col 9)-(line 524,col 37)",
        "(line 526,col 9)-(line 526,col 60)",
        "(line 527,col 9)-(line 527,col 21)",
        "(line 528,col 9)-(line 528,col 68)",
        "(line 530,col 9)-(line 530,col 21)",
        "(line 532,col 9)-(line 532,col 79)",
        "(line 533,col 9)-(line 533,col 62)",
        "(line 534,col 9)-(line 535,col 76)",
        "(line 536,col 9)-(line 536,col 40)",
        "(line 538,col 9)-(line 538,col 21)",
        "(line 540,col 9)-(line 540,col 54)",
        "(line 541,col 9)-(line 541,col 21)",
        "(line 543,col 9)-(line 543,col 74)",
        "(line 544,col 9)-(line 544,col 25)",
        "(line 545,col 9)-(line 545,col 20)",
        "(line 547,col 9)-(line 547,col 50)",
        "(line 548,col 9)-(line 548,col 20)",
        "(line 550,col 9)-(line 550,col 61)",
        "(line 551,col 9)-(line 551,col 20)",
        "(line 553,col 9)-(line 553,col 51)",
        "(line 554,col 9)-(line 554,col 20)",
        "(line 556,col 9)-(line 556,col 58)",
        "(line 557,col 9)-(line 557,col 21)",
        "(line 559,col 9)-(line 559,col 55)",
        "(line 560,col 9)-(line 560,col 21)",
        "(line 562,col 9)-(line 562,col 57)",
        "(line 563,col 9)-(line 563,col 21)",
        "(line 565,col 9)-(line 565,col 56)",
        "(line 566,col 9)-(line 566,col 21)",
        "(line 568,col 9)-(line 568,col 66)",
        "(line 569,col 9)-(line 569,col 21)",
        "(line 571,col 9)-(line 571,col 65)",
        "(line 572,col 9)-(line 572,col 20)",
        "(line 574,col 9)-(line 574,col 48)",
        "(line 575,col 9)-(line 575,col 36)",
        "(line 576,col 9)-(line 576,col 61)",
        "(line 579,col 9)-(line 579,col 61)",
        "(line 581,col 9)-(line 581,col 24)",
        "(line 583,col 9)-(line 583,col 48)",
        "(line 584,col 9)-(line 584,col 39)",
        "(line 585,col 9)-(line 585,col 49)",
        "(line 587,col 9)-(line 587,col 63)",
        "(line 589,col 9)-(line 589,col 46)",
        "(line 590,col 9)-(line 590,col 35)",
        "(line 591,col 9)-(line 591,col 53)",
        "(line 593,col 9)-(line 595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry, int)",
      "begin_line": 610,
      "end_line": 644,
      "comment": "\n     * If the entry holds a Zip64 extended information extra field,\n     * read sizes from there if the entry\u0027s sizes are set to\n     * 0xFFFFFFFFF, do the same for the offset of the local file\n     * header.\n     *\n     * \u003cp\u003eEnsures the Zip64 extra either knows both compressed and\n     * uncompressed size or neither of both as the internal logic in\n     * ExtraFieldUtils forces the field to create local header data\n     * even if they are never used - and here a field with only one\n     * size would be invalid.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 75)",
        "(line 617,col 9)-(line 643,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EOCD_SIZE"
      ],
      "begin_line": 651,
      "end_line": 664,
      "comment": "\n     * Length of the \"End of central directory record\" - which is\n     * supposed to be the last structure of the archive - without file\n     * comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EOCD_SIZE"
      ],
      "begin_line": 670,
      "end_line": 671,
      "comment": "\n     * Maximum length of the \"End of central directory record\" with a\n     * file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 679,
      "end_line": 688,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"End of central directory\n     * record\" relative to the start of the \"End of central directory\n     * record\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LENGTH"
      ],
      "begin_line": 695,
      "end_line": 702,
      "comment": "\n     * Length of the \"Zip64 end of central directory locator\" - which\n     * should be right in front of the \"end of central directory\n     * record\" if one is present at all.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LOCATOR_OFFSET"
      ],
      "begin_line": 710,
      "end_line": 714,
      "comment": "\n     * Offset of the field that holds the location of the \"Zip64 end\n     * of central directory record\" inside the \"Zip64 end of central\n     * directory locator\" relative to the start of the \"Zip64 end of\n     * central directory locator\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 722,
      "end_line": 736,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"Zip64 end of central\n     * directory record\" relative to the start of the \"Zip64 end of\n     * central directory record\".\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory()",
      "begin_line": 744,
      "end_line": 765,
      "comment": "\n     * Searches for either the \u0026quot;Zip64 end of central directory\n     * locator\u0026quot; or the \u0026quot;End of central dir record\u0026quot;, parses\n     * it and positions the stream at the first central directory\n     * record.\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 48)",
        "(line 747,col 9)-(line 747,col 30)",
        "(line 748,col 9)-(line 749,col 58)",
        "(line 750,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 764,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64()",
      "begin_line": 776,
      "end_line": 791,
      "comment": "\n     * Parses the \u0026quot;Zip64 end of central directory locator\u0026quot;,\n     * finds the \u0026quot;Zip64 end of central directory record\u0026quot; using the\n     * parsed information, parses that and positions the stream at the\n     * first central directory record.\n     *\n     * Expects stream to be positioned right behind the \u0026quot;Zip64\n     * end of central directory locator\u0026quot;\u0027s signature.\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 779,col 64)",
        "(line 780,col 9)-(line 780,col 37)",
        "(line 781,col 9)-(line 781,col 66)",
        "(line 782,col 9)-(line 782,col 36)",
        "(line 783,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 788,col 64)",
        "(line 789,col 9)-(line 789,col 37)",
        "(line 790,col 9)-(line 790,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32()",
      "begin_line": 800,
      "end_line": 805,
      "comment": "\n     * Parses the \u0026quot;End of central dir record\u0026quot; and positions\n     * the stream at the first central directory record.\n     *\n     * Expects stream to be positioned at the beginning of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 802,col 9)-(line 802,col 38)",
        "(line 803,col 9)-(line 803,col 36)",
        "(line 804,col 9)-(line 804,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtEndOfCentralDirectoryRecord()",
      "begin_line": 811,
      "end_line": 818,
      "comment": "\n     * Searches for the and positions the stream at the start of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 814,col 78)",
        "(line 815,col 9)-(line 817,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(long, long, byte[])",
      "begin_line": 825,
      "end_line": 858,
      "comment": "\n     * Searches the archive backwards from minDistance to maxDistance\n     * for the given signature, positions the RandomaccessFile right\n     * at the signature if it has been found.\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 30)",
        "(line 829,col 9)-(line 829,col 57)",
        "(line 830,col 9)-(line 831,col 64)",
        "(line 832,col 9)-(line 853,col 9)",
        "(line 854,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.skipBytes(int)",
      "begin_line": 864,
      "end_line": 873,
      "comment": "\n     * Skips the given number of bytes or throws an EOFException if\n     * skipping failed.\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 29)",
        "(line 866,col 9)-(line 872,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_OFFSET_FOR_FILENAME_LENGTH"
      ],
      "begin_line": 879,
      "end_line": 888,
      "comment": "\n     * Number of bytes in local file header up to the \u0026quot;length of\n     * filename\u0026quot; entry.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 897,
      "end_line": 940,
      "comment": "\n     * Walks through all recorded entries and adds the data available\n     * from the local file header.\n     *\n     * \u003cp\u003eAlso records the offsets for the data to read from the\n     * entries.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 939,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader()",
      "begin_line": 946,
      "end_line": 950,
      "comment": "\n     * Checks whether the archive starts with a LFH.  If it doesn\u0027t,\n     * it may be an empty archive.\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 24)",
        "(line 948,col 9)-(line 948,col 36)",
        "(line 949,col 9)-(line 949,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 957,
      "end_line": 1019,
      "comment": "\n     * InputStream that delegates requests to the underlying\n     * RandomAccessFile, making sure that only bytes from a certain\n     * range can be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "remaining"
      ],
      "begin_line": 958,
      "end_line": 958,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loc"
      ],
      "begin_line": 959,
      "end_line": 959,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 960,
      "end_line": 960,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.BoundedInputStream(long, long)",
      "begin_line": 962,
      "end_line": 965,
      "comment": "",
      "child_ranges": [
        "(line 963,col 13)-(line 963,col 39)",
        "(line 964,col 13)-(line 964,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read()",
      "begin_line": 967,
      "end_line": 980,
      "comment": "",
      "child_ranges": [
        "(line 969,col 13)-(line 975,col 13)",
        "(line 976,col 13)-(line 979,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 982,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 984,col 13)-(line 991,col 13)",
        "(line 993,col 13)-(line 995,col 13)",
        "(line 997,col 13)-(line 999,col 13)",
        "(line 1000,col 13)-(line 1000,col 25)",
        "(line 1001,col 13)-(line 1004,col 13)",
        "(line 1005,col 13)-(line 1008,col 13)",
        "(line 1009,col 13)-(line 1009,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.addDummy()",
      "begin_line": 1016,
      "end_line": 1018,
      "comment": "\n         * Inflater needs an extra dummy byte for nowrap - see\n         * Inflater\u0027s javadocs.\n         ",
      "child_ranges": [
        "(line 1017,col 13)-(line 1017,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameAndComment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1021,
      "end_line": 1028,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1022,
      "end_line": 1022,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 1023,
      "end_line": 1023,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.NameAndComment(byte[], byte[])",
      "begin_line": 1024,
      "end_line": 1027,
      "comment": "",
      "child_ranges": [
        "(line 1025,col 13)-(line 1025,col 29)",
        "(line 1026,col 13)-(line 1026,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "OFFSET_COMPARATOR"
      ],
      "begin_line": 1038,
      "end_line": 1057,
      "comment": "\n     * Compares two ZipArchiveEntries based on their offset within the archive.\n     *\n     * \u003cp\u003eWon\u0027t return any meaningful results if one of the entries\n     * isn\u0027t part of the archive at all.\u003c/p\u003e\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-5b771a2e-1555-4041-a7c9-defc3c9ecf35.compare(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1040,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1041,col 13)-(line 1043,col 13)",
        "(line 1045,col 13)-(line 1045,col 65)",
        "(line 1046,col 13)-(line 1046,col 65)",
        "(line 1047,col 13)-(line 1049,col 13)",
        "(line 1050,col 13)-(line 1052,col 13)",
        "(line 1053,col 13)-(line 1054,col 62)",
        "(line 1055,col 13)-(line 1055,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveEntry"
      ],
      "begin_line": 1062,
      "end_line": 1092,
      "comment": "\n     * Extends ZipArchiveEntry to store the offset within the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offsetEntry"
      ],
      "begin_line": 1064,
      "end_line": 1064,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.Entry(org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry)",
      "begin_line": 1066,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 13)-(line 1067,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.getOffsetEntry()",
      "begin_line": 1070,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 13)-(line 1071,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.hashCode()",
      "begin_line": 1074,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1076,col 13)-(line 1077,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.equals(java.lang.Object)",
      "begin_line": 1080,
      "end_line": 1091,
      "comment": "",
      "child_ranges": [
        "(line 1082,col 13)-(line 1089,col 13)",
        "(line 1090,col 13)-(line 1090,col 25)"
      ]
    }
  ]
}