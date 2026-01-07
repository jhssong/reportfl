{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 57,
      "end_line": 1037,
      "comment": "\n * Implements an input stream that can read Zip archives.\n *\n * \u003cp\u003eNote that {@link ZipArchiveEntry#getSize()} may return -1 if the\n * DEFLATE algorithm is used, as the size information is not available\n * from the header.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link ZipFile} class is preferred when reading from files.\u003c/p\u003e\n *\n * \u003cp\u003eAs of Apache Commons Compress it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * @see ZipFile\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Wrapped stream, will always be a PushbackInputStream.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Inflater used for all deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Calculates checkusms for all entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Buffer used to read from the wrapped stream.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * The entry that is currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Whether the stream has been closed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Whether the stream has reached the central directory - and thus\n     * found all entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lastStoredEntry"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * When reading a stored entry that uses the data descriptor this\n     * stream has to read the full entry and caches it.  This is the\n     * cache.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Whether the stream will try to read STORED entries that use a\n     * data descriptor.\n     "
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
      "begin_line": 161,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 180,
      "end_line": 184,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean, boolean)",
      "begin_line": 195,
      "end_line": 204,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     * @param allowStoredEntriesWithDataDescriptor whether the stream\n     * will try to read STORED entries that use a data descriptor\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 65)",
        "(line 200,col 9)-(line 200,col 59)",
        "(line 201,col 9)-(line 201,col 66)",
        "(line 202,col 9)-(line 203,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 206,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 34)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 230,col 43)",
        "(line 231,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 23)",
        "(line 240,col 9)-(line 240,col 37)",
        "(line 242,col 9)-(line 242,col 60)",
        "(line 243,col 9)-(line 243,col 21)",
        "(line 244,col 9)-(line 245,col 57)",
        "(line 247,col 9)-(line 247,col 79)",
        "(line 248,col 9)-(line 248,col 62)",
        "(line 249,col 9)-(line 250,col 76)",
        "(line 251,col 9)-(line 251,col 64)",
        "(line 252,col 9)-(line 252,col 51)",
        "(line 254,col 9)-(line 254,col 21)",
        "(line 256,col 9)-(line 256,col 65)",
        "(line 257,col 9)-(line 257,col 21)",
        "(line 259,col 9)-(line 259,col 74)",
        "(line 260,col 9)-(line 260,col 36)",
        "(line 261,col 9)-(line 261,col 20)",
        "(line 263,col 9)-(line 263,col 42)",
        "(line 264,col 9)-(line 275,col 9)",
        "(line 277,col 9)-(line 277,col 58)",
        "(line 279,col 9)-(line 279,col 21)",
        "(line 281,col 9)-(line 281,col 55)",
        "(line 282,col 9)-(line 282,col 21)",
        "(line 284,col 9)-(line 284,col 48)",
        "(line 285,col 9)-(line 285,col 28)",
        "(line 286,col 9)-(line 286,col 72)",
        "(line 288,col 9)-(line 288,col 46)",
        "(line 289,col 9)-(line 289,col 29)",
        "(line 290,col 9)-(line 290,col 42)",
        "(line 292,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 39)",
        "(line 298,col 9)-(line 298,col 22)",
        "(line 299,col 9)-(line 299,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFirstLocalFileHeader(byte[])",
      "begin_line": 307,
      "end_line": 323,
      "comment": "\n     * Fills the given array with the first local file header and\n     * deals with splitting/spanning markers that may prefix the first\n     * LFH.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 23)",
        "(line 309,col 9)-(line 309,col 39)",
        "(line 310,col 9)-(line 314,col 9)",
        "(line 315,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 330,
      "end_line": 349,
      "comment": "\n     * Records whether a Zip64 extra is present and sets the size\n     * information from it if sizes are 0xFFFFFFFF and the entry\n     * doesn\u0027t use a data descriptor.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 334,col 52)",
        "(line 335,col 9)-(line 335,col 40)",
        "(line 336,col 9)-(line 348,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 352,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 364,
      "end_line": 373,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 375,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 382,col 9)",
        "(line 385,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 400,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(byte[], int, int)",
      "begin_line": 406,
      "end_line": 441,
      "comment": "\n     * Implementation of read for STORED entries.\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 414,col 9)",
        "(line 416,col 9)-(line 416,col 45)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 428,col 9)",
        "(line 430,col 9)-(line 430,col 79)",
        "(line 431,col 9)-(line 431,col 62)",
        "(line 432,col 9)-(line 435,col 9)",
        "(line 436,col 9)-(line 436,col 77)",
        "(line 437,col 9)-(line 437,col 37)",
        "(line 438,col 9)-(line 438,col 36)",
        "(line 439,col 9)-(line 439,col 42)",
        "(line 440,col 9)-(line 440,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(byte[], int, int)",
      "begin_line": 446,
      "end_line": 462,
      "comment": "\n     * Implementation of read for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 59)",
        "(line 449,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 40)",
        "(line 461,col 9)-(line 461,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFromInflater(byte[], int, int)",
      "begin_line": 468,
      "end_line": 487,
      "comment": "\n     * Potentially reads more bytes to fill the inflater\u0027s buffer and\n     * reads from it.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 21)",
        "(line 471,col 9)-(line 485,col 48)",
        "(line 486,col 9)-(line 486,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 489,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 495,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 513,
      "end_line": 530,
      "comment": "\n     * Skips over and discards value bytes of data from this input\n     * stream.\n     *\n     * \u003cp\u003eThis implementation may end up skipping over some smaller\n     * number of bytes, possibly 0, if and only if it reaches the end\n     * of the underlying stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual number of bytes skipped is returned.\u003c/p\u003e\n     *\n     * @param value the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException - if an I/O error occurs.\n     * @throws IllegalArgumentException - if value is negative.\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 543,
      "end_line": 553,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 546,col 9)",
        "(line 548,col 9)-(line 552,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 555,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 561,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 582,
      "end_line": 620,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 588,col 9)",
        "(line 591,col 9)-(line 609,col 9)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 615,col 20)",
        "(line 616,col 9)-(line 616,col 20)",
        "(line 617,col 9)-(line 617,col 20)",
        "(line 618,col 9)-(line 618,col 23)",
        "(line 619,col 9)-(line 619,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData()",
      "begin_line": 626,
      "end_line": 640,
      "comment": "\n     * Read all data of the current entry from the underlying stream\n     * that hasn\u0027t been read, yet.\n     ",
      "child_ranges": [
        "(line 627,col 9)-(line 628,col 42)",
        "(line 629,col 9)-(line 639,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated()",
      "begin_line": 657,
      "end_line": 665,
      "comment": "\n     * Get the number of bytes Inflater has actually processed.\n     *\n     * \u003cp\u003efor Java \u0026lt; Java7 the getBytes* methods in\n     * Inflater/Deflater seem to return unsigned ints rather than\n     * longs that start over with 0 at 2^32.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream knows how many bytes it has read, but not how\n     * many the Inflater actually consumed - it should be between the\n     * total number of bytes read for the entry and the total number\n     * minus the last read operation.  Here we just try to make the\n     * value close enough to the bytes we\u0027ve read by assuming the\n     * number of bytes consumed must be smaller than (or equal to) the\n     * number of bytes read but not smaller by more than 2^32.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 38)",
        "(line 659,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 667,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 668,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 674,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 677,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 678,col 9)-(line 678,col 29)",
        "(line 679,col 9)-(line 685,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 688,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 689,col 9)-(line 689,col 28)",
        "(line 690,col 9)-(line 690,col 44)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 696,col 45)",
        "(line 709,col 9)-(line 709,col 33)",
        "(line 710,col 9)-(line 710,col 65)",
        "(line 711,col 9)-(line 722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 732,
      "end_line": 736,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 735,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 755,
      "end_line": 785,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 64)",
        "(line 757,col 9)-(line 757,col 20)",
        "(line 758,col 9)-(line 758,col 29)",
        "(line 761,col 9)-(line 761,col 68)",
        "(line 763,col 9)-(line 781,col 9)",
        "(line 783,col 9)-(line 783,col 37)",
        "(line 784,col 9)-(line 784,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH"
      ],
      "begin_line": 787,
      "end_line": 787,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH"
      ],
      "begin_line": 788,
      "end_line": 788,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DD"
      ],
      "begin_line": 789,
      "end_line": 789,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 799,
      "end_line": 831,
      "comment": "\n     * Checks whether the current buffer contains the signature of a\n     * \u0026quot;data decsriptor\u0026quot;, \u0026quot;local file header\u0026quot; or\n     * \u0026quot;central directory entry\u0026quot;.\n     *\n     * \u003cp\u003eIf it contains such a signature, reads the data descriptor\n     * and positions the stream right after the data descriptor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 29)",
        "(line 804,col 9)-(line 804,col 28)",
        "(line 805,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 842,
      "end_line": 854,
      "comment": "\n     * If the last read bytes could hold a data descriptor and an\n     * incomplete signature then save the last bytes to the front of\n     * the buffer and cache everything in front of the potential data\n     * descriptor into the given ByteArrayOutputStream.\n     *\n     * \u003cp\u003eData descriptor plus incomplete signature (3 bytes in the\n     * worst case) can be 20 bytes max.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 67)",
        "(line 845,col 9)-(line 852,col 9)",
        "(line 853,col 9)-(line 853,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(byte[], int, int)",
      "begin_line": 856,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 858,col 9)-(line 858,col 63)",
        "(line 859,col 9)-(line 859,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skipRemainderOfArchive()",
      "begin_line": 883,
      "end_line": 894,
      "comment": "\n     * Reads the stream until it find the \"End of central directory\n     * record\" and consumes it as well.\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 50)",
        "(line 888,col 9)-(line 888,col 25)",
        "(line 889,col 9)-(line 890,col 67)",
        "(line 891,col 9)-(line 891,col 29)",
        "(line 893,col 9)-(line 893,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.findEocdRecord()",
      "begin_line": 900,
      "end_line": 931,
      "comment": "\n     * Reads forward until the signature of the \u0026quot;End of central\n     * directory\u0026quot; recod is found.\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 29)",
        "(line 902,col 9)-(line 902,col 37)",
        "(line 903,col 9)-(line 930,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.realSkip(long)",
      "begin_line": 940,
      "end_line": 957,
      "comment": "\n     * Skips bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link\n     * #skip} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 941,col 9)-(line 955,col 9)",
        "(line 956,col 9)-(line 956,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readOneByte()",
      "begin_line": 966,
      "end_line": 972,
      "comment": "\n     * Reads bytes by reading from the underlying stream rather than\n     * the (potentially inflating) archive stream - which {@link\n     * #read} would do.\n     *\n     * Also updates bytes-read counter.\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 967,col 26)",
        "(line 968,col 9)-(line 970,col 9)",
        "(line 971,col 9)-(line 971,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.isFirstByteOfEocdSig(int)",
      "begin_line": 974,
      "end_line": 976,
      "comment": "",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 55)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 982,
      "end_line": 1008,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 986,
      "end_line": 986,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 990,
      "end_line": 990,
      "comment": "\n         * Does the entry use a data descriptor?\n         "
    },
    {
      "type": "field",
      "varNames": [
        "usesZip64"
      ],
      "begin_line": 994,
      "end_line": 994,
      "comment": "\n         * Does the entry have a ZIP64 extended information extra field.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 999,
      "end_line": 999,
      "comment": "\n         * Number of bytes of entry content read by the client if the\n         * entry is STORED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 1007,
      "end_line": 1007,
      "comment": "\n         * Number of bytes of entry content read so from the stream.\n         *\n         * \u003cp\u003eThis may be more than the actual entry\u0027s length as some\n         * stuff gets buffered up and needs to be pushed back when the\n         * end of the entry has been reached.\u003c/p\u003e\n         "
    },
    {
      "type": "class_interface",
      "name": "Buffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1015,
      "end_line": 1036,
      "comment": "\n     * Contains a temporary buffer used to read from the wrapped\n     * stream together with some information needed for internal\n     * housekeeping.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 1019,
      "end_line": 1019,
      "comment": "\n         * Buffer used as temporary buffer when reading from the stream.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "offsetInBuffer"
      ],
      "begin_line": 1024,
      "end_line": 1024,
      "comment": "\n         * {@link #buf buf} may contain data the client hasnt read, yet,\n         * this is the first byte that hasn\u0027t been read so far.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "lengthOfLastRead"
      ],
      "begin_line": 1029,
      "end_line": 1029,
      "comment": "\n         * Number of bytes read from the wrapped stream into {@link #buf\n         * buf} with the last read operation.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.Buffer.reset()",
      "begin_line": 1033,
      "end_line": 1035,
      "comment": "\n         * Reset internal housekeeping.\n         ",
      "child_ranges": [
        "(line 1034,col 13)-(line 1034,col 50)"
      ]
    }
  ]
}