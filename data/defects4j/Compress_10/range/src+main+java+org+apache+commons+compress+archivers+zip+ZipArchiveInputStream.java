{
  "filepath": "/tmp/Compress-10b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 56,
      "end_line": 824,
      "comment": "\n * Implements an input stream that can read Zip archives.\n *\n * \u003cp\u003eNote that {@link ZipArchiveEntry#getSize()} may return -1 if the\n * DEFLATE algorithm is used, as the size information is not available\n * from the header.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link ZipFile} class is preferred when reading from files.\u003c/p\u003e\n *\n * \u003cp\u003eAs of Apache Commons Compress it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries.\u003c/p\u003e\n *\n * @see ZipFile\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Wrapped stream, will always be a PushbackInputStream.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Inflater used for all deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Calculates checkusms for all entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Buffer used to read from the wrapped stream.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * The entry that is currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Whether the stream has been closed.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Whether the stream has reached the central directory - and thus\n     * found all entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "lastStoredEntry"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * When reading a stored entry that uses the data descriptor this\n     * stream has to read the full entry and caches it.  This is the\n     * cache.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * Whether the stream will try to read STORED entries that use a\n     * data descriptor.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LFH_LEN"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TWO_EXP_32"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 140,
      "end_line": 144,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean, boolean)",
      "begin_line": 155,
      "end_line": 164,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     * @param allowStoredEntriesWithDataDescriptor whether the stream\n     * will try to read STORED entries that use a data descriptor\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 65)",
        "(line 160,col 9)-(line 160,col 59)",
        "(line 161,col 9)-(line 161,col 66)",
        "(line 162,col 9)-(line 163,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 166,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 167,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 39)",
        "(line 174,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 39)",
        "(line 180,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 23)",
        "(line 189,col 9)-(line 189,col 37)",
        "(line 191,col 9)-(line 191,col 56)",
        "(line 192,col 9)-(line 192,col 21)",
        "(line 193,col 9)-(line 194,col 57)",
        "(line 196,col 9)-(line 196,col 75)",
        "(line 197,col 9)-(line 197,col 62)",
        "(line 198,col 9)-(line 199,col 76)",
        "(line 200,col 9)-(line 200,col 64)",
        "(line 201,col 9)-(line 201,col 51)",
        "(line 203,col 9)-(line 203,col 21)",
        "(line 205,col 9)-(line 205,col 61)",
        "(line 206,col 9)-(line 206,col 21)",
        "(line 208,col 9)-(line 208,col 70)",
        "(line 209,col 9)-(line 209,col 36)",
        "(line 210,col 9)-(line 210,col 20)",
        "(line 212,col 9)-(line 212,col 42)",
        "(line 213,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 54)",
        "(line 228,col 9)-(line 228,col 21)",
        "(line 230,col 9)-(line 230,col 51)",
        "(line 231,col 9)-(line 231,col 21)",
        "(line 233,col 9)-(line 233,col 48)",
        "(line 234,col 9)-(line 234,col 28)",
        "(line 235,col 9)-(line 235,col 72)",
        "(line 237,col 9)-(line 237,col 46)",
        "(line 238,col 9)-(line 238,col 29)",
        "(line 239,col 9)-(line 239,col 42)",
        "(line 241,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 39)",
        "(line 247,col 9)-(line 247,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.processZip64Extra(org.apache.commons.compress.archivers.zip.ZipLong, org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 255,
      "end_line": 273,
      "comment": "\n     * Records whether a Zip64 extra is present and sets the size\n     * information from it if sizes are 0xFFFFFFFF and the entry\n     * doesn\u0027t use a data descriptor.\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 259,col 52)",
        "(line 260,col 9)-(line 260,col 40)",
        "(line 261,col 9)-(line 272,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 276,
      "end_line": 279,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 288,
      "end_line": 297,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 299,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 309,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStored(byte[], int, int)",
      "begin_line": 330,
      "end_line": 366,
      "comment": "\n     * Implementation of read for STORED entries.\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 338,col 9)",
        "(line 340,col 9)-(line 340,col 45)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 356,col 21)",
        "(line 357,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 77)",
        "(line 362,col 9)-(line 362,col 37)",
        "(line 363,col 9)-(line 363,col 36)",
        "(line 364,col 9)-(line 364,col 42)",
        "(line 365,col 9)-(line 365,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDeflated(byte[], int, int)",
      "begin_line": 371,
      "end_line": 394,
      "comment": "\n     * Implementation of read for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 379,col 21)",
        "(line 380,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 40)",
        "(line 393,col 9)-(line 393,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 396,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 402,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 420,
      "end_line": 436,
      "comment": "\n     * Skips over and discards value bytes of data from this input\n     * stream.\n     *\n     * \u003cp\u003eThis implementation may end up skipping over some smaller\n     * number of bytes, possibly 0, if and only if it reaches the end\n     * of the underlying stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe actual number of bytes skipped is returned.\u003c/p\u003e\n     *\n     * @param value the number of bytes to be skipped.\n     * @return the actual number of bytes skipped.\n     * @throws IOException - if an I/O error occurs.\n     * @throws IllegalArgumentException - if value is negative.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 449,
      "end_line": 456,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 455,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 458,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 459,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 485,
      "end_line": 523,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 491,col 9)",
        "(line 494,col 9)-(line 512,col 9)",
        "(line 514,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 518,col 20)",
        "(line 519,col 9)-(line 519,col 20)",
        "(line 520,col 9)-(line 520,col 20)",
        "(line 521,col 9)-(line 521,col 23)",
        "(line 522,col 9)-(line 522,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.drainCurrentEntryData()",
      "begin_line": 529,
      "end_line": 543,
      "comment": "\n     * Read all data of the current entry from the underlying stream\n     * that hasn\u0027t been read, yet.\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 531,col 42)",
        "(line 532,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getBytesInflated()",
      "begin_line": 560,
      "end_line": 568,
      "comment": "\n     * Get the number of bytes Inflater has actually processed.\n     *\n     * \u003cp\u003efor Java \u0026lt; Java7 the getBytes* methods in\n     * Inflater/Deflater seem to return unsigned ints rather than\n     * longs that start over with 0 at 2^32.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream knows how many bytes it has read, but not how\n     * many the Inflater actually consumed - it should be between the\n     * total number of bytes read for the entry and the total number\n     * minus the last read operation.  Here we just try to make the\n     * value close enough to the bytes we\u0027ve read by assuming the\n     * number of bytes consumed must be smaller than (or equal to) the\n     * number of bytes read but not smaller by more than 2^32.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 38)",
        "(line 562,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 570,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 571,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 577,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 580,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 29)",
        "(line 582,col 9)-(line 588,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 591,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 34)",
        "(line 593,col 9)-(line 593,col 21)",
        "(line 594,col 9)-(line 594,col 37)",
        "(line 595,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 45)",
        "(line 613,col 9)-(line 613,col 32)",
        "(line 614,col 9)-(line 614,col 21)",
        "(line 615,col 9)-(line 615,col 53)",
        "(line 616,col 9)-(line 625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 635,
      "end_line": 639,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 638,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 658,
      "end_line": 688,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 64)",
        "(line 660,col 9)-(line 660,col 20)",
        "(line 661,col 9)-(line 661,col 29)",
        "(line 664,col 9)-(line 664,col 68)",
        "(line 666,col 9)-(line 684,col 9)",
        "(line 686,col 9)-(line 686,col 37)",
        "(line 687,col 9)-(line 687,col 54)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH"
      ],
      "begin_line": 690,
      "end_line": 690,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH"
      ],
      "begin_line": 691,
      "end_line": 691,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DD"
      ],
      "begin_line": 692,
      "end_line": 692,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.bufferContainsSignature(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 702,
      "end_line": 734,
      "comment": "\n     * Checks whether the current buffer contains the signature of a\n     * \u0026quot;data decsriptor\u0026quot;, \u0026quot;local file header\u0026quot; or\n     * \u0026quot;central directory entry\u0026quot;.\n     *\n     * \u003cp\u003eIf it contains such a signature, reads the data descriptor\n     * and positions the stream right after the data descriptor.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 29)",
        "(line 707,col 9)-(line 707,col 28)",
        "(line 708,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.cacheBytesRead(java.io.ByteArrayOutputStream, int, int, int)",
      "begin_line": 745,
      "end_line": 757,
      "comment": "\n     * If the last read bytes could hold a data descriptor and an\n     * incomplete signature then save the last bytes to the front of\n     * the buffer and cache everything in front of the potential data\n     * descriptor into the given ByteArrayOutputStream.\n     *\n     * \u003cp\u003eData descriptor plus incomplete signature (3 bytes in the\n     * worst case) can be 20 bytes max.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 67)",
        "(line 748,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.pushback(byte[], int, int)",
      "begin_line": 759,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 63)",
        "(line 762,col 9)-(line 762,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 769,
      "end_line": 795,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being read.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 773,
      "end_line": 773,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 777,
      "end_line": 777,
      "comment": "\n         * Does the entry use a data descriptor?\n         "
    },
    {
      "type": "field",
      "varNames": [
        "usesZip64"
      ],
      "begin_line": 781,
      "end_line": 781,
      "comment": "\n         * Does the entry have a ZIP64 extended information extra field.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 786,
      "end_line": 786,
      "comment": "\n         * Number of bytes of entry content read by the client if the\n         * entry is STORED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 794,
      "end_line": 794,
      "comment": "\n         * Number of bytes of entry content read so from the stream.\n         *\n         * \u003cp\u003eThis may be more than the actual entry\u0027s length as some\n         * stuff gets buffered up and needs to be pushed back when the\n         * end of the entry has been reached.\u003c/p\u003e\n         "
    },
    {
      "type": "class_interface",
      "name": "Buffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 802,
      "end_line": 823,
      "comment": "\n     * Contains a temporary buffer used to read from the wrapped\n     * stream together with some information needed for internal\n     * housekeeping.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 806,
      "end_line": 806,
      "comment": "\n         * Buffer used as temporary buffer when reading from the stream.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "offsetInBuffer"
      ],
      "begin_line": 811,
      "end_line": 811,
      "comment": "\n         * {@link #buf buf} may contain data the client hasnt read, yet,\n         * this is the first byte that hasn\u0027t been read so far.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "lengthOfLastRead"
      ],
      "begin_line": 816,
      "end_line": 816,
      "comment": "\n         * Number of bytes read from the wrapped stream into {@link #buf\n         * buf} with the last read operation.\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.Buffer.reset()",
      "begin_line": 820,
      "end_line": 822,
      "comment": "\n         * Reset internal housekeeping.\n         ",
      "child_ranges": [
        "(line 821,col 13)-(line 821,col 50)"
      ]
    }
  ]
}