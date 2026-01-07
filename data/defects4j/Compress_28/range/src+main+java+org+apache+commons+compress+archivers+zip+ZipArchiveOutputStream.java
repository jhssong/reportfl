{
  "filepath": "/tmp/Compress-28b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 75,
      "end_line": 1504,
      "comment": "\n * Reimplementation of {@link java.util.zip.ZipOutputStream\n * java.util.zip.ZipOutputStream} that does handle the extended\n * functionality of this package, especially internal/external file\n * attributes and extra fields with different layouts for local file\n * data and central directory entries.\n *\n * \u003cp\u003eThis class will try to use {@link java.io.RandomAccessFile\n * RandomAccessFile} when you know that the output is going to go to a\n * file.\u003c/p\u003e\n *\n * \u003cp\u003eIf RandomAccessFile cannot be used, this implementation will use\n * a Data Descriptor to store size and CRC information for {@link\n * #DEFLATED DEFLATED} entries, this means, you don\u0027t need to\n * calculate them yourself.  Unfortunately this is not possible for\n * the {@link #STORED STORED} method, here setting the CRC and\n * uncompressed size information is required before {@link\n * #putArchiveEntry(ArchiveEntry)} can be called.\u003c/p\u003e\n *\n * \u003cp\u003eAs of Apache Commons Compress 1.3 it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries in most cases but explicit\n * control is provided via {@link #setUseZip64}.  If the stream can not\n * user RandomAccessFile and you try to write a ZipArchiveEntry of\n * unknown size then Zip64 extensions will be disabled by default.\u003c/p\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " indicates if this archive is finished. protected for use in Jar implementation "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATER_BLOCK_SIZE"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " \n     * Apparently Deflater.setInput gets slowed down a lot on Sun JVMs\n     * when it gets handed a really big buffer.  See\n     * https://issues.apache.org/bugzilla/show_bug.cgi?id\u003d45396\n     *\n     * Using a buffer size of 8 kB proved to be a good compromise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATED"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Compression method for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COMPRESSION"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Default compression level for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STORED"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": "\n     * Compression method for stored entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENCODING"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * default encoding for file names and comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EFS_FLAG"
      ],
      "begin_line": 116,
      "end_line": 117,
      "comment": "\n     * General purpose flag, which indicates that filenames are\n     * written in UTF-8.\n     * @deprecated use {@link GeneralPurposeBit#UFT8_NAMES_FLAG} instead\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": "\n     * Current entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * The file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Compression level for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasCompressionLevelChanged"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Has the compression level changed when compared to the last\n     * entry?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Default compression method for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 150,
      "end_line": 151,
      "comment": "\n     * List of ZipArchiveEntries written so far.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": "\n     * CRC instance to avoid parsing DEFLATED data twice.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": "\n     * Count the bytes written to out.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdOffset"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": "\n     * Start of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdLength"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": "\n     * Length of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": "\n     * Helper, a 0 as ZipShort.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZERO"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n     * Helper, a 0 as ZipLong.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offsets"
      ],
      "begin_line": 186,
      "end_line": 187,
      "comment": "\n     * Holds the offsets of the LFH starts for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 204,
      "end_line": 205,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     *\n     * This field is of internal use and will be set in {@link\n     * #setEncoding(String)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": "\n     * This Deflater object is used for output.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": "\n     * This buffer serves as a Deflater.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": "\n     * Optional random access output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useUTF8Flag"
      ],
      "begin_line": 230,
      "end_line": 230,
      "comment": "\n     * whether to use the general purpose bit flag when writing UTF-8\n     * filenames or not.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fallbackToUTF8"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": "\n     * Whether to encode non-encodable file names as UTF-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "createUnicodeExtraFields"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": "\n     * whether to create UnicodePathExtraField-s for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasUsedZip64"
      ],
      "begin_line": 247,
      "end_line": 247,
      "comment": "\n     * Whether anything inside this archive has used a ZIP64 feature.\n     *\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zip64Mode"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 255,
      "end_line": 258,
      "comment": "\n     * Creates a new ZIP OutputStream filtering the underlying stream.\n     * @param out the outputstream to zip\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 23)",
        "(line 257,col 9)-(line 257,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.File)",
      "begin_line": 266,
      "end_line": 279,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a File.  Will use\n     * random access if possible.\n     * @param file the file to zip to\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 30)",
        "(line 268,col 9)-(line 268,col 37)",
        "(line 269,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 16)",
        "(line 278,col 9)-(line 278,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * This method indicates whether this archive is writing to a\n     * seekable stream (i.e., to a random access file).\n     *\n     * \u003cp\u003eFor seekable streams, you don\u0027t need to calculate the CRC or\n     * uncompressed size for {@link #STORED} entries before\n     * invoking {@link #putArchiveEntry(ArchiveEntry)}.\n     * @return true if seekable\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setEncoding(java.lang.String)",
      "begin_line": 303,
      "end_line": 309,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 33)",
        "(line 305,col 9)-(line 305,col 70)",
        "(line 306,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding()",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag(boolean)",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 345,
      "end_line": 347,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 393,
      "end_line": 395,
      "comment": "\n     * Whether Zip64 extensions will be used.\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Never Never},\n     * {@link #putArchiveEntry}, {@link #closeArchiveEntry}, {@link\n     * #finish} or {@link #close} may throw a {@link\n     * Zip64RequiredException} if the entry\u0027s size or the total size\n     * of the archive exceeds 4GB or there are more than 65536 entries\n     * inside the archive.  Any archive created in this mode will be\n     * readable by implementations that don\u0027t support Zip64.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Always Always},\n     * Zip64 extensions will be used for all entries.  Any archive\n     * created in this mode may be unreadable by implementations that\n     * don\u0027t support Zip64 even if all its contents would be.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#AsNeeded\n     * AsNeeded}, Zip64 extensions will transparently be used for\n     * those entries that require them.  This mode can only be used if\n     * the uncompressed size of the {@link ZipArchiveEntry} is known\n     * when calling {@link #putArchiveEntry} or the archive is written\n     * to a seekable output (i.e. you have used the {@link\n     * #ZipArchiveOutputStream(java.io.File) File-arg constructor}) -\n     * this mode is not valid when the output stream is not seekable\n     * and the uncompressed size is unknown when {@link\n     * #putArchiveEntry} is called.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf no entry inside the resulting archive requires Zip64\n     * extensions then {@link Zip64Mode#Never Never} will create the\n     * smallest archive.  {@link Zip64Mode#AsNeeded AsNeeded} will\n     * create a slightly bigger archive if the uncompressed size of\n     * any entry has initially been unknown and create an archive\n     * identical to {@link Zip64Mode#Never Never} otherwise.  {@link\n     * Zip64Mode#Always Always} will create an archive that is at\n     * least 24 bytes per entry bigger than the one {@link\n     * Zip64Mode#Never Never} would create.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to {@link Zip64Mode#AsNeeded AsNeeded} unless\n     * {@link #putArchiveEntry} is called with an entry of unknown\n     * size and data is written to a non-seekable stream - in this\n     * case the default is {@link Zip64Mode#Never Never}.\u003c/p\u003e\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 403,
      "end_line": 424,
      "comment": "\n     * {@inheritDoc}\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 405,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 27)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 38)",
        "(line 418,col 9)-(line 418,col 37)",
        "(line 419,col 9)-(line 419,col 35)",
        "(line 420,col 9)-(line 420,col 24)",
        "(line 421,col 9)-(line 421,col 24)",
        "(line 422,col 9)-(line 422,col 18)",
        "(line 423,col 9)-(line 423,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 433,
      "end_line": 463,
      "comment": "\n     * Writes all necessary data for this entry.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size exceeds 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 447,col 9)-(line 447,col 24)",
        "(line 449,col 9)-(line 449,col 75)",
        "(line 450,col 9)-(line 450,col 54)",
        "(line 451,col 9)-(line 451,col 38)",
        "(line 452,col 9)-(line 452,col 20)",
        "(line 454,col 9)-(line 455,col 68)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 461,col 41)",
        "(line 462,col 9)-(line 462,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater()",
      "begin_line": 468,
      "end_line": 475,
      "comment": "\n     * Ensures all bytes sent to the deflater are written to the stream.\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 474,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 483,
      "end_line": 526,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 520,col 62)",
        "(line 521,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(boolean)",
      "begin_line": 533,
      "end_line": 576,
      "comment": "\n     * When using random access output, write the local file header\n     * and potentiall the ZIP64 extra containing the correct CRC and\n     * compressed/uncompressed sizes.\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 41)",
        "(line 537,col 9)-(line 537,col 39)",
        "(line 538,col 9)-(line 538,col 57)",
        "(line 539,col 9)-(line 545,col 9)",
        "(line 547,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 585,
      "end_line": 625,
      "comment": "\n     * {@inheritDoc} \n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 589,col 9)",
        "(line 591,col 9)-(line 593,col 9)",
        "(line 595,col 9)-(line 595,col 65)",
        "(line 596,col 9)-(line 596,col 33)",
        "(line 598,col 9)-(line 598,col 33)",
        "(line 600,col 9)-(line 600,col 75)",
        "(line 601,col 9)-(line 601,col 47)",
        "(line 603,col 9)-(line 618,col 9)",
        "(line 620,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 631,
      "end_line": 639,
      "comment": "\n     * Provides default values for compression method and last\n     * modification time.\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 634,col 9)",
        "(line 636,col 9)-(line 638,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 647,
      "end_line": 669,
      "comment": "\n     * Throws an exception if the size is unknown for a stored entry\n     * that is written to a non-seekable output or the entry is too\n     * big to be written without Zip64 extra but the mode has been set\n     * to Never.\n     ",
      "child_ranges": [
        "(line 650,col 9)-(line 661,col 9)",
        "(line 663,col 9)-(line 668,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 685,
      "end_line": 691,
      "comment": "\n     * Whether to addd a Zip64 extended information extra field to the\n     * local file header.\n     *\n     * \u003cp\u003eReturns true if\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003emode is Always\u003c/li\u003e\n     * \u003cli\u003eor we already know it is going to be needed\u003c/li\u003e\n     * \u003cli\u003eor the size is unknown and we can ensure it won\u0027t hurt\n     * other implementations if we add it (i.e. we can erase its\n     * usage\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 686,col 9)-(line 690,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 697,
      "end_line": 699,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 709,
      "end_line": 717,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 710,col 9)-(line 714,col 9)",
        "(line 715,col 9)-(line 715,col 59)",
        "(line 716,col 9)-(line 716,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 725,
      "end_line": 727,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 736,
      "end_line": 745,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 738,col 9)-(line 743,col 9)",
        "(line 744,col 9)-(line 744,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 754,
      "end_line": 769,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 758,col 9)",
        "(line 759,col 9)-(line 759,col 52)",
        "(line 760,col 9)-(line 760,col 32)",
        "(line 761,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 767,col 38)",
        "(line 768,col 9)-(line 768,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDeflated(byte[], int, int)",
      "begin_line": 774,
      "end_line": 795,
      "comment": "\n     * write implementation for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 794,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 806,
      "end_line": 812,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 810,col 9)",
        "(line 811,col 9)-(line 811,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 820,
      "end_line": 825,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 822,col 9)-(line 824,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 833,
      "end_line": 833,
      "comment": "\n     * local file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 837,
      "end_line": 837,
      "comment": "\n     * data descriptor signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 841,
      "end_line": 841,
      "comment": "\n     * central file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 845,
      "end_line": 845,
      "comment": "\n     * end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_SIG"
      ],
      "begin_line": 849,
      "end_line": 849,
      "comment": "\n     * ZIP64 end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_LOC_SIG"
      ],
      "begin_line": 853,
      "end_line": 853,
      "comment": "\n     * ZIP64 end of central dir locator signature\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 859,
      "end_line": 865,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 50)",
        "(line 861,col 9)-(line 864,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 872,
      "end_line": 951,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 64)",
        "(line 875,col 9)-(line 875,col 38)",
        "(line 877,col 9)-(line 879,col 9)",
        "(line 881,col 9)-(line 881,col 47)",
        "(line 883,col 9)-(line 883,col 26)",
        "(line 884,col 9)-(line 884,col 24)",
        "(line 887,col 9)-(line 887,col 45)",
        "(line 889,col 9)-(line 892,col 76)",
        "(line 893,col 9)-(line 893,col 24)",
        "(line 896,col 9)-(line 896,col 47)",
        "(line 897,col 9)-(line 897,col 25)",
        "(line 900,col 9)-(line 900,col 50)",
        "(line 901,col 9)-(line 901,col 24)",
        "(line 906,col 9)-(line 906,col 39)",
        "(line 907,col 9)-(line 927,col 9)",
        "(line 929,col 9)-(line 929,col 22)",
        "(line 933,col 9)-(line 933,col 50)",
        "(line 934,col 9)-(line 934,col 25)",
        "(line 937,col 9)-(line 937,col 50)",
        "(line 938,col 9)-(line 938,col 50)",
        "(line 939,col 9)-(line 939,col 25)",
        "(line 942,col 9)-(line 943,col 49)",
        "(line 944,col 9)-(line 944,col 32)",
        "(line 947,col 9)-(line 947,col 24)",
        "(line 948,col 9)-(line 948,col 32)",
        "(line 950,col 9)-(line 950,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)",
      "begin_line": 958,
      "end_line": 986,
      "comment": "\n     * Adds UnicodeExtra fields for name and file comment if mode is\n     * ALWAYS or the data cannot be encoded using the configured\n     * encoding.\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 968,col 9)",
        "(line 970,col 9)-(line 970,col 38)",
        "(line 971,col 9)-(line 985,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 993,
      "end_line": 1009,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 996,col 9)",
        "(line 997,col 9)-(line 997,col 25)",
        "(line 998,col 9)-(line 998,col 48)",
        "(line 999,col 9)-(line 999,col 33)",
        "(line 1000,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1008,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1019,
      "end_line": 1128,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte and {@link Zip64Mode #setUseZip64} is {@link\n     * Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 26)",
        "(line 1021,col 9)-(line 1021,col 24)",
        "(line 1023,col 9)-(line 1023,col 59)",
        "(line 1024,col 9)-(line 1027,col 40)",
        "(line 1029,col 9)-(line 1035,col 9)",
        "(line 1037,col 9)-(line 1037,col 57)",
        "(line 1041,col 9)-(line 1043,col 73)",
        "(line 1044,col 9)-(line 1044,col 25)",
        "(line 1046,col 9)-(line 1046,col 45)",
        "(line 1047,col 9)-(line 1047,col 70)",
        "(line 1048,col 9)-(line 1051,col 74)",
        "(line 1052,col 9)-(line 1052,col 24)",
        "(line 1055,col 9)-(line 1055,col 47)",
        "(line 1056,col 9)-(line 1056,col 25)",
        "(line 1059,col 9)-(line 1059,col 50)",
        "(line 1060,col 9)-(line 1060,col 24)",
        "(line 1065,col 9)-(line 1065,col 48)",
        "(line 1066,col 9)-(line 1073,col 9)",
        "(line 1075,col 9)-(line 1075,col 22)",
        "(line 1078,col 9)-(line 1078,col 38)",
        "(line 1080,col 9)-(line 1080,col 50)",
        "(line 1081,col 9)-(line 1081,col 25)",
        "(line 1084,col 9)-(line 1084,col 53)",
        "(line 1085,col 9)-(line 1085,col 50)",
        "(line 1086,col 9)-(line 1086,col 25)",
        "(line 1089,col 9)-(line 1089,col 38)",
        "(line 1090,col 9)-(line 1092,col 9)",
        "(line 1094,col 9)-(line 1094,col 64)",
        "(line 1096,col 9)-(line 1096,col 54)",
        "(line 1097,col 9)-(line 1097,col 25)",
        "(line 1100,col 9)-(line 1100,col 23)",
        "(line 1101,col 9)-(line 1101,col 25)",
        "(line 1104,col 9)-(line 1104,col 64)",
        "(line 1105,col 9)-(line 1105,col 25)",
        "(line 1108,col 9)-(line 1108,col 63)",
        "(line 1109,col 9)-(line 1109,col 24)",
        "(line 1112,col 9)-(line 1112,col 69)",
        "(line 1113,col 9)-(line 1113,col 24)",
        "(line 1116,col 9)-(line 1117,col 49)",
        "(line 1118,col 9)-(line 1118,col 32)",
        "(line 1121,col 9)-(line 1121,col 24)",
        "(line 1122,col 9)-(line 1122,col 32)",
        "(line 1125,col 9)-(line 1126,col 57)",
        "(line 1127,col 9)-(line 1127,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean)",
      "begin_line": 1134,
      "end_line": 1152,
      "comment": "\n     * If the entry needs Zip64 extra information inside the central\n     * directory then configure its data.\n     ",
      "child_ranges": [
        "(line 1136,col 9)-(line 1151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 1161,
      "end_line": 1194,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link Zip64Mode #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 27)",
        "(line 1165,col 9)-(line 1165,col 23)",
        "(line 1166,col 9)-(line 1166,col 23)",
        "(line 1169,col 9)-(line 1169,col 45)",
        "(line 1170,col 9)-(line 1174,col 9)",
        "(line 1175,col 9)-(line 1178,col 9)",
        "(line 1180,col 9)-(line 1181,col 68)",
        "(line 1182,col 9)-(line 1182,col 22)",
        "(line 1183,col 9)-(line 1183,col 22)",
        "(line 1186,col 9)-(line 1186,col 68)",
        "(line 1187,col 9)-(line 1187,col 68)",
        "(line 1190,col 9)-(line 1190,col 59)",
        "(line 1191,col 9)-(line 1191,col 50)",
        "(line 1192,col 9)-(line 1193,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 1196,
      "end_line": 1196,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory()",
      "begin_line": 1204,
      "end_line": 1264,
      "comment": "\n     * Writes the \u0026quot;ZIP64 End of central dir record\u0026quot; and\n     * \u0026quot;ZIP64 End of central dir locator\u0026quot;.\n     * @throws IOException on error\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1205,col 9)-(line 1207,col 9)",
        "(line 1209,col 9)-(line 1214,col 9)",
        "(line 1216,col 9)-(line 1218,col 9)",
        "(line 1220,col 9)-(line 1220,col 30)",
        "(line 1222,col 9)-(line 1222,col 33)",
        "(line 1225,col 9)-(line 1234,col 30)",
        "(line 1237,col 9)-(line 1237,col 55)",
        "(line 1238,col 9)-(line 1238,col 55)",
        "(line 1241,col 9)-(line 1241,col 24)",
        "(line 1242,col 9)-(line 1242,col 24)",
        "(line 1245,col 9)-(line 1245,col 66)",
        "(line 1246,col 9)-(line 1246,col 22)",
        "(line 1247,col 9)-(line 1247,col 22)",
        "(line 1250,col 9)-(line 1250,col 57)",
        "(line 1251,col 9)-(line 1251,col 57)",
        "(line 1256,col 9)-(line 1256,col 37)",
        "(line 1259,col 9)-(line 1259,col 24)",
        "(line 1261,col 9)-(line 1261,col 55)",
        "(line 1263,col 9)-(line 1263,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 1271,
      "end_line": 1273,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1272,col 9)-(line 1272,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 1282,
      "end_line": 1289,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1284,col 9)-(line 1288,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflateUntilInputIsNeeded()",
      "begin_line": 1291,
      "end_line": 1295,
      "comment": "",
      "child_ranges": [
        "(line 1292,col 9)-(line 1294,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean, boolean)",
      "begin_line": 1297,
      "end_line": 1324,
      "comment": "",
      "child_ranges": [
        "(line 1306,col 9)-(line 1306,col 53)",
        "(line 1307,col 9)-(line 1307,col 54)",
        "(line 1308,col 9)-(line 1308,col 54)",
        "(line 1309,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1317,col 9)",
        "(line 1321,col 9)-(line 1321,col 60)",
        "(line 1323,col 9)-(line 1323,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 1337,
      "end_line": 1344,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     *\n     * \u003cp\u003eMust not be used if the stream has already been closed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1340,col 9)-(line 1342,col 9)",
        "(line 1343,col 9)-(line 1343,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1352,
      "end_line": 1376,
      "comment": "\n     * Get the existing ZIP64 extended information extra field or\n     * create a new one and add it to the entry.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1354,col 9)-(line 1356,col 9)",
        "(line 1357,col 9)-(line 1357,col 28)",
        "(line 1358,col 9)-(line 1361,col 41)",
        "(line 1362,col 9)-(line 1370,col 9)",
        "(line 1373,col 9)-(line 1373,col 37)",
        "(line 1375,col 9)-(line 1375,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1384,
      "end_line": 1388,
      "comment": "\n     * Is there a ZIP64 extended information extra field for the\n     * entry?\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1385,col 9)-(line 1387,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1397,
      "end_line": 1405,
      "comment": "\n     * If the mode is AsNeeded and the entry is a compressed entry of\n     * unknown size that gets written to a non-seekable stream the\n     * change the default to Never.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1398,col 9)-(line 1403,col 9)",
        "(line 1404,col 9)-(line 1404,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1407,
      "end_line": 1411,
      "comment": "",
      "child_ranges": [
        "(line 1408,col 9)-(line 1408,col 64)",
        "(line 1409,col 9)-(line 1410,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1413,
      "end_line": 1415,
      "comment": "",
      "child_ranges": [
        "(line 1414,col 9)-(line 1414,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy()",
      "begin_line": 1424,
      "end_line": 1431,
      "comment": "\n     * Closes the underlying stream/file without finishing the\n     * archive, the result will likely be a corrupt archive.\n     *\n     * \u003cp\u003eThis method only exists to support tests that generate\n     * corrupt archives so they can clean up any temporary files.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1425,col 9)-(line 1427,col 9)",
        "(line 1428,col 9)-(line 1430,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1437,
      "end_line": 1461,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 1441,
      "end_line": 1441,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 1445,
      "end_line": 1445,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 1450,
      "end_line": 1451,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1453,
      "end_line": 1453,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 1454,
      "end_line": 1456,
      "comment": "",
      "child_ranges": [
        "(line 1455,col 13)-(line 1455,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 1457,
      "end_line": 1460,
      "comment": "",
      "child_ranges": [
        "(line 1459,col 13)-(line 1459,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1467,
      "end_line": 1502,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being written.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1468,
      "end_line": 1470,
      "comment": "",
      "child_ranges": [
        "(line 1469,col 13)-(line 1469,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 1474,
      "end_line": 1474,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 1479,
      "end_line": 1479,
      "comment": "\n         * Offset for CRC entry in the local file header data for the\n         * current entry starts here.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 1483,
      "end_line": 1483,
      "comment": "\n         * Data for local header data\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1488,
      "end_line": 1488,
      "comment": "\n         * Number of bytes read for the current entry (can\u0027t rely on\n         * Deflater#getBytesRead) when using DEFLATED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "causedUseOfZip64"
      ],
      "begin_line": 1492,
      "end_line": 1492,
      "comment": "\n         * Whether current entry was the first one using ZIP64 features.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasWritten"
      ],
      "begin_line": 1501,
      "end_line": 1501,
      "comment": "\n         * Whether write() has been called at all.\n         *\n         * \u003cp\u003eIn order to create a valid archive {@link\n         * #closeArchiveEntry closeArchiveEntry} will write an empty\n         * array to get the CRC right if nothing has been written to\n         * the stream at all.\u003c/p\u003e\n         "
    }
  ]
}