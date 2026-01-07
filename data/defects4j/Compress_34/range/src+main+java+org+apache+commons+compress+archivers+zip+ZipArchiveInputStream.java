{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 75,
      "end_line": 1104,
      "comment": "\n * Implements an input stream that can read Zip archives.\n *\n * \u003cp\u003eAs of Apache Commons Compress it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link ZipFile} class is preferred when reading from files\n * as {@link ZipArchiveInputStream} is limited by not being able to\n * read the central directory header before returning entries.  In\n * particular {@link ZipArchiveInputStream}\u003c/p\u003e\n *\n * \u003cul\u003e\n *\n *  \u003cli\u003emay return entries that are not part of the central directory\n *  at all and shouldn\u0027t be considered part of the archive.\u003c/li\u003e\n *\n *  \u003cli\u003emay return several entries with the same name.\u003c/li\u003e\n *\n *  \u003cli\u003ewill not return internal or external attributes.\u003c/li\u003e\n *\n *  \u003cli\u003emay return incomplete extra field data.\u003c/li\u003e\n *\n *  \u003cli\u003emay return unknown sizes and CRC values for entries until the\n *  next entry has been reached if the archive uses the data\n *  descriptor feature.\u003c/li\u003e\n *\n * \u003c/ul\u003e\n *\n * @see ZipFile\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The zip encoding to use for filenames and the file comment. "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Whether to look for and use Unicode extra fields. "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Wrapped stream, will always be a PushbackInputStream. "
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Inflater used for all deflated entries. "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Buffer used to read from the wrapped stream. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The entry that is currently being read. "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Whether the stream has been closed. "
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Whether the stream has reached the central directory - and thus found all entries. "
    },
    {
      "type": "field",
      "varNames": [
        "lastStoredEntry"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * When reading a stored entry that uses the data descriptor this\n     * stream has to read the full entry and caches it.  This is the\n     * cache.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Whether the stream will try to read STORED entries that use a data descriptor. "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_LEN"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_EXP_32"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_BUF"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_BUF"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_BUF"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD_BUF"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_DWORD_BUF"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entriesRead"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Create an instance using UTF-8 encoding\n     * @param inputStream the stream to wrap\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Create an instance using the specified encoding\n     * @param inputStream the stream to wrap\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 188,
      "end_line": 190,
      "comment": "\n     * Create an instance using the specified encoding\n     * @param inputStream the stream to wrap\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean, boolean)",
      "begin_line": 203,
      "end_line": 215,
      "comment": "\n     * Create an instance using the specified encoding\n     * @param inputStream the stream to wrap\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     * @param allowStoredEntriesWithDataDescriptor whether the stream\n     * will try to read STORED entries that use a data descriptor\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 33)",
        "(line 208,col 9)-(line 208,col 65)",
        "(line 209,col 9)-(line 209,col 59)",
        "(line 210,col 9)-(line 210,col 66)",
        "(line 211,col 9)-(line 212,col 49)",
        "(line 214,col 9)-(line 214,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 217,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 34)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 225,col 9)",
        "(line 227,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 43)",
        "(line 242,col 9)-(line 245,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 23)",
        "(line 251,col 9)-(line 251,col 37)",
        "(line 253,col 9)-(line 253,col 60)",
        "(line 254,col 9)-(line 254,col 21)",
        "(line 255,col 9)-(line 255,col 95)",
        "(line 257,col 9)-(line 257,col 79)",
        "(line 258,col 9)-(line 258,col 62)",
        "(line 259,col 9)-(line 259,col 106)",
        "(line 260,col 9)-(line 260,col 64)",
        "(line 261,col 9)-(line 261,col 51)",
        "(line 263,col 9)-(line 263,col 21)",
        "(line 265,col 9)-(line 265,col 65)",
        "(line 266,col 9)-(line 266,col 21)",
        "(line 268,col 9)-(line 268,col 74)",
        "(line 269,col 9)-(line 269,col 36)",
        "(line 270,col 9)-(line 270,col 20)",
        "(line 272,col 9)-(line 272,col 42)",
        "(line 273,col 9)-(line 284,col 9)",
        "(line 286,col 9)-(line 286,col 58)",
        "(line 288,col 9)-(line 288,col 21)",
        "(line 290,col 9)-(line 290,col 55)",
        "(line 291,col 9)-(line 291,col 21)",
        "(line 293,col 9)-(line 293,col 48)",
        "(line 294,col 9)-(line 294,col 28)",
        "(line 295,col 9)-(line 295,col 72)",
        "(line 297,col 9)-(line 297,col 46)",
        "(line 298,col 9)-(line 298,col 29)",
        "(line 299,col 9)-(line 299,col 42)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 305,col 9)-(line 305,col 39)",
        "(line 307,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 318,col 22)",
        "(line 319,col 9)-(line 319,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(byte[])",
      "begin_line": 327,
      "end_line": 342,
      "comment": "\n     * Fills the given array with the first local file header and\n     * deals with splitting/spanning markers that may prefix the first\n     * LFH.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 23)",
        "(line 329,col 9)-(line 329,col 39)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 334,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 349,
      "end_line": 364,
      "comment": "\n     * Records whether a Zip64 extra is present and sets the size\n     * information from it if sizes are 0xFFFFFFFF and the entry\n     * doesn\u0027t use a data descriptor.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 352,col 86)",
        "(line 353,col 9)-(line 353,col 40)",
        "(line 354,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 366,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 378,
      "end_line": 387,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 389,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 393,col 9)",
        "(line 395,col 9)-(line 397,col 9)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 404,col 9)-(line 404,col 54)",
        "(line 405,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 410,col 17)",
        "(line 411,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 427,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(byte[], int, int)",
      "begin_line": 433,
      "end_line": 467,
      "comment": "\n     * Implementation of read for STORED entries.\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 442,col 45)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 55)",
        "(line 460,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 40)",
        "(line 465,col 9)-(line 465,col 36)",
        "(line 466,col 9)-(line 466,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(byte[], int, int)",
      "begin_line": 472,
      "end_line": 486,
      "comment": "\n     * Implementation of read for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 60)",
        "(line 474,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater(byte[], int, int)",
      "begin_line": 492,
      "end_line": 512,
      "comment": "\n     * Potentially reads more bytes to fill the inflater\u0027s buffer and\n     * reads from it.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 21)",
        "(line 494,col 9)-(line 510,col 48)",
        "(line 511,col 9)-(line 511,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 514,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 520,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 538,
      "end_line": 553,
      "comment": "\n     * Skips over and discards value bytes of data from this input\n     * stream.\n     *\n     * \u003cp\u003eThis implementation may end up skipping over some smaller\n     * number of bytes, possibly 0, if and only if it reaches the end\n     * of the underlying stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual number of bytes skipped is returned.\u003c/p\u003e\n     *\n     * @param value the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException - if an I/O error occurs.\n     * @throws IllegalArgumentException - if value is negative.\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 564,
      "end_line": 573,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 567,col 9)",
        "(line 569,col 9)-(line 572,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 575,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 602,
      "end_line": 638,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 605,col 9)",
        "(line 606,col 9)-(line 608,col 9)",
        "(line 611,col 9)-(line 628,col 9)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 634,col 20)",
        "(line 635,col 9)-(line 635,col 27)",
        "(line 636,col 9)-(line 636,col 23)",
        "(line 637,col 9)-(line 637,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData()",
      "begin_line": 644,
      "end_line": 655,
      "comment": "\n     * Read all data of the current entry from the underlying stream\n     * that hasn\u0027t been read, yet.\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 645,col 89)",
        "(line 646,col 9)-(line 654,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated()",
      "begin_line": 672,
      "end_line": 680,
      "comment": "\n     * Get the number of bytes Inflater has actually processed.\n     *\n     * \u003cp\u003efor Java \u0026lt; Java7 the getBytes* methods in\n     * Inflater/Deflater seem to return unsigned ints rather than\n     * longs that start over with 0 at 2^32.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream knows how many bytes it has read, but not how\n     * many the Inflater actually consumed - it should be between the\n     * total number of bytes read for the entry and the total number\n     * minus the last read operation.  Here we just try to make the\n     * value close enough to the bytes we\u0027ve read by assuming the\n     * number of bytes consumed must be smaller than (or equal to) the\n     * number of bytes read but not smaller by more than 2^32.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 38)",
        "(line 674,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 679,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 682,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 683,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 686,col 42)",
        "(line 687,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 692,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 695,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 45)",
        "(line 697,col 9)-(line 697,col 21)",
        "(line 698,col 9)-(line 700,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 703,
      "end_line": 734,
      "comment": "",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 28)",
        "(line 705,col 9)-(line 705,col 44)",
        "(line 706,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 45)",
        "(line 724,col 9)-(line 724,col 33)",
        "(line 725,col 9)-(line 725,col 65)",
        "(line 726,col 9)-(line 733,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 743,
      "end_line": 748,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 747,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 767,
      "end_line": 796,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 768,col 9)-(line 768,col 64)",
        "(line 769,col 9)-(line 769,col 20)",
        "(line 770,col 9)-(line 770,col 29)",
        "(line 773,col 9)-(line 773,col 68)",
        "(line 775,col 9)-(line 792,col 9)",
        "(line 794,col 9)-(line 794,col 37)",
        "(line 795,col 9)-(line 795,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH"
      ],
      "begin_line": 798,
      "end_line": 798,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH"
      ],
      "begin_line": 799,
      "end_line": 799,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DD"
      ],
      "begin_line": 800,
      "end_line": 800,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 810,
      "end_line": 840,
      "comment": "\n     * Checks whether the current buffer contains the signature of a\n     * \u0026quot;data descriptor\u0026quot;, \u0026quot;local file header\u0026quot; or\n     * \u0026quot;central directory entry\u0026quot;.\n     *\n     * \u003cp\u003eIf it contains such a signature, reads the data descriptor\n     * and positions the stream right after the data descriptor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 813,col 29)",
        "(line 814,col 9)-(line 814,col 28)",
        "(line 815,col 9)-(line 838,col 9)",
        "(line 839,col 9)-(line 839,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 851,
      "end_line": 861,
      "comment": "\n     * If the last read bytes could hold a data descriptor and an\n     * incomplete signature then save the last bytes to the front of\n     * the buffer and cache everything in front of the potential data\n     * descriptor into the given ByteArrayOutputStream.\n     *\n     * \u003cp\u003eData descriptor plus incomplete signature (3 bytes in the\n     * worst case) can be 20 bytes max.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 67)",
        "(line 853,col 9)-(line 859,col 9)",
        "(line 860,col 9)-(line 860,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(byte[], int, int)",
      "begin_line": 863,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 63)",
        "(line 865,col 9)-(line 865,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive()",
      "begin_line": 889,
      "end_line": 899,
      "comment": "\n     * Reads the stream until it find the \"End of central directory\n     * record\" and consumes it as well.\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 50)",
        "(line 894,col 9)-(line 894,col 25)",
        "(line 895,col 9)-(line 895,col 89)",
        "(line 896,col 9)-(line 896,col 29)",
        "(line 898,col 9)-(line 898,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord()",
      "begin_line": 905,
      "end_line": 936,
      "comment": "\n     * Reads forward until the signature of the \u0026quot;End of central\n     * directory\u0026quot; record is found.\n     ",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 29)",
        "(line 907,col 9)-(line 907,col 37)",
        "(line 908,col 9)-(line 935,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(long)",
      "begin_line": 945,
      "end_line": 960,
      "comment": "\n     * Skips bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link\n     * #skip} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 946,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte()",
      "begin_line": 968,
      "end_line": 974,
      "comment": "\n     * Reads bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link #read} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 26)",
        "(line 970,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 973,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.isFirstByteOfEocdSig(int)",
      "begin_line": 976,
      "end_line": 978,
      "comment": "",
      "child_ranges": [
        "(line 977,col 9)-(line 977,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 984,
      "end_line": 1025,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 989,
      "end_line": 989,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 994,
      "end_line": 994,
      "comment": "\n         * Does the entry use a data descriptor?\n         "
    },
    {
      "type": "field",
      "varNames": [
        "usesZip64"
      ],
      "begin_line": 999,
      "end_line": 999,
      "comment": "\n         * Does the entry have a ZIP64 extended information extra field.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1005,
      "end_line": 1005,
      "comment": "\n         * Number of bytes of entry content read by the client if the\n         * entry is STORED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 1014,
      "end_line": 1014,
      "comment": "\n         * Number of bytes of entry content read so from the stream.\n         *\n         * \u003cp\u003eThis may be more than the actual entry\u0027s length as some\n         * stuff gets buffered up and needs to be pushed back when the\n         * end of the entry has been reached.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 1019,
      "end_line": 1019,
      "comment": "\n         * The checksum calculated as the current entry is read.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1024,
      "end_line": 1024,
      "comment": "\n         * The input stream decompressing the data for shrunk and imploded entries.\n         "
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 1030,
      "end_line": 1103,
      "comment": "\n     * Bounded input stream adapted from commons-io\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1033,
      "end_line": 1033,
      "comment": " the wrapped input stream "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 1036,
      "end_line": 1036,
      "comment": " the max length to provide "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 1039,
      "end_line": 1039,
      "comment": " the number of bytes already returned "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.BoundedInputStream(java.io.InputStream, long)",
      "begin_line": 1048,
      "end_line": 1051,
      "comment": "\n         * Creates a new \u003ccode\u003eBoundedInputStream\u003c/code\u003e that wraps the given input\n         * stream and limits it to a certain size.\n         *\n         * @param in The wrapped input stream\n         * @param size The maximum number of bytes to return\n         ",
      "child_ranges": [
        "(line 1049,col 13)-(line 1049,col 28)",
        "(line 1050,col 13)-(line 1050,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read()",
      "begin_line": 1053,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1055,col 13)-(line 1057,col 13)",
        "(line 1058,col 13)-(line 1058,col 41)",
        "(line 1059,col 13)-(line 1059,col 18)",
        "(line 1060,col 13)-(line 1060,col 21)",
        "(line 1061,col 13)-(line 1061,col 42)",
        "(line 1062,col 13)-(line 1062,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[])",
      "begin_line": 1065,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 13)-(line 1067,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1070,
      "end_line": 1086,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 13)-(line 1074,col 13)",
        "(line 1075,col 13)-(line 1075,col 75)",
        "(line 1076,col 13)-(line 1076,col 65)",
        "(line 1078,col 13)-(line 1080,col 13)",
        "(line 1082,col 13)-(line 1082,col 29)",
        "(line 1083,col 13)-(line 1083,col 29)",
        "(line 1084,col 13)-(line 1084,col 53)",
        "(line 1085,col 13)-(line 1085,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.skip(long)",
      "begin_line": 1088,
      "end_line": 1094,
      "comment": "",
      "child_ranges": [
        "(line 1090,col 13)-(line 1090,col 70)",
        "(line 1091,col 13)-(line 1091,col 54)",
        "(line 1092,col 13)-(line 1092,col 32)",
        "(line 1093,col 13)-(line 1093,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.available()",
      "begin_line": 1096,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1098,col 13)-(line 1100,col 13)",
        "(line 1101,col 13)-(line 1101,col 34)"
      ]
    }
  ]
}