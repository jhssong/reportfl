{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 59,
      "end_line": 1080,
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
      "begin_line": 67,
      "end_line": 67,
      "comment": " Whether to look for and use Unicode extra fields. "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Wrapped stream, will always be a PushbackInputStream. "
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Inflater used for all deflated entries. "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Buffer used to read from the wrapped stream. "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The entry that is currently being read. "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Whether the stream has been closed. "
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Whether the stream has reached the central directory - and thus found all entries. "
    },
    {
      "type": "field",
      "varNames": [
        "lastStoredEntry"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * When reading a stored entry that uses the data descriptor this\n     * stream has to read the full entry and caches it.  This is the\n     * cache.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Whether the stream will try to read STORED entries that use a data descriptor. "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_LEN"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LEN"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_EXP_32"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_BUF"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " cached buffers - must only be used locally in the class (COMPRESS-172 - reduce garbage collection)"
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_BUF"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT_BUF"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD_BUF"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_DWORD_BUF"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entriesRead"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Create an instance using UTF-8 encoding\n     * @param inputStream the stream to wrap\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 157,
      "end_line": 159,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean, boolean)",
      "begin_line": 180,
      "end_line": 191,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     * @param allowStoredEntriesWithDataDescriptor whether the stream\n     * will try to read STORED entries that use a data descriptor\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 65)",
        "(line 185,col 9)-(line 185,col 59)",
        "(line 186,col 9)-(line 186,col 66)",
        "(line 187,col 9)-(line 188,col 49)",
        "(line 190,col 9)-(line 190,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 193,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 34)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 215,col 9)",
        "(line 217,col 9)-(line 217,col 43)",
        "(line 218,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 23)",
        "(line 227,col 9)-(line 227,col 37)",
        "(line 229,col 9)-(line 229,col 60)",
        "(line 230,col 9)-(line 230,col 21)",
        "(line 231,col 9)-(line 231,col 95)",
        "(line 233,col 9)-(line 233,col 79)",
        "(line 234,col 9)-(line 234,col 62)",
        "(line 235,col 9)-(line 235,col 106)",
        "(line 236,col 9)-(line 236,col 64)",
        "(line 237,col 9)-(line 237,col 51)",
        "(line 239,col 9)-(line 239,col 21)",
        "(line 241,col 9)-(line 241,col 65)",
        "(line 242,col 9)-(line 242,col 21)",
        "(line 244,col 9)-(line 244,col 74)",
        "(line 245,col 9)-(line 245,col 36)",
        "(line 246,col 9)-(line 246,col 20)",
        "(line 248,col 9)-(line 248,col 42)",
        "(line 249,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 58)",
        "(line 264,col 9)-(line 264,col 21)",
        "(line 266,col 9)-(line 266,col 55)",
        "(line 267,col 9)-(line 267,col 21)",
        "(line 269,col 9)-(line 269,col 48)",
        "(line 270,col 9)-(line 270,col 28)",
        "(line 271,col 9)-(line 271,col 72)",
        "(line 273,col 9)-(line 273,col 46)",
        "(line 274,col 9)-(line 274,col 29)",
        "(line 275,col 9)-(line 275,col 42)",
        "(line 277,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 281,col 39)",
        "(line 283,col 9)-(line 292,col 9)",
        "(line 294,col 9)-(line 294,col 22)",
        "(line 295,col 9)-(line 295,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(byte[])",
      "begin_line": 303,
      "end_line": 318,
      "comment": "\n     * Fills the given array with the first local file header and\n     * deals with splitting/spanning markers that may prefix the first\n     * LFH.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 23)",
        "(line 305,col 9)-(line 305,col 39)",
        "(line 306,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 317,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 325,
      "end_line": 340,
      "comment": "\n     * Records whether a Zip64 extra is present and sets the size\n     * information from it if sizes are 0xFFFFFFFF and the entry\n     * doesn\u0027t use a data descriptor.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 328,col 86)",
        "(line 329,col 9)-(line 329,col 40)",
        "(line 330,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 342,
      "end_line": 345,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 354,
      "end_line": 363,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 365,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 376,col 9)-(line 378,col 9)",
        "(line 380,col 9)-(line 380,col 54)",
        "(line 381,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 17)",
        "(line 387,col 9)-(line 397,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 403,col 9)-(line 403,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(byte[], int, int)",
      "begin_line": 409,
      "end_line": 443,
      "comment": "\n     * Implementation of read for STORED entries.\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 45)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 423,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 435,col 55)",
        "(line 436,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 40)",
        "(line 441,col 9)-(line 441,col 36)",
        "(line 442,col 9)-(line 442,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(byte[], int, int)",
      "begin_line": 448,
      "end_line": 462,
      "comment": "\n     * Implementation of read for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 60)",
        "(line 450,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater(byte[], int, int)",
      "begin_line": 468,
      "end_line": 488,
      "comment": "\n     * Potentially reads more bytes to fill the inflater\u0027s buffer and\n     * reads from it.\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 21)",
        "(line 470,col 9)-(line 486,col 48)",
        "(line 487,col 9)-(line 487,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 490,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 496,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 514,
      "end_line": 529,
      "comment": "\n     * Skips over and discards value bytes of data from this input\n     * stream.\n     *\n     * \u003cp\u003eThis implementation may end up skipping over some smaller\n     * number of bytes, possibly 0, if and only if it reaches the end\n     * of the underlying stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual number of bytes skipped is returned.\u003c/p\u003e\n     *\n     * @param value the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException - if an I/O error occurs.\n     * @throws IllegalArgumentException - if value is negative.\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 540,
      "end_line": 549,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     *\n     * @param signature the bytes to check\n     * @param length    the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 543,col 9)",
        "(line 545,col 9)-(line 548,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 551,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 578,
      "end_line": 614,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 587,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 608,col 9)",
        "(line 610,col 9)-(line 610,col 20)",
        "(line 611,col 9)-(line 611,col 27)",
        "(line 612,col 9)-(line 612,col 23)",
        "(line 613,col 9)-(line 613,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData()",
      "begin_line": 620,
      "end_line": 631,
      "comment": "\n     * Read all data of the current entry from the underlying stream\n     * that hasn\u0027t been read, yet.\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 89)",
        "(line 622,col 9)-(line 630,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated()",
      "begin_line": 648,
      "end_line": 656,
      "comment": "\n     * Get the number of bytes Inflater has actually processed.\n     *\n     * \u003cp\u003efor Java \u0026lt; Java7 the getBytes* methods in\n     * Inflater/Deflater seem to return unsigned ints rather than\n     * longs that start over with 0 at 2^32.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream knows how many bytes it has read, but not how\n     * many the Inflater actually consumed - it should be between the\n     * total number of bytes read for the entry and the total number\n     * minus the last read operation.  Here we just try to make the\n     * value close enough to the bytes we\u0027ve read by assuming the\n     * number of bytes consumed must be smaller than (or equal to) the\n     * number of bytes read but not smaller by more than 2^32.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 38)",
        "(line 650,col 9)-(line 654,col 9)",
        "(line 655,col 9)-(line 655,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 658,
      "end_line": 669,
      "comment": "",
      "child_ranges": [
        "(line 659,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 662,col 42)",
        "(line 663,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 668,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 671,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 672,col 9)-(line 672,col 45)",
        "(line 673,col 9)-(line 673,col 21)",
        "(line 674,col 9)-(line 676,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 679,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 28)",
        "(line 681,col 9)-(line 681,col 44)",
        "(line 682,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 687,col 45)",
        "(line 700,col 9)-(line 700,col 33)",
        "(line 701,col 9)-(line 701,col 65)",
        "(line 702,col 9)-(line 709,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 719,
      "end_line": 724,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 720,col 9)-(line 723,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 743,
      "end_line": 772,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 64)",
        "(line 745,col 9)-(line 745,col 20)",
        "(line 746,col 9)-(line 746,col 29)",
        "(line 749,col 9)-(line 749,col 68)",
        "(line 751,col 9)-(line 768,col 9)",
        "(line 770,col 9)-(line 770,col 37)",
        "(line 771,col 9)-(line 771,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH"
      ],
      "begin_line": 774,
      "end_line": 774,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH"
      ],
      "begin_line": 775,
      "end_line": 775,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DD"
      ],
      "begin_line": 776,
      "end_line": 776,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 786,
      "end_line": 816,
      "comment": "\n     * Checks whether the current buffer contains the signature of a\n     * \u0026quot;data descriptor\u0026quot;, \u0026quot;local file header\u0026quot; or\n     * \u0026quot;central directory entry\u0026quot;.\n     *\n     * \u003cp\u003eIf it contains such a signature, reads the data descriptor\n     * and positions the stream right after the data descriptor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 789,col 9)-(line 789,col 29)",
        "(line 790,col 9)-(line 790,col 28)",
        "(line 791,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 827,
      "end_line": 837,
      "comment": "\n     * If the last read bytes could hold a data descriptor and an\n     * incomplete signature then save the last bytes to the front of\n     * the buffer and cache everything in front of the potential data\n     * descriptor into the given ByteArrayOutputStream.\n     *\n     * \u003cp\u003eData descriptor plus incomplete signature (3 bytes in the\n     * worst case) can be 20 bytes max.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 67)",
        "(line 829,col 9)-(line 835,col 9)",
        "(line 836,col 9)-(line 836,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(byte[], int, int)",
      "begin_line": 839,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 840,col 9)-(line 840,col 63)",
        "(line 841,col 9)-(line 841,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive()",
      "begin_line": 865,
      "end_line": 875,
      "comment": "\n     * Reads the stream until it find the \"End of central directory\n     * record\" and consumes it as well.\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 869,col 50)",
        "(line 870,col 9)-(line 870,col 25)",
        "(line 871,col 9)-(line 871,col 89)",
        "(line 872,col 9)-(line 872,col 29)",
        "(line 874,col 9)-(line 874,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord()",
      "begin_line": 881,
      "end_line": 912,
      "comment": "\n     * Reads forward until the signature of the \u0026quot;End of central\n     * directory\u0026quot; record is found.\n     ",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 29)",
        "(line 883,col 9)-(line 883,col 37)",
        "(line 884,col 9)-(line 911,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(long)",
      "begin_line": 921,
      "end_line": 936,
      "comment": "\n     * Skips bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link\n     * #skip} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 922,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 935,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte()",
      "begin_line": 944,
      "end_line": 950,
      "comment": "\n     * Reads bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link #read} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 945,col 9)-(line 945,col 26)",
        "(line 946,col 9)-(line 948,col 9)",
        "(line 949,col 9)-(line 949,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.isFirstByteOfEocdSig(int)",
      "begin_line": 952,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 960,
      "end_line": 1001,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 965,
      "end_line": 965,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 970,
      "end_line": 970,
      "comment": "\n         * Does the entry use a data descriptor?\n         "
    },
    {
      "type": "field",
      "varNames": [
        "usesZip64"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": "\n         * Does the entry have a ZIP64 extended information extra field.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 981,
      "end_line": 981,
      "comment": "\n         * Number of bytes of entry content read by the client if the\n         * entry is STORED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 990,
      "end_line": 990,
      "comment": "\n         * Number of bytes of entry content read so from the stream.\n         *\n         * \u003cp\u003eThis may be more than the actual entry\u0027s length as some\n         * stuff gets buffered up and needs to be pushed back when the\n         * end of the entry has been reached.\u003c/p\u003e\n         "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 995,
      "end_line": 995,
      "comment": "\n         * The checksum calculated as the current entry is read.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1000,
      "end_line": 1000,
      "comment": "\n         * The input stream decompressing the data for shrunk and imploded entries.\n         "
    },
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 1006,
      "end_line": 1079,
      "comment": "\n     * Bounded input stream adapted from commons-io\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 1009,
      "end_line": 1009,
      "comment": " the wrapped input stream "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 1012,
      "end_line": 1012,
      "comment": " the max length to provide "
    },
    {
      "type": "field",
      "varNames": [
        "pos"
      ],
      "begin_line": 1015,
      "end_line": 1015,
      "comment": " the number of bytes already returned "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.BoundedInputStream(java.io.InputStream, long)",
      "begin_line": 1024,
      "end_line": 1027,
      "comment": "\n         * Creates a new \u003ccode\u003eBoundedInputStream\u003c/code\u003e that wraps the given input\n         * stream and limits it to a certain size.\n         *\n         * @param in The wrapped input stream\n         * @param size The maximum number of bytes to return\n         ",
      "child_ranges": [
        "(line 1025,col 13)-(line 1025,col 28)",
        "(line 1026,col 13)-(line 1026,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read()",
      "begin_line": 1029,
      "end_line": 1039,
      "comment": "",
      "child_ranges": [
        "(line 1031,col 13)-(line 1033,col 13)",
        "(line 1034,col 13)-(line 1034,col 41)",
        "(line 1035,col 13)-(line 1035,col 18)",
        "(line 1036,col 13)-(line 1036,col 21)",
        "(line 1037,col 13)-(line 1037,col 42)",
        "(line 1038,col 13)-(line 1038,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[])",
      "begin_line": 1041,
      "end_line": 1044,
      "comment": "",
      "child_ranges": [
        "(line 1043,col 13)-(line 1043,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 1046,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1048,col 13)-(line 1050,col 13)",
        "(line 1051,col 13)-(line 1051,col 75)",
        "(line 1052,col 13)-(line 1052,col 65)",
        "(line 1054,col 13)-(line 1056,col 13)",
        "(line 1058,col 13)-(line 1058,col 29)",
        "(line 1059,col 13)-(line 1059,col 29)",
        "(line 1060,col 13)-(line 1060,col 53)",
        "(line 1061,col 13)-(line 1061,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.skip(long)",
      "begin_line": 1064,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1066,col 13)-(line 1066,col 70)",
        "(line 1067,col 13)-(line 1067,col 54)",
        "(line 1068,col 13)-(line 1068,col 32)",
        "(line 1069,col 13)-(line 1069,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.BoundedInputStream.available()",
      "begin_line": 1072,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1074,col 13)-(line 1076,col 13)",
        "(line 1077,col 13)-(line 1077,col 34)"
      ]
    }
  ]
}