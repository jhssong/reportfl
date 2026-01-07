{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 58,
      "end_line": 969,
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
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * General purpose flag, which indicates that filenames are\n     * written in utf-8.\n     * @deprecated use {@link GeneralPurposeBit#UFT8_NAMES_FLAG} instead\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Current entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * The file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Compression level for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasCompressionLevelChanged"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Has the compression level changed when compared to the last\n     * entry?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Default compression method for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * List of ZipArchiveEntries written so far.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": "\n     * CRC instance to avoid parsing DEFLATED data twice.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Count the bytes written to out.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Data for local header data\n     "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": "\n     * Offset for CRC entry in the local file header data for the\n     * current entry starts here.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdOffset"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n     * Start of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdLength"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": "\n     * Length of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": "\n     * Helper, a 0 as ZipShort.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZERO"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": "\n     * Helper, a 0 as ZipLong.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offsets"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * Holds the offsets of the LFH starts for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 196,
      "end_line": 197,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     *\n     * This field is of internal use and will be set in {@link\n     * #setEncoding(String)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": "\n     * This Deflater object is used for output.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": "\n     * This buffer servers as a Deflater.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": "\n     * Optional random access output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useUTF8Flag"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": "\n     * whether to use the general purpose bit flag when writing UTF-8\n     * filenames or not.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fallbackToUTF8"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": "\n     * Whether to encode non-encodable file names as UTF-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "createUnicodeExtraFields"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": "\n     * whether to create UnicodePathExtraField-s for each entry.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 238,
      "end_line": 241,
      "comment": "\n     * Creates a new ZIP OutputStream filtering the underlying stream.\n     * @param out the outputstream to zip\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 23)",
        "(line 240,col 9)-(line 240,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.File)",
      "begin_line": 249,
      "end_line": 268,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a File.  Will use\n     * random access if possible.\n     * @param file the file to zip to\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 30)",
        "(line 251,col 9)-(line 251,col 37)",
        "(line 252,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 16)",
        "(line 267,col 9)-(line 267,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "\n     * This method indicates whether this archive is writing to a\n     * seekable stream (i.e., to a random access file).\n     *\n     * \u003cp\u003eFor seekable streams, you don\u0027t need to calculate the CRC or\n     * uncompressed size for {@link #STORED} entries before\n     * invoking {@link #putArchiveEntry(ArchiveEntry)}.\n     * @return true if seekable\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setEncoding(java.lang.String)",
      "begin_line": 292,
      "end_line": 296,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 33)",
        "(line 294,col 9)-(line 294,col 70)",
        "(line 295,col 9)-(line 295,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag(boolean)",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 332,
      "end_line": 334,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 337,
      "end_line": 355,
      "comment": " {@inheritDoc} ",
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
      "begin_line": 430,
      "end_line": 469,
      "comment": "\n     * {@inheritDoc} \n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 9)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 439,col 49)",
        "(line 440,col 9)-(line 440,col 27)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 451,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 487,
      "end_line": 495,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 488,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 59)",
        "(line 494,col 9)-(line 494,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 514,
      "end_line": 519,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 528,
      "end_line": 557,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 46)",
        "(line 530,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 38)",
        "(line 556,col 9)-(line 556,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 565,
      "end_line": 576,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 568,col 9)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 575,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 584,
      "end_line": 588,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 587,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 596,
      "end_line": 596,
      "comment": "\n     * local file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 600,
      "end_line": 600,
      "comment": "\n     * data descriptor signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 604,
      "end_line": 604,
      "comment": "\n     * central file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 608,
      "end_line": 608,
      "comment": "\n     * end of central dir signature\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 614,
      "end_line": 619,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 50)",
        "(line 616,col 9)-(line 618,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 626,
      "end_line": 723,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 64)",
        "(line 630,col 9)-(line 630,col 40)",
        "(line 632,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 638,col 61)",
        "(line 640,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 667,col 51)",
        "(line 669,col 9)-(line 669,col 26)",
        "(line 670,col 9)-(line 670,col 24)",
        "(line 673,col 9)-(line 673,col 45)",
        "(line 675,col 9)-(line 677,col 76)",
        "(line 678,col 9)-(line 678,col 24)",
        "(line 681,col 9)-(line 681,col 47)",
        "(line 682,col 9)-(line 682,col 25)",
        "(line 685,col 9)-(line 685,col 50)",
        "(line 686,col 9)-(line 686,col 24)",
        "(line 691,col 9)-(line 691,col 33)",
        "(line 692,col 9)-(line 700,col 9)",
        "(line 702,col 9)-(line 702,col 22)",
        "(line 706,col 9)-(line 706,col 50)",
        "(line 707,col 9)-(line 707,col 25)",
        "(line 710,col 9)-(line 710,col 50)",
        "(line 711,col 9)-(line 711,col 50)",
        "(line 712,col 9)-(line 712,col 25)",
        "(line 715,col 9)-(line 715,col 65)",
        "(line 716,col 9)-(line 716,col 32)",
        "(line 719,col 9)-(line 719,col 24)",
        "(line 720,col 9)-(line 720,col 32)",
        "(line 722,col 9)-(line 722,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 730,
      "end_line": 741,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 25)",
        "(line 735,col 9)-(line 735,col 51)",
        "(line 736,col 9)-(line 736,col 62)",
        "(line 737,col 9)-(line 737,col 52)",
        "(line 739,col 9)-(line 739,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 748,
      "end_line": 839,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 26)",
        "(line 750,col 9)-(line 750,col 24)",
        "(line 754,col 9)-(line 754,col 66)",
        "(line 755,col 9)-(line 755,col 25)",
        "(line 757,col 9)-(line 757,col 45)",
        "(line 758,col 9)-(line 758,col 70)",
        "(line 759,col 9)-(line 761,col 76)",
        "(line 762,col 9)-(line 762,col 24)",
        "(line 765,col 9)-(line 765,col 47)",
        "(line 766,col 9)-(line 766,col 25)",
        "(line 769,col 9)-(line 769,col 50)",
        "(line 770,col 9)-(line 770,col 24)",
        "(line 775,col 9)-(line 775,col 48)",
        "(line 776,col 9)-(line 776,col 59)",
        "(line 777,col 9)-(line 777,col 49)",
        "(line 779,col 9)-(line 779,col 22)",
        "(line 783,col 9)-(line 783,col 40)",
        "(line 785,col 9)-(line 789,col 9)",
        "(line 791,col 9)-(line 791,col 61)",
        "(line 793,col 9)-(line 793,col 50)",
        "(line 794,col 9)-(line 794,col 25)",
        "(line 797,col 9)-(line 797,col 53)",
        "(line 798,col 9)-(line 798,col 50)",
        "(line 799,col 9)-(line 799,col 25)",
        "(line 802,col 9)-(line 802,col 38)",
        "(line 803,col 9)-(line 805,col 9)",
        "(line 807,col 9)-(line 807,col 57)",
        "(line 809,col 9)-(line 809,col 54)",
        "(line 810,col 9)-(line 810,col 25)",
        "(line 813,col 9)-(line 813,col 23)",
        "(line 814,col 9)-(line 814,col 25)",
        "(line 817,col 9)-(line 817,col 64)",
        "(line 818,col 9)-(line 818,col 25)",
        "(line 821,col 9)-(line 821,col 63)",
        "(line 822,col 9)-(line 822,col 24)",
        "(line 825,col 9)-(line 825,col 43)",
        "(line 826,col 9)-(line 826,col 24)",
        "(line 829,col 9)-(line 829,col 65)",
        "(line 830,col 9)-(line 830,col 32)",
        "(line 833,col 9)-(line 833,col 24)",
        "(line 834,col 9)-(line 834,col 32)",
        "(line 837,col 9)-(line 837,col 77)",
        "(line 838,col 9)-(line 838,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 845,
      "end_line": 865,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 27)",
        "(line 849,col 9)-(line 849,col 23)",
        "(line 850,col 9)-(line 850,col 23)",
        "(line 853,col 9)-(line 853,col 55)",
        "(line 854,col 9)-(line 854,col 22)",
        "(line 855,col 9)-(line 855,col 22)",
        "(line 858,col 9)-(line 858,col 45)",
        "(line 859,col 9)-(line 859,col 45)",
        "(line 862,col 9)-(line 862,col 59)",
        "(line 863,col 9)-(line 863,col 50)",
        "(line 864,col 9)-(line 864,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 872,
      "end_line": 874,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 883,
      "end_line": 890,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 889,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflateUntilInputIsNeeded()",
      "begin_line": 892,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 893,col 9)-(line 895,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean)",
      "begin_line": 898,
      "end_line": 920,
      "comment": "",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 40)",
        "(line 906,col 9)-(line 906,col 54)",
        "(line 907,col 9)-(line 907,col 54)",
        "(line 908,col 9)-(line 913,col 9)",
        "(line 917,col 9)-(line 917,col 60)",
        "(line 919,col 9)-(line 919,col 29)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 926,
      "end_line": 949,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 930,
      "end_line": 930,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 934,
      "end_line": 934,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 939,
      "end_line": 940,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 942,
      "end_line": 942,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 943,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 944,col 13)-(line 944,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 946,
      "end_line": 948,
      "comment": "",
      "child_ranges": [
        "(line 947,col 13)-(line 947,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 962,
      "end_line": 968,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     *\n     * \u003cp\u003eMust not be used if the stream has already been closed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 57)"
      ]
    }
  ]
}