{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveInputStream"
      ],
      "begin_line": 46,
      "end_line": 565,
      "comment": "\n * Implements an input stream that can read Zip archives.\n * \u003cp\u003e\n * Note that {@link ZipArchiveEntry#getSize()} may return -1 if the DEFLATE algorithm is used, as the size information\n * is not available from the header.\n * \u003cp\u003e\n * The {@link ZipFile} class is preferred when reading from files.\n *  \n * @see ZipFile\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "useUnicodeExtraFields"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": "\n     * Whether to look for and use Unicode extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "inf"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "closed"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hitCentralDirectory"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "readBytesOfEntry",
        "offsetInBuffer"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesReadFromStream"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lengthOfLastRead"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hasDataDescriptor"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "lastStoredEntry"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "allowStoredEntriesWithDataDescriptor"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_LEN"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream)",
      "begin_line": 94,
      "end_line": 96,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 56)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean)",
      "begin_line": 104,
      "end_line": 108,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     ",
      "child_ranges": [
        "(line 107,col 9)-(line 107,col 66)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.ZipArchiveInputStream(java.io.InputStream, java.lang.String, boolean, boolean)",
      "begin_line": 119,
      "end_line": 128,
      "comment": "\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     * @param useUnicodeExtraFields whether to use InfoZIP Unicode\n     * Extra Fields (if present) to set the file names.\n     * @param allowStoredEntriesWithDataDescriptor whether the stream\n     * will try to read STORED entries that use a data descriptor\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 65)",
        "(line 124,col 9)-(line 124,col 59)",
        "(line 125,col 9)-(line 125,col 62)",
        "(line 126,col 9)-(line 127,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextZipEntry()",
      "begin_line": 130,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 39)",
        "(line 138,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 39)",
        "(line 144,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 152,col 23)",
        "(line 153,col 9)-(line 153,col 40)",
        "(line 155,col 9)-(line 155,col 56)",
        "(line 156,col 9)-(line 156,col 21)",
        "(line 157,col 9)-(line 158,col 51)",
        "(line 160,col 9)-(line 160,col 75)",
        "(line 161,col 9)-(line 161,col 62)",
        "(line 162,col 9)-(line 163,col 76)",
        "(line 164,col 9)-(line 164,col 56)",
        "(line 165,col 9)-(line 165,col 45)",
        "(line 167,col 9)-(line 167,col 21)",
        "(line 169,col 9)-(line 169,col 55)",
        "(line 170,col 9)-(line 170,col 21)",
        "(line 172,col 9)-(line 172,col 70)",
        "(line 173,col 9)-(line 173,col 30)",
        "(line 174,col 9)-(line 174,col 20)",
        "(line 176,col 9)-(line 187,col 9)",
        "(line 189,col 9)-(line 189,col 54)",
        "(line 191,col 9)-(line 191,col 21)",
        "(line 193,col 9)-(line 193,col 51)",
        "(line 194,col 9)-(line 194,col 21)",
        "(line 196,col 9)-(line 196,col 48)",
        "(line 197,col 9)-(line 197,col 28)",
        "(line 198,col 9)-(line 198,col 56)",
        "(line 200,col 9)-(line 200,col 46)",
        "(line 201,col 9)-(line 201,col 29)",
        "(line 202,col 9)-(line 202,col 36)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.getNextEntry()",
      "begin_line": 211,
      "end_line": 213,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 222,
      "end_line": 230,
      "comment": "\n     * Whether this class is able to read the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 229,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.read(byte[], int, int)",
      "begin_line": 232,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 241,col 9)-(line 305,col 9)",
        "(line 306,col 9)-(line 306,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.close()",
      "begin_line": 309,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 310,col 9)-(line 313,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.skip(long)",
      "begin_line": 316,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.matches(byte[], int)",
      "begin_line": 344,
      "end_line": 351,
      "comment": "\n     * Checks if the signature matches what is expected for a zip file.\n     * Does not currently handle self-extracting zips which may have arbitrary\n     * leading content.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a zip archive stream, false otherwise\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 350,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.checksig(byte[], byte[])",
      "begin_line": 353,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.closeEntry()",
      "begin_line": 380,
      "end_line": 431,
      "comment": "\n     * Closes the current ZIP archive entry and positions the underlying\n     * stream to the beginning of the next entry. All per-entry variables\n     * and data structures are cleared.\n     * \u003cp\u003e\n     * If the compressed size of this entry is included in the entry header,\n     * then any outstanding bytes are simply skipped from the underlying\n     * stream without uncompressing them. This allows an entry to be safely\n     * closed even if the compression method is unsupported.\n     * \u003cp\u003e\n     * In case we don\u0027t know the compressed size of this entry or have\n     * already buffered too much data from the underlying stream to support\n     * uncompression, then the uncompression process is completed and the\n     * end position of the stream is adjusted based on the result of that\n     * process.\n     *\n     * @throws IOException if an error occurs\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 386,col 9)",
        "(line 389,col 9)-(line 419,col 9)",
        "(line 421,col 9)-(line 423,col 9)",
        "(line 425,col 9)-(line 425,col 20)",
        "(line 426,col 9)-(line 427,col 33)",
        "(line 428,col 9)-(line 428,col 20)",
        "(line 429,col 9)-(line 429,col 23)",
        "(line 430,col 9)-(line 430,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.fill()",
      "begin_line": 433,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 434,col 9)-(line 436,col 9)",
        "(line 437,col 9)-(line 440,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readFully(byte[])",
      "begin_line": 443,
      "end_line": 452,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 29)",
        "(line 445,col 9)-(line 451,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readDataDescriptor()",
      "begin_line": 454,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 34)",
        "(line 456,col 9)-(line 456,col 21)",
        "(line 457,col 9)-(line 457,col 37)",
        "(line 458,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 39)",
        "(line 464,col 9)-(line 464,col 21)",
        "(line 465,col 9)-(line 465,col 61)",
        "(line 466,col 9)-(line 466,col 21)",
        "(line 467,col 9)-(line 467,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.supportsDataDescriptorFor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 477,
      "end_line": 481,
      "comment": "\n     * Whether this entry requires a data descriptor this library can work with.\n     *\n     * @return true if allowStoredEntriesWithDataDescriptor is true,\n     * the entry doesn\u0027t require any data descriptor or the method is\n     * DEFLATED.\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 480,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveInputStream.readStoredEntry()",
      "begin_line": 500,
      "end_line": 564,
      "comment": "\n     * Caches a stored entry that uses the data descriptor.\n     *\n     * \u003cul\u003e\n     *   \u003cli\u003eReads a stored entry until the signature of a local file\n     *     header, central directory header or data descriptor has been\n     *     found.\u003c/li\u003e\n     *   \u003cli\u003eStores all entry data in lastStoredEntry.\u003c/p\u003e\n     *   \u003cli\u003eRewinds the stream to position at the data\n     *     descriptor.\u003c/li\u003e\n     *   \u003cli\u003ereads the data descriptor\u003c/li\u003e\n     * \u003c/ul\u003e\n     *\n     * \u003cp\u003eAfter calling this method the entry should know its size,\n     * the entry\u0027s data is cached and the stream is positioned at the\n     * next local file or central directory header.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 64)",
        "(line 502,col 9)-(line 502,col 48)",
        "(line 503,col 9)-(line 503,col 48)",
        "(line 504,col 9)-(line 504,col 46)",
        "(line 505,col 9)-(line 505,col 20)",
        "(line 506,col 9)-(line 506,col 29)",
        "(line 508,col 9)-(line 560,col 9)",
        "(line 562,col 9)-(line 562,col 37)",
        "(line 563,col 9)-(line 563,col 54)"
      ]
    }
  ]
}