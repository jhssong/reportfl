{
  "filepath": "/tmp/Compress-18b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 57,
      "end_line": 834,
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
        "TWO_EXP_32"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 50)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String)",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 42)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 150,
      "end_line": 154,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean, boolean)",
      "begin_line": 165,
      "end_line": 174,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     * @param allowStoredEntriesWithDataDescriptor whether the stream\n     * will try to read STORED entries that use a data descriptor\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 65)",
        "(line 170,col 9)-(line 170,col 59)",
        "(line 171,col 9)-(line 171,col 66)",
        "(line 172,col 9)-(line 173,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 176,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 39)",
        "(line 184,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 39)",
        "(line 190,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 198,col 9)-(line 198,col 23)",
        "(line 199,col 9)-(line 199,col 37)",
        "(line 201,col 9)-(line 201,col 56)",
        "(line 202,col 9)-(line 202,col 21)",
        "(line 203,col 9)-(line 204,col 57)",
        "(line 206,col 9)-(line 206,col 75)",
        "(line 207,col 9)-(line 207,col 62)",
        "(line 208,col 9)-(line 209,col 76)",
        "(line 210,col 9)-(line 210,col 64)",
        "(line 211,col 9)-(line 211,col 51)",
        "(line 213,col 9)-(line 213,col 21)",
        "(line 215,col 9)-(line 215,col 61)",
        "(line 216,col 9)-(line 216,col 21)",
        "(line 218,col 9)-(line 218,col 70)",
        "(line 219,col 9)-(line 219,col 36)",
        "(line 220,col 9)-(line 220,col 20)",
        "(line 222,col 9)-(line 222,col 42)",
        "(line 223,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 54)",
        "(line 238,col 9)-(line 238,col 21)",
        "(line 240,col 9)-(line 240,col 51)",
        "(line 241,col 9)-(line 241,col 21)",
        "(line 243,col 9)-(line 243,col 48)",
        "(line 244,col 9)-(line 244,col 28)",
        "(line 245,col 9)-(line 245,col 72)",
        "(line 247,col 9)-(line 247,col 46)",
        "(line 248,col 9)-(line 248,col 29)",
        "(line 249,col 9)-(line 249,col 42)",
        "(line 251,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 39)",
        "(line 257,col 9)-(line 257,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 265,
      "end_line": 283,
      "comment": "\n     * Records whether a Zip64 extra is present and sets the size\n     * information from it if sizes are 0xFFFFFFFF and the entry\n     * doesn\u0027t use a data descriptor.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 269,col 52)",
        "(line 270,col 9)-(line 270,col 40)",
        "(line 271,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 286,
      "end_line": 289,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 298,
      "end_line": 307,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 309,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 319,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(byte[], int, int)",
      "begin_line": 340,
      "end_line": 376,
      "comment": "\n     * Implementation of read for STORED entries.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 350,col 45)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 355,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 366,col 21)",
        "(line 367,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 77)",
        "(line 372,col 9)-(line 372,col 37)",
        "(line 373,col 9)-(line 373,col 36)",
        "(line 374,col 9)-(line 374,col 42)",
        "(line 375,col 9)-(line 375,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(byte[], int, int)",
      "begin_line": 381,
      "end_line": 404,
      "comment": "\n     * Implementation of read for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 21)",
        "(line 390,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 40)",
        "(line 403,col 9)-(line 403,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 406,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 412,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 430,
      "end_line": 446,
      "comment": "\n     * Skips over and discards value bytes of data from this input\n     * stream.\n     *\n     * \u003cp\u003eThis implementation may end up skipping over some smaller\n     * number of bytes, possibly 0, if and only if it reaches the end\n     * of the underlying stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual number of bytes skipped is returned.\u003c/p\u003e\n     *\n     * @param value the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException - if an I/O error occurs.\n     * @throws IllegalArgumentException - if value is negative.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 459,
      "end_line": 466,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 465,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 468,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 495,
      "end_line": 533,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 499,col 9)-(line 501,col 9)",
        "(line 504,col 9)-(line 522,col 9)",
        "(line 524,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 528,col 20)",
        "(line 529,col 9)-(line 529,col 20)",
        "(line 530,col 9)-(line 530,col 20)",
        "(line 531,col 9)-(line 531,col 23)",
        "(line 532,col 9)-(line 532,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData()",
      "begin_line": 539,
      "end_line": 553,
      "comment": "\n     * Read all data of the current entry from the underlying stream\n     * that hasn\u0027t been read, yet.\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 541,col 42)",
        "(line 542,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated()",
      "begin_line": 570,
      "end_line": 578,
      "comment": "\n     * Get the number of bytes Inflater has actually processed.\n     *\n     * \u003cp\u003efor Java \u0026lt; Java7 the getBytes* methods in\n     * Inflater/Deflater seem to return unsigned ints rather than\n     * longs that start over with 0 at 2^32.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream knows how many bytes it has read, but not how\n     * many the Inflater actually consumed - it should be between the\n     * total number of bytes read for the entry and the total number\n     * minus the last read operation.  Here we just try to make the\n     * value close enough to the bytes we\u0027ve read by assuming the\n     * number of bytes consumed must be smaller than (or equal to) the\n     * number of bytes read but not smaller by more than 2^32.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 38)",
        "(line 572,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 577,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 580,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 587,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 590,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 29)",
        "(line 592,col 9)-(line 598,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 601,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 34)",
        "(line 603,col 9)-(line 603,col 21)",
        "(line 604,col 9)-(line 604,col 37)",
        "(line 605,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 45)",
        "(line 623,col 9)-(line 623,col 32)",
        "(line 624,col 9)-(line 624,col 21)",
        "(line 625,col 9)-(line 625,col 53)",
        "(line 626,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 645,
      "end_line": 649,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 668,
      "end_line": 698,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 64)",
        "(line 670,col 9)-(line 670,col 20)",
        "(line 671,col 9)-(line 671,col 29)",
        "(line 674,col 9)-(line 674,col 68)",
        "(line 676,col 9)-(line 694,col 9)",
        "(line 696,col 9)-(line 696,col 37)",
        "(line 697,col 9)-(line 697,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH"
      ],
      "begin_line": 700,
      "end_line": 700,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH"
      ],
      "begin_line": 701,
      "end_line": 701,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DD"
      ],
      "begin_line": 702,
      "end_line": 702,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 712,
      "end_line": 744,
      "comment": "\n     * Checks whether the current buffer contains the signature of a\n     * \u0026quot;data decsriptor\u0026quot;, \u0026quot;local file header\u0026quot; or\n     * \u0026quot;central directory entry\u0026quot;.\n     *\n     * \u003cp\u003eIf it contains such a signature, reads the data descriptor\n     * and positions the stream right after the data descriptor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 29)",
        "(line 717,col 9)-(line 717,col 28)",
        "(line 718,col 9)-(line 742,col 9)",
        "(line 743,col 9)-(line 743,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 755,
      "end_line": 767,
      "comment": "\n     * If the last read bytes could hold a data descriptor and an\n     * incomplete signature then save the last bytes to the front of\n     * the buffer and cache everything in front of the potential data\n     * descriptor into the given ByteArrayOutputStream.\n     *\n     * \u003cp\u003eData descriptor plus incomplete signature (3 bytes in the\n     * worst case) can be 20 bytes max.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 67)",
        "(line 758,col 9)-(line 765,col 9)",
        "(line 766,col 9)-(line 766,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(byte[], int, int)",
      "begin_line": 769,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 63)",
        "(line 772,col 9)-(line 772,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 779,
      "end_line": 805,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 783,
      "end_line": 783,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 787,
      "end_line": 787,
      "comment": "\n         * Does the entry use a data descriptor?\n         "
    },
    {
      "type": "field",
      "varNames": [
        "usesZip64"
      ],
      "begin_line": 791,
      "end_line": 791,
      "comment": "\n         * Does the entry have a ZIP64 extended information extra field.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 796,
      "end_line": 796,
      "comment": "\n         * Number of bytes of entry content read by the client if the\n         * entry is STORED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 804,
      "end_line": 804,
      "comment": "\n         * Number of bytes of entry content read so from the stream.\n         *\n         * \u003cp\u003eThis may be more than the actual entry\u0027s length as some\n         * stuff gets buffered up and needs to be pushed back when the\n         * end of the entry has been reached.\u003c/p\u003e\n         "
    },
    {
      "type": "class_interface",
      "name": "Buffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 812,
      "end_line": 833,
      "comment": "\n     * Contains a temporary buffer used to read from the wrapped\n     * stream together with some information needed for internal\n     * housekeeping.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 816,
      "end_line": 816,
      "comment": "\n         * Buffer used as temporary buffer when reading from the stream.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "offsetInBuffer"
      ],
      "begin_line": 821,
      "end_line": 821,
      "comment": "\n         * {@link #buf buf} may contain data the client hasnt read, yet,\n         * this is the first byte that hasn\u0027t been read so far.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "lengthOfLastRead"
      ],
      "begin_line": 826,
      "end_line": 826,
      "comment": "\n         * Number of bytes read from the wrapped stream into {@link #buf\n         * buf} with the last read operation.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.Buffer.reset()",
      "begin_line": 830,
      "end_line": 832,
      "comment": "\n         * Reset internal housekeeping.\n         ",
      "child_ranges": [
        "(line 831,col 13)-(line 831,col 50)"
      ]
    }
  ]
}