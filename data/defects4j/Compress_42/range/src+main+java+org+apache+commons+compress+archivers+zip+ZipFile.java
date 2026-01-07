{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 83,
      "end_line": 1252,
      "comment": "\n * Replacement for \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e.\n *\n * \u003cp\u003eThis class adds support for file name encodings other than UTF-8\n * (which is required to work on ZIP files created by native zip tools\n * and is able to skip a preamble like the one found in self\n * extracting archives.  Furthermore it returns instances of\n * \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n * instead of \u003ccode\u003ejava.util.zip.ZipEntry\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eIt doesn\u0027t extend \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e as it would\n * have to reimplement all methods anyway.  Like\n * \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e, it uses SeekableByteChannel under the\n * covers and supports compressed and uncompressed entries.  As of\n * Apache Commons Compress 1.3 it also transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe method signatures mimic the ones of\n * \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e, with a couple of exceptions:\n *\n * \u003cul\u003e\n *   \u003cli\u003eThere is no getName method.\u003c/li\u003e\n *   \u003cli\u003eentries has been renamed to getEntries.\u003c/li\u003e\n *   \u003cli\u003egetEntries and getEntry return\n *   \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n *   instances.\u003c/li\u003e\n *   \u003cli\u003eclose is allowed to throw IOException.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NIBLET_MASK"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_SHIFT"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_0"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_1"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_2"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_3"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 96,
      "end_line": 97,
      "comment": "\n     * List of entries in the order they appear inside the central\n     * directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 102,
      "end_line": 103,
      "comment": "\n     * Maps String to list of ZipArchiveEntrys, name -\u003e actual entries.\n     "
    },
    {
      "type": "class_interface",
      "name": "OffsetEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 105,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerOffset"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataOffset"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archiveName"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * File name of actual source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * The actual data source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * Whether the file is closed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dwordBuf"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "wordBuf"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfhBuf"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortBuf"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dwordBbuf"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wordBbuf"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cfhBbuf"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File)",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\" for file names.\n     *\n     * @param f the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String)",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\".\n     *\n     * @param name name of the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String, java.lang.String)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names, scanning unicode extra fields.\n     *\n     * @param name name of the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String)",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names and scanning for unicode extra fields.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String, boolean)",
      "begin_line": 215,
      "end_line": 219,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 218,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * Opens the given channel for reading, assuming \"UTF8\" for file names.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 71)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel, java.lang.String)",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * Opens the given channel for reading, assuming the specified\n     * encoding for file names.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel, java.lang.String, java.lang.String, boolean)",
      "begin_line": 276,
      "end_line": 280,
      "comment": "\n     * Opens the given channel for reading, assuming the specified\n     * encoding for file names.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the archive.\n     * @param archiveName name of the archive, used for error messages only.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 75)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.nio.channels.SeekableByteChannel, java.lang.String, java.lang.String, boolean, boolean)",
      "begin_line": 282,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 39)",
        "(line 287,col 9)-(line 287,col 33)",
        "(line 288,col 9)-(line 288,col 70)",
        "(line 289,col 9)-(line 289,col 59)",
        "(line 290,col 9)-(line 290,col 26)",
        "(line 291,col 9)-(line 291,col 32)",
        "(line 292,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEncoding()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.close()",
      "begin_line": 318,
      "end_line": 326,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if an error occurs closing the archive.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 22)",
        "(line 325,col 9)-(line 325,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * close a zipfile quietly; throw no io fault, do nothing\n     * on a null parameter\n     * @param zipfile file to close, can be null\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries()",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Returns all entries.\n     *\n     * \u003cp\u003eEntries will be returned in the same order they appear\n     * within the archive\u0027s central directory.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder()",
      "begin_line": 359,
      "end_line": 363,
      "comment": "\n     * Returns all entries in physical order.\n     *\n     * \u003cp\u003eEntries will be returned in the same order their contents\n     * appear within the archive.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 98)",
        "(line 361,col 9)-(line 361,col 50)",
        "(line 362,col 9)-(line 362,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntry(java.lang.String)",
      "begin_line": 377,
      "end_line": 380,
      "comment": "\n     * Returns a named entry - or {@code null} if no entry by\n     * that name exists.\n     *\n     * \u003cp\u003eIf multiple entries with the same name exist the first entry\n     * in the archive\u0027s central directory by that name is\n     * returned.\u003c/p\u003e\n     *\n     * @param name name of the entry.\n     * @return the ZipArchiveEntry corresponding to the given name - or\n     * {@code null} if not present.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 80)",
        "(line 379,col 9)-(line 379,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries(java.lang.String)",
      "begin_line": 391,
      "end_line": 395,
      "comment": "\n     * Returns all named entries in the same order they appear within\n     * the archive\u0027s central directory.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 74)",
        "(line 393,col 9)-(line 394,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder(java.lang.String)",
      "begin_line": 406,
      "end_line": 413,
      "comment": "\n     * Returns all named entries in the same order their contents\n     * appear within the archive.\n     *\n     * @param name name of the entry.\n     * @return the Iterable\u0026lt;ZipArchiveEntry\u0026gt; corresponding to the\n     * given name\n     * @since 1.6\n     ",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 69)",
        "(line 408,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.canReadEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 424,
      "end_line": 426,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     * @param ze the entry\n     * @return whether this class is able to read the given entry.\n     ",
      "child_ranges": [
        "(line 425,col 9)-(line 425,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getRawInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 438,
      "end_line": 445,
      "comment": "\n     * Expose the raw stream of the archive entry (compressed form).\n     *\n     * \u003cp\u003eThis method does not relate to how/if we understand the payload in the\n     * stream, since we really only intend to move it on to somewhere else.\u003c/p\u003e\n     *\n     * @param ze The entry to get the stream for\n     * @return The raw input stream containing (possibly) compressed data.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 442,col 70)",
        "(line 443,col 9)-(line 443,col 50)",
        "(line 444,col 9)-(line 444,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.copyRawEntries(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream, org.apache.commons.compress.archivers.zip.ZipArchiveEntryPredicate)",
      "begin_line": 457,
      "end_line": 466,
      "comment": "\n     * Transfer selected entries from this zipfile to a given #ZipArchiveOutputStream.\n     * Compression and all other attributes will be as in this file.\n     * \u003cp\u003eThis method transfers entries based on the central directory of the zip file.\u003c/p\u003e\n     *\n     * @param target The zipArchiveOutputStream to write the entries to\n     * @param predicate A predicate that selects which entries to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 77)",
        "(line 460,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 476,
      "end_line": 528,
      "comment": "\n     * Returns an InputStream for reading the contents of the given entry.\n     *\n     * @param ze the entry to get the stream for.\n     * @return a stream to read the entry from.\n     * @throws IOException if unable to create an input stream from the zipentry\n     * @throws ZipException if the zipentry uses an unsupported feature\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 482,col 70)",
        "(line 483,col 9)-(line 483,col 43)",
        "(line 484,col 9)-(line 484,col 50)",
        "(line 486,col 9)-(line 487,col 66)",
        "(line 488,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-4d701a37-62b6-435f-a147-35583d56cbf2.close()",
      "begin_line": 500,
      "end_line": 507,
      "comment": "",
      "child_ranges": [
        "(line 502,col 25)-(line 506,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getUnixSymlink(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 544,
      "end_line": 551,
      "comment": "\n     * \u003cp\u003e\n     * Convenience method to return the entry\u0027s content as a String if isUnixSymlink()\n     * returns true for it, otherwise returns null.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003eThis method assumes the symbolic link\u0027s file name uses the\n     * same encoding that as been specified for this ZipFile.\u003c/p\u003e\n     *\n     * @param entry ZipArchiveEntry object that represents the symbolic link\n     * @return entry\u0027s content as a String\n     * @throws IOException problem with content\u0027s input stream\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.finalize()",
      "begin_line": 558,
      "end_line": 569,
      "comment": "\n     * Ensures that the close method of this zipfile is called when\n     * there are no more references to it.\n     * @see #close()\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 575,
      "end_line": 591,
      "comment": "\n     * Length of a \"central directory\" entry structure without file\n     * name, extra fields or comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 593,
      "end_line": 594,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory()",
      "begin_line": 607,
      "end_line": 630,
      "comment": "\n     * Reads the central directory of the given archive and populates\n     * the internal tables with ZipArchiveEntry instances.\n     *\n     * \u003cp\u003eThe ZipArchiveEntrys will know all data that can be obtained from\n     * the central directory alone, but not the data that requires the\n     * local file header or additional data to be read.\u003c/p\u003e\n     *\n     * @return a map of zipentries that didn\u0027t have the language\n     * encoding flag set when read.\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 610,col 28)",
        "(line 612,col 9)-(line 612,col 37)",
        "(line 614,col 9)-(line 614,col 26)",
        "(line 615,col 9)-(line 615,col 45)",
        "(line 616,col 9)-(line 616,col 45)",
        "(line 618,col 9)-(line 621,col 9)",
        "(line 623,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 641,
      "end_line": 724,
      "comment": "\n     * Reads an individual entry of the central directory, creats an\n     * ZipArchiveEntry from it and adds it to the global maps.\n     *\n     * @param noUTF8Flag map used to collect entries that don\u0027t have\n     * their UTF-8 flag set and whose name will be set by data read\n     * from the local file header later.  The current entry may be\n     * added to this map.\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 25)",
        "(line 645,col 9)-(line 645,col 44)",
        "(line 646,col 9)-(line 646,col 20)",
        "(line 647,col 9)-(line 647,col 53)",
        "(line 648,col 9)-(line 648,col 43)",
        "(line 650,col 9)-(line 650,col 65)",
        "(line 651,col 9)-(line 651,col 21)",
        "(line 652,col 9)-(line 652,col 43)",
        "(line 653,col 9)-(line 653,col 68)",
        "(line 655,col 9)-(line 655,col 62)",
        "(line 656,col 9)-(line 656,col 21)",
        "(line 658,col 9)-(line 658,col 78)",
        "(line 659,col 9)-(line 659,col 62)",
        "(line 660,col 9)-(line 661,col 76)",
        "(line 662,col 9)-(line 662,col 40)",
        "(line 663,col 9)-(line 663,col 54)",
        "(line 665,col 9)-(line 665,col 21)",
        "(line 668,col 9)-(line 668,col 53)",
        "(line 669,col 9)-(line 669,col 21)",
        "(line 671,col 9)-(line 671,col 79)",
        "(line 672,col 9)-(line 672,col 25)",
        "(line 673,col 9)-(line 673,col 20)",
        "(line 675,col 9)-(line 675,col 49)",
        "(line 676,col 9)-(line 676,col 20)",
        "(line 678,col 9)-(line 678,col 60)",
        "(line 679,col 9)-(line 679,col 20)",
        "(line 681,col 9)-(line 681,col 50)",
        "(line 682,col 9)-(line 682,col 20)",
        "(line 684,col 9)-(line 684,col 63)",
        "(line 685,col 9)-(line 685,col 21)",
        "(line 687,col 9)-(line 687,col 60)",
        "(line 688,col 9)-(line 688,col 21)",
        "(line 690,col 9)-(line 690,col 62)",
        "(line 691,col 9)-(line 691,col 21)",
        "(line 693,col 9)-(line 693,col 61)",
        "(line 694,col 9)-(line 694,col 21)",
        "(line 696,col 9)-(line 696,col 65)",
        "(line 697,col 9)-(line 697,col 21)",
        "(line 699,col 9)-(line 699,col 64)",
        "(line 700,col 9)-(line 700,col 20)",
        "(line 702,col 9)-(line 702,col 54)",
        "(line 703,col 9)-(line 703,col 62)",
        "(line 704,col 9)-(line 704,col 61)",
        "(line 707,col 9)-(line 707,col 60)",
        "(line 709,col 9)-(line 709,col 24)",
        "(line 711,col 9)-(line 711,col 54)",
        "(line 712,col 9)-(line 712,col 65)",
        "(line 713,col 9)-(line 713,col 49)",
        "(line 715,col 9)-(line 715,col 63)",
        "(line 717,col 9)-(line 717,col 52)",
        "(line 718,col 9)-(line 718,col 61)",
        "(line 719,col 9)-(line 719,col 53)",
        "(line 721,col 9)-(line 723,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry, int)",
      "begin_line": 738,
      "end_line": 772,
      "comment": "\n     * If the entry holds a Zip64 extended information extra field,\n     * read sizes from there if the entry\u0027s sizes are set to\n     * 0xFFFFFFFFF, do the same for the offset of the local file\n     * header.\n     *\n     * \u003cp\u003eEnsures the Zip64 extra either knows both compressed and\n     * uncompressed size or neither of both as the internal logic in\n     * ExtraFieldUtils forces the field to create local header data\n     * even if they are never used - and here a field with only one\n     * size would be invalid.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 744,col 75)",
        "(line 745,col 9)-(line 771,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EOCD_SIZE"
      ],
      "begin_line": 779,
      "end_line": 792,
      "comment": "\n     * Length of the \"End of central directory record\" - which is\n     * supposed to be the last structure of the archive - without file\n     * comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EOCD_SIZE"
      ],
      "begin_line": 798,
      "end_line": 799,
      "comment": "\n     * Maximum length of the \"End of central directory record\" with a\n     * file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 807,
      "end_line": 816,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"End of central directory\n     * record\" relative to the start of the \"End of central directory\n     * record\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LENGTH"
      ],
      "begin_line": 823,
      "end_line": 830,
      "comment": "\n     * Length of the \"Zip64 end of central directory locator\" - which\n     * should be right in front of the \"end of central directory\n     * record\" if one is present at all.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LOCATOR_OFFSET"
      ],
      "begin_line": 838,
      "end_line": 842,
      "comment": "\n     * Offset of the field that holds the location of the \"Zip64 end\n     * of central directory record\" inside the \"Zip64 end of central\n     * directory locator\" relative to the start of the \"Zip64 end of\n     * central directory locator\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 850,
      "end_line": 864,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"Zip64 end of central\n     * directory record\" relative to the start of the \"Zip64 end of\n     * central directory record\".\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory()",
      "begin_line": 872,
      "end_line": 894,
      "comment": "\n     * Searches for either the \u0026quot;Zip64 end of central directory\n     * locator\u0026quot; or the \u0026quot;End of central dir record\u0026quot;, parses\n     * it and positions the stream at the first central directory\n     * record.\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 48)",
        "(line 875,col 9)-(line 875,col 30)",
        "(line 876,col 9)-(line 877,col 52)",
        "(line 878,col 9)-(line 884,col 9)",
        "(line 885,col 9)-(line 893,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64()",
      "begin_line": 905,
      "end_line": 923,
      "comment": "\n     * Parses the \u0026quot;Zip64 end of central directory locator\u0026quot;,\n     * finds the \u0026quot;Zip64 end of central directory record\u0026quot; using the\n     * parsed information, parses that and positions the stream at the\n     * first central directory record.\n     *\n     * Expects stream to be positioned right behind the \u0026quot;Zip64\n     * end of central directory locator\u0026quot;\u0027s signature.\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 908,col 64)",
        "(line 909,col 9)-(line 909,col 27)",
        "(line 910,col 9)-(line 910,col 46)",
        "(line 911,col 9)-(line 911,col 69)",
        "(line 912,col 9)-(line 912,col 26)",
        "(line 913,col 9)-(line 913,col 45)",
        "(line 914,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 919,col 64)",
        "(line 920,col 9)-(line 920,col 27)",
        "(line 921,col 9)-(line 921,col 46)",
        "(line 922,col 9)-(line 922,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32()",
      "begin_line": 932,
      "end_line": 938,
      "comment": "\n     * Parses the \u0026quot;End of central dir record\u0026quot; and positions\n     * the stream at the first central directory record.\n     *\n     * Expects stream to be positioned at the beginning of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 934,col 9)-(line 934,col 38)",
        "(line 935,col 9)-(line 935,col 26)",
        "(line 936,col 9)-(line 936,col 45)",
        "(line 937,col 9)-(line 937,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtEndOfCentralDirectoryRecord()",
      "begin_line": 944,
      "end_line": 951,
      "comment": "\n     * Searches for the and positions the stream at the start of the\n     * \u0026quot;End of central dir record\u0026quot;.\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 947,col 78)",
        "(line 948,col 9)-(line 950,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(long, long, byte[])",
      "begin_line": 958,
      "end_line": 995,
      "comment": "\n     * Searches the archive backwards from minDistance to maxDistance\n     * for the given signature, positions the RandomaccessFile right\n     * at the signature if it has been found.\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 30)",
        "(line 962,col 9)-(line 962,col 55)",
        "(line 963,col 9)-(line 964,col 62)",
        "(line 965,col 9)-(line 990,col 9)",
        "(line 991,col 9)-(line 993,col 9)",
        "(line 994,col 9)-(line 994,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.skipBytes(int)",
      "begin_line": 1001,
      "end_line": 1008,
      "comment": "\n     * Skips the given number of bytes or throws an EOFException if\n     * skipping failed.\n     ",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 50)",
        "(line 1003,col 9)-(line 1003,col 51)",
        "(line 1004,col 9)-(line 1006,col 9)",
        "(line 1007,col 9)-(line 1007,col 38)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_OFFSET_FOR_FILENAME_LENGTH"
      ],
      "begin_line": 1014,
      "end_line": 1023,
      "comment": "\n     * Number of bytes in local file header up to the \u0026quot;length of\n     * filename\u0026quot; entry.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 1032,
      "end_line": 1070,
      "comment": "\n     * Walks through all recorded entries and adds the data available\n     * from the local file header.\n     *\n     * \u003cp\u003eAlso records the offsets for the data to read from the\n     * entries.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1035,col 9)-(line 1069,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader()",
      "begin_line": 1076,
      "end_line": 1081,
      "comment": "\n     * Checks whether the archive starts with a LFH.  If it doesn\u0027t,\n     * it may be an empty archive.\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 28)",
        "(line 1078,col 9)-(line 1078,col 26)",
        "(line 1079,col 9)-(line 1079,col 45)",
        "(line 1080,col 9)-(line 1080,col 70)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 1088,
      "end_line": 1177,
      "comment": "\n     * InputStream that delegates requests to the underlying\n     * SeekableByteChannel, making sure that only bytes from a certain\n     * range can be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_BUF_LEN"
      ],
      "begin_line": 1089,
      "end_line": 1089,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 1090,
      "end_line": 1090,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "remaining"
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
        "addDummyByte"
      ],
      "begin_line": 1093,
      "end_line": 1093,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.BoundedInputStream(long, long)",
      "begin_line": 1095,
      "end_line": 1103,
      "comment": "",
      "child_ranges": [
        "(line 1096,col 13)-(line 1096,col 39)",
        "(line 1097,col 13)-(line 1097,col 24)",
        "(line 1098,col 13)-(line 1102,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read()",
      "begin_line": 1105,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1107,col 13)-(line 1113,col 13)",
        "(line 1114,col 13)-(line 1121,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1124,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 13)-(line 1133,col 13)",
        "(line 1135,col 13)-(line 1137,col 13)",
        "(line 1139,col 13)-(line 1141,col 13)",
        "(line 1142,col 13)-(line 1142,col 27)",
        "(line 1143,col 13)-(line 1143,col 25)",
        "(line 1144,col 13)-(line 1154,col 13)",
        "(line 1155,col 13)-(line 1159,col 13)",
        "(line 1160,col 13)-(line 1160,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(int)",
      "begin_line": 1163,
      "end_line": 1168,
      "comment": "",
      "child_ranges": [
        "(line 1164,col 13)-(line 1164,col 39)",
        "(line 1165,col 13)-(line 1165,col 44)",
        "(line 1166,col 13)-(line 1166,col 26)",
        "(line 1167,col 13)-(line 1167,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.addDummy()",
      "begin_line": 1174,
      "end_line": 1176,
      "comment": "\n         * Inflater needs an extra dummy byte for nowrap - see\n         * Inflater\u0027s javadocs.\n         ",
      "child_ranges": [
        "(line 1175,col 13)-(line 1175,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameAndComment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1179,
      "end_line": 1186,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1180,
      "end_line": 1180,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 1181,
      "end_line": 1181,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.NameAndComment(byte[], byte[])",
      "begin_line": 1182,
      "end_line": 1185,
      "comment": "",
      "child_ranges": [
        "(line 1183,col 13)-(line 1183,col 29)",
        "(line 1184,col 13)-(line 1184,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "offsetComparator"
      ],
      "begin_line": 1196,
      "end_line": 1216,
      "comment": "\n     * Compares two ZipArchiveEntries based on their offset within the archive.\n     *\n     * \u003cp\u003eWon\u0027t return any meaningful results if one of the entries\n     * isn\u0027t part of the archive at all.\u003c/p\u003e\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-f2e40541-c5e6-472c-a4f9-dd7b119a3238.compare(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1198,
      "end_line": 1215,
      "comment": "",
      "child_ranges": [
        "(line 1200,col 13)-(line 1202,col 13)",
        "(line 1204,col 13)-(line 1204,col 71)",
        "(line 1205,col 13)-(line 1205,col 71)",
        "(line 1206,col 13)-(line 1208,col 13)",
        "(line 1209,col 13)-(line 1211,col 13)",
        "(line 1212,col 13)-(line 1213,col 62)",
        "(line 1214,col 13)-(line 1214,col 52)"
      ]
    },
    {
      "type": "class_interface",
      "name": "Entry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipArchiveEntry"
      ],
      "begin_line": 1221,
      "end_line": 1251,
      "comment": "\n     * Extends ZipArchiveEntry to store the offset within the archive.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offsetEntry"
      ],
      "begin_line": 1223,
      "end_line": 1223,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.Entry(org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry)",
      "begin_line": 1225,
      "end_line": 1227,
      "comment": "",
      "child_ranges": [
        "(line 1226,col 13)-(line 1226,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.getOffsetEntry()",
      "begin_line": 1229,
      "end_line": 1231,
      "comment": "",
      "child_ranges": [
        "(line 1230,col 13)-(line 1230,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.hashCode()",
      "begin_line": 1233,
      "end_line": 1237,
      "comment": "",
      "child_ranges": [
        "(line 1235,col 13)-(line 1236,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Entry.equals(java.lang.Object)",
      "begin_line": 1239,
      "end_line": 1250,
      "comment": "",
      "child_ranges": [
        "(line 1241,col 13)-(line 1248,col 13)",
        "(line 1249,col 13)-(line 1249,col 25)"
      ]
    }
  ]
}