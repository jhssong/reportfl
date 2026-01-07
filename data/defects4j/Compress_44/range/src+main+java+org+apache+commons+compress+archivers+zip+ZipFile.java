{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 84,
      "end_line": 1258,
      "comment": "\n * Replacement for \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e.\n *\n * \u003cp\u003eThis class adds support for file name encodings other than UTF-8\n * (which is required to work on ZIP files created by native zip tools\n * and is able to skip a preamble like the one found in self\n * extracting archives.  Furthermore it returns instances of\n * \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n * instead of \u003ccode\u003ejava.util.zip.ZipEntry\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eIt doesn\u0027t extend \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e as it would\n * have to reimplement all methods anyway.  Like\n * \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e, it uses SeekableByteChannel under the\n * covers and supports compressed and uncompressed entries.  As of\n * Apache Commons Compress 1.3 it also transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe method signatures mimic the ones of\n * \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e, with a couple of exceptions:\n *\n * \u003cul\u003e\n *   \u003cli\u003eThere is no getName method.\u003c/li\u003e\n *   \u003cli\u003eentries has been renamed to getEntries.\u003c/li\u003e\n *   \u003cli\u003egetEntries and getEntry return\n *   \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n *   instances.\u003c/li\u003e\n *   \u003cli\u003eclose is allowed to throw IOException.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NIBLET_MASK"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_SHIFT"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_0"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_1"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_2"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_3"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 97,
      "end_line": 98,
      "comment": "\n     * List of entries in the order they appear inside the central\n     * directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 103,
      "end_line": 104,
      "comment": "\n     * Maps String to list of ZipArchiveEntrys, name -\u003e actual entries.\n     "
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
        "dwordBuf"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "wordBuf"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfhBuf"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortBuf"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dwordBbuf"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wordBbuf"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfhBbuf"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File)",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\" for file names.\n     *\n     * @param f the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\".\n     *\n     * @param name name of the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String, java.lang.String)",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names, scanning unicode extra fields.\n     *\n     * @param name name of the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String)",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names and scanning for unicode extra fields.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String, boolean)",
      "begin_line": 211,
      "end_line": 215,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 214,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel)",
      "begin_line": 229,
      "end_line": 232,
      "comment": "\n     * Opens the given channel for reading, assuming \"UTF8\" for file names.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel, java.lang.String)",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\n     * Opens the given channel for reading, assuming the specified\n     * encoding for file names.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel, java.lang.String, java.lang.String, boolean)",
      "begin_line": 272,
      "end_line": 276,
      "comment": "\n     * Opens the given channel for reading, assuming the specified\n     * encoding for file names.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the archive.\n     * @param archiveName name of the archive, used for error messages only.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel, java.lang.String, java.lang.String, boolean, boolean)",
      "begin_line": 278,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 39)",
        "(line 283,col 9)-(line 283,col 33)",
        "(line 284,col 9)-(line 284,col 70)",
        "(line 285,col 9)-(line 285,col 59)",
        "(line 286,col 9)-(line 286,col 26)",
        "(line 287,col 9)-(line 287,col 32)",
        "(line 288,col 9)-(line 298,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEncoding()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.close()",
      "begin_line": 314,
      "end_line": 322,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if an error occurs closing the archive.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 22)",
        "(line 321,col 9)-(line 321,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * close a zipfile quietly; throw no io fault, do nothing\n     * on a null parameter\n     * @param zipfile file to close, can be null\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * Returns all entries.\n     *\n     * \u003cp\u003eEntries will be returned in the same order they appear\n     * within the archive\u0027s central directory.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder()",
      "begin_line": 355,
      "end_line": 359,
      "comment": "\n     * Returns all entries in physical order.\n     *\n     * \u003cp\u003eEntries will be returned in the same order their contents\n     * appear within the archive.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 98)",
        "(line 357,col 9)-(line 357,col 50)",
        "(line 358,col 9)-(line 358,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntry(java.lang.String)",
      "begin_line": 373,
      "end_line": 376,
      "comment": "\n     * Returns a named entry - or {@code null} if no entry by\n     * that name exists.\n     *\n     * \u003cp\u003eIf multiple entries with the same name exist the first entry\n     * in the archive\u0027s central directory by that name is\n     * returned.\u003c/p\u003e\n     *\n     * @param name name of the entry.\n     * @return the ZipArchiveEntry corresponding to the given name - or\n     * {@code null} if not present.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 80)",
        "(line 375,col 9)-(line 375,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries(java.lang.String)",
      "begin_line": 387,
      "end_line": 391,
      "comment": "\n     * Returns all named entries in the same order they appear within\n     * the archive\u0027s central directory.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 74)",
        "(line 389,col 9)-(line 390,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder(java.lang.String)",
      "begin_line": 402,
      "end_line": 409,
      "comment": "\n     * Returns all named entries in the same order their contents\n     * appear within the archive.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 69)",
        "(line 404,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.canReadEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     * @param ze the entry\n     * @return whether this class is able to read the given entry.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getRawInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 434,
      "end_line": 440,
      "comment": "\n     * Expose the raw stream of the archive entry (compressed form).\n     *\n     * \u003cp\u003eThis method does not relate to how/if we understand the payload in the\n     * stream, since we really only intend to move it on to somewhere else.\u003c/p\u003e\n     *\n     * @param ze The entry to get the stream for\n     * @return The raw input stream containing (possibly) compressed data.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 46)",
        "(line 439,col 9)-(line 439,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.copyRawEntries(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, org.apache.commons.compress.archivers.zip.ZipArchiveEntryPredicate)",
      "begin_line": 452,
      "end_line": 461,
      "comment": "\n     * Transfer selected entries from this zipfile to a given #ZipArchiveOutputStream.\n     * Compression and all other attributes will be as in this file.\n     * \u003cp\u003eThis method transfers entries based on the central directory of the zip file.\u003c/p\u003e\n     *\n     * @param target The zipArchiveOutputStream to write the entries to\n     * @param predicate A predicate that selects which entries to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 77)",
        "(line 455,col 9)-(line 460,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 471,
      "end_line": 522,
      "comment": "\n     * Returns an InputStream for reading the contents of the given entry.\n     *\n     * @param ze the entry to get the stream for.\n     * @return a stream to read the entry from.\n     * @throws IOException if unable to create an input stream from the zipentry\n     * @throws ZipException if the zipentry uses an unsupported feature\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 477,col 43)",
        "(line 478,col 9)-(line 478,col 46)",
        "(line 480,col 9)-(line 481,col 68)",
        "(line 482,col 9)-(line 521,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-37822802-7611-449d-97de-86048c531d12.close()",
      "begin_line": 494,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 496,col 25)-(line 500,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getUnixSymlink(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 538,
      "end_line": 545,
      "comment": "\n     * \u003cp\u003e\n     * Convenience method to return the entry\u0027s content as a String if isUnixSymlink()\n     * returns true for it, otherwise returns null.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eThis method assumes the symbolic link\u0027s file name uses the\n     * same encoding that as been specified for this ZipFile.\u003c/p\u003e\n     *\n     * @param entry ZipArchiveEntry object that represents the symbolic link\n     * @return entry\u0027s content as a String\n     * @throws IOException problem with content\u0027s input stream\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.finalize()",
      "begin_line": 552,
      "end_line": 563,
      "comment": "\n     * Ensures that the close method of this zipfile is called when\n     * there are no more references to it.\n     * @see #close()\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 569,
      "end_line": 585,
      "comment": "\n     * Length of a \"central directory\" entry structure without file\n     * name, extra fields or comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 587,
      "end_line": 588,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory()",
      "begin_line": 601,
      "end_line": 624,
      "comment": "\n     * Reads the central directory of the given archive and populates\n     * the internal tables with ZipArchiveEntry instances.\n     *\n     * \u003cp\u003eThe ZipArchiveEntrys will know all data that can be obtained from\n     * the central directory alone, but not the data that requires the\n     * local file header or additional data to be read.\u003c/p\u003e\n     *\n     * @return a map of zipentries that didn\u0027t have the language\n     * encoding flag set when read.\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 604,col 28)",
        "(line 606,col 9)-(line 606,col 37)",
        "(line 608,col 9)-(line 608,col 26)",
        "(line 609,col 9)-(line 609,col 45)",
        "(line 610,col 9)-(line 610,col 45)",
        "(line 612,col 9)-(line 615,col 9)",
        "(line 617,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 623,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 635,
      "end_line": 717,
      "comment": "\n     * Reads an individual entry of the central directory, creats an\n     * ZipArchiveEntry from it and adds it to the global maps.\n     *\n     * @param noUTF8Flag map used to collect entries that don\u0027t have\n     * their UTF-8 flag set and whose name will be set by data read\n     * from the local file header later.  The current entry may be\n     * added to this map.\n     ",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 25)",
        "(line 639,col 9)-(line 639,col 44)",
        "(line 640,col 9)-(line 640,col 20)",
        "(line 641,col 9)-(line 641,col 37)",
        "(line 643,col 9)-(line 643,col 65)",
        "(line 644,col 9)-(line 644,col 21)",
        "(line 645,col 9)-(line 645,col 43)",
        "(line 646,col 9)-(line 646,col 68)",
        "(line 648,col 9)-(line 648,col 62)",
        "(line 649,col 9)-(line 649,col 21)",
        "(line 651,col 9)-(line 651,col 78)",
        "(line 652,col 9)-(line 652,col 62)",
        "(line 653,col 9)-(line 654,col 76)",
        "(line 655,col 9)-(line 655,col 40)",
        "(line 656,col 9)-(line 656,col 54)",
        "(line 658,col 9)-(line 658,col 21)",
        "(line 661,col 9)-(line 661,col 53)",
        "(line 662,col 9)-(line 662,col 21)",
        "(line 664,col 9)-(line 664,col 79)",
        "(line 665,col 9)-(line 665,col 25)",
        "(line 666,col 9)-(line 666,col 20)",
        "(line 668,col 9)-(line 668,col 49)",
        "(line 669,col 9)-(line 669,col 20)",
        "(line 671,col 9)-(line 671,col 60)",
        "(line 672,col 9)-(line 672,col 20)",
        "(line 674,col 9)-(line 674,col 50)",
        "(line 675,col 9)-(line 675,col 20)",
        "(line 677,col 9)-(line 677,col 63)",
        "(line 678,col 9)-(line 678,col 21)",
        "(line 680,col 9)-(line 680,col 60)",
        "(line 681,col 9)-(line 681,col 21)",
        "(line 683,col 9)-(line 683,col 62)",
        "(line 684,col 9)-(line 684,col 21)",
        "(line 686,col 9)-(line 686,col 61)",
        "(line 687,col 9)-(line 687,col 21)",
        "(line 689,col 9)-(line 689,col 65)",
        "(line 690,col 9)-(line 690,col 21)",
        "(line 692,col 9)-(line 692,col 64)",
        "(line 693,col 9)-(line 693,col 20)",
        "(line 695,col 9)-(line 695,col 54)",
        "(line 696,col 9)-(line 696,col 62)",
        "(line 697,col 9)-(line 697,col 61)",
        "(line 700,col 9)-(line 700,col 63)",
        "(line 702,col 9)-(line 702,col 24)",
        "(line 704,col 9)-(line 704,col 54)",
        "(line 705,col 9)-(line 705,col 65)",
        "(line 706,col 9)-(line 706,col 49)",
        "(line 708,col 9)-(line 708,col 55)",
        "(line 710,col 9)-(line 710,col 52)",
        "(line 711,col 9)-(line 711,col 61)",
        "(line 712,col 9)-(line 712,col 53)",
        "(line 714,col 9)-(line 716,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, int)",
      "begin_line": 731,
      "end_line": 763,
      "comment": "\n     * If the entry holds a Zip64 extended information extra field,\n     * read sizes from there if the entry\u0027s sizes are set to\n     * 0xFFFFFFFFF, do the same for the offset of the local file\n     * header.\n     *\n     * \u003cp\u003eEnsures the Zip64 extra either knows both compressed and\n     * uncompressed size or neither of both as the internal logic in\n     * ExtraFieldUtils forces the field to create local header data\n     * even if they are never used - and here a field with only one\n     * size would be invalid.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 734,col 9)-(line 736,col 75)",
        "(line 737,col 9)-(line 762,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EOCD_SIZE"
      ],
      "begin_line": 770,
      "end_line": 783,
      "comment": "\n     * Length of the \"End of central directory record\" - which is\n     * supposed to be the last structure of the archive - without file\n     * comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EOCD_SIZE"
      ],
      "begin_line": 789,
      "end_line": 790,
      "comment": "\n     * Maximum length of the \"End of central directory record\" with a\n     * file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 798,
      "end_line": 807,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"End of central directory\n     * record\" relative to the start of the \"End of central directory\n     * record\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LENGTH"
      ],
      "begin_line": 814,
      "end_line": 821,
      "comment": "\n     * Length of the \"Zip64 end of central directory locator\" - which\n     * should be right in front of the \"end of central directory\n     * record\" if one is present at all.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LOCATOR_OFFSET"
      ],
      "begin_line": 829,
      "end_line": 833,
      "comment": "\n     * Offset of the field that holds the location of the \"Zip64 end\n     * of central directory record\" inside the \"Zip64 end of central\n     * directory locator\" relative to the start of the \"Zip64 end of\n     * central directory locator\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 841,
      "end_line": 855,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"Zip64 end of central\n     * directory record\" relative to the start of the \"Zip64 end of\n     * central directory record\".\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory()",
      "begin_line": 863,
      "end_line": 885,
      "comment": "\n     * Searches for either the \u0026quot;Zip64 end of central directory\n     * locator\u0026quot; or the \u0026quot;End of central dir record\u0026quot;, parses\n     * it and positions the stream at the first central directory\n     * record.\n     ",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 48)",
        "(line 866,col 9)-(line 866,col 30)",
        "(line 867,col 9)-(line 868,col 52)",
        "(line 869,col 9)-(line 875,col 9)",
        "(line 876,col 9)-(line 884,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64()",
      "begin_line": 896,
      "end_line": 914,
      "comment": "\n     * Parses the \u0026quot;Zip64 end of central directory locator\u0026quot;,\n     * finds the \u0026quot;Zip64 end of central directory record\u0026quot; using the\n     * parsed information, parses that and positions the stream at the\n     * first central directory record.\n     *\n     * Expects stream to be positioned right behind the \u0026quot;Zip64\n     * end of central directory locator\u0026quot;\u0027s signature.\n     ",
      "child_ranges": [
        "(line 898,col 9)-(line 899,col 64)",
        "(line 900,col 9)-(line 900,col 27)",
        "(line 901,col 9)-(line 901,col 46)",
        "(line 902,col 9)-(line 902,col 69)",
        "(line 903,col 9)-(line 903,col 26)",
        "(line 904,col 9)-(line 904,col 45)",
        "(line 905,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 910,col 64)",
        "(line 911,col 9)-(line 911,col 27)",
        "(line 912,col 9)-(line 912,col 46)",
        "(line 913,col 9)-(line 913,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32()",
      "begin_line": 923,
      "end_line": 929,
      "comment": "\n     * Parses the \u0026quot;End of central dir record\u0026quot; and positions\n     * the stream at the first central directory record.\n     *\n     * Expects stream to be positioned at the beginning of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 38)",
        "(line 926,col 9)-(line 926,col 26)",
        "(line 927,col 9)-(line 927,col 45)",
        "(line 928,col 9)-(line 928,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtEndOfCentralDirectoryRecord()",
      "begin_line": 935,
      "end_line": 942,
      "comment": "\n     * Searches for the and positions the stream at the start of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 938,col 78)",
        "(line 939,col 9)-(line 941,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(long, long, byte[])",
      "begin_line": 949,
      "end_line": 986,
      "comment": "\n     * Searches the archive backwards from minDistance to maxDistance\n     * for the given signature, positions the RandomaccessFile right\n     * at the signature if it has been found.\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 952,col 30)",
        "(line 953,col 9)-(line 953,col 55)",
        "(line 954,col 9)-(line 955,col 62)",
        "(line 956,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 985,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.skipBytes(int)",
      "begin_line": 992,
      "end_line": 999,
      "comment": "\n     * Skips the given number of bytes or throws an EOFException if\n     * skipping failed.\n     ",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 50)",
        "(line 994,col 9)-(line 994,col 51)",
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 998,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_OFFSET_FOR_FILENAME_LENGTH"
      ],
      "begin_line": 1005,
      "end_line": 1014,
      "comment": "\n     * Number of bytes in local file header up to the \u0026quot;length of\n     * filename\u0026quot; entry.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 1023,
      "end_line": 1061,
      "comment": "\n     * Walks through all recorded entries and adds the data available\n     * from the local file header.\n     *\n     * \u003cp\u003eAlso records the offsets for the data to read from the\n     * entries.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1026,col 9)-(line 1060,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader()",
      "begin_line": 1067,
      "end_line": 1072,
      "comment": "\n     * Checks whether the archive starts with a LFH.  If it doesn\u0027t,\n     * it may be an empty archive.\n     ",
      "child_ranges": [
        "(line 1068,col 9)-(line 1068,col 28)",
        "(line 1069,col 9)-(line 1069,col 26)",
        "(line 1070,col 9)-(line 1070,col 45)",
        "(line 1071,col 9)-(line 1071,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.createBoundedInputStream(long, long)",
      "begin_line": 1078,
      "end_line": 1082,
      "comment": "\n     * Creates new BoundedInputStream, according to implementation of\n     * underlying archive channel.\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1081,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 1089,
      "end_line": 1168,
      "comment": "\n     * InputStream that delegates requests to the underlying\n     * SeekableByteChannel, making sure that only bytes from a certain\n     * range can be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "singleByteBuffer"
      ],
      "begin_line": 1090,
      "end_line": 1090,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 1091,
      "end_line": 1091,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loc"
      ],
      "begin_line": 1092,
      "end_line": 1092,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addDummy"
      ],
      "begin_line": 1093,
      "end_line": 1093,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.BoundedInputStream(long, long)",
      "begin_line": 1095,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1096,col 13)-(line 1096,col 39)",
        "(line 1097,col 13)-(line 1100,col 13)",
        "(line 1101,col 13)-(line 1101,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read()",
      "begin_line": 1104,
      "end_line": 1125,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 13)-(line 1112,col 13)",
        "(line 1113,col 13)-(line 1118,col 13)",
        "(line 1119,col 13)-(line 1119,col 51)",
        "(line 1120,col 13)-(line 1122,col 13)",
        "(line 1123,col 13)-(line 1123,col 18)",
        "(line 1124,col 13)-(line 1124,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1127,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1129,col 13)-(line 1131,col 13)",
        "(line 1133,col 13)-(line 1143,col 13)",
        "(line 1145,col 13)-(line 1145,col 27)",
        "(line 1146,col 13)-(line 1146,col 47)",
        "(line 1147,col 13)-(line 1147,col 37)",
        "(line 1148,col 13)-(line 1151,col 13)",
        "(line 1152,col 13)-(line 1152,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(long, java.nio.ByteBuffer)",
      "begin_line": 1155,
      "end_line": 1163,
      "comment": "",
      "child_ranges": [
        "(line 1156,col 13)-(line 1156,col 21)",
        "(line 1157,col 13)-(line 1160,col 13)",
        "(line 1161,col 13)-(line 1161,col 23)",
        "(line 1162,col 13)-(line 1162,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.addDummy()",
      "begin_line": 1165,
      "end_line": 1167,
      "comment": "",
      "child_ranges": [
        "(line 1166,col 13)-(line 1166,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedFileChannelInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream"
      ],
      "begin_line": 1176,
      "end_line": 1190,
      "comment": "\n     * Lock-free implementation of BoundedInputStream. The\n     * implementation uses positioned reads on the underlying archive\n     * file channel and therefore performs significantly faster in\n     * concurrent environment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 1177,
      "end_line": 1177,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedFileChannelInputStream.BoundedFileChannelInputStream(long, long)",
      "begin_line": 1179,
      "end_line": 1182,
      "comment": "",
      "child_ranges": [
        "(line 1180,col 13)-(line 1180,col 36)",
        "(line 1181,col 13)-(line 1181,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedFileChannelInputStream.read(long, java.nio.ByteBuffer)",
      "begin_line": 1184,
      "end_line": 1189,
      "comment": "",
      "child_ranges": [
        "(line 1186,col 13)-(line 1186,col 46)",
        "(line 1187,col 13)-(line 1187,col 23)",
        "(line 1188,col 13)-(line 1188,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameAndComment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1192,
      "end_line": 1199,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1193,
      "end_line": 1193,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 1194,
      "end_line": 1194,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.NameAndComment(byte[], byte[])",
      "begin_line": 1195,
      "end_line": 1198,
      "comment": "",
      "child_ranges": [
        "(line 1196,col 13)-(line 1196,col 29)",
        "(line 1197,col 13)-(line 1197,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "offsetComparator"
      ],
      "begin_line": 1209,
      "end_line": 1229,
      "comment": "\n     * Compares two ZipArchiveEntries based on their offset within the archive.\n     *\n     * \u003cp\u003eWon\u0027t return any meaningful results if one of the entries\n     * isn\u0027t part of the archive at all.\u003c/p\u003e\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-5619a8e0-7b68-4416-b057-9d57237fd7df.compare(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1211,
      "end_line": 1228,
      "comment": "",
      "child_ranges": [
        "(line 1213,col 13)-(line 1215,col 13)",
        "(line 1217,col 13)-(line 1217,col 71)",
        "(line 1218,col 13)-(line 1218,col 71)",
        "(line 1219,col 13)-(line 1221,col 13)",
        "(line 1222,col 13)-(line 1224,col 13)",
        "(line 1225,col 13)-(line 1226,col 55)",
        "(line 1227,col 13)-(line 1227,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveEntry"
      ],
      "begin_line": 1234,
      "end_line": 1257,
      "comment": "\n     * Extends ZipArchiveEntry to store the offset within the archive.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.Entry()",
      "begin_line": 1236,
      "end_line": 1237,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.hashCode()",
      "begin_line": 1239,
      "end_line": 1243,
      "comment": "",
      "child_ranges": [
        "(line 1241,col 13)-(line 1242,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.equals(java.lang.Object)",
      "begin_line": 1245,
      "end_line": 1256,
      "comment": "",
      "child_ranges": [
        "(line 1247,col 13)-(line 1254,col 13)",
        "(line 1255,col 13)-(line 1255,col 25)"
      ]
    }
  ]
}