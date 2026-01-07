{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 76,
      "end_line": 1108,
      "comment": "\n * Implements an input stream that can read Zip archives.\n *\n * \u003cp\u003eAs of Apache Commons Compress it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link ZipFile} class is preferred when reading from files\n * as {@link ZipArchiveInputStream} is limited by not being able to\n * read the central directory header before returning entries.  In\n * particular {@link ZipArchiveInputStream}\u003c/p\u003e\n *\n * \u003cul\u003e\n *\n *  \u003cli\u003emay return entries that are not part of the central directory\n *  at all and shouldn\u0027t be considered part of the archive.\u003c/li\u003e\n *\n *  \u003cli\u003emay return several entries with the same name.\u003c/li\u003e\n *\n *  \u003cli\u003ewill not return internal or external attributes.\u003c/li\u003e\n *\n *  \u003cli\u003emay return incomplete extra field data.\u003c/li\u003e\n *\n *  \u003cli\u003emay return unknown sizes and CRC values for entries until the\n *  next entry has been reached if the archive uses the data\n *  descriptor feature.\u003c/li\u003e\n *\n * \u003c/ul\u003e\n *\n * @see ZipFile\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The zip encoding to use for filenames and the file comment. "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " the provided encoding (for unit tests)"
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Whether to look for and use Unicode extra fields. "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Wrapped stream, will always be a PushbackInputStream. "
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Inflater used for all deflated entries. "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Buffer used to read from the wrapped stream. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The entry that is currently being read. "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Whether the stream has been closed. "
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Whether the stream has reached the central directory - and thus found all entries. "
    },
    {
      "type": "field",
      "varNames": [
        "lastStoredEntry"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * When reading a stored entry that uses the data descriptor this\n     * stream has to read the full entry and caches it.  This is the\n     * cache.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Whether the stream will try to read STORED entries that use a data descriptor. "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_LEN"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_EXP_32"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_BUF"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_BUF"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_BUF"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD_BUF"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_DWORD_BUF"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entriesRead"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Create an instance using UTF-8 encoding\n     * @param inputStream the stream to wrap\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 177,
      "end_line": 179,
      "comment": "\n     * Create an instance using the specified encoding\n     * @param inputStream the stream to wrap\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Create an instance using the specified encoding\n     * @param inputStream the stream to wrap\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean, boolean)",
      "begin_line": 204,
      "end_line": 216,
      "comment": "\n     * Create an instance using the specified encoding\n     * @param inputStream the stream to wrap\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     * @param allowStoredEntriesWithDataDescriptor whether the stream\n     * will try to read STORED entries that use a data descriptor\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 33)",
        "(line 209,col 9)-(line 209,col 65)",
        "(line 210,col 9)-(line 210,col 59)",
        "(line 211,col 9)-(line 211,col 66)",
        "(line 212,col 9)-(line 213,col 49)",
        "(line 215,col 9)-(line 215,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 218,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 34)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 43)",
        "(line 243,col 9)-(line 246,col 9)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 23)",
        "(line 252,col 9)-(line 252,col 37)",
        "(line 254,col 9)-(line 254,col 60)",
        "(line 255,col 9)-(line 255,col 21)",
        "(line 256,col 9)-(line 256,col 95)",
        "(line 258,col 9)-(line 258,col 79)",
        "(line 259,col 9)-(line 259,col 62)",
        "(line 260,col 9)-(line 260,col 106)",
        "(line 261,col 9)-(line 261,col 64)",
        "(line 262,col 9)-(line 262,col 51)",
        "(line 264,col 9)-(line 264,col 21)",
        "(line 266,col 9)-(line 266,col 65)",
        "(line 267,col 9)-(line 267,col 21)",
        "(line 269,col 9)-(line 269,col 74)",
        "(line 270,col 9)-(line 270,col 36)",
        "(line 271,col 9)-(line 271,col 20)",
        "(line 273,col 9)-(line 273,col 42)",
        "(line 274,col 9)-(line 285,col 9)",
        "(line 287,col 9)-(line 287,col 58)",
        "(line 289,col 9)-(line 289,col 21)",
        "(line 291,col 9)-(line 291,col 55)",
        "(line 292,col 9)-(line 292,col 21)",
        "(line 294,col 9)-(line 294,col 48)",
        "(line 295,col 9)-(line 295,col 28)",
        "(line 296,col 9)-(line 296,col 72)",
        "(line 298,col 9)-(line 298,col 46)",
        "(line 299,col 9)-(line 299,col 29)",
        "(line 300,col 9)-(line 300,col 42)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 306,col 39)",
        "(line 308,col 9)-(line 319,col 9)",
        "(line 321,col 9)-(line 321,col 22)",
        "(line 322,col 9)-(line 322,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(byte[])",
      "begin_line": 330,
      "end_line": 345,
      "comment": "\n     * Fills the given array with the first local file header and\n     * deals with splitting/spanning markers that may prefix the first\n     * LFH.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 23)",
        "(line 332,col 9)-(line 332,col 39)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 352,
      "end_line": 367,
      "comment": "\n     * Records whether a Zip64 extra is present and sets the size\n     * information from it if sizes are 0xFFFFFFFF and the entry\n     * doesn\u0027t use a data descriptor.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 86)",
        "(line 356,col 9)-(line 356,col 40)",
        "(line 357,col 9)-(line 366,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 369,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 381,
      "end_line": 390,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 392,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 396,col 9)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 407,col 54)",
        "(line 408,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 17)",
        "(line 414,col 9)-(line 425,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 431,col 9)-(line 431,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(byte[], int, int)",
      "begin_line": 437,
      "end_line": 471,
      "comment": "\n     * Implementation of read for STORED entries.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 446,col 45)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 463,col 55)",
        "(line 464,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 40)",
        "(line 469,col 9)-(line 469,col 36)",
        "(line 470,col 9)-(line 470,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(byte[], int, int)",
      "begin_line": 476,
      "end_line": 490,
      "comment": "\n     * Implementation of read for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 60)",
        "(line 478,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 489,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater(byte[], int, int)",
      "begin_line": 496,
      "end_line": 516,
      "comment": "\n     * Potentially reads more bytes to fill the inflater\u0027s buffer and\n     * reads from it.\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 21)",
        "(line 498,col 9)-(line 514,col 48)",
        "(line 515,col 9)-(line 515,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 518,
      "end_line": 525,
      "comment": "",
      "child_ranges": [
        "(line 520,col 9)-(line 524,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 542,
      "end_line": 557,
      "comment": "\n     * Skips over and discards value bytes of data from this input\n     * stream.\n     *\n     * \u003cp\u003eThis implementation may end up skipping over some smaller\n     * number of bytes, possibly 0, if and only if it reaches the end\n     * of the underlying stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual number of bytes skipped is returned.\u003c/p\u003e\n     *\n     * @param value the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException - if an I/O error occurs.\n     * @throws IllegalArgumentException - if value is negative.\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 568,
      "end_line": 577,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 576,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 579,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 580,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 606,
      "end_line": 642,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 612,col 9)",
        "(line 615,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 638,col 20)",
        "(line 639,col 9)-(line 639,col 27)",
        "(line 640,col 9)-(line 640,col 23)",
        "(line 641,col 9)-(line 641,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData()",
      "begin_line": 648,
      "end_line": 659,
      "comment": "\n     * Read all data of the current entry from the underlying stream\n     * that hasn\u0027t been read, yet.\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 89)",
        "(line 650,col 9)-(line 658,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated()",
      "begin_line": 676,
      "end_line": 684,
      "comment": "\n     * Get the number of bytes Inflater has actually processed.\n     *\n     * \u003cp\u003efor Java \u0026lt; Java7 the getBytes* methods in\n     * Inflater/Deflater seem to return unsigned ints rather than\n     * longs that start over with 0 at 2^32.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream knows how many bytes it has read, but not how\n     * many the Inflater actually consumed - it should be between the\n     * total number of bytes read for the entry and the total number\n     * minus the last read operation.  Here we just try to make the\n     * value close enough to the bytes we\u0027ve read by assuming the\n     * number of bytes consumed must be smaller than (or equal to) the\n     * number of bytes read but not smaller by more than 2^32.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 38)",
        "(line 678,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 683,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 686,
      "end_line": 697,
      "comment": "",
      "child_ranges": [
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 690,col 42)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 699,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 45)",
        "(line 701,col 9)-(line 701,col 21)",
        "(line 702,col 9)-(line 704,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 707,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 28)",
        "(line 709,col 9)-(line 709,col 44)",
        "(line 710,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 45)",
        "(line 728,col 9)-(line 728,col 33)",
        "(line 729,col 9)-(line 729,col 65)",
        "(line 730,col 9)-(line 737,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 747,
      "end_line": 752,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 751,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 771,
      "end_line": 800,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 64)",
        "(line 773,col 9)-(line 773,col 20)",
        "(line 774,col 9)-(line 774,col 29)",
        "(line 777,col 9)-(line 777,col 68)",
        "(line 779,col 9)-(line 796,col 9)",
        "(line 798,col 9)-(line 798,col 37)",
        "(line 799,col 9)-(line 799,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH"
      ],
      "begin_line": 802,
      "end_line": 802,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH"
      ],
      "begin_line": 803,
      "end_line": 803,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DD"
      ],
      "begin_line": 804,
      "end_line": 804,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 814,
      "end_line": 844,
      "comment": "\n     * Checks whether the current buffer contains the signature of a\n     * \u0026quot;data descriptor\u0026quot;, \u0026quot;local file header\u0026quot; or\n     * \u0026quot;central directory entry\u0026quot;.\n     *\n     * \u003cp\u003eIf it contains such a signature, reads the data descriptor\n     * and positions the stream right after the data descriptor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 29)",
        "(line 818,col 9)-(line 818,col 28)",
        "(line 819,col 9)-(line 842,col 9)",
        "(line 843,col 9)-(line 843,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 855,
      "end_line": 865,
      "comment": "\n     * If the last read bytes could hold a data descriptor and an\n     * incomplete signature then save the last bytes to the front of\n     * the buffer and cache everything in front of the potential data\n     * descriptor into the given ByteArrayOutputStream.\n     *\n     * \u003cp\u003eData descriptor plus incomplete signature (3 bytes in the\n     * worst case) can be 20 bytes max.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 67)",
        "(line 857,col 9)-(line 863,col 9)",
        "(line 864,col 9)-(line 864,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(byte[], int, int)",
      "begin_line": 867,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 63)",
        "(line 869,col 9)-(line 869,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive()",
      "begin_line": 893,
      "end_line": 903,
      "comment": "\n     * Reads the stream until it find the \"End of central directory\n     * record\" and consumes it as well.\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 50)",
        "(line 898,col 9)-(line 898,col 25)",
        "(line 899,col 9)-(line 899,col 89)",
        "(line 900,col 9)-(line 900,col 29)",
        "(line 902,col 9)-(line 902,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord()",
      "begin_line": 909,
      "end_line": 940,
      "comment": "\n     * Reads forward until the signature of the \u0026quot;End of central\n     * directory\u0026quot; record is found.\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 29)",
        "(line 911,col 9)-(line 911,col 37)",
        "(line 912,col 9)-(line 939,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(long)",
      "begin_line": 949,
      "end_line": 964,
      "comment": "\n     * Skips bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link\n     * #skip} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 950,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 963,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte()",
      "begin_line": 972,
      "end_line": 978,
      "comment": "\n     * Reads bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link #read} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 973,col 9)-(line 973,col 26)",
        "(line 974,col 9)-(line 976,col 9)",
        "(line 977,col 9)-(line 977,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.isFirstByteOfEocdSig(int)",
      "begin_line": 980,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 988,
      "end_line": 1029,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 993,
      "end_line": 993,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 998,
      "end_line": 998,
      "comment": "\n         * Does the entry use a data descriptor?\n         "
    },
    {
      "type": "field",
      "varNames": [
        "usesZip64"
      ],
      "begin_line": 1003,
      "end_line": 1003,
      "comment": "\n         * Does the entry have a ZIP64 extended information extra field.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1009,
      "end_line": 1009,
      "comment": "\n         * Number of bytes of entry content read by the client if the\n         * entry is STORED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 1018,
      "end_line": 1018,
      "comment": "\n         * Number of bytes of entry content read so from the stream.\n         *\n         * \u003cp\u003eThis may be more than the actual entry\u0027s length as some\n         * stuff gets buffered up and needs to be pushed back when the\n         * end of the entry has been reached.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 1023,
      "end_line": 1023,
      "comment": "\n         * The checksum calculated as the current entry is read.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1028,
      "end_line": 1028,
      "comment": "\n         * The input stream decompressing the data for shrunk and imploded entries.\n         "
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 1034,
      "end_line": 1107,
      "comment": "\n     * Bounded input stream adapted from commons-io\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1037,
      "end_line": 1037,
      "comment": " the wrapped input stream "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 1040,
      "end_line": 1040,
      "comment": " the max length to provide "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 1043,
      "end_line": 1043,
      "comment": " the number of bytes already returned "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.BoundedInputStream(java.io.InputStream, long)",
      "begin_line": 1052,
      "end_line": 1055,
      "comment": "\n         * Creates a new \u003ccode\u003eBoundedInputStream\u003c/code\u003e that wraps the given input\n         * stream and limits it to a certain size.\n         *\n         * @param in The wrapped input stream\n         * @param size The maximum number of bytes to return\n         ",
      "child_ranges": [
        "(line 1053,col 13)-(line 1053,col 28)",
        "(line 1054,col 13)-(line 1054,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read()",
      "begin_line": 1057,
      "end_line": 1067,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 13)-(line 1061,col 13)",
        "(line 1062,col 13)-(line 1062,col 41)",
        "(line 1063,col 13)-(line 1063,col 18)",
        "(line 1064,col 13)-(line 1064,col 21)",
        "(line 1065,col 13)-(line 1065,col 42)",
        "(line 1066,col 13)-(line 1066,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[])",
      "begin_line": 1069,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1071,col 13)-(line 1071,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1074,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1076,col 13)-(line 1078,col 13)",
        "(line 1079,col 13)-(line 1079,col 75)",
        "(line 1080,col 13)-(line 1080,col 65)",
        "(line 1082,col 13)-(line 1084,col 13)",
        "(line 1086,col 13)-(line 1086,col 29)",
        "(line 1087,col 13)-(line 1087,col 29)",
        "(line 1088,col 13)-(line 1088,col 53)",
        "(line 1089,col 13)-(line 1089,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.skip(long)",
      "begin_line": 1092,
      "end_line": 1098,
      "comment": "",
      "child_ranges": [
        "(line 1094,col 13)-(line 1094,col 70)",
        "(line 1095,col 13)-(line 1095,col 54)",
        "(line 1096,col 13)-(line 1096,col 32)",
        "(line 1097,col 13)-(line 1097,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.available()",
      "begin_line": 1100,
      "end_line": 1106,
      "comment": "",
      "child_ranges": [
        "(line 1102,col 13)-(line 1104,col 13)",
        "(line 1105,col 13)-(line 1105,col 34)"
      ]
    }
  ]
}