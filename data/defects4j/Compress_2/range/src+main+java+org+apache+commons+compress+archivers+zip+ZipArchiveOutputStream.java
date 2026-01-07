{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 58,
      "end_line": 945,
      "comment": "\n * Reimplementation of {@link java.util.zip.ZipOutputStream\n * java.util.zip.ZipOutputStream} that does handle the extended\n * functionality of this package, especially internal/external file\n * attributes and extra fields with different layouts for local file\n * data and central directory entries.\n *\n * \u003cp\u003eThis class will try to use {@link java.io.RandomAccessFile\n * RandomAccessFile} when you know that the output is going to go to a\n * file.\u003c/p\u003e\n *\n * \u003cp\u003eIf RandomAccessFile cannot be used, this implementation will use\n * a Data Descriptor to store size and CRC information for {@link\n * #DEFLATED DEFLATED} entries, this means, you don\u0027t need to\n * calculate them yourself.  Unfortunately this is not possible for\n * the {@link #STORED STORED} method, here setting the CRC and\n * uncompressed size information is required before {@link\n * #putNextEntry putNextEntry} can be called.\u003c/p\u003e\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SHORT"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "WORD"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATER_BLOCK_SIZE"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " \n     * Apparently Deflater.setInput gets slowed down a lot on Sun JVMs\n     * when it gets handed a really big buffer.  See\n     * https://issues.apache.org/bugzilla/show_bug.cgi?id\u003d45396\n     *\n     * Using a buffer size of 8 kB proved to be a good compromise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATED"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Compression method for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COMPRESSION"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Default compression level for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STORED"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Compression method for stored entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENCODING"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * default encoding for file names and comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EFS_FLAG"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * General purpose flag, which indicates that filenames are\n     * written in utf-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Current entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * The file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Compression level for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasCompressionLevelChanged"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Has the compression level changed when compared to the last\n     * entry?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Default compression method for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * List of ZipArchiveEntries written so far.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * CRC instance to avoid parsing DEFLATED data twice.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * Count the bytes written to out.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Data for local header data\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": "\n     * Offset for CRC entry in the local file header data for the\n     * current entry starts here.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdOffset"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * Start of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdLength"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n     * Length of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": "\n     * Helper, a 0 as ZipShort.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZERO"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n     * Helper, a 0 as ZipLong.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offsets"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * Holds the offsets of the LFH starts for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 191,
      "end_line": 192,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     *\n     * This field is of internal use and will be set in {@link\n     * #setEncoding(String)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": "\n     * This Deflater object is used for output.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": "\n     * This buffer servers as a Deflater.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": "\n     * Optional random access output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useEFS"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n     * whether to use the EFS flag when writing UTF-8 filenames or not.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fallbackToUTF8"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n     * Whether to encode non-encodable file names as UTF-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "createUnicodeExtraFields"
      ],
      "begin_line": 226,
      "end_line": 227,
      "comment": "\n     * whether to create UnicodePathExtraField-s for each entry.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * Creates a new ZIP OutputStream filtering the underlying stream.\n     * @param out the outputstream to zip\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 23)",
        "(line 235,col 9)-(line 235,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.File)",
      "begin_line": 244,
      "end_line": 263,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a File.  Will use\n     * random access if possible.\n     * @param file the file to zip to\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 30)",
        "(line 246,col 9)-(line 246,col 37)",
        "(line 247,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 16)",
        "(line 262,col 9)-(line 262,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable()",
      "begin_line": 274,
      "end_line": 276,
      "comment": "\n     * This method indicates whether this archive is writing to a\n     * seekable stream (i.e., to a random access file).\n     *\n     * \u003cp\u003eFor seekable streams, you don\u0027t need to calculate the CRC or\n     * uncompressed size for {@link #STORED} entries before\n     * invoking {@link #putNextEntry}.\n     * @return true if seekable\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setEncoding(java.lang.String)",
      "begin_line": 287,
      "end_line": 291,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 33)",
        "(line 289,col 9)-(line 289,col 70)",
        "(line 290,col 9)-(line 290,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag(boolean)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 336,
      "end_line": 346,
      "comment": "\n     * Finishs writing the contents and closes this as well as the\n     * underlying stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 21)",
        "(line 338,col 9)-(line 338,col 27)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 38)",
        "(line 343,col 9)-(line 343,col 35)",
        "(line 344,col 9)-(line 344,col 24)",
        "(line 345,col 9)-(line 345,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeEntry()",
      "begin_line": 352,
      "end_line": 411,
      "comment": "\n     * Writes all necessary data for this entry.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 38)",
        "(line 358,col 9)-(line 358,col 20)",
        "(line 360,col 9)-(line 395,col 9)",
        "(line 399,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 409,col 35)",
        "(line 410,col 9)-(line 410,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putNextEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 418,
      "end_line": 451,
      "comment": "\n     * Begin writing next entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 21)",
        "(line 421,col 9)-(line 421,col 19)",
        "(line 422,col 9)-(line 422,col 27)",
        "(line 424,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 433,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 450,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 469,
      "end_line": 477,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 59)",
        "(line 476,col 9)-(line 476,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 496,
      "end_line": 523,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(int)",
      "begin_line": 532,
      "end_line": 536,
      "comment": "\n     * Writes a single byte to ZIP entry.\n     *\n     * \u003cp\u003eDelegates to the three arg method.\u003c/p\u003e\n     * @param b the byte to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 34)",
        "(line 534,col 9)-(line 534,col 41)",
        "(line 535,col 9)-(line 535,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 544,
      "end_line": 553,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 17)",
        "(line 547,col 9)-(line 549,col 9)",
        "(line 550,col 9)-(line 552,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 561,
      "end_line": 565,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 564,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 567,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 571,
      "end_line": 573,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[])",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * Invokes the {@link #write(byte[],int,int)} three-arg version.\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 30)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 589,
      "end_line": 589,
      "comment": "\n     * local file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 593,
      "end_line": 593,
      "comment": "\n     * data descriptor signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 597,
      "end_line": 597,
      "comment": "\n     * central file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 601,
      "end_line": 601,
      "comment": "\n     * end of central dir signature\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 607,
      "end_line": 612,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 50)",
        "(line 609,col 9)-(line 611,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 619,
      "end_line": 716,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 64)",
        "(line 623,col 9)-(line 623,col 40)",
        "(line 625,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 631,col 61)",
        "(line 633,col 9)-(line 658,col 9)",
        "(line 660,col 9)-(line 660,col 51)",
        "(line 662,col 9)-(line 662,col 26)",
        "(line 663,col 9)-(line 663,col 24)",
        "(line 666,col 9)-(line 666,col 45)",
        "(line 668,col 9)-(line 670,col 76)",
        "(line 671,col 9)-(line 671,col 24)",
        "(line 674,col 9)-(line 674,col 47)",
        "(line 675,col 9)-(line 675,col 25)",
        "(line 678,col 9)-(line 678,col 50)",
        "(line 679,col 9)-(line 679,col 24)",
        "(line 684,col 9)-(line 684,col 33)",
        "(line 685,col 9)-(line 693,col 9)",
        "(line 695,col 9)-(line 695,col 22)",
        "(line 699,col 9)-(line 699,col 50)",
        "(line 700,col 9)-(line 700,col 25)",
        "(line 703,col 9)-(line 703,col 50)",
        "(line 704,col 9)-(line 704,col 50)",
        "(line 705,col 9)-(line 705,col 25)",
        "(line 708,col 9)-(line 708,col 65)",
        "(line 709,col 9)-(line 709,col 32)",
        "(line 712,col 9)-(line 712,col 24)",
        "(line 713,col 9)-(line 713,col 32)",
        "(line 715,col 9)-(line 715,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 723,
      "end_line": 734,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 727,col 25)",
        "(line 728,col 9)-(line 728,col 51)",
        "(line 729,col 9)-(line 729,col 62)",
        "(line 730,col 9)-(line 730,col 52)",
        "(line 732,col 9)-(line 732,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 741,
      "end_line": 832,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 26)",
        "(line 743,col 9)-(line 743,col 24)",
        "(line 747,col 9)-(line 747,col 66)",
        "(line 748,col 9)-(line 748,col 25)",
        "(line 750,col 9)-(line 750,col 45)",
        "(line 751,col 9)-(line 751,col 70)",
        "(line 752,col 9)-(line 754,col 76)",
        "(line 755,col 9)-(line 755,col 24)",
        "(line 758,col 9)-(line 758,col 47)",
        "(line 759,col 9)-(line 759,col 25)",
        "(line 762,col 9)-(line 762,col 50)",
        "(line 763,col 9)-(line 763,col 24)",
        "(line 768,col 9)-(line 768,col 48)",
        "(line 769,col 9)-(line 769,col 59)",
        "(line 770,col 9)-(line 770,col 49)",
        "(line 772,col 9)-(line 772,col 22)",
        "(line 776,col 9)-(line 776,col 40)",
        "(line 778,col 9)-(line 782,col 9)",
        "(line 784,col 9)-(line 784,col 61)",
        "(line 786,col 9)-(line 786,col 50)",
        "(line 787,col 9)-(line 787,col 25)",
        "(line 790,col 9)-(line 790,col 53)",
        "(line 791,col 9)-(line 791,col 50)",
        "(line 792,col 9)-(line 792,col 25)",
        "(line 795,col 9)-(line 795,col 38)",
        "(line 796,col 9)-(line 798,col 9)",
        "(line 800,col 9)-(line 800,col 57)",
        "(line 802,col 9)-(line 802,col 54)",
        "(line 803,col 9)-(line 803,col 25)",
        "(line 806,col 9)-(line 806,col 23)",
        "(line 807,col 9)-(line 807,col 25)",
        "(line 810,col 9)-(line 810,col 64)",
        "(line 811,col 9)-(line 811,col 25)",
        "(line 814,col 9)-(line 814,col 63)",
        "(line 815,col 9)-(line 815,col 24)",
        "(line 818,col 9)-(line 818,col 43)",
        "(line 819,col 9)-(line 819,col 24)",
        "(line 822,col 9)-(line 822,col 65)",
        "(line 823,col 9)-(line 823,col 32)",
        "(line 826,col 9)-(line 826,col 24)",
        "(line 827,col 9)-(line 827,col 32)",
        "(line 830,col 9)-(line 830,col 77)",
        "(line 831,col 9)-(line 831,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 838,
      "end_line": 858,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 27)",
        "(line 842,col 9)-(line 842,col 23)",
        "(line 843,col 9)-(line 843,col 23)",
        "(line 846,col 9)-(line 846,col 55)",
        "(line 847,col 9)-(line 847,col 22)",
        "(line 848,col 9)-(line 848,col 22)",
        "(line 851,col 9)-(line 851,col 45)",
        "(line 852,col 9)-(line 852,col 45)",
        "(line 855,col 9)-(line 855,col 59)",
        "(line 856,col 9)-(line 856,col 50)",
        "(line 857,col 9)-(line 857,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 865,
      "end_line": 867,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 876,
      "end_line": 883,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 882,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflateUntilInputIsNeeded()",
      "begin_line": 885,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 886,col 9)-(line 888,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean)",
      "begin_line": 891,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 40)",
        "(line 899,col 9)-(line 899,col 72)",
        "(line 900,col 9)-(line 906,col 9)",
        "(line 910,col 9)-(line 910,col 60)",
        "(line 912,col 9)-(line 912,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 919,
      "end_line": 944,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 923,
      "end_line": 924,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 928,
      "end_line": 929,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 934,
      "end_line": 935,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 937,
      "end_line": 937,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 938,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 939,col 13)-(line 939,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 941,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 942,col 13)-(line 942,col 24)"
      ]
    }
  ]
}