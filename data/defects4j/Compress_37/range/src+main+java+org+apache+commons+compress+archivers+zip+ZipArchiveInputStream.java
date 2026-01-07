{
  "filepath": "/tmp/Compress-37b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 77,
      "end_line": 1112,
      "comment": "\n * Implements an input stream that can read Zip archives.\n *\n * \u003cp\u003eAs of Apache Commons Compress it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link ZipFile} class is preferred when reading from files\n * as {@link ZipArchiveInputStream} is limited by not being able to\n * read the central directory header before returning entries.  In\n * particular {@link ZipArchiveInputStream}\u003c/p\u003e\n *\n * \u003cul\u003e\n *\n *  \u003cli\u003emay return entries that are not part of the central directory\n *  at all and shouldn\u0027t be considered part of the archive.\u003c/li\u003e\n *\n *  \u003cli\u003emay return several entries with the same name.\u003c/li\u003e\n *\n *  \u003cli\u003ewill not return internal or external attributes.\u003c/li\u003e\n *\n *  \u003cli\u003emay return incomplete extra field data.\u003c/li\u003e\n *\n *  \u003cli\u003emay return unknown sizes and CRC values for entries until the\n *  next entry has been reached if the archive uses the data\n *  descriptor feature.\u003c/li\u003e\n *\n * \u003c/ul\u003e\n *\n * @see ZipFile\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " The zip encoding to use for filenames and the file comment. "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Whether to look for and use Unicode extra fields. "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " Wrapped stream, will always be a PushbackInputStream. "
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Inflater used for all deflated entries. "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Buffer used to read from the wrapped stream. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The entry that is currently being read. "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Whether the stream has been closed. "
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Whether the stream has reached the central directory - and thus found all entries. "
    },
    {
      "type": "field",
      "varNames": [
        "lastStoredEntry"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * When reading a stored entry that uses the data descriptor this\n     * stream has to read the full entry and caches it.  This is the\n     * cache.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Whether the stream will try to read STORED entries that use a data descriptor. "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_LEN"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_EXP_32"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_BUF"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_BUF"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_BUF"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD_BUF"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_DWORD_BUF"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entriesRead"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * Create an instance using UTF-8 encoding\n     * @param inputStream the stream to wrap\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Create an instance using the specified encoding\n     * @param inputStream the stream to wrap\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Create an instance using the specified encoding\n     * @param inputStream the stream to wrap\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean, boolean)",
      "begin_line": 205,
      "end_line": 217,
      "comment": "\n     * Create an instance using the specified encoding\n     * @param inputStream the stream to wrap\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     * @param allowStoredEntriesWithDataDescriptor whether the stream\n     * will try to read STORED entries that use a data descriptor\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 33)",
        "(line 210,col 9)-(line 210,col 65)",
        "(line 211,col 9)-(line 211,col 59)",
        "(line 212,col 9)-(line 212,col 66)",
        "(line 213,col 9)-(line 214,col 49)",
        "(line 216,col 9)-(line 216,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 219,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 34)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 243,col 49)",
        "(line 244,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 23)",
        "(line 253,col 9)-(line 253,col 37)",
        "(line 255,col 9)-(line 255,col 66)",
        "(line 256,col 9)-(line 256,col 21)",
        "(line 257,col 9)-(line 257,col 95)",
        "(line 259,col 9)-(line 259,col 79)",
        "(line 260,col 9)-(line 260,col 62)",
        "(line 261,col 9)-(line 261,col 106)",
        "(line 262,col 9)-(line 262,col 64)",
        "(line 263,col 9)-(line 263,col 51)",
        "(line 265,col 9)-(line 265,col 21)",
        "(line 267,col 9)-(line 267,col 65)",
        "(line 268,col 9)-(line 268,col 21)",
        "(line 270,col 9)-(line 270,col 80)",
        "(line 271,col 9)-(line 271,col 36)",
        "(line 272,col 9)-(line 272,col 20)",
        "(line 274,col 9)-(line 274,col 42)",
        "(line 275,col 9)-(line 286,col 9)",
        "(line 288,col 9)-(line 288,col 64)",
        "(line 290,col 9)-(line 290,col 21)",
        "(line 292,col 9)-(line 292,col 61)",
        "(line 293,col 9)-(line 293,col 21)",
        "(line 295,col 9)-(line 295,col 54)",
        "(line 296,col 9)-(line 296,col 28)",
        "(line 297,col 9)-(line 297,col 72)",
        "(line 299,col 9)-(line 299,col 52)",
        "(line 300,col 9)-(line 300,col 29)",
        "(line 301,col 9)-(line 301,col 42)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 307,col 39)",
        "(line 309,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 322,col 22)",
        "(line 323,col 9)-(line 323,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(byte[])",
      "begin_line": 331,
      "end_line": 346,
      "comment": "\n     * Fills the given array with the first local file header and\n     * deals with splitting/spanning markers that may prefix the first\n     * LFH.\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 23)",
        "(line 333,col 9)-(line 333,col 45)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 345,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 353,
      "end_line": 368,
      "comment": "\n     * Records whether a Zip64 extra is present and sets the size\n     * information from it if sizes are 0xFFFFFFFF and the entry\n     * doesn\u0027t use a data descriptor.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 356,col 86)",
        "(line 357,col 9)-(line 357,col 40)",
        "(line 358,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 370,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 382,
      "end_line": 391,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 393,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 404,col 9)-(line 406,col 9)",
        "(line 408,col 9)-(line 408,col 54)",
        "(line 409,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 17)",
        "(line 415,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 432,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(byte[], int, int)",
      "begin_line": 438,
      "end_line": 472,
      "comment": "\n     * Implementation of read for STORED entries.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 447,col 51)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 464,col 55)",
        "(line 465,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 40)",
        "(line 470,col 9)-(line 470,col 36)",
        "(line 471,col 9)-(line 471,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(byte[], int, int)",
      "begin_line": 477,
      "end_line": 491,
      "comment": "\n     * Implementation of read for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 66)",
        "(line 479,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 490,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater(byte[], int, int)",
      "begin_line": 497,
      "end_line": 517,
      "comment": "\n     * Potentially reads more bytes to fill the inflater\u0027s buffer and\n     * reads from it.\n     ",
      "child_ranges": [
        "(line 498,col 9)-(line 498,col 21)",
        "(line 499,col 9)-(line 515,col 48)",
        "(line 516,col 9)-(line 516,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 519,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 546,
      "end_line": 561,
      "comment": "\n     * Skips over and discards value bytes of data from this input\n     * stream.\n     *\n     * \u003cp\u003eThis implementation may end up skipping over some smaller\n     * number of bytes, possibly 0, if and only if it reaches the end\n     * of the underlying stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual number of bytes skipped is returned.\u003c/p\u003e\n     *\n     * @param value the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException - if an I/O error occurs.\n     * @throws IllegalArgumentException - if value is negative.\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 572,
      "end_line": 581,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 575,col 9)",
        "(line 577,col 9)-(line 580,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 583,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 610,
      "end_line": 646,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 613,col 9)",
        "(line 614,col 9)-(line 616,col 9)",
        "(line 619,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 640,col 9)",
        "(line 642,col 9)-(line 642,col 20)",
        "(line 643,col 9)-(line 643,col 27)",
        "(line 644,col 9)-(line 644,col 23)",
        "(line 645,col 9)-(line 645,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData()",
      "begin_line": 652,
      "end_line": 663,
      "comment": "\n     * Read all data of the current entry from the underlying stream\n     * that hasn\u0027t been read, yet.\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 89)",
        "(line 654,col 9)-(line 662,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated()",
      "begin_line": 680,
      "end_line": 688,
      "comment": "\n     * Get the number of bytes Inflater has actually processed.\n     *\n     * \u003cp\u003efor Java \u0026lt; Java7 the getBytes* methods in\n     * Inflater/Deflater seem to return unsigned ints rather than\n     * longs that start over with 0 at 2^32.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream knows how many bytes it has read, but not how\n     * many the Inflater actually consumed - it should be between the\n     * total number of bytes read for the entry and the total number\n     * minus the last read operation.  Here we just try to make the\n     * value close enough to the bytes we\u0027ve read by assuming the\n     * number of bytes consumed must be smaller than (or equal to) the\n     * number of bytes read but not smaller by more than 2^32.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 681,col 9)-(line 681,col 38)",
        "(line 682,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 690,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 48)",
        "(line 695,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 700,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 703,
      "end_line": 709,
      "comment": "",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 51)",
        "(line 705,col 9)-(line 705,col 21)",
        "(line 706,col 9)-(line 708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 711,
      "end_line": 742,
      "comment": "",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 28)",
        "(line 713,col 9)-(line 713,col 44)",
        "(line 714,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 45)",
        "(line 732,col 9)-(line 732,col 33)",
        "(line 733,col 9)-(line 733,col 71)",
        "(line 734,col 9)-(line 741,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 751,
      "end_line": 756,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 752,col 9)-(line 755,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 775,
      "end_line": 804,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 70)",
        "(line 777,col 9)-(line 777,col 20)",
        "(line 778,col 9)-(line 778,col 29)",
        "(line 781,col 9)-(line 781,col 74)",
        "(line 783,col 9)-(line 800,col 9)",
        "(line 802,col 9)-(line 802,col 43)",
        "(line 803,col 9)-(line 803,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH"
      ],
      "begin_line": 806,
      "end_line": 806,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH"
      ],
      "begin_line": 807,
      "end_line": 807,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DD"
      ],
      "begin_line": 808,
      "end_line": 808,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 818,
      "end_line": 848,
      "comment": "\n     * Checks whether the current buffer contains the signature of a\n     * \u0026quot;data descriptor\u0026quot;, \u0026quot;local file header\u0026quot; or\n     * \u0026quot;central directory entry\u0026quot;.\n     *\n     * \u003cp\u003eIf it contains such a signature, reads the data descriptor\n     * and positions the stream right after the data descriptor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 821,col 9)-(line 821,col 29)",
        "(line 822,col 9)-(line 822,col 28)",
        "(line 823,col 9)-(line 846,col 9)",
        "(line 847,col 9)-(line 847,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 859,
      "end_line": 869,
      "comment": "\n     * If the last read bytes could hold a data descriptor and an\n     * incomplete signature then save the last bytes to the front of\n     * the buffer and cache everything in front of the potential data\n     * descriptor into the given ByteArrayOutputStream.\n     *\n     * \u003cp\u003eData descriptor plus incomplete signature (3 bytes in the\n     * worst case) can be 20 bytes max.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 67)",
        "(line 861,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(byte[], int, int)",
      "begin_line": 871,
      "end_line": 874,
      "comment": "",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 63)",
        "(line 873,col 9)-(line 873,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive()",
      "begin_line": 897,
      "end_line": 907,
      "comment": "\n     * Reads the stream until it find the \"End of central directory\n     * record\" and consumes it as well.\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 50)",
        "(line 902,col 9)-(line 902,col 25)",
        "(line 903,col 9)-(line 903,col 89)",
        "(line 904,col 9)-(line 904,col 29)",
        "(line 906,col 9)-(line 906,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord()",
      "begin_line": 913,
      "end_line": 944,
      "comment": "\n     * Reads forward until the signature of the \u0026quot;End of central\n     * directory\u0026quot; record is found.\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 914,col 29)",
        "(line 915,col 9)-(line 915,col 37)",
        "(line 916,col 9)-(line 943,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(long)",
      "begin_line": 953,
      "end_line": 968,
      "comment": "\n     * Skips bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link\n     * #skip} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte()",
      "begin_line": 976,
      "end_line": 982,
      "comment": "\n     * Reads bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link #read} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 977,col 9)-(line 977,col 32)",
        "(line 978,col 9)-(line 980,col 9)",
        "(line 981,col 9)-(line 981,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.isFirstByteOfEocdSig(int)",
      "begin_line": 984,
      "end_line": 986,
      "comment": "",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 992,
      "end_line": 1033,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 997,
      "end_line": 997,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 1002,
      "end_line": 1002,
      "comment": "\n         * Does the entry use a data descriptor?\n         "
    },
    {
      "type": "field",
      "varNames": [
        "usesZip64"
      ],
      "begin_line": 1007,
      "end_line": 1007,
      "comment": "\n         * Does the entry have a ZIP64 extended information extra field.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1013,
      "end_line": 1013,
      "comment": "\n         * Number of bytes of entry content read by the client if the\n         * entry is STORED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 1022,
      "end_line": 1022,
      "comment": "\n         * Number of bytes of entry content read so from the stream.\n         *\n         * \u003cp\u003eThis may be more than the actual entry\u0027s length as some\n         * stuff gets buffered up and needs to be pushed back when the\n         * end of the entry has been reached.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 1027,
      "end_line": 1027,
      "comment": "\n         * The checksum calculated as the current entry is read.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1032,
      "end_line": 1032,
      "comment": "\n         * The input stream decompressing the data for shrunk and imploded entries.\n         "
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 1038,
      "end_line": 1111,
      "comment": "\n     * Bounded input stream adapted from commons-io\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1041,
      "end_line": 1041,
      "comment": " the wrapped input stream "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 1044,
      "end_line": 1044,
      "comment": " the max length to provide "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 1047,
      "end_line": 1047,
      "comment": " the number of bytes already returned "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.BoundedInputStream(java.io.InputStream, long)",
      "begin_line": 1056,
      "end_line": 1059,
      "comment": "\n         * Creates a new \u003ccode\u003eBoundedInputStream\u003c/code\u003e that wraps the given input\n         * stream and limits it to a certain size.\n         *\n         * @param in The wrapped input stream\n         * @param size The maximum number of bytes to return\n         ",
      "child_ranges": [
        "(line 1057,col 13)-(line 1057,col 28)",
        "(line 1058,col 13)-(line 1058,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read()",
      "begin_line": 1061,
      "end_line": 1071,
      "comment": "",
      "child_ranges": [
        "(line 1063,col 13)-(line 1065,col 13)",
        "(line 1066,col 13)-(line 1066,col 41)",
        "(line 1067,col 13)-(line 1067,col 18)",
        "(line 1068,col 13)-(line 1068,col 21)",
        "(line 1069,col 13)-(line 1069,col 42)",
        "(line 1070,col 13)-(line 1070,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[])",
      "begin_line": 1073,
      "end_line": 1076,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 13)-(line 1075,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1078,
      "end_line": 1094,
      "comment": "",
      "child_ranges": [
        "(line 1080,col 13)-(line 1082,col 13)",
        "(line 1083,col 13)-(line 1083,col 75)",
        "(line 1084,col 13)-(line 1084,col 65)",
        "(line 1086,col 13)-(line 1088,col 13)",
        "(line 1090,col 13)-(line 1090,col 29)",
        "(line 1091,col 13)-(line 1091,col 29)",
        "(line 1092,col 13)-(line 1092,col 53)",
        "(line 1093,col 13)-(line 1093,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.skip(long)",
      "begin_line": 1096,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1098,col 13)-(line 1098,col 70)",
        "(line 1099,col 13)-(line 1099,col 54)",
        "(line 1100,col 13)-(line 1100,col 32)",
        "(line 1101,col 13)-(line 1101,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.available()",
      "begin_line": 1104,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1106,col 13)-(line 1108,col 13)",
        "(line 1109,col 13)-(line 1109,col 34)"
      ]
    }
  ]
}