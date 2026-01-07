{
  "filepath": "/tmp/Compress-6b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
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
      "comment": "\n * Reimplementation of {@link java.util.zip.ZipOutputStream\n * java.util.zip.ZipOutputStream} that does handle the extended\n * functionality of this package, especially internal/external file\n * attributes and extra fields with different layouts for local file\n * data and central directory entries.\n *\n * \u003cp\u003eThis class will try to use {@link java.io.RandomAccessFile\n * RandomAccessFile} when you know that the output is going to go to a\n * file.\u003c/p\u003e\n *\n * \u003cp\u003eIf RandomAccessFile cannot be used, this implementation will use\n * a Data Descriptor to store size and CRC information for {@link\n * #DEFLATED DEFLATED} entries, this means, you don\u0027t need to\n * calculate them yourself.  Unfortunately this is not possible for\n * the {@link #STORED STORED} method, here setting the CRC and\n * uncompressed size information is required before {@link\n * #putArchiveEntry(ArchiveEntry)} can be called.\u003c/p\u003e\n * @NotThreadSafe\n "
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
        "finished"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " indicates if this archive is finished. protected for use in Jar implementation "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATER_BLOCK_SIZE"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " \n     * Apparently Deflater.setInput gets slowed down a lot on Sun JVMs\n     * when it gets handed a really big buffer.  See\n     * https://issues.apache.org/bugzilla/show_bug.cgi?id\u003d45396\n     *\n     * Using a buffer size of 8 kB proved to be a good compromise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATED"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Compression method for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COMPRESSION"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Default compression level for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STORED"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Compression method for stored entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENCODING"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * default encoding for file names and comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EFS_FLAG"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * General purpose flag, which indicates that filenames are\n     * written in utf-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Current entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * The file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Compression level for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasCompressionLevelChanged"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Has the compression level changed when compared to the last\n     * entry?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Default compression method for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * List of ZipArchiveEntries written so far.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * CRC instance to avoid parsing DEFLATED data twice.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * Count the bytes written to out.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Data for local header data\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": "\n     * Offset for CRC entry in the local file header data for the\n     * current entry starts here.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdOffset"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": "\n     * Start of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdLength"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": "\n     * Length of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * Helper, a 0 as ZipShort.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZERO"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": "\n     * Helper, a 0 as ZipLong.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offsets"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": "\n     * Holds the offsets of the LFH starts for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 195,
      "end_line": 196,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     *\n     * This field is of internal use and will be set in {@link\n     * #setEncoding(String)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n     * This Deflater object is used for output.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": "\n     * This buffer servers as a Deflater.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n     * Optional random access output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useEFS"
      ],
      "begin_line": 220,
      "end_line": 220,
      "comment": "\n     * whether to use the EFS flag when writing UTF-8 filenames or not.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fallbackToUTF8"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": "\n     * Whether to encode non-encodable file names as UTF-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "createUnicodeExtraFields"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": "\n     * whether to create UnicodePathExtraField-s for each entry.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 236,
      "end_line": 239,
      "comment": "\n     * Creates a new ZIP OutputStream filtering the underlying stream.\n     * @param out the outputstream to zip\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 23)",
        "(line 238,col 9)-(line 238,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.File)",
      "begin_line": 247,
      "end_line": 266,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a File.  Will use\n     * random access if possible.\n     * @param file the file to zip to\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 30)",
        "(line 249,col 9)-(line 249,col 37)",
        "(line 250,col 9)-(line 263,col 9)",
        "(line 264,col 9)-(line 264,col 16)",
        "(line 265,col 9)-(line 265,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * This method indicates whether this archive is writing to a\n     * seekable stream (i.e., to a random access file).\n     *\n     * \u003cp\u003eFor seekable streams, you don\u0027t need to calculate the CRC or\n     * uncompressed size for {@link #STORED} entries before\n     * invoking {@link #putArchiveEntry(ArchiveEntry)}.\n     * @return true if seekable\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setEncoding(java.lang.String)",
      "begin_line": 290,
      "end_line": 294,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 33)",
        "(line 292,col 9)-(line 292,col 70)",
        "(line 293,col 9)-(line 293,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding()",
      "begin_line": 301,
      "end_line": 303,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag(boolean)",
      "begin_line": 311,
      "end_line": 313,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 330,
      "end_line": 332,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 337,
      "end_line": 355,
      "comment": " (non-Javadoc)\n     * @see org.apache.commons.compress.archivers.ArchiveOutputStream#finish()\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 340,col 9)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 346,col 9)-(line 346,col 27)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 38)",
        "(line 351,col 9)-(line 351,col 35)",
        "(line 352,col 9)-(line 352,col 24)",
        "(line 353,col 9)-(line 353,col 24)",
        "(line 354,col 9)-(line 354,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 361,
      "end_line": 424,
      "comment": "\n     * Writes all necessary data for this entry.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 370,col 38)",
        "(line 371,col 9)-(line 371,col 20)",
        "(line 373,col 9)-(line 408,col 9)",
        "(line 412,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 422,col 35)",
        "(line 423,col 9)-(line 423,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 428,
      "end_line": 467,
      "comment": " @throws ClassCastException if entry is not an instance of ZipArchiveEntry",
      "child_ranges": [
        "(line 429,col 9)-(line 431,col 9)",
        "(line 433,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 437,col 49)",
        "(line 438,col 9)-(line 438,col 27)",
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 449,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 465,col 9)",
        "(line 466,col 9)-(line 466,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 473,
      "end_line": 475,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 485,
      "end_line": 493,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 490,col 9)",
        "(line 491,col 9)-(line 491,col 59)",
        "(line 492,col 9)-(line 492,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 501,
      "end_line": 503,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 512,
      "end_line": 544,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 542,col 38)",
        "(line 543,col 9)-(line 543,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 552,
      "end_line": 563,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 571,
      "end_line": 575,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 572,col 9)-(line 574,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 583,
      "end_line": 583,
      "comment": "\n     * local file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 587,
      "end_line": 587,
      "comment": "\n     * data descriptor signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 591,
      "end_line": 591,
      "comment": "\n     * central file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 595,
      "end_line": 595,
      "comment": "\n     * end of central dir signature\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 601,
      "end_line": 606,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 50)",
        "(line 603,col 9)-(line 605,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 613,
      "end_line": 710,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 64)",
        "(line 617,col 9)-(line 617,col 40)",
        "(line 619,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 625,col 61)",
        "(line 627,col 9)-(line 652,col 9)",
        "(line 654,col 9)-(line 654,col 51)",
        "(line 656,col 9)-(line 656,col 26)",
        "(line 657,col 9)-(line 657,col 24)",
        "(line 660,col 9)-(line 660,col 45)",
        "(line 662,col 9)-(line 664,col 76)",
        "(line 665,col 9)-(line 665,col 24)",
        "(line 668,col 9)-(line 668,col 47)",
        "(line 669,col 9)-(line 669,col 25)",
        "(line 672,col 9)-(line 672,col 50)",
        "(line 673,col 9)-(line 673,col 24)",
        "(line 678,col 9)-(line 678,col 33)",
        "(line 679,col 9)-(line 687,col 9)",
        "(line 689,col 9)-(line 689,col 22)",
        "(line 693,col 9)-(line 693,col 50)",
        "(line 694,col 9)-(line 694,col 25)",
        "(line 697,col 9)-(line 697,col 50)",
        "(line 698,col 9)-(line 698,col 50)",
        "(line 699,col 9)-(line 699,col 25)",
        "(line 702,col 9)-(line 702,col 65)",
        "(line 703,col 9)-(line 703,col 32)",
        "(line 706,col 9)-(line 706,col 24)",
        "(line 707,col 9)-(line 707,col 32)",
        "(line 709,col 9)-(line 709,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 717,
      "end_line": 728,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 25)",
        "(line 722,col 9)-(line 722,col 51)",
        "(line 723,col 9)-(line 723,col 62)",
        "(line 724,col 9)-(line 724,col 52)",
        "(line 726,col 9)-(line 726,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 735,
      "end_line": 826,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 26)",
        "(line 737,col 9)-(line 737,col 24)",
        "(line 741,col 9)-(line 741,col 66)",
        "(line 742,col 9)-(line 742,col 25)",
        "(line 744,col 9)-(line 744,col 45)",
        "(line 745,col 9)-(line 745,col 70)",
        "(line 746,col 9)-(line 748,col 76)",
        "(line 749,col 9)-(line 749,col 24)",
        "(line 752,col 9)-(line 752,col 47)",
        "(line 753,col 9)-(line 753,col 25)",
        "(line 756,col 9)-(line 756,col 50)",
        "(line 757,col 9)-(line 757,col 24)",
        "(line 762,col 9)-(line 762,col 48)",
        "(line 763,col 9)-(line 763,col 59)",
        "(line 764,col 9)-(line 764,col 49)",
        "(line 766,col 9)-(line 766,col 22)",
        "(line 770,col 9)-(line 770,col 40)",
        "(line 772,col 9)-(line 776,col 9)",
        "(line 778,col 9)-(line 778,col 61)",
        "(line 780,col 9)-(line 780,col 50)",
        "(line 781,col 9)-(line 781,col 25)",
        "(line 784,col 9)-(line 784,col 53)",
        "(line 785,col 9)-(line 785,col 50)",
        "(line 786,col 9)-(line 786,col 25)",
        "(line 789,col 9)-(line 789,col 38)",
        "(line 790,col 9)-(line 792,col 9)",
        "(line 794,col 9)-(line 794,col 57)",
        "(line 796,col 9)-(line 796,col 54)",
        "(line 797,col 9)-(line 797,col 25)",
        "(line 800,col 9)-(line 800,col 23)",
        "(line 801,col 9)-(line 801,col 25)",
        "(line 804,col 9)-(line 804,col 64)",
        "(line 805,col 9)-(line 805,col 25)",
        "(line 808,col 9)-(line 808,col 63)",
        "(line 809,col 9)-(line 809,col 24)",
        "(line 812,col 9)-(line 812,col 43)",
        "(line 813,col 9)-(line 813,col 24)",
        "(line 816,col 9)-(line 816,col 65)",
        "(line 817,col 9)-(line 817,col 32)",
        "(line 820,col 9)-(line 820,col 24)",
        "(line 821,col 9)-(line 821,col 32)",
        "(line 824,col 9)-(line 824,col 77)",
        "(line 825,col 9)-(line 825,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 832,
      "end_line": 852,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 833,col 9)-(line 833,col 27)",
        "(line 836,col 9)-(line 836,col 23)",
        "(line 837,col 9)-(line 837,col 23)",
        "(line 840,col 9)-(line 840,col 55)",
        "(line 841,col 9)-(line 841,col 22)",
        "(line 842,col 9)-(line 842,col 22)",
        "(line 845,col 9)-(line 845,col 45)",
        "(line 846,col 9)-(line 846,col 45)",
        "(line 849,col 9)-(line 849,col 59)",
        "(line 850,col 9)-(line 850,col 50)",
        "(line 851,col 9)-(line 851,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 859,
      "end_line": 861,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 870,
      "end_line": 877,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 872,col 9)-(line 876,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflateUntilInputIsNeeded()",
      "begin_line": 879,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 880,col 9)-(line 882,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean)",
      "begin_line": 885,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 40)",
        "(line 893,col 9)-(line 893,col 72)",
        "(line 894,col 9)-(line 900,col 9)",
        "(line 904,col 9)-(line 904,col 60)",
        "(line 906,col 9)-(line 906,col 56)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 913,
      "end_line": 936,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 917,
      "end_line": 917,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 921,
      "end_line": 921,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 926,
      "end_line": 927,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 929,
      "end_line": 929,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 930,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 931,col 13)-(line 931,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 933,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 934,col 13)-(line 934,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 938,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 940,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 57)"
      ]
    }
  ]
}