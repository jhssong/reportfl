{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 77,
      "end_line": 1136,
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
        "lfhBuf"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "skipBuf"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "shortBuf"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "wordBuf"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "twoDwordBuf"
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
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 34)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 227,col 9)",
        "(line 229,col 9)-(line 229,col 50)",
        "(line 230,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 254,col 9)-(line 254,col 23)",
        "(line 255,col 9)-(line 255,col 37)",
        "(line 257,col 9)-(line 257,col 65)",
        "(line 258,col 9)-(line 258,col 21)",
        "(line 259,col 9)-(line 259,col 95)",
        "(line 261,col 9)-(line 261,col 78)",
        "(line 262,col 9)-(line 262,col 62)",
        "(line 263,col 9)-(line 263,col 106)",
        "(line 264,col 9)-(line 264,col 64)",
        "(line 265,col 9)-(line 265,col 51)",
        "(line 267,col 9)-(line 267,col 21)",
        "(line 269,col 9)-(line 269,col 64)",
        "(line 270,col 9)-(line 270,col 21)",
        "(line 272,col 9)-(line 272,col 79)",
        "(line 273,col 9)-(line 273,col 36)",
        "(line 274,col 9)-(line 274,col 20)",
        "(line 276,col 9)-(line 276,col 42)",
        "(line 277,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 290,col 63)",
        "(line 292,col 9)-(line 292,col 21)",
        "(line 294,col 9)-(line 294,col 60)",
        "(line 295,col 9)-(line 295,col 21)",
        "(line 297,col 9)-(line 297,col 54)",
        "(line 298,col 9)-(line 298,col 28)",
        "(line 299,col 9)-(line 299,col 72)",
        "(line 301,col 9)-(line 301,col 52)",
        "(line 302,col 9)-(line 302,col 29)",
        "(line 303,col 9)-(line 303,col 42)",
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 39)",
        "(line 311,col 9)-(line 311,col 64)",
        "(line 312,col 9)-(line 312,col 52)",
        "(line 313,col 9)-(line 313,col 48)",
        "(line 315,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 328,col 22)",
        "(line 329,col 9)-(line 329,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(byte[])",
      "begin_line": 337,
      "end_line": 352,
      "comment": "\n     * Fills the given array with the first local file header and\n     * deals with splitting/spanning markers that may prefix the first\n     * LFH.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 23)",
        "(line 339,col 9)-(line 339,col 45)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 359,
      "end_line": 374,
      "comment": "\n     * Records whether a Zip64 extra is present and sets the size\n     * information from it if sizes are 0xFFFFFFFF and the entry\n     * doesn\u0027t use a data descriptor.\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 362,col 86)",
        "(line 363,col 9)-(line 363,col 40)",
        "(line 364,col 9)-(line 373,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 376,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 388,
      "end_line": 397,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 396,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 399,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 54)",
        "(line 415,col 9)-(line 418,col 9)",
        "(line 420,col 9)-(line 420,col 17)",
        "(line 421,col 9)-(line 432,col 9)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 438,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(byte[], int, int)",
      "begin_line": 444,
      "end_line": 478,
      "comment": "\n     * Implementation of read for STORED entries.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 51)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 470,col 55)",
        "(line 471,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 40)",
        "(line 476,col 9)-(line 476,col 36)",
        "(line 477,col 9)-(line 477,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(byte[], int, int)",
      "begin_line": 483,
      "end_line": 497,
      "comment": "\n     * Implementation of read for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 66)",
        "(line 485,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater(byte[], int, int)",
      "begin_line": 503,
      "end_line": 523,
      "comment": "\n     * Potentially reads more bytes to fill the inflater\u0027s buffer and\n     * reads from it.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 21)",
        "(line 505,col 9)-(line 521,col 48)",
        "(line 522,col 9)-(line 522,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 525,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 552,
      "end_line": 567,
      "comment": "\n     * Skips over and discards value bytes of data from this input\n     * stream.\n     *\n     * \u003cp\u003eThis implementation may end up skipping over some smaller\n     * number of bytes, possibly 0, if and only if it reaches the end\n     * of the underlying stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual number of bytes skipped is returned.\u003c/p\u003e\n     *\n     * @param value the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException - if an I/O error occurs.\n     * @throws IllegalArgumentException - if value is negative.\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 578,
      "end_line": 587,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 581,col 9)",
        "(line 583,col 9)-(line 586,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 589,
      "end_line": 596,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 616,
      "end_line": 658,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 622,col 9)",
        "(line 625,col 9)-(line 648,col 9)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 654,col 9)-(line 654,col 20)",
        "(line 655,col 9)-(line 655,col 27)",
        "(line 656,col 9)-(line 656,col 23)",
        "(line 657,col 9)-(line 657,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.currentEntryHasOutstandingBytes()",
      "begin_line": 667,
      "end_line": 670,
      "comment": "\n     * If the compressed size of the current entry is included in the entry header\n     * and there are any outstanding bytes in the underlying stream, then\n     * this returns true.\n     *\n     * @return true, if current entry is determined to have outstanding bytes, false otherwise\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 669,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData()",
      "begin_line": 676,
      "end_line": 687,
      "comment": "\n     * Read all data of the current entry from the underlying stream\n     * that hasn\u0027t been read, yet.\n     ",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 89)",
        "(line 678,col 9)-(line 686,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated()",
      "begin_line": 704,
      "end_line": 712,
      "comment": "\n     * Get the number of bytes Inflater has actually processed.\n     *\n     * \u003cp\u003efor Java \u0026lt; Java7 the getBytes* methods in\n     * Inflater/Deflater seem to return unsigned ints rather than\n     * longs that start over with 0 at 2^32.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream knows how many bytes it has read, but not how\n     * many the Inflater actually consumed - it should be between the\n     * total number of bytes read for the entry and the total number\n     * minus the last read operation.  Here we just try to make the\n     * value close enough to the bytes we\u0027ve read by assuming the\n     * number of bytes consumed must be smaller than (or equal to) the\n     * number of bytes read but not smaller by more than 2^32.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 38)",
        "(line 706,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 711,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 714,
      "end_line": 725,
      "comment": "",
      "child_ranges": [
        "(line 715,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 48)",
        "(line 719,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 724,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 727,
      "end_line": 733,
      "comment": "",
      "child_ranges": [
        "(line 728,col 9)-(line 728,col 51)",
        "(line 729,col 9)-(line 729,col 21)",
        "(line 730,col 9)-(line 732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 735,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 27)",
        "(line 737,col 9)-(line 737,col 43)",
        "(line 738,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 45)",
        "(line 756,col 9)-(line 756,col 31)",
        "(line 757,col 9)-(line 757,col 69)",
        "(line 758,col 9)-(line 765,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 775,
      "end_line": 780,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 779,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 799,
      "end_line": 828,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 70)",
        "(line 801,col 9)-(line 801,col 20)",
        "(line 802,col 9)-(line 802,col 29)",
        "(line 805,col 9)-(line 805,col 74)",
        "(line 807,col 9)-(line 824,col 9)",
        "(line 826,col 9)-(line 826,col 43)",
        "(line 827,col 9)-(line 827,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH"
      ],
      "begin_line": 830,
      "end_line": 830,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH"
      ],
      "begin_line": 831,
      "end_line": 831,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DD"
      ],
      "begin_line": 832,
      "end_line": 832,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 842,
      "end_line": 872,
      "comment": "\n     * Checks whether the current buffer contains the signature of a\n     * \u0026quot;data descriptor\u0026quot;, \u0026quot;local file header\u0026quot; or\n     * \u0026quot;central directory entry\u0026quot;.\n     *\n     * \u003cp\u003eIf it contains such a signature, reads the data descriptor\n     * and positions the stream right after the data descriptor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 845,col 29)",
        "(line 846,col 9)-(line 846,col 28)",
        "(line 847,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 871,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 883,
      "end_line": 893,
      "comment": "\n     * If the last read bytes could hold a data descriptor and an\n     * incomplete signature then save the last bytes to the front of\n     * the buffer and cache everything in front of the potential data\n     * descriptor into the given ByteArrayOutputStream.\n     *\n     * \u003cp\u003eData descriptor plus incomplete signature (3 bytes in the\n     * worst case) can be 20 bytes max.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 67)",
        "(line 885,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 892,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(byte[], int, int)",
      "begin_line": 895,
      "end_line": 898,
      "comment": "",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 63)",
        "(line 897,col 9)-(line 897,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive()",
      "begin_line": 921,
      "end_line": 931,
      "comment": "\n     * Reads the stream until it find the \"End of central directory\n     * record\" and consumes it as well.\n     ",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 57)",
        "(line 926,col 9)-(line 926,col 25)",
        "(line 927,col 9)-(line 927,col 96)",
        "(line 928,col 9)-(line 928,col 28)",
        "(line 930,col 9)-(line 930,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord()",
      "begin_line": 937,
      "end_line": 968,
      "comment": "\n     * Reads forward until the signature of the \u0026quot;End of central\n     * directory\u0026quot; record is found.\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 29)",
        "(line 939,col 9)-(line 939,col 37)",
        "(line 940,col 9)-(line 967,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(long)",
      "begin_line": 977,
      "end_line": 992,
      "comment": "\n     * Skips bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link\n     * #skip} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 978,col 9)-(line 990,col 9)",
        "(line 991,col 9)-(line 991,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte()",
      "begin_line": 1000,
      "end_line": 1006,
      "comment": "\n     * Reads bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link #read} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 32)",
        "(line 1002,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1005,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.isFirstByteOfEocdSig(int)",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1016,
      "end_line": 1057,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 1021,
      "end_line": 1021,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 1026,
      "end_line": 1026,
      "comment": "\n         * Does the entry use a data descriptor?\n         "
    },
    {
      "type": "field",
      "varNames": [
        "usesZip64"
      ],
      "begin_line": 1031,
      "end_line": 1031,
      "comment": "\n         * Does the entry have a ZIP64 extended information extra field.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1037,
      "end_line": 1037,
      "comment": "\n         * Number of bytes of entry content read by the client if the\n         * entry is STORED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 1046,
      "end_line": 1046,
      "comment": "\n         * Number of bytes of entry content read so from the stream.\n         *\n         * \u003cp\u003eThis may be more than the actual entry\u0027s length as some\n         * stuff gets buffered up and needs to be pushed back when the\n         * end of the entry has been reached.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 1051,
      "end_line": 1051,
      "comment": "\n         * The checksum calculated as the current entry is read.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1056,
      "end_line": 1056,
      "comment": "\n         * The input stream decompressing the data for shrunk and imploded entries.\n         "
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 1062,
      "end_line": 1135,
      "comment": "\n     * Bounded input stream adapted from commons-io\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1065,
      "end_line": 1065,
      "comment": " the wrapped input stream "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 1068,
      "end_line": 1068,
      "comment": " the max length to provide "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 1071,
      "end_line": 1071,
      "comment": " the number of bytes already returned "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.BoundedInputStream(java.io.InputStream, long)",
      "begin_line": 1080,
      "end_line": 1083,
      "comment": "\n         * Creates a new \u003ccode\u003eBoundedInputStream\u003c/code\u003e that wraps the given input\n         * stream and limits it to a certain size.\n         *\n         * @param in The wrapped input stream\n         * @param size The maximum number of bytes to return\n         ",
      "child_ranges": [
        "(line 1081,col 13)-(line 1081,col 28)",
        "(line 1082,col 13)-(line 1082,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read()",
      "begin_line": 1085,
      "end_line": 1095,
      "comment": "",
      "child_ranges": [
        "(line 1087,col 13)-(line 1089,col 13)",
        "(line 1090,col 13)-(line 1090,col 41)",
        "(line 1091,col 13)-(line 1091,col 18)",
        "(line 1092,col 13)-(line 1092,col 21)",
        "(line 1093,col 13)-(line 1093,col 42)",
        "(line 1094,col 13)-(line 1094,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[])",
      "begin_line": 1097,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 13)-(line 1099,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1102,
      "end_line": 1118,
      "comment": "",
      "child_ranges": [
        "(line 1104,col 13)-(line 1106,col 13)",
        "(line 1107,col 13)-(line 1107,col 75)",
        "(line 1108,col 13)-(line 1108,col 65)",
        "(line 1110,col 13)-(line 1112,col 13)",
        "(line 1114,col 13)-(line 1114,col 29)",
        "(line 1115,col 13)-(line 1115,col 29)",
        "(line 1116,col 13)-(line 1116,col 53)",
        "(line 1117,col 13)-(line 1117,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.skip(long)",
      "begin_line": 1120,
      "end_line": 1126,
      "comment": "",
      "child_ranges": [
        "(line 1122,col 13)-(line 1122,col 70)",
        "(line 1123,col 13)-(line 1123,col 54)",
        "(line 1124,col 13)-(line 1124,col 32)",
        "(line 1125,col 13)-(line 1125,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.available()",
      "begin_line": 1128,
      "end_line": 1134,
      "comment": "",
      "child_ranges": [
        "(line 1130,col 13)-(line 1132,col 13)",
        "(line 1133,col 13)-(line 1133,col 34)"
      ]
    }
  ]
}