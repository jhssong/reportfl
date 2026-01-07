{
  "filepath": "/tmp/Compress-37b/src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 79,
      "end_line": 1149,
      "comment": "\n * Replacement for \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e.\n *\n * \u003cp\u003eThis class adds support for file name encodings other than UTF-8\n * (which is required to work on ZIP files created by native zip tools\n * and is able to skip a preamble like the one found in self\n * extracting archives.  Furthermore it returns instances of\n * \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n * instead of \u003ccode\u003ejava.util.zip.ZipEntry\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eIt doesn\u0027t extend \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e as it would\n * have to reimplement all methods anyway.  Like\n * \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e, it uses RandomAccessFile under the\n * covers and supports compressed and uncompressed entries.  As of\n * Apache Commons Compress 1.3 it also transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe method signatures mimic the ones of\n * \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e, with a couple of exceptions:\n *\n * \u003cul\u003e\n *   \u003cli\u003eThere is no getName method.\u003c/li\u003e\n *   \u003cli\u003eentries has been renamed to getEntries.\u003c/li\u003e\n *   \u003cli\u003egetEntries and getEntry return\n *   \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n *   instances.\u003c/li\u003e\n *   \u003cli\u003eclose is allowed to throw IOException.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NIBLET_MASK"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_SHIFT"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_0"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_1"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_2"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_3"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 92,
      "end_line": 93,
      "comment": "\n     * List of entries in the order they appear inside the central\n     * directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 98,
      "end_line": 99,
      "comment": "\n     * Maps String to list of ZipArchiveEntrys, name -\u003e actual entries.\n     "
    },
    {
      "type": "class_interface",
      "name": "OffsetEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 101,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerOffset"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataOffset"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archiveName"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * File name of actual source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * The actual data source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Whether the file is closed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DWORD_BUF"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "WORD_BUF"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_BUF"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_BUF"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\" for file names.\n     *\n     * @param f the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\".\n     *\n     * @param name name of the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String, java.lang.String)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names, scanning unicode extra fields.\n     *\n     * @param name name of the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names and scanning for unicode extra fields.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String, boolean)",
      "begin_line": 208,
      "end_line": 227,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 47)",
        "(line 211,col 9)-(line 211,col 33)",
        "(line 212,col 9)-(line 212,col 70)",
        "(line 213,col 9)-(line 213,col 59)",
        "(line 214,col 9)-(line 214,col 47)",
        "(line 215,col 9)-(line 215,col 32)",
        "(line 216,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEncoding()",
      "begin_line": 234,
      "end_line": 236,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.close()",
      "begin_line": 242,
      "end_line": 250,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if an error occurs closing the archive.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 22)",
        "(line 249,col 9)-(line 249,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * close a zipfile quietly; throw no io fault, do nothing\n     * on a null parameter\n     * @param zipfile file to close, can be null\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Returns all entries.\n     *\n     * \u003cp\u003eEntries will be returned in the same order they appear\n     * within the archive\u0027s central directory.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder()",
      "begin_line": 283,
      "end_line": 287,
      "comment": "\n     * Returns all entries in physical order.\n     *\n     * \u003cp\u003eEntries will be returned in the same order their contents\n     * appear within the archive.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 98)",
        "(line 285,col 9)-(line 285,col 51)",
        "(line 286,col 9)-(line 286,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntry(java.lang.String)",
      "begin_line": 301,
      "end_line": 304,
      "comment": "\n     * Returns a named entry - or {@code null} if no entry by\n     * that name exists.\n     *\n     * \u003cp\u003eIf multiple entries with the same name exist the first entry\n     * in the archive\u0027s central directory by that name is\n     * returned.\u003c/p\u003e\n     *\n     * @param name name of the entry.\n     * @return the ZipArchiveEntry corresponding to the given name - or\n     * {@code null} if not present.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 80)",
        "(line 303,col 9)-(line 303,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries(java.lang.String)",
      "begin_line": 315,
      "end_line": 319,
      "comment": "\n     * Returns all named entries in the same order they appear within\n     * the archive\u0027s central directory.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 74)",
        "(line 317,col 9)-(line 318,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder(java.lang.String)",
      "begin_line": 330,
      "end_line": 337,
      "comment": "\n     * Returns all named entries in the same order their contents\n     * appear within the archive.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 69)",
        "(line 332,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.canReadEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 348,
      "end_line": 350,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     * @param ze the entry\n     * @return whether this class is able to read the given entry.\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getRawInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 362,
      "end_line": 369,
      "comment": "\n     * Expose the raw stream of the archive entry (compressed form).\n     *\n     * \u003cp\u003eThis method does not relate to how/if we understand the payload in the\n     * stream, since we really only intend to move it on to somewhere else.\u003c/p\u003e\n     *\n     * @param ze The entry to get the stream for\n     * @return The raw input stream containing (possibly) compressed data.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 366,col 9)-(line 366,col 70)",
        "(line 367,col 9)-(line 367,col 50)",
        "(line 368,col 9)-(line 368,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.copyRawEntries(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, org.apache.commons.compress.archivers.zip.ZipArchiveEntryPredicate)",
      "begin_line": 381,
      "end_line": 390,
      "comment": "\n     * Transfer selected entries from this zipfile to a given #ZipArchiveOutputStream.\n     * Compression and all other attributes will be as in this file.\n     * \u003cp\u003eThis method transfers entries based on the central directory of the zip file.\u003c/p\u003e\n     *\n     * @param target The zipArchiveOutputStream to write the entries to\n     * @param predicate A predicate that selects which entries to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 77)",
        "(line 384,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 400,
      "end_line": 451,
      "comment": "\n     * Returns an InputStream for reading the contents of the given entry.\n     *\n     * @param ze the entry to get the stream for.\n     * @return a stream to read the entry from.\n     * @throws IOException if unable to create an input stream from the zipentry\n     * @throws ZipException if the zipentry uses an unsupported feature\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 9)",
        "(line 406,col 9)-(line 406,col 70)",
        "(line 407,col 9)-(line 407,col 43)",
        "(line 408,col 9)-(line 408,col 50)",
        "(line 409,col 9)-(line 410,col 66)",
        "(line 411,col 9)-(line 450,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-80c8f02c-7539-4c86-9c05-b6e11982596d.close()",
      "begin_line": 423,
      "end_line": 430,
      "comment": "",
      "child_ranges": [
        "(line 425,col 25)-(line 429,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getUnixSymlink(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 467,
      "end_line": 481,
      "comment": "\n     * \u003cp\u003e\n     * Convenience method to return the entry\u0027s content as a String if isUnixSymlink()\n     * returns true for it, otherwise returns null.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eThis method assumes the symbolic link\u0027s file name uses the\n     * same encoding that as been specified for this ZipFile.\u003c/p\u003e\n     *\n     * @param entry ZipArchiveEntry object that represents the symbolic link\n     * @return entry\u0027s content as a String\n     * @throws IOException problem with content\u0027s input stream\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.finalize()",
      "begin_line": 488,
      "end_line": 499,
      "comment": "\n     * Ensures that the close method of this zipfile is called when\n     * there are no more references to it.\n     * @see #close()\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 498,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 505,
      "end_line": 521,
      "comment": "\n     * Length of a \"central directory\" entry structure without file\n     * name, extra fields or comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 523,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory()",
      "begin_line": 537,
      "end_line": 558,
      "comment": "\n     * Reads the central directory of the given archive and populates\n     * the internal tables with ZipArchiveEntry instances.\n     *\n     * \u003cp\u003eThe ZipArchiveEntrys will know all data that can be obtained from\n     * the central directory alone, but not the data that requires the\n     * local file header or additional data to be read.\u003c/p\u003e\n     *\n     * @return a map of zipentries that didn\u0027t have the language\n     * encoding flag set when read.\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 540,col 59)",
        "(line 542,col 9)-(line 542,col 37)",
        "(line 544,col 9)-(line 544,col 36)",
        "(line 545,col 9)-(line 545,col 46)",
        "(line 547,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 569,
      "end_line": 651,
      "comment": "\n     * Reads an individual entry of the central directory, creats an\n     * ZipArchiveEntry from it and adds it to the global maps.\n     *\n     * @param noUTF8Flag map used to collect entries that don\u0027t have\n     * their UTF-8 flag set and whose name will be set by data read\n     * from the local file header later.  The current entry may be\n     * added to this map.\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 35)",
        "(line 573,col 9)-(line 573,col 20)",
        "(line 574,col 9)-(line 574,col 53)",
        "(line 575,col 9)-(line 575,col 43)",
        "(line 577,col 9)-(line 577,col 66)",
        "(line 578,col 9)-(line 578,col 21)",
        "(line 579,col 9)-(line 579,col 43)",
        "(line 580,col 9)-(line 580,col 68)",
        "(line 582,col 9)-(line 582,col 63)",
        "(line 583,col 9)-(line 583,col 21)",
        "(line 585,col 9)-(line 585,col 79)",
        "(line 586,col 9)-(line 586,col 62)",
        "(line 587,col 9)-(line 588,col 76)",
        "(line 589,col 9)-(line 589,col 40)",
        "(line 590,col 9)-(line 590,col 55)",
        "(line 592,col 9)-(line 592,col 21)",
        "(line 595,col 9)-(line 595,col 54)",
        "(line 596,col 9)-(line 596,col 21)",
        "(line 598,col 9)-(line 598,col 80)",
        "(line 599,col 9)-(line 599,col 25)",
        "(line 600,col 9)-(line 600,col 20)",
        "(line 602,col 9)-(line 602,col 50)",
        "(line 603,col 9)-(line 603,col 20)",
        "(line 605,col 9)-(line 605,col 61)",
        "(line 606,col 9)-(line 606,col 20)",
        "(line 608,col 9)-(line 608,col 51)",
        "(line 609,col 9)-(line 609,col 20)",
        "(line 611,col 9)-(line 611,col 64)",
        "(line 612,col 9)-(line 612,col 21)",
        "(line 614,col 9)-(line 614,col 61)",
        "(line 615,col 9)-(line 615,col 21)",
        "(line 617,col 9)-(line 617,col 63)",
        "(line 618,col 9)-(line 618,col 21)",
        "(line 620,col 9)-(line 620,col 62)",
        "(line 621,col 9)-(line 621,col 21)",
        "(line 623,col 9)-(line 623,col 66)",
        "(line 624,col 9)-(line 624,col 21)",
        "(line 626,col 9)-(line 626,col 65)",
        "(line 627,col 9)-(line 627,col 20)",
        "(line 629,col 9)-(line 629,col 54)",
        "(line 630,col 9)-(line 630,col 36)",
        "(line 631,col 9)-(line 631,col 61)",
        "(line 634,col 9)-(line 634,col 61)",
        "(line 636,col 9)-(line 636,col 24)",
        "(line 638,col 9)-(line 638,col 54)",
        "(line 639,col 9)-(line 639,col 39)",
        "(line 640,col 9)-(line 640,col 49)",
        "(line 642,col 9)-(line 642,col 63)",
        "(line 644,col 9)-(line 644,col 52)",
        "(line 645,col 9)-(line 645,col 35)",
        "(line 646,col 9)-(line 646,col 53)",
        "(line 648,col 9)-(line 650,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry, int)",
      "begin_line": 665,
      "end_line": 699,
      "comment": "\n     * If the entry holds a Zip64 extended information extra field,\n     * read sizes from there if the entry\u0027s sizes are set to\n     * 0xFFFFFFFFF, do the same for the offset of the local file\n     * header.\n     *\n     * \u003cp\u003eEnsures the Zip64 extra either knows both compressed and\n     * uncompressed size or neither of both as the internal logic in\n     * ExtraFieldUtils forces the field to create local header data\n     * even if they are never used - and here a field with only one\n     * size would be invalid.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 671,col 75)",
        "(line 672,col 9)-(line 698,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EOCD_SIZE"
      ],
      "begin_line": 706,
      "end_line": 719,
      "comment": "\n     * Length of the \"End of central directory record\" - which is\n     * supposed to be the last structure of the archive - without file\n     * comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EOCD_SIZE"
      ],
      "begin_line": 725,
      "end_line": 726,
      "comment": "\n     * Maximum length of the \"End of central directory record\" with a\n     * file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 734,
      "end_line": 743,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"End of central directory\n     * record\" relative to the start of the \"End of central directory\n     * record\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LENGTH"
      ],
      "begin_line": 750,
      "end_line": 757,
      "comment": "\n     * Length of the \"Zip64 end of central directory locator\" - which\n     * should be right in front of the \"end of central directory\n     * record\" if one is present at all.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LOCATOR_OFFSET"
      ],
      "begin_line": 765,
      "end_line": 769,
      "comment": "\n     * Offset of the field that holds the location of the \"Zip64 end\n     * of central directory record\" inside the \"Zip64 end of central\n     * directory locator\" relative to the start of the \"Zip64 end of\n     * central directory locator\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 777,
      "end_line": 791,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"Zip64 end of central\n     * directory record\" relative to the start of the \"Zip64 end of\n     * central directory record\".\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory()",
      "begin_line": 799,
      "end_line": 820,
      "comment": "\n     * Searches for either the \u0026quot;Zip64 end of central directory\n     * locator\u0026quot; or the \u0026quot;End of central dir record\u0026quot;, parses\n     * it and positions the stream at the first central directory\n     * record.\n     ",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 48)",
        "(line 802,col 9)-(line 802,col 30)",
        "(line 803,col 9)-(line 804,col 58)",
        "(line 805,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 819,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64()",
      "begin_line": 831,
      "end_line": 846,
      "comment": "\n     * Parses the \u0026quot;Zip64 end of central directory locator\u0026quot;,\n     * finds the \u0026quot;Zip64 end of central directory record\u0026quot; using the\n     * parsed information, parses that and positions the stream at the\n     * first central directory record.\n     *\n     * Expects stream to be positioned right behind the \u0026quot;Zip64\n     * end of central directory locator\u0026quot;\u0027s signature.\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 834,col 64)",
        "(line 835,col 9)-(line 835,col 37)",
        "(line 836,col 9)-(line 836,col 66)",
        "(line 837,col 9)-(line 837,col 36)",
        "(line 838,col 9)-(line 841,col 9)",
        "(line 842,col 9)-(line 843,col 64)",
        "(line 844,col 9)-(line 844,col 37)",
        "(line 845,col 9)-(line 845,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32()",
      "begin_line": 855,
      "end_line": 860,
      "comment": "\n     * Parses the \u0026quot;End of central dir record\u0026quot; and positions\n     * the stream at the first central directory record.\n     *\n     * Expects stream to be positioned at the beginning of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 38)",
        "(line 858,col 9)-(line 858,col 36)",
        "(line 859,col 9)-(line 859,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtEndOfCentralDirectoryRecord()",
      "begin_line": 866,
      "end_line": 873,
      "comment": "\n     * Searches for the and positions the stream at the start of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 869,col 78)",
        "(line 870,col 9)-(line 872,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(long, long, byte[])",
      "begin_line": 880,
      "end_line": 913,
      "comment": "\n     * Searches the archive backwards from minDistance to maxDistance\n     * for the given signature, positions the RandomaccessFile right\n     * at the signature if it has been found.\n     ",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 30)",
        "(line 884,col 9)-(line 884,col 57)",
        "(line 885,col 9)-(line 886,col 64)",
        "(line 887,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 911,col 9)",
        "(line 912,col 9)-(line 912,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.skipBytes(int)",
      "begin_line": 919,
      "end_line": 928,
      "comment": "\n     * Skips the given number of bytes or throws an EOFException if\n     * skipping failed.\n     ",
      "child_ranges": [
        "(line 920,col 9)-(line 920,col 29)",
        "(line 921,col 9)-(line 927,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_OFFSET_FOR_FILENAME_LENGTH"
      ],
      "begin_line": 934,
      "end_line": 943,
      "comment": "\n     * Number of bytes in local file header up to the \u0026quot;length of\n     * filename\u0026quot; entry.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 952,
      "end_line": 995,
      "comment": "\n     * Walks through all recorded entries and adds the data available\n     * from the local file header.\n     *\n     * \u003cp\u003eAlso records the offsets for the data to read from the\n     * entries.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 955,col 9)-(line 994,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader()",
      "begin_line": 1001,
      "end_line": 1005,
      "comment": "\n     * Checks whether the archive starts with a LFH.  If it doesn\u0027t,\n     * it may be an empty archive.\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 24)",
        "(line 1003,col 9)-(line 1003,col 36)",
        "(line 1004,col 9)-(line 1004,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 1012,
      "end_line": 1074,
      "comment": "\n     * InputStream that delegates requests to the underlying\n     * RandomAccessFile, making sure that only bytes from a certain\n     * range can be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "remaining"
      ],
      "begin_line": 1013,
      "end_line": 1013,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loc"
      ],
      "begin_line": 1014,
      "end_line": 1014,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 1015,
      "end_line": 1015,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.BoundedInputStream(long, long)",
      "begin_line": 1017,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 1018,col 13)-(line 1018,col 39)",
        "(line 1019,col 13)-(line 1019,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read()",
      "begin_line": 1022,
      "end_line": 1035,
      "comment": "",
      "child_ranges": [
        "(line 1024,col 13)-(line 1030,col 13)",
        "(line 1031,col 13)-(line 1034,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1037,
      "end_line": 1065,
      "comment": "",
      "child_ranges": [
        "(line 1039,col 13)-(line 1046,col 13)",
        "(line 1048,col 13)-(line 1050,col 13)",
        "(line 1052,col 13)-(line 1054,col 13)",
        "(line 1055,col 13)-(line 1055,col 25)",
        "(line 1056,col 13)-(line 1059,col 13)",
        "(line 1060,col 13)-(line 1063,col 13)",
        "(line 1064,col 13)-(line 1064,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.addDummy()",
      "begin_line": 1071,
      "end_line": 1073,
      "comment": "\n         * Inflater needs an extra dummy byte for nowrap - see\n         * Inflater\u0027s javadocs.\n         ",
      "child_ranges": [
        "(line 1072,col 13)-(line 1072,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameAndComment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1076,
      "end_line": 1083,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1077,
      "end_line": 1077,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 1078,
      "end_line": 1078,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.NameAndComment(byte[], byte[])",
      "begin_line": 1079,
      "end_line": 1082,
      "comment": "",
      "child_ranges": [
        "(line 1080,col 13)-(line 1080,col 29)",
        "(line 1081,col 13)-(line 1081,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "OFFSET_COMPARATOR"
      ],
      "begin_line": 1093,
      "end_line": 1113,
      "comment": "\n     * Compares two ZipArchiveEntries based on their offset within the archive.\n     *\n     * \u003cp\u003eWon\u0027t return any meaningful results if one of the entries\n     * isn\u0027t part of the archive at all.\u003c/p\u003e\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-9fb668d6-d25e-44f4-9f61-f9aa6a4b9dbf.compare(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1095,
      "end_line": 1112,
      "comment": "",
      "child_ranges": [
        "(line 1097,col 13)-(line 1099,col 13)",
        "(line 1101,col 13)-(line 1101,col 71)",
        "(line 1102,col 13)-(line 1102,col 71)",
        "(line 1103,col 13)-(line 1105,col 13)",
        "(line 1106,col 13)-(line 1108,col 13)",
        "(line 1109,col 13)-(line 1110,col 62)",
        "(line 1111,col 13)-(line 1111,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveEntry"
      ],
      "begin_line": 1118,
      "end_line": 1148,
      "comment": "\n     * Extends ZipArchiveEntry to store the offset within the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offsetEntry"
      ],
      "begin_line": 1120,
      "end_line": 1120,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.Entry(org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry)",
      "begin_line": 1122,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1123,col 13)-(line 1123,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.getOffsetEntry()",
      "begin_line": 1126,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1127,col 13)-(line 1127,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.hashCode()",
      "begin_line": 1130,
      "end_line": 1134,
      "comment": "",
      "child_ranges": [
        "(line 1132,col 13)-(line 1133,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.equals(java.lang.Object)",
      "begin_line": 1136,
      "end_line": 1147,
      "comment": "",
      "child_ranges": [
        "(line 1138,col 13)-(line 1145,col 13)",
        "(line 1146,col 13)-(line 1146,col 25)"
      ]
    }
  ]
}