{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 79,
      "end_line": 1131,
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
      "end_line": 249,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if an error occurs closing the archive.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 22)",
        "(line 248,col 9)-(line 248,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)",
      "begin_line": 256,
      "end_line": 258,
      "comment": "\n     * close a zipfile quietly; throw no io fault, do nothing\n     * on a null parameter\n     * @param zipfile file to close, can be null\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Returns all entries.\n     *\n     * \u003cp\u003eEntries will be returned in the same order they appear\n     * within the archive\u0027s central directory.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder()",
      "begin_line": 282,
      "end_line": 286,
      "comment": "\n     * Returns all entries in physical order.\n     *\n     * \u003cp\u003eEntries will be returned in the same order their contents\n     * appear within the archive.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 92)",
        "(line 284,col 9)-(line 284,col 51)",
        "(line 285,col 9)-(line 285,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntry(java.lang.String)",
      "begin_line": 300,
      "end_line": 303,
      "comment": "\n     * Returns a named entry - or {@code null} if no entry by\n     * that name exists.\n     *\n     * \u003cp\u003eIf multiple entries with the same name exist the first entry\n     * in the archive\u0027s central directory by that name is\n     * returned.\u003c/p\u003e\n     *\n     * @param name name of the entry.\n     * @return the ZipArchiveEntry corresponding to the given name - or\n     * {@code null} if not present.\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 74)",
        "(line 302,col 9)-(line 302,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries(java.lang.String)",
      "begin_line": 314,
      "end_line": 318,
      "comment": "\n     * Returns all named entries in the same order they appear within\n     * the archive\u0027s central directory.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 68)",
        "(line 316,col 9)-(line 317,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder(java.lang.String)",
      "begin_line": 329,
      "end_line": 336,
      "comment": "\n     * Returns all named entries in the same order their contents\n     * appear within the archive.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 69)",
        "(line 331,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.canReadEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     * @param ze the entry\n     * @return whether this class is able to read the given entry.\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getRawInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 360,
      "end_line": 367,
      "comment": "\n     * Expose the raw stream of the archive entry (compressed form)\n     * \u003cp/\u003e\n     * This method does not relate to how/if we understand the payload in the\n     * stream, since we really only intend to move it on to somewhere else.\n     *\n     * @param ze The entry to get the stream for\n     * @return The raw input stream containing (possibly) compressed data.\n     ",
      "child_ranges": [
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 64)",
        "(line 365,col 9)-(line 365,col 44)",
        "(line 366,col 9)-(line 366,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.copyRawEntries(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, org.apache.commons.compress.archivers.zip.ZipArchiveEntryPredicate)",
      "begin_line": 379,
      "end_line": 388,
      "comment": "\n     * Transfer selected entries from this zipfile to a given #ZipArchiveOutputStream.\n     * Compression and all other attributes will be as in this file.\n     * This method transfers entries based on the central directory of the zip file.\n     *\n     * @param target The zipArchiveOutputStream to write the entries to\n     * @param predicate A predicate that selects which entries to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 71)",
        "(line 382,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 398,
      "end_line": 433,
      "comment": "\n     * Returns an InputStream for reading the contents of the given entry.\n     *\n     * @param ze the entry to get the stream for.\n     * @return a stream to read the entry from.\n     * @throws IOException if unable to create an input stream from the zipentry\n     * @throws ZipException if the zipentry uses an unsupported feature\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 64)",
        "(line 405,col 9)-(line 405,col 43)",
        "(line 406,col 9)-(line 406,col 44)",
        "(line 407,col 9)-(line 408,col 66)",
        "(line 409,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-05000f6d-2c2f-41c7-823c-31f41df1f2a8.close()",
      "begin_line": 421,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 423,col 25)-(line 423,col 38)",
        "(line 424,col 25)-(line 424,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getUnixSymlink(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 449,
      "end_line": 464,
      "comment": "\n     * \u003cp\u003e\n     * Convenience method to return the entry\u0027s content as a String if isUnixSymlink()\n     * returns true for it, otherwise returns null.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eThis method assumes the symbolic link\u0027s file name uses the\n     * same encoding that as been specified for this ZipFile.\u003c/p\u003e\n     *\n     * @param entry ZipArchiveEntry object that represents the symbolic link\n     * @return entry\u0027s content as a String\n     * @throws IOException problem with content\u0027s input stream\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.finalize()",
      "begin_line": 471,
      "end_line": 482,
      "comment": "\n     * Ensures that the close method of this zipfile is called when\n     * there are no more references to it.\n     * @see #close()\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 481,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 488,
      "end_line": 504,
      "comment": "\n     * Length of a \"central directory\" entry structure without file\n     * name, extra fields or comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 506,
      "end_line": 507,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory()",
      "begin_line": 520,
      "end_line": 541,
      "comment": "\n     * Reads the central directory of the given archive and populates\n     * the internal tables with ZipArchiveEntry instances.\n     *\n     * \u003cp\u003eThe ZipArchiveEntrys will know all data that can be obtained from\n     * the central directory alone, but not the data that requires the\n     * local file header or additional data to be read.\u003c/p\u003e\n     *\n     * @return a map of zipentries that didn\u0027t have the language\n     * encoding flag set when read.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 523,col 59)",
        "(line 525,col 9)-(line 525,col 37)",
        "(line 527,col 9)-(line 527,col 36)",
        "(line 528,col 9)-(line 528,col 46)",
        "(line 530,col 9)-(line 533,col 9)",
        "(line 535,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 552,
      "end_line": 634,
      "comment": "\n     * Reads an individual entry of the central directory, creats an\n     * ZipArchiveEntry from it and adds it to the global maps.\n     *\n     * @param noUTF8Flag map used to collect entries that don\u0027t have\n     * their UTF-8 flag set and whose name will be set by data read\n     * from the local file header later.  The current entry may be\n     * added to this map.\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 35)",
        "(line 556,col 9)-(line 556,col 20)",
        "(line 557,col 9)-(line 557,col 47)",
        "(line 558,col 9)-(line 558,col 37)",
        "(line 560,col 9)-(line 560,col 60)",
        "(line 561,col 9)-(line 561,col 21)",
        "(line 562,col 9)-(line 562,col 43)",
        "(line 563,col 9)-(line 563,col 68)",
        "(line 565,col 9)-(line 565,col 63)",
        "(line 566,col 9)-(line 566,col 21)",
        "(line 568,col 9)-(line 568,col 79)",
        "(line 569,col 9)-(line 569,col 62)",
        "(line 570,col 9)-(line 571,col 76)",
        "(line 572,col 9)-(line 572,col 40)",
        "(line 573,col 9)-(line 573,col 55)",
        "(line 575,col 9)-(line 575,col 21)",
        "(line 578,col 9)-(line 578,col 54)",
        "(line 579,col 9)-(line 579,col 21)",
        "(line 581,col 9)-(line 581,col 74)",
        "(line 582,col 9)-(line 582,col 25)",
        "(line 583,col 9)-(line 583,col 20)",
        "(line 585,col 9)-(line 585,col 50)",
        "(line 586,col 9)-(line 586,col 20)",
        "(line 588,col 9)-(line 588,col 61)",
        "(line 589,col 9)-(line 589,col 20)",
        "(line 591,col 9)-(line 591,col 51)",
        "(line 592,col 9)-(line 592,col 20)",
        "(line 594,col 9)-(line 594,col 58)",
        "(line 595,col 9)-(line 595,col 21)",
        "(line 597,col 9)-(line 597,col 55)",
        "(line 598,col 9)-(line 598,col 21)",
        "(line 600,col 9)-(line 600,col 57)",
        "(line 601,col 9)-(line 601,col 21)",
        "(line 603,col 9)-(line 603,col 56)",
        "(line 604,col 9)-(line 604,col 21)",
        "(line 606,col 9)-(line 606,col 66)",
        "(line 607,col 9)-(line 607,col 21)",
        "(line 609,col 9)-(line 609,col 65)",
        "(line 610,col 9)-(line 610,col 20)",
        "(line 612,col 9)-(line 612,col 48)",
        "(line 613,col 9)-(line 613,col 36)",
        "(line 614,col 9)-(line 614,col 61)",
        "(line 617,col 9)-(line 617,col 61)",
        "(line 619,col 9)-(line 619,col 24)",
        "(line 621,col 9)-(line 621,col 48)",
        "(line 622,col 9)-(line 622,col 39)",
        "(line 623,col 9)-(line 623,col 49)",
        "(line 625,col 9)-(line 625,col 63)",
        "(line 627,col 9)-(line 627,col 46)",
        "(line 628,col 9)-(line 628,col 35)",
        "(line 629,col 9)-(line 629,col 53)",
        "(line 631,col 9)-(line 633,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry, int)",
      "begin_line": 648,
      "end_line": 682,
      "comment": "\n     * If the entry holds a Zip64 extended information extra field,\n     * read sizes from there if the entry\u0027s sizes are set to\n     * 0xFFFFFFFFF, do the same for the offset of the local file\n     * header.\n     *\n     * \u003cp\u003eEnsures the Zip64 extra either knows both compressed and\n     * uncompressed size or neither of both as the internal logic in\n     * ExtraFieldUtils forces the field to create local header data\n     * even if they are never used - and here a field with only one\n     * size would be invalid.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 654,col 75)",
        "(line 655,col 9)-(line 681,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EOCD_SIZE"
      ],
      "begin_line": 689,
      "end_line": 702,
      "comment": "\n     * Length of the \"End of central directory record\" - which is\n     * supposed to be the last structure of the archive - without file\n     * comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EOCD_SIZE"
      ],
      "begin_line": 708,
      "end_line": 709,
      "comment": "\n     * Maximum length of the \"End of central directory record\" with a\n     * file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 717,
      "end_line": 726,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"End of central directory\n     * record\" relative to the start of the \"End of central directory\n     * record\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LENGTH"
      ],
      "begin_line": 733,
      "end_line": 740,
      "comment": "\n     * Length of the \"Zip64 end of central directory locator\" - which\n     * should be right in front of the \"end of central directory\n     * record\" if one is present at all.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LOCATOR_OFFSET"
      ],
      "begin_line": 748,
      "end_line": 752,
      "comment": "\n     * Offset of the field that holds the location of the \"Zip64 end\n     * of central directory record\" inside the \"Zip64 end of central\n     * directory locator\" relative to the start of the \"Zip64 end of\n     * central directory locator\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 760,
      "end_line": 774,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"Zip64 end of central\n     * directory record\" relative to the start of the \"Zip64 end of\n     * central directory record\".\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory()",
      "begin_line": 782,
      "end_line": 803,
      "comment": "\n     * Searches for either the \u0026quot;Zip64 end of central directory\n     * locator\u0026quot; or the \u0026quot;End of central dir record\u0026quot;, parses\n     * it and positions the stream at the first central directory\n     * record.\n     ",
      "child_ranges": [
        "(line 784,col 9)-(line 784,col 48)",
        "(line 785,col 9)-(line 785,col 30)",
        "(line 786,col 9)-(line 787,col 58)",
        "(line 788,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 802,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64()",
      "begin_line": 814,
      "end_line": 829,
      "comment": "\n     * Parses the \u0026quot;Zip64 end of central directory locator\u0026quot;,\n     * finds the \u0026quot;Zip64 end of central directory record\u0026quot; using the\n     * parsed information, parses that and positions the stream at the\n     * first central directory record.\n     *\n     * Expects stream to be positioned right behind the \u0026quot;Zip64\n     * end of central directory locator\u0026quot;\u0027s signature.\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 817,col 64)",
        "(line 818,col 9)-(line 818,col 37)",
        "(line 819,col 9)-(line 819,col 66)",
        "(line 820,col 9)-(line 820,col 36)",
        "(line 821,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 826,col 64)",
        "(line 827,col 9)-(line 827,col 37)",
        "(line 828,col 9)-(line 828,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32()",
      "begin_line": 838,
      "end_line": 843,
      "comment": "\n     * Parses the \u0026quot;End of central dir record\u0026quot; and positions\n     * the stream at the first central directory record.\n     *\n     * Expects stream to be positioned at the beginning of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 38)",
        "(line 841,col 9)-(line 841,col 36)",
        "(line 842,col 9)-(line 842,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtEndOfCentralDirectoryRecord()",
      "begin_line": 849,
      "end_line": 856,
      "comment": "\n     * Searches for the and positions the stream at the start of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 851,col 9)-(line 852,col 78)",
        "(line 853,col 9)-(line 855,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(long, long, byte[])",
      "begin_line": 863,
      "end_line": 896,
      "comment": "\n     * Searches the archive backwards from minDistance to maxDistance\n     * for the given signature, positions the RandomaccessFile right\n     * at the signature if it has been found.\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 30)",
        "(line 867,col 9)-(line 867,col 57)",
        "(line 868,col 9)-(line 869,col 64)",
        "(line 870,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 894,col 9)",
        "(line 895,col 9)-(line 895,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.skipBytes(int)",
      "begin_line": 902,
      "end_line": 911,
      "comment": "\n     * Skips the given number of bytes or throws an EOFException if\n     * skipping failed.\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 903,col 29)",
        "(line 904,col 9)-(line 910,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_OFFSET_FOR_FILENAME_LENGTH"
      ],
      "begin_line": 917,
      "end_line": 926,
      "comment": "\n     * Number of bytes in local file header up to the \u0026quot;length of\n     * filename\u0026quot; entry.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 935,
      "end_line": 978,
      "comment": "\n     * Walks through all recorded entries and adds the data available\n     * from the local file header.\n     *\n     * \u003cp\u003eAlso records the offsets for the data to read from the\n     * entries.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 977,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader()",
      "begin_line": 984,
      "end_line": 988,
      "comment": "\n     * Checks whether the archive starts with a LFH.  If it doesn\u0027t,\n     * it may be an empty archive.\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 24)",
        "(line 986,col 9)-(line 986,col 36)",
        "(line 987,col 9)-(line 987,col 71)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 995,
      "end_line": 1057,
      "comment": "\n     * InputStream that delegates requests to the underlying\n     * RandomAccessFile, making sure that only bytes from a certain\n     * range can be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "remaining"
      ],
      "begin_line": 996,
      "end_line": 996,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loc"
      ],
      "begin_line": 997,
      "end_line": 997,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 998,
      "end_line": 998,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.BoundedInputStream(long, long)",
      "begin_line": 1000,
      "end_line": 1003,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 13)-(line 1001,col 39)",
        "(line 1002,col 13)-(line 1002,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read()",
      "begin_line": 1005,
      "end_line": 1018,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 13)-(line 1013,col 13)",
        "(line 1014,col 13)-(line 1017,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1020,
      "end_line": 1048,
      "comment": "",
      "child_ranges": [
        "(line 1022,col 13)-(line 1029,col 13)",
        "(line 1031,col 13)-(line 1033,col 13)",
        "(line 1035,col 13)-(line 1037,col 13)",
        "(line 1038,col 13)-(line 1038,col 25)",
        "(line 1039,col 13)-(line 1042,col 13)",
        "(line 1043,col 13)-(line 1046,col 13)",
        "(line 1047,col 13)-(line 1047,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.addDummy()",
      "begin_line": 1054,
      "end_line": 1056,
      "comment": "\n         * Inflater needs an extra dummy byte for nowrap - see\n         * Inflater\u0027s javadocs.\n         ",
      "child_ranges": [
        "(line 1055,col 13)-(line 1055,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameAndComment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1059,
      "end_line": 1066,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1060,
      "end_line": 1060,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 1061,
      "end_line": 1061,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.NameAndComment(byte[], byte[])",
      "begin_line": 1062,
      "end_line": 1065,
      "comment": "",
      "child_ranges": [
        "(line 1063,col 13)-(line 1063,col 29)",
        "(line 1064,col 13)-(line 1064,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "OFFSET_COMPARATOR"
      ],
      "begin_line": 1076,
      "end_line": 1095,
      "comment": "\n     * Compares two ZipArchiveEntries based on their offset within the archive.\n     *\n     * \u003cp\u003eWon\u0027t return any meaningful results if one of the entries\n     * isn\u0027t part of the archive at all.\u003c/p\u003e\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-651e00b8-4616-4826-bfe2-6e9821e450f2.compare(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1078,
      "end_line": 1094,
      "comment": "",
      "child_ranges": [
        "(line 1079,col 13)-(line 1081,col 13)",
        "(line 1083,col 13)-(line 1083,col 65)",
        "(line 1084,col 13)-(line 1084,col 65)",
        "(line 1085,col 13)-(line 1087,col 13)",
        "(line 1088,col 13)-(line 1090,col 13)",
        "(line 1091,col 13)-(line 1092,col 62)",
        "(line 1093,col 13)-(line 1093,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveEntry"
      ],
      "begin_line": 1100,
      "end_line": 1130,
      "comment": "\n     * Extends ZipArchiveEntry to store the offset within the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offsetEntry"
      ],
      "begin_line": 1102,
      "end_line": 1102,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.Entry(org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry)",
      "begin_line": 1104,
      "end_line": 1106,
      "comment": "",
      "child_ranges": [
        "(line 1105,col 13)-(line 1105,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.getOffsetEntry()",
      "begin_line": 1108,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1109,col 13)-(line 1109,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.hashCode()",
      "begin_line": 1112,
      "end_line": 1116,
      "comment": "",
      "child_ranges": [
        "(line 1114,col 13)-(line 1115,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.equals(java.lang.Object)",
      "begin_line": 1118,
      "end_line": 1129,
      "comment": "",
      "child_ranges": [
        "(line 1120,col 13)-(line 1127,col 13)",
        "(line 1128,col 13)-(line 1128,col 25)"
      ]
    }
  ]
}