{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 85,
      "end_line": 1268,
      "comment": "\n * Replacement for \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e.\n *\n * \u003cp\u003eThis class adds support for file name encodings other than UTF-8\n * (which is required to work on ZIP files created by native zip tools\n * and is able to skip a preamble like the one found in self\n * extracting archives.  Furthermore it returns instances of\n * \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n * instead of \u003ccode\u003ejava.util.zip.ZipEntry\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eIt doesn\u0027t extend \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e as it would\n * have to reimplement all methods anyway.  Like\n * \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e, it uses SeekableByteChannel under the\n * covers and supports compressed and uncompressed entries.  As of\n * Apache Commons Compress 1.3 it also transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe method signatures mimic the ones of\n * \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e, with a couple of exceptions:\n *\n * \u003cul\u003e\n *   \u003cli\u003eThere is no getName method.\u003c/li\u003e\n *   \u003cli\u003eentries has been renamed to getEntries.\u003c/li\u003e\n *   \u003cli\u003egetEntries and getEntry return\n *   \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n *   instances.\u003c/li\u003e\n *   \u003cli\u003eclose is allowed to throw IOException.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NIBLET_MASK"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_SHIFT"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_0"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_1"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_2"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_3"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 98,
      "end_line": 99,
      "comment": "\n     * List of entries in the order they appear inside the central\n     * directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 104,
      "end_line": 105,
      "comment": "\n     * Maps String to list of ZipArchiveEntrys, name -\u003e actual entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archiveName"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * File name of actual source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * The actual data source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Whether the file is closed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dwordBuf"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "wordBuf"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfhBuf"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortBuf"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dwordBbuf"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wordBbuf"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfhBbuf"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\" for file names.\n     *\n     * @param f the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\".\n     *\n     * @param name name of the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String, java.lang.String)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names, scanning unicode extra fields.\n     *\n     * @param name name of the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names and scanning for unicode extra fields.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String, boolean)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 215,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel)",
      "begin_line": 230,
      "end_line": 233,
      "comment": "\n     * Opens the given channel for reading, assuming \"UTF8\" for file names.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel, java.lang.String)",
      "begin_line": 250,
      "end_line": 253,
      "comment": "\n     * Opens the given channel for reading, assuming the specified\n     * encoding for file names.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel, java.lang.String, java.lang.String, boolean)",
      "begin_line": 273,
      "end_line": 277,
      "comment": "\n     * Opens the given channel for reading, assuming the specified\n     * encoding for file names.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the archive.\n     * @param archiveName name of the archive, used for error messages only.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel, java.lang.String, java.lang.String, boolean, boolean)",
      "begin_line": 279,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 39)",
        "(line 284,col 9)-(line 284,col 33)",
        "(line 285,col 9)-(line 285,col 70)",
        "(line 286,col 9)-(line 286,col 59)",
        "(line 287,col 9)-(line 287,col 26)",
        "(line 288,col 9)-(line 288,col 32)",
        "(line 289,col 9)-(line 299,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEncoding()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.close()",
      "begin_line": 315,
      "end_line": 323,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if an error occurs closing the archive.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 22)",
        "(line 322,col 9)-(line 322,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * close a zipfile quietly; throw no io fault, do nothing\n     * on a null parameter\n     * @param zipfile file to close, can be null\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * Returns all entries.\n     *\n     * \u003cp\u003eEntries will be returned in the same order they appear\n     * within the archive\u0027s central directory.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder()",
      "begin_line": 356,
      "end_line": 360,
      "comment": "\n     * Returns all entries in physical order.\n     *\n     * \u003cp\u003eEntries will be returned in the same order their contents\n     * appear within the archive.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 98)",
        "(line 358,col 9)-(line 358,col 50)",
        "(line 359,col 9)-(line 359,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntry(java.lang.String)",
      "begin_line": 374,
      "end_line": 377,
      "comment": "\n     * Returns a named entry - or {@code null} if no entry by\n     * that name exists.\n     *\n     * \u003cp\u003eIf multiple entries with the same name exist the first entry\n     * in the archive\u0027s central directory by that name is\n     * returned.\u003c/p\u003e\n     *\n     * @param name name of the entry.\n     * @return the ZipArchiveEntry corresponding to the given name - or\n     * {@code null} if not present.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 80)",
        "(line 376,col 9)-(line 376,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries(java.lang.String)",
      "begin_line": 388,
      "end_line": 392,
      "comment": "\n     * Returns all named entries in the same order they appear within\n     * the archive\u0027s central directory.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 74)",
        "(line 390,col 9)-(line 391,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder(java.lang.String)",
      "begin_line": 403,
      "end_line": 410,
      "comment": "\n     * Returns all named entries in the same order their contents\n     * appear within the archive.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 69)",
        "(line 405,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.canReadEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     * @param ze the entry\n     * @return whether this class is able to read the given entry.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getRawInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 435,
      "end_line": 441,
      "comment": "\n     * Expose the raw stream of the archive entry (compressed form).\n     *\n     * \u003cp\u003eThis method does not relate to how/if we understand the payload in the\n     * stream, since we really only intend to move it on to somewhere else.\u003c/p\u003e\n     *\n     * @param ze The entry to get the stream for\n     * @return The raw input stream containing (possibly) compressed data.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 46)",
        "(line 440,col 9)-(line 440,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.copyRawEntries(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, org.apache.commons.compress.archivers.zip.ZipArchiveEntryPredicate)",
      "begin_line": 453,
      "end_line": 462,
      "comment": "\n     * Transfer selected entries from this zipfile to a given #ZipArchiveOutputStream.\n     * Compression and all other attributes will be as in this file.\n     * \u003cp\u003eThis method transfers entries based on the central directory of the zip file.\u003c/p\u003e\n     *\n     * @param target The zipArchiveOutputStream to write the entries to\n     * @param predicate A predicate that selects which entries to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 77)",
        "(line 456,col 9)-(line 461,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 472,
      "end_line": 529,
      "comment": "\n     * Returns an InputStream for reading the contents of the given entry.\n     *\n     * @param ze the entry to get the stream for.\n     * @return a stream to read the entry from.\n     * @throws IOException if unable to create an input stream from the zipentry\n     * @throws ZipException if the zipentry uses an unsupported feature\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 478,col 43)",
        "(line 479,col 9)-(line 479,col 46)",
        "(line 484,col 9)-(line 485,col 68)",
        "(line 486,col 9)-(line 486,col 61)",
        "(line 487,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-281a058c-121e-4212-8878-04af56d4987e.close()",
      "begin_line": 499,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 501,col 25)-(line 505,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getUnixSymlink(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 545,
      "end_line": 552,
      "comment": "\n     * \u003cp\u003e\n     * Convenience method to return the entry\u0027s content as a String if isUnixSymlink()\n     * returns true for it, otherwise returns null.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eThis method assumes the symbolic link\u0027s file name uses the\n     * same encoding that as been specified for this ZipFile.\u003c/p\u003e\n     *\n     * @param entry ZipArchiveEntry object that represents the symbolic link\n     * @return entry\u0027s content as a String\n     * @throws IOException problem with content\u0027s input stream\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.finalize()",
      "begin_line": 559,
      "end_line": 570,
      "comment": "\n     * Ensures that the close method of this zipfile is called when\n     * there are no more references to it.\n     * @see #close()\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 569,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 576,
      "end_line": 592,
      "comment": "\n     * Length of a \"central directory\" entry structure without file\n     * name, extra fields or comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 594,
      "end_line": 595,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory()",
      "begin_line": 608,
      "end_line": 631,
      "comment": "\n     * Reads the central directory of the given archive and populates\n     * the internal tables with ZipArchiveEntry instances.\n     *\n     * \u003cp\u003eThe ZipArchiveEntrys will know all data that can be obtained from\n     * the central directory alone, but not the data that requires the\n     * local file header or additional data to be read.\u003c/p\u003e\n     *\n     * @return a map of zipentries that didn\u0027t have the language\n     * encoding flag set when read.\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 611,col 28)",
        "(line 613,col 9)-(line 613,col 37)",
        "(line 615,col 9)-(line 615,col 26)",
        "(line 616,col 9)-(line 616,col 45)",
        "(line 617,col 9)-(line 617,col 45)",
        "(line 619,col 9)-(line 622,col 9)",
        "(line 624,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 630,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 642,
      "end_line": 727,
      "comment": "\n     * Reads an individual entry of the central directory, creats an\n     * ZipArchiveEntry from it and adds it to the global maps.\n     *\n     * @param noUTF8Flag map used to collect entries that don\u0027t have\n     * their UTF-8 flag set and whose name will be set by data read\n     * from the local file header later.  The current entry may be\n     * added to this map.\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 25)",
        "(line 646,col 9)-(line 646,col 44)",
        "(line 647,col 9)-(line 647,col 20)",
        "(line 648,col 9)-(line 648,col 37)",
        "(line 650,col 9)-(line 650,col 65)",
        "(line 651,col 9)-(line 651,col 21)",
        "(line 652,col 9)-(line 652,col 43)",
        "(line 653,col 9)-(line 653,col 68)",
        "(line 655,col 9)-(line 655,col 62)",
        "(line 656,col 9)-(line 656,col 21)",
        "(line 658,col 9)-(line 658,col 78)",
        "(line 659,col 9)-(line 659,col 62)",
        "(line 660,col 9)-(line 661,col 76)",
        "(line 662,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 40)",
        "(line 666,col 9)-(line 666,col 54)",
        "(line 668,col 9)-(line 668,col 21)",
        "(line 671,col 9)-(line 671,col 53)",
        "(line 672,col 9)-(line 672,col 21)",
        "(line 674,col 9)-(line 674,col 79)",
        "(line 675,col 9)-(line 675,col 25)",
        "(line 676,col 9)-(line 676,col 20)",
        "(line 678,col 9)-(line 678,col 49)",
        "(line 679,col 9)-(line 679,col 20)",
        "(line 681,col 9)-(line 681,col 60)",
        "(line 682,col 9)-(line 682,col 20)",
        "(line 684,col 9)-(line 684,col 50)",
        "(line 685,col 9)-(line 685,col 20)",
        "(line 687,col 9)-(line 687,col 63)",
        "(line 688,col 9)-(line 688,col 21)",
        "(line 690,col 9)-(line 690,col 60)",
        "(line 691,col 9)-(line 691,col 21)",
        "(line 693,col 9)-(line 693,col 62)",
        "(line 694,col 9)-(line 694,col 21)",
        "(line 696,col 9)-(line 696,col 61)",
        "(line 697,col 9)-(line 697,col 21)",
        "(line 699,col 9)-(line 699,col 65)",
        "(line 700,col 9)-(line 700,col 21)",
        "(line 702,col 9)-(line 702,col 64)",
        "(line 703,col 9)-(line 703,col 20)",
        "(line 705,col 9)-(line 705,col 54)",
        "(line 706,col 9)-(line 706,col 62)",
        "(line 707,col 9)-(line 707,col 61)",
        "(line 710,col 9)-(line 710,col 63)",
        "(line 712,col 9)-(line 712,col 24)",
        "(line 714,col 9)-(line 714,col 54)",
        "(line 715,col 9)-(line 715,col 65)",
        "(line 716,col 9)-(line 716,col 49)",
        "(line 718,col 9)-(line 718,col 55)",
        "(line 720,col 9)-(line 720,col 52)",
        "(line 721,col 9)-(line 721,col 61)",
        "(line 722,col 9)-(line 722,col 53)",
        "(line 724,col 9)-(line 726,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, int)",
      "begin_line": 741,
      "end_line": 773,
      "comment": "\n     * If the entry holds a Zip64 extended information extra field,\n     * read sizes from there if the entry\u0027s sizes are set to\n     * 0xFFFFFFFFF, do the same for the offset of the local file\n     * header.\n     *\n     * \u003cp\u003eEnsures the Zip64 extra either knows both compressed and\n     * uncompressed size or neither of both as the internal logic in\n     * ExtraFieldUtils forces the field to create local header data\n     * even if they are never used - and here a field with only one\n     * size would be invalid.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 746,col 75)",
        "(line 747,col 9)-(line 772,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EOCD_SIZE"
      ],
      "begin_line": 780,
      "end_line": 793,
      "comment": "\n     * Length of the \"End of central directory record\" - which is\n     * supposed to be the last structure of the archive - without file\n     * comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EOCD_SIZE"
      ],
      "begin_line": 799,
      "end_line": 800,
      "comment": "\n     * Maximum length of the \"End of central directory record\" with a\n     * file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 808,
      "end_line": 817,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"End of central directory\n     * record\" relative to the start of the \"End of central directory\n     * record\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LENGTH"
      ],
      "begin_line": 824,
      "end_line": 831,
      "comment": "\n     * Length of the \"Zip64 end of central directory locator\" - which\n     * should be right in front of the \"end of central directory\n     * record\" if one is present at all.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LOCATOR_OFFSET"
      ],
      "begin_line": 839,
      "end_line": 843,
      "comment": "\n     * Offset of the field that holds the location of the \"Zip64 end\n     * of central directory record\" inside the \"Zip64 end of central\n     * directory locator\" relative to the start of the \"Zip64 end of\n     * central directory locator\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 851,
      "end_line": 865,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"Zip64 end of central\n     * directory record\" relative to the start of the \"Zip64 end of\n     * central directory record\".\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory()",
      "begin_line": 873,
      "end_line": 895,
      "comment": "\n     * Searches for either the \u0026quot;Zip64 end of central directory\n     * locator\u0026quot; or the \u0026quot;End of central dir record\u0026quot;, parses\n     * it and positions the stream at the first central directory\n     * record.\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 48)",
        "(line 876,col 9)-(line 876,col 30)",
        "(line 877,col 9)-(line 878,col 52)",
        "(line 879,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 894,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64()",
      "begin_line": 906,
      "end_line": 924,
      "comment": "\n     * Parses the \u0026quot;Zip64 end of central directory locator\u0026quot;,\n     * finds the \u0026quot;Zip64 end of central directory record\u0026quot; using the\n     * parsed information, parses that and positions the stream at the\n     * first central directory record.\n     *\n     * Expects stream to be positioned right behind the \u0026quot;Zip64\n     * end of central directory locator\u0026quot;\u0027s signature.\n     ",
      "child_ranges": [
        "(line 908,col 9)-(line 909,col 64)",
        "(line 910,col 9)-(line 910,col 27)",
        "(line 911,col 9)-(line 911,col 46)",
        "(line 912,col 9)-(line 912,col 69)",
        "(line 913,col 9)-(line 913,col 26)",
        "(line 914,col 9)-(line 914,col 45)",
        "(line 915,col 9)-(line 918,col 9)",
        "(line 919,col 9)-(line 920,col 64)",
        "(line 921,col 9)-(line 921,col 27)",
        "(line 922,col 9)-(line 922,col 46)",
        "(line 923,col 9)-(line 923,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32()",
      "begin_line": 933,
      "end_line": 939,
      "comment": "\n     * Parses the \u0026quot;End of central dir record\u0026quot; and positions\n     * the stream at the first central directory record.\n     *\n     * Expects stream to be positioned at the beginning of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 38)",
        "(line 936,col 9)-(line 936,col 26)",
        "(line 937,col 9)-(line 937,col 45)",
        "(line 938,col 9)-(line 938,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtEndOfCentralDirectoryRecord()",
      "begin_line": 945,
      "end_line": 952,
      "comment": "\n     * Searches for the and positions the stream at the start of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 948,col 78)",
        "(line 949,col 9)-(line 951,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(long, long, byte[])",
      "begin_line": 959,
      "end_line": 996,
      "comment": "\n     * Searches the archive backwards from minDistance to maxDistance\n     * for the given signature, positions the RandomaccessFile right\n     * at the signature if it has been found.\n     ",
      "child_ranges": [
        "(line 962,col 9)-(line 962,col 30)",
        "(line 963,col 9)-(line 963,col 55)",
        "(line 964,col 9)-(line 965,col 62)",
        "(line 966,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 994,col 9)",
        "(line 995,col 9)-(line 995,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.skipBytes(int)",
      "begin_line": 1002,
      "end_line": 1009,
      "comment": "\n     * Skips the given number of bytes or throws an EOFException if\n     * skipping failed.\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 50)",
        "(line 1004,col 9)-(line 1004,col 51)",
        "(line 1005,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1008,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_OFFSET_FOR_FILENAME_LENGTH"
      ],
      "begin_line": 1015,
      "end_line": 1024,
      "comment": "\n     * Number of bytes in local file header up to the \u0026quot;length of\n     * filename\u0026quot; entry.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 1033,
      "end_line": 1071,
      "comment": "\n     * Walks through all recorded entries and adds the data available\n     * from the local file header.\n     *\n     * \u003cp\u003eAlso records the offsets for the data to read from the\n     * entries.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1036,col 9)-(line 1070,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader()",
      "begin_line": 1077,
      "end_line": 1082,
      "comment": "\n     * Checks whether the archive starts with a LFH.  If it doesn\u0027t,\n     * it may be an empty archive.\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 28)",
        "(line 1079,col 9)-(line 1079,col 26)",
        "(line 1080,col 9)-(line 1080,col 45)",
        "(line 1081,col 9)-(line 1081,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.createBoundedInputStream(long, long)",
      "begin_line": 1088,
      "end_line": 1092,
      "comment": "\n     * Creates new BoundedInputStream, according to implementation of\n     * underlying archive channel.\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1091,col 53)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 1099,
      "end_line": 1178,
      "comment": "\n     * InputStream that delegates requests to the underlying\n     * SeekableByteChannel, making sure that only bytes from a certain\n     * range can be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "singleByteBuffer"
      ],
      "begin_line": 1100,
      "end_line": 1100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "end"
      ],
      "begin_line": 1101,
      "end_line": 1101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loc"
      ],
      "begin_line": 1102,
      "end_line": 1102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addDummy"
      ],
      "begin_line": 1103,
      "end_line": 1103,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.BoundedInputStream(long, long)",
      "begin_line": 1105,
      "end_line": 1112,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 13)-(line 1106,col 39)",
        "(line 1107,col 13)-(line 1110,col 13)",
        "(line 1111,col 13)-(line 1111,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read()",
      "begin_line": 1114,
      "end_line": 1135,
      "comment": "",
      "child_ranges": [
        "(line 1116,col 13)-(line 1122,col 13)",
        "(line 1123,col 13)-(line 1128,col 13)",
        "(line 1129,col 13)-(line 1129,col 51)",
        "(line 1130,col 13)-(line 1132,col 13)",
        "(line 1133,col 13)-(line 1133,col 18)",
        "(line 1134,col 13)-(line 1134,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1137,
      "end_line": 1163,
      "comment": "",
      "child_ranges": [
        "(line 1139,col 13)-(line 1141,col 13)",
        "(line 1143,col 13)-(line 1153,col 13)",
        "(line 1155,col 13)-(line 1155,col 27)",
        "(line 1156,col 13)-(line 1156,col 47)",
        "(line 1157,col 13)-(line 1157,col 37)",
        "(line 1158,col 13)-(line 1161,col 13)",
        "(line 1162,col 13)-(line 1162,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(long, java.nio.ByteBuffer)",
      "begin_line": 1165,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1166,col 13)-(line 1166,col 21)",
        "(line 1167,col 13)-(line 1170,col 13)",
        "(line 1171,col 13)-(line 1171,col 23)",
        "(line 1172,col 13)-(line 1172,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.addDummy()",
      "begin_line": 1175,
      "end_line": 1177,
      "comment": "",
      "child_ranges": [
        "(line 1176,col 13)-(line 1176,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedFileChannelInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream"
      ],
      "begin_line": 1186,
      "end_line": 1200,
      "comment": "\n     * Lock-free implementation of BoundedInputStream. The\n     * implementation uses positioned reads on the underlying archive\n     * file channel and therefore performs significantly faster in\n     * concurrent environment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 1187,
      "end_line": 1187,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedFileChannelInputStream.BoundedFileChannelInputStream(long, long)",
      "begin_line": 1189,
      "end_line": 1192,
      "comment": "",
      "child_ranges": [
        "(line 1190,col 13)-(line 1190,col 36)",
        "(line 1191,col 13)-(line 1191,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedFileChannelInputStream.read(long, java.nio.ByteBuffer)",
      "begin_line": 1194,
      "end_line": 1199,
      "comment": "",
      "child_ranges": [
        "(line 1196,col 13)-(line 1196,col 46)",
        "(line 1197,col 13)-(line 1197,col 23)",
        "(line 1198,col 13)-(line 1198,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameAndComment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1202,
      "end_line": 1209,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1203,
      "end_line": 1203,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 1204,
      "end_line": 1204,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.NameAndComment(byte[], byte[])",
      "begin_line": 1205,
      "end_line": 1208,
      "comment": "",
      "child_ranges": [
        "(line 1206,col 13)-(line 1206,col 29)",
        "(line 1207,col 13)-(line 1207,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "offsetComparator"
      ],
      "begin_line": 1219,
      "end_line": 1239,
      "comment": "\n     * Compares two ZipArchiveEntries based on their offset within the archive.\n     *\n     * \u003cp\u003eWon\u0027t return any meaningful results if one of the entries\n     * isn\u0027t part of the archive at all.\u003c/p\u003e\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-9c865c54-a076-47a5-9cdd-605f0822686f.compare(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1221,
      "end_line": 1238,
      "comment": "",
      "child_ranges": [
        "(line 1223,col 13)-(line 1225,col 13)",
        "(line 1227,col 13)-(line 1227,col 71)",
        "(line 1228,col 13)-(line 1228,col 71)",
        "(line 1229,col 13)-(line 1231,col 13)",
        "(line 1232,col 13)-(line 1234,col 13)",
        "(line 1235,col 13)-(line 1236,col 55)",
        "(line 1237,col 13)-(line 1237,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveEntry"
      ],
      "begin_line": 1244,
      "end_line": 1267,
      "comment": "\n     * Extends ZipArchiveEntry to store the offset within the archive.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.Entry()",
      "begin_line": 1246,
      "end_line": 1247,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.hashCode()",
      "begin_line": 1249,
      "end_line": 1253,
      "comment": "",
      "child_ranges": [
        "(line 1251,col 13)-(line 1252,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.equals(java.lang.Object)",
      "begin_line": 1255,
      "end_line": 1266,
      "comment": "",
      "child_ranges": [
        "(line 1257,col 13)-(line 1264,col 13)",
        "(line 1265,col 13)-(line 1265,col 25)"
      ]
    }
  ]
}