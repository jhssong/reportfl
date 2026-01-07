{
  "filepath": "/tmp/Compress-14b/src/main/java/org/apache/commons/compress/archivers/zip/ZipFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipFile",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 73,
      "end_line": 969,
      "comment": "\n * Replacement for \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e.\n *\n * \u003cp\u003eThis class adds support for file name encodings other than UTF-8\n * (which is required to work on ZIP files created by native zip tools\n * and is able to skip a preamble like the one found in self\n * extracting archives.  Furthermore it returns instances of\n * \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n * instead of \u003ccode\u003ejava.util.zip.ZipEntry\u003c/code\u003e.\u003c/p\u003e\n *\n * \u003cp\u003eIt doesn\u0027t extend \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e as it would\n * have to reimplement all methods anyway.  Like\n * \u003ccode\u003ejava.util.ZipFile\u003c/code\u003e, it uses RandomAccessFile under the\n * covers and supports compressed and uncompressed entries.  As of\n * Apache Commons Compress it also transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe method signatures mimic the ones of\n * \u003ccode\u003ejava.util.zip.ZipFile\u003c/code\u003e, with a couple of exceptions:\n *\n * \u003cul\u003e\n *   \u003cli\u003eThere is no getName method.\u003c/li\u003e\n *   \u003cli\u003eentries has been renamed to getEntries.\u003c/li\u003e\n *   \u003cli\u003egetEntries and getEntry return\n *   \u003ccode\u003eorg.apache.commons.compress.archivers.zip.ZipArchiveEntry\u003c/code\u003e\n *   instances.\u003c/li\u003e\n *   \u003cli\u003eclose is allowed to throw IOException.\u003c/li\u003e\n * \u003c/ul\u003e\n *\n "
    },
    {
      "type": "field",
      "varNames": [
        "HASH_SIZE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "NIBLET_MASK"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_SHIFT"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_0"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_1"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_2"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "POS_3"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 86,
      "end_line": 87,
      "comment": "\n     * Maps ZipArchiveEntrys to two longs, recording the offsets of\n     * the local file headers and the start of entry data.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "nameMap"
      ],
      "begin_line": 92,
      "end_line": 93,
      "comment": "\n     * Maps String to ZipArchiveEntrys, name -\u003e actual entry.\n     "
    },
    {
      "type": "class_interface",
      "name": "OffsetEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 95,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "headerOffset"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataOffset"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archiveName"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * File name of actual source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * The actual data source.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * Whether the file is closed.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File)",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\" for file names.\n     *\n     * @param f the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 40)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Opens the given file for reading, assuming \"UTF8\".\n     *\n     * @param name name of the archive.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 53)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.lang.String, java.lang.String)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names, scanning unicode extra fields.\n     *\n     * @param name name of the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String)",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names and scanning for unicode extra fields.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 32)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.ZipFile(java.io.File, java.lang.String, boolean)",
      "begin_line": 196,
      "end_line": 219,
      "comment": "\n     * Opens the given file for reading, assuming the specified\n     * encoding for file names.\n     *\n     * @param f the archive.\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     *\n     * @throws IOException if an error occurs while reading the file.\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 47)",
        "(line 199,col 9)-(line 199,col 33)",
        "(line 200,col 9)-(line 200,col 70)",
        "(line 201,col 9)-(line 201,col 59)",
        "(line 202,col 9)-(line 202,col 47)",
        "(line 203,col 9)-(line 203,col 32)",
        "(line 204,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEncoding()",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.close()",
      "begin_line": 234,
      "end_line": 241,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if an error occurs closing the archive.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 22)",
        "(line 240,col 9)-(line 240,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.closeQuietly(org.apache.commons.compress.archivers.zip.ZipFile)",
      "begin_line": 248,
      "end_line": 256,
      "comment": "\n     * close a zipfile quietly; throw no io fault, do nothing\n     * on a null parameter\n     * @param zipfile file to close, can be null\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntries()",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns all entries.\n     *\n     * \u003cp\u003eEntries will be returned in the same order they appear\n     * within the archive\u0027s central directory.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntriesInPhysicalOrder()",
      "begin_line": 280,
      "end_line": 285,
      "comment": "\n     * Returns all entries in physical order.\n     *\n     * \u003cp\u003eEntries will be returned in the same order their contents\n     * appear within the archive.\u003c/p\u003e\n     *\n     * @return all entries as {@link ZipArchiveEntry} instances\n     *\n     * @since Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 282,col 61)",
        "(line 283,col 9)-(line 283,col 51)",
        "(line 284,col 9)-(line 284,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getEntry(java.lang.String)",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * Returns a named entry - or \u003ccode\u003enull\u003c/code\u003e if no entry by\n     * that name exists.\n     * @param name name of the entry.\n     * @return the ZipArchiveEntry corresponding to the given name - or\n     * \u003ccode\u003enull\u003c/code\u003e if not present.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.canReadEntryData(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 305,
      "end_line": 307,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.getInputStream(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 317,
      "end_line": 344,
      "comment": "\n     * Returns an InputStream for reading the contents of the given entry.\n     *\n     * @param ze the entry to get the stream for.\n     * @return a stream to read the entry from.\n     * @throws IOException if unable to create an input stream from the zipenty\n     * @throws ZipException if the zipentry uses an unsupported feature\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 50)",
        "(line 320,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 324,col 9)-(line 324,col 44)",
        "(line 325,col 9)-(line 326,col 66)",
        "(line 327,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-bc4030f0-d2cd-4878-a6de-071a1d509c5e.close()",
      "begin_line": 334,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 336,col 25)-(line 336,col 38)",
        "(line 337,col 25)-(line 337,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.finalize()",
      "begin_line": 351,
      "end_line": 362,
      "comment": "\n     * Ensures that the close method of this zipfile is called when\n     * there are no more references to it.\n     * @see #close()\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 361,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 368,
      "end_line": 384,
      "comment": "\n     * Length of a \"central directory\" entry structure without file\n     * name, extra fields or comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 386,
      "end_line": 387,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.populateFromCentralDirectory()",
      "begin_line": 400,
      "end_line": 422,
      "comment": "\n     * Reads the central directory of the given archive and populates\n     * the internal tables with ZipArchiveEntry instances.\n     *\n     * \u003cp\u003eThe ZipArchiveEntrys will know all data that can be obtained from\n     * the central directory alone, but not the data that requires the\n     * local file header or additional data to be read.\u003c/p\u003e\n     *\n     * @return a map of zipentries that didn\u0027t have the language\n     * encoding flag set when read.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 403,col 59)",
        "(line 405,col 9)-(line 405,col 37)",
        "(line 407,col 9)-(line 407,col 47)",
        "(line 408,col 9)-(line 408,col 42)",
        "(line 409,col 9)-(line 409,col 52)",
        "(line 411,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.readCentralDirectoryEntry(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 433,
      "end_line": 515,
      "comment": "\n     * Reads an individual entry of the central directory, creats an\n     * ZipArchiveEntry from it and adds it to the global maps.\n     *\n     * @param noUTF8Flag map used to collect entries that don\u0027t have\n     * their UTF-8 flag set and whose name will be set by data read\n     * from the local file header later.  The current entry may be\n     * added to this map.\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 39)",
        "(line 438,col 9)-(line 438,col 31)",
        "(line 439,col 9)-(line 439,col 20)",
        "(line 440,col 9)-(line 440,col 51)",
        "(line 442,col 9)-(line 442,col 56)",
        "(line 443,col 9)-(line 443,col 21)",
        "(line 444,col 9)-(line 444,col 68)",
        "(line 446,col 9)-(line 446,col 21)",
        "(line 448,col 9)-(line 448,col 75)",
        "(line 449,col 9)-(line 449,col 62)",
        "(line 450,col 9)-(line 451,col 76)",
        "(line 452,col 9)-(line 452,col 40)",
        "(line 454,col 9)-(line 454,col 21)",
        "(line 456,col 9)-(line 456,col 50)",
        "(line 457,col 9)-(line 457,col 21)",
        "(line 459,col 9)-(line 459,col 70)",
        "(line 460,col 9)-(line 460,col 25)",
        "(line 461,col 9)-(line 461,col 20)",
        "(line 463,col 9)-(line 463,col 46)",
        "(line 464,col 9)-(line 464,col 20)",
        "(line 466,col 9)-(line 466,col 57)",
        "(line 467,col 9)-(line 467,col 20)",
        "(line 469,col 9)-(line 469,col 47)",
        "(line 470,col 9)-(line 470,col 20)",
        "(line 472,col 9)-(line 472,col 54)",
        "(line 473,col 9)-(line 473,col 21)",
        "(line 475,col 9)-(line 475,col 51)",
        "(line 476,col 9)-(line 476,col 21)",
        "(line 478,col 9)-(line 478,col 53)",
        "(line 479,col 9)-(line 479,col 21)",
        "(line 481,col 9)-(line 481,col 52)",
        "(line 482,col 9)-(line 482,col 21)",
        "(line 484,col 9)-(line 484,col 62)",
        "(line 485,col 9)-(line 485,col 21)",
        "(line 487,col 9)-(line 487,col 61)",
        "(line 488,col 9)-(line 488,col 20)",
        "(line 490,col 9)-(line 490,col 48)",
        "(line 491,col 9)-(line 491,col 36)",
        "(line 492,col 9)-(line 492,col 61)",
        "(line 495,col 9)-(line 495,col 47)",
        "(line 496,col 9)-(line 496,col 57)",
        "(line 498,col 9)-(line 498,col 32)",
        "(line 500,col 9)-(line 500,col 38)",
        "(line 502,col 9)-(line 502,col 48)",
        "(line 503,col 9)-(line 503,col 39)",
        "(line 504,col 9)-(line 504,col 49)",
        "(line 506,col 9)-(line 506,col 63)",
        "(line 508,col 9)-(line 508,col 46)",
        "(line 509,col 9)-(line 509,col 35)",
        "(line 510,col 9)-(line 510,col 53)",
        "(line 512,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.setSizesAndOffsetFromZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.OffsetEntry, int)",
      "begin_line": 529,
      "end_line": 563,
      "comment": "\n     * If the entry holds a Zip64 extended information extra field,\n     * read sizes from there if the entry\u0027s sizes are set to\n     * 0xFFFFFFFFF, do the same for the offset of the local file\n     * header.\n     *\n     * \u003cp\u003eEnsures the Zip64 extra either knows both compressed and\n     * uncompressed size or neither of both as the internal logic in\n     * ExtraFieldUtils forces the field to create local header data\n     * even if they are never used - and here a field with only one\n     * size would be invalid.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 535,col 75)",
        "(line 536,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "MIN_EOCD_SIZE"
      ],
      "begin_line": 570,
      "end_line": 583,
      "comment": "\n     * Length of the \"End of central directory record\" - which is\n     * supposed to be the last structure of the archive - without file\n     * comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_EOCD_SIZE"
      ],
      "begin_line": 589,
      "end_line": 590,
      "comment": "\n     * Maximum length of the \"End of central directory record\" with a\n     * file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 598,
      "end_line": 607,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"End of central directory\n     * record\" relative to the start of the \"End of central directory\n     * record\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LENGTH"
      ],
      "begin_line": 614,
      "end_line": 621,
      "comment": "\n     * Length of the \"Zip64 end of central directory locator\" - which\n     * should be right in front of the \"end of central directory\n     * record\" if one is present at all.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCDL_LOCATOR_OFFSET"
      ],
      "begin_line": 629,
      "end_line": 633,
      "comment": "\n     * Offset of the field that holds the location of the \"Zip64 end\n     * of central directory record\" inside the \"Zip64 end of central\n     * directory locator\" relative to the start of the \"Zip64 end of\n     * central directory locator\".\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_CFD_LOCATOR_OFFSET"
      ],
      "begin_line": 641,
      "end_line": 655,
      "comment": "\n     * Offset of the field that holds the location of the first\n     * central directory entry inside the \"Zip64 end of central\n     * directory record\" relative to the start of the \"Zip64 end of\n     * central directory record\".\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory()",
      "begin_line": 663,
      "end_line": 675,
      "comment": "\n     * Searches for either the \u0026quot;Zip64 end of central directory\n     * locator\u0026quot; or the \u0026quot;End of central dir record\u0026quot;, parses\n     * it and positions the stream at the first central directory\n     * record.\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 668,col 66)",
        "(line 669,col 9)-(line 674,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory64()",
      "begin_line": 683,
      "end_line": 704,
      "comment": "\n     * Parses the \u0026quot;Zip64 end of central directory locator\u0026quot;,\n     * finds the \u0026quot;Zip64 end of central directory record\u0026quot; using the\n     * parsed information, parses that and positions the stream at the\n     * first central directory record.\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 46)",
        "(line 686,col 9)-(line 686,col 49)",
        "(line 687,col 9)-(line 687,col 43)",
        "(line 688,col 9)-(line 688,col 72)",
        "(line 689,col 9)-(line 689,col 36)",
        "(line 690,col 9)-(line 690,col 31)",
        "(line 691,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 700,col 64)",
        "(line 701,col 9)-(line 701,col 43)",
        "(line 702,col 9)-(line 702,col 37)",
        "(line 703,col 9)-(line 703,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.positionAtCentralDirectory32()",
      "begin_line": 711,
      "end_line": 722,
      "comment": "\n     * Searches for the \u0026quot;End of central dir record\u0026quot;, parses\n     * it and positions the stream at the first central directory\n     * record.\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 714,col 78)",
        "(line 715,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 38)",
        "(line 719,col 9)-(line 719,col 42)",
        "(line 720,col 9)-(line 720,col 37)",
        "(line 721,col 9)-(line 721,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.tryToLocateSignature(long, long, byte[])",
      "begin_line": 729,
      "end_line": 762,
      "comment": "\n     * Searches the archive backwards from minDistance to maxDistance\n     * for the given signature, positions the RandomaccessFile right\n     * at the signature if it has been found.\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 30)",
        "(line 733,col 9)-(line 733,col 57)",
        "(line 734,col 9)-(line 735,col 64)",
        "(line 736,col 9)-(line 757,col 9)",
        "(line 758,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.skipBytes(int)",
      "begin_line": 768,
      "end_line": 777,
      "comment": "\n     * Skips the given number of bytes or throws an EOFException if\n     * skipping failed.\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 29)",
        "(line 770,col 9)-(line 776,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_OFFSET_FOR_FILENAME_LENGTH"
      ],
      "begin_line": 783,
      "end_line": 792,
      "comment": "\n     * Number of bytes in local file header up to the \u0026quot;length of\n     * filename\u0026quot; entry.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.resolveLocalFileHeaderData(java.util.Map\u003corg.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment\u003e)",
      "begin_line": 801,
      "end_line": 847,
      "comment": "\n     * Walks through all recorded entries and adds the data available\n     * from the local file header.\n     *\n     * \u003cp\u003eAlso records the offsets for the data to read from the\n     * entries.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 809,col 69)",
        "(line 810,col 9)-(line 810,col 24)",
        "(line 811,col 9)-(line 846,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.startsWithLocalFileHeader()",
      "begin_line": 853,
      "end_line": 863,
      "comment": "\n     * Checks whether the archive starts with a LFH.  If it doesn\u0027t,\n     * it may be an empty archive.\n     ",
      "child_ranges": [
        "(line 854,col 9)-(line 854,col 24)",
        "(line 855,col 9)-(line 855,col 44)",
        "(line 856,col 9)-(line 856,col 33)",
        "(line 857,col 9)-(line 861,col 9)",
        "(line 862,col 9)-(line 862,col 20)"
      ]
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 870,
      "end_line": 932,
      "comment": "\n     * InputStream that delegates requests to the underlying\n     * RandomAccessFile, making sure that only bytes from a certain\n     * range can be read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "remaining"
      ],
      "begin_line": 871,
      "end_line": 871,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "loc"
      ],
      "begin_line": 872,
      "end_line": 872,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "addDummyByte"
      ],
      "begin_line": 873,
      "end_line": 873,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.BoundedInputStream(long, long)",
      "begin_line": 875,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 876,col 13)-(line 876,col 39)",
        "(line 877,col 13)-(line 877,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read()",
      "begin_line": 880,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 882,col 13)-(line 888,col 13)",
        "(line 889,col 13)-(line 892,col 13)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 895,
      "end_line": 923,
      "comment": "",
      "child_ranges": [
        "(line 897,col 13)-(line 904,col 13)",
        "(line 906,col 13)-(line 908,col 13)",
        "(line 910,col 13)-(line 912,col 13)",
        "(line 913,col 13)-(line 913,col 25)",
        "(line 914,col 13)-(line 917,col 13)",
        "(line 918,col 13)-(line 921,col 13)",
        "(line 922,col 13)-(line 922,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.BoundedInputStream.addDummy()",
      "begin_line": 929,
      "end_line": 931,
      "comment": "\n         * Inflater needs an extra dummy byte for nowrap - see\n         * Inflater\u0027s javadocs.\n         ",
      "child_ranges": [
        "(line 930,col 13)-(line 930,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "NameAndComment",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 934,
      "end_line": 941,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 935,
      "end_line": 935,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 936,
      "end_line": 936,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.NameAndComment.NameAndComment(byte[], byte[])",
      "begin_line": 937,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 938,col 13)-(line 938,col 29)",
        "(line 939,col 13)-(line 939,col 35)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "OFFSET_COMPARATOR"
      ],
      "begin_line": 951,
      "end_line": 968,
      "comment": "\n     * Compares two ZipArchiveEntries based on their offset within the archive.\n     *\n     * \u003cp\u003eWon\u0027t return any meaningful results if one of the entries\n     * isn\u0027t part of the archive at all.\u003c/p\u003e\n     *\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipFile.Anonymous-6ee62716-cebe-48b9-8569-00fd86a8c09d.compare(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 953,
      "end_line": 967,
      "comment": "",
      "child_ranges": [
        "(line 954,col 13)-(line 955,col 25)",
        "(line 957,col 13)-(line 957,col 47)",
        "(line 958,col 13)-(line 958,col 47)",
        "(line 959,col 13)-(line 961,col 13)",
        "(line 962,col 13)-(line 964,col 13)",
        "(line 965,col 13)-(line 965,col 63)",
        "(line 966,col 13)-(line 966,col 52)"
      ]
    }
  ]
}