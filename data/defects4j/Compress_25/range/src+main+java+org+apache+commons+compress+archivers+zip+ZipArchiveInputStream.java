{
  "filepath": "/tmp/Compress-25b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 59,
      "end_line": 1073,
      "comment": "\n * Implements an input stream that can read Zip archives.\n *\n * \u003cp\u003eNote that {@link ZipArchiveEntry#getSize()} may return -1 if the\n * DEFLATE algorithm is used, as the size information is not available\n * from the header.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link ZipFile} class is preferred when reading from files.\u003c/p\u003e\n *\n * \u003cp\u003eAs of Apache Commons Compress it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * @see ZipFile\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " The zip encoding to use for filenames and the file comment. "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " Whether to look for and use Unicode extra fields. "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " Wrapped stream, will always be a PushbackInputStream. "
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Inflater used for all deflated entries. "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Buffer used to read from the wrapped stream. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " The entry that is currently being read. "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " Whether the stream has been closed. "
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " Whether the stream has reached the central directory - and thus found all entries. "
    },
    {
      "type": "field",
      "varNames": [
        "lastStoredEntry"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * When reading a stored entry that uses the data descriptor this\n     * stream has to read the full entry and caches it.  This is the\n     * cache.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Whether the stream will try to read STORED entries that use a data descriptor. "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_LEN"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_EXP_32"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_BUF"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_BUF"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_BUF"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD_BUF"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_DWORD_BUF"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entriesRead"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean, boolean)",
      "begin_line": 174,
      "end_line": 184,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     * @param allowStoredEntriesWithDataDescriptor whether the stream\n     * will try to read STORED entries that use a data descriptor\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 65)",
        "(line 179,col 9)-(line 179,col 59)",
        "(line 180,col 9)-(line 180,col 66)",
        "(line 181,col 9)-(line 182,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 186,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 34)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 194,col 9)",
        "(line 196,col 9)-(line 208,col 9)",
        "(line 210,col 9)-(line 210,col 43)",
        "(line 211,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 23)",
        "(line 220,col 9)-(line 220,col 37)",
        "(line 222,col 9)-(line 222,col 60)",
        "(line 223,col 9)-(line 223,col 21)",
        "(line 224,col 9)-(line 224,col 95)",
        "(line 226,col 9)-(line 226,col 79)",
        "(line 227,col 9)-(line 227,col 62)",
        "(line 228,col 9)-(line 228,col 106)",
        "(line 229,col 9)-(line 229,col 64)",
        "(line 230,col 9)-(line 230,col 51)",
        "(line 232,col 9)-(line 232,col 21)",
        "(line 234,col 9)-(line 234,col 65)",
        "(line 235,col 9)-(line 235,col 21)",
        "(line 237,col 9)-(line 237,col 74)",
        "(line 238,col 9)-(line 238,col 36)",
        "(line 239,col 9)-(line 239,col 20)",
        "(line 241,col 9)-(line 241,col 42)",
        "(line 242,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 58)",
        "(line 257,col 9)-(line 257,col 21)",
        "(line 259,col 9)-(line 259,col 55)",
        "(line 260,col 9)-(line 260,col 21)",
        "(line 262,col 9)-(line 262,col 48)",
        "(line 263,col 9)-(line 263,col 28)",
        "(line 264,col 9)-(line 264,col 72)",
        "(line 266,col 9)-(line 266,col 46)",
        "(line 267,col 9)-(line 267,col 29)",
        "(line 268,col 9)-(line 268,col 42)",
        "(line 270,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 274,col 39)",
        "(line 276,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 22)",
        "(line 288,col 9)-(line 288,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(byte[])",
      "begin_line": 296,
      "end_line": 311,
      "comment": "\n     * Fills the given array with the first local file header and\n     * deals with splitting/spanning markers that may prefix the first\n     * LFH.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 23)",
        "(line 298,col 9)-(line 298,col 39)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 310,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 318,
      "end_line": 333,
      "comment": "\n     * Records whether a Zip64 extra is present and sets the size\n     * information from it if sizes are 0xFFFFFFFF and the entry\n     * doesn\u0027t use a data descriptor.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 321,col 86)",
        "(line 322,col 9)-(line 322,col 40)",
        "(line 323,col 9)-(line 332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 335,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 347,
      "end_line": 356,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 358,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 366,col 9)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 54)",
        "(line 374,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 17)",
        "(line 380,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 396,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(byte[], int, int)",
      "begin_line": 402,
      "end_line": 436,
      "comment": "\n     * Implementation of read for STORED entries.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 45)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 428,col 55)",
        "(line 429,col 9)-(line 432,col 9)",
        "(line 433,col 9)-(line 433,col 40)",
        "(line 434,col 9)-(line 434,col 36)",
        "(line 435,col 9)-(line 435,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(byte[], int, int)",
      "begin_line": 441,
      "end_line": 455,
      "comment": "\n     * Implementation of read for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 60)",
        "(line 443,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 454,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater(byte[], int, int)",
      "begin_line": 461,
      "end_line": 481,
      "comment": "\n     * Potentially reads more bytes to fill the inflater\u0027s buffer and\n     * reads from it.\n     ",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 21)",
        "(line 463,col 9)-(line 479,col 48)",
        "(line 480,col 9)-(line 480,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 483,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 485,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 507,
      "end_line": 522,
      "comment": "\n     * Skips over and discards value bytes of data from this input\n     * stream.\n     *\n     * \u003cp\u003eThis implementation may end up skipping over some smaller\n     * number of bytes, possibly 0, if and only if it reaches the end\n     * of the underlying stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual number of bytes skipped is returned.\u003c/p\u003e\n     *\n     * @param value the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException - if an I/O error occurs.\n     * @throws IllegalArgumentException - if value is negative.\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 533,
      "end_line": 542,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 536,col 9)",
        "(line 538,col 9)-(line 541,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 544,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 550,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 571,
      "end_line": 607,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 577,col 9)",
        "(line 580,col 9)-(line 597,col 9)",
        "(line 599,col 9)-(line 601,col 9)",
        "(line 603,col 9)-(line 603,col 20)",
        "(line 604,col 9)-(line 604,col 27)",
        "(line 605,col 9)-(line 605,col 23)",
        "(line 606,col 9)-(line 606,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData()",
      "begin_line": 613,
      "end_line": 624,
      "comment": "\n     * Read all data of the current entry from the underlying stream\n     * that hasn\u0027t been read, yet.\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 614,col 89)",
        "(line 615,col 9)-(line 623,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated()",
      "begin_line": 641,
      "end_line": 649,
      "comment": "\n     * Get the number of bytes Inflater has actually processed.\n     *\n     * \u003cp\u003efor Java \u0026lt; Java7 the getBytes* methods in\n     * Inflater/Deflater seem to return unsigned ints rather than\n     * longs that start over with 0 at 2^32.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream knows how many bytes it has read, but not how\n     * many the Inflater actually consumed - it should be between the\n     * total number of bytes read for the entry and the total number\n     * minus the last read operation.  Here we just try to make the\n     * value close enough to the bytes we\u0027ve read by assuming the\n     * number of bytes consumed must be smaller than (or equal to) the\n     * number of bytes read but not smaller by more than 2^32.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 38)",
        "(line 643,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 651,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 652,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 42)",
        "(line 656,col 9)-(line 660,col 9)",
        "(line 661,col 9)-(line 661,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 664,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 45)",
        "(line 666,col 9)-(line 666,col 21)",
        "(line 667,col 9)-(line 669,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 672,
      "end_line": 703,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 28)",
        "(line 674,col 9)-(line 674,col 44)",
        "(line 675,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 680,col 45)",
        "(line 693,col 9)-(line 693,col 33)",
        "(line 694,col 9)-(line 694,col 65)",
        "(line 695,col 9)-(line 702,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 712,
      "end_line": 717,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 716,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 736,
      "end_line": 765,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 737,col 9)-(line 737,col 64)",
        "(line 738,col 9)-(line 738,col 20)",
        "(line 739,col 9)-(line 739,col 29)",
        "(line 742,col 9)-(line 742,col 68)",
        "(line 744,col 9)-(line 761,col 9)",
        "(line 763,col 9)-(line 763,col 37)",
        "(line 764,col 9)-(line 764,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH"
      ],
      "begin_line": 767,
      "end_line": 767,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH"
      ],
      "begin_line": 768,
      "end_line": 768,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DD"
      ],
      "begin_line": 769,
      "end_line": 769,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 779,
      "end_line": 809,
      "comment": "\n     * Checks whether the current buffer contains the signature of a\n     * \u0026quot;data decsriptor\u0026quot;, \u0026quot;local file header\u0026quot; or\n     * \u0026quot;central directory entry\u0026quot;.\n     *\n     * \u003cp\u003eIf it contains such a signature, reads the data descriptor\n     * and positions the stream right after the data descriptor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 782,col 9)-(line 782,col 29)",
        "(line 783,col 9)-(line 783,col 28)",
        "(line 784,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 820,
      "end_line": 830,
      "comment": "\n     * If the last read bytes could hold a data descriptor and an\n     * incomplete signature then save the last bytes to the front of\n     * the buffer and cache everything in front of the potential data\n     * descriptor into the given ByteArrayOutputStream.\n     *\n     * \u003cp\u003eData descriptor plus incomplete signature (3 bytes in the\n     * worst case) can be 20 bytes max.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 67)",
        "(line 822,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(byte[], int, int)",
      "begin_line": 832,
      "end_line": 835,
      "comment": "",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 63)",
        "(line 834,col 9)-(line 834,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive()",
      "begin_line": 858,
      "end_line": 868,
      "comment": "\n     * Reads the stream until it find the \"End of central directory\n     * record\" and consumes it as well.\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 50)",
        "(line 863,col 9)-(line 863,col 25)",
        "(line 864,col 9)-(line 864,col 89)",
        "(line 865,col 9)-(line 865,col 29)",
        "(line 867,col 9)-(line 867,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord()",
      "begin_line": 874,
      "end_line": 905,
      "comment": "\n     * Reads forward until the signature of the \u0026quot;End of central\n     * directory\u0026quot; record is found.\n     ",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 29)",
        "(line 876,col 9)-(line 876,col 37)",
        "(line 877,col 9)-(line 904,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(long)",
      "begin_line": 914,
      "end_line": 929,
      "comment": "\n     * Skips bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link\n     * #skip} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 927,col 9)",
        "(line 928,col 9)-(line 928,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte()",
      "begin_line": 937,
      "end_line": 943,
      "comment": "\n     * Reads bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link #read} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 26)",
        "(line 939,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 942,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.isFirstByteOfEocdSig(int)",
      "begin_line": 945,
      "end_line": 947,
      "comment": "",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 953,
      "end_line": 994,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 958,
      "end_line": 958,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 963,
      "end_line": 963,
      "comment": "\n         * Does the entry use a data descriptor?\n         "
    },
    {
      "type": "field",
      "varNames": [
        "usesZip64"
      ],
      "begin_line": 968,
      "end_line": 968,
      "comment": "\n         * Does the entry have a ZIP64 extended information extra field.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": "\n         * Number of bytes of entry content read by the client if the\n         * entry is STORED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 983,
      "end_line": 983,
      "comment": "\n         * Number of bytes of entry content read so from the stream.\n         *\n         * \u003cp\u003eThis may be more than the actual entry\u0027s length as some\n         * stuff gets buffered up and needs to be pushed back when the\n         * end of the entry has been reached.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 988,
      "end_line": 988,
      "comment": "\n         * The checksum calculated as the current entry is read.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 993,
      "end_line": 993,
      "comment": "\n         * The input stream decompressing the data for shrunk and imploded entries.\n         "
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 999,
      "end_line": 1072,
      "comment": "\n     * Bounded input stream adapted from commons-io\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1002,
      "end_line": 1002,
      "comment": " the wrapped input stream "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 1005,
      "end_line": 1005,
      "comment": " the max length to provide "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 1008,
      "end_line": 1008,
      "comment": " the number of bytes already returned "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.BoundedInputStream(java.io.InputStream, long)",
      "begin_line": 1017,
      "end_line": 1020,
      "comment": "\n         * Creates a new \u003ccode\u003eBoundedInputStream\u003c/code\u003e that wraps the given input\n         * stream and limits it to a certain size.\n         *\n         * @param in The wrapped input stream\n         * @param size The maximum number of bytes to return\n         ",
      "child_ranges": [
        "(line 1018,col 13)-(line 1018,col 28)",
        "(line 1019,col 13)-(line 1019,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read()",
      "begin_line": 1022,
      "end_line": 1032,
      "comment": "",
      "child_ranges": [
        "(line 1024,col 13)-(line 1026,col 13)",
        "(line 1027,col 13)-(line 1027,col 41)",
        "(line 1028,col 13)-(line 1028,col 18)",
        "(line 1029,col 13)-(line 1029,col 21)",
        "(line 1030,col 13)-(line 1030,col 42)",
        "(line 1031,col 13)-(line 1031,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[])",
      "begin_line": 1034,
      "end_line": 1037,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 13)-(line 1036,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1039,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1041,col 13)-(line 1043,col 13)",
        "(line 1044,col 13)-(line 1044,col 75)",
        "(line 1045,col 13)-(line 1045,col 65)",
        "(line 1047,col 13)-(line 1049,col 13)",
        "(line 1051,col 13)-(line 1051,col 29)",
        "(line 1052,col 13)-(line 1052,col 29)",
        "(line 1053,col 13)-(line 1053,col 53)",
        "(line 1054,col 13)-(line 1054,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.skip(long)",
      "begin_line": 1057,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 13)-(line 1059,col 70)",
        "(line 1060,col 13)-(line 1060,col 54)",
        "(line 1061,col 13)-(line 1061,col 32)",
        "(line 1062,col 13)-(line 1062,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.available()",
      "begin_line": 1065,
      "end_line": 1071,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 13)-(line 1069,col 13)",
        "(line 1070,col 13)-(line 1070,col 34)"
      ]
    }
  ]
}