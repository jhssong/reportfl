{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 74,
      "end_line": 1506,
      "comment": "\n * Reimplementation of {@link java.util.zip.ZipOutputStream\n * java.util.zip.ZipOutputStream} that does handle the extended\n * functionality of this package, especially internal/external file\n * attributes and extra fields with different layouts for local file\n * data and central directory entries.\n *\n * \u003cp\u003eThis class will try to use {@link java.io.RandomAccessFile\n * RandomAccessFile} when you know that the output is going to go to a\n * file.\u003c/p\u003e\n *\n * \u003cp\u003eIf RandomAccessFile cannot be used, this implementation will use\n * a Data Descriptor to store size and CRC information for {@link\n * #DEFLATED DEFLATED} entries, this means, you don\u0027t need to\n * calculate them yourself.  Unfortunately this is not possible for\n * the {@link #STORED STORED} method, here setting the CRC and\n * uncompressed size information is required before {@link\n * #putArchiveEntry(ArchiveEntry)} can be called.\u003c/p\u003e\n *\n * \u003cp\u003eAs of Apache Commons Compress 1.3 it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries in most cases but explicit\n * control is provided via {@link #setUseZip64}.  If the stream can not\n * user RandomAccessFile and you try to write a ZipArchiveEntry of\n * unknown size then Zip64 extensions will be disabled by default.\u003c/p\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " indicates if this archive is finished. protected for use in Jar implementation "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATER_BLOCK_SIZE"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " \n     * Apparently Deflater.setInput gets slowed down a lot on Sun JVMs\n     * when it gets handed a really big buffer.  See\n     * https://issues.apache.org/bugzilla/show_bug.cgi?id\u003d45396\n     *\n     * Using a buffer size of 8 kB proved to be a good compromise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATED"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Compression method for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COMPRESSION"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Default compression level for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STORED"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * Compression method for stored entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENCODING"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * default encoding for file names and comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EFS_FLAG"
      ],
      "begin_line": 115,
      "end_line": 116,
      "comment": "\n     * General purpose flag, which indicates that filenames are\n     * written in UTF-8.\n     * @deprecated use {@link GeneralPurposeBit#UFT8_NAMES_FLAG} instead\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Current entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * The file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Compression level for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasCompressionLevelChanged"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": "\n     * Has the compression level changed when compared to the last\n     * entry?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Default compression method for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 149,
      "end_line": 150,
      "comment": "\n     * List of ZipArchiveEntries written so far.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "crc"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * CRC instance to avoid parsing DEFLATED data twice.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "written"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n     * Count the bytes written to out.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdOffset"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": "\n     * Start of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdLength"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": "\n     * Length of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * Helper, a 0 as ZipShort.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZERO"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": "\n     * Helper, a 0 as ZipLong.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "offsets"
      ],
      "begin_line": 185,
      "end_line": 186,
      "comment": "\n     * Holds the offsets of the LFH starts for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 203,
      "end_line": 204,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     *\n     * This field is of internal use and will be set in {@link\n     * #setEncoding(String)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": "\n     * This Deflater object is used for output.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "buf"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n     * This buffer serves as a Deflater.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": "\n     * Optional random access output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useUTF8Flag"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": "\n     * whether to use the general purpose bit flag when writing UTF-8\n     * filenames or not.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fallbackToUTF8"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": "\n     * Whether to encode non-encodable file names as UTF-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "createUnicodeExtraFields"
      ],
      "begin_line": 239,
      "end_line": 239,
      "comment": "\n     * whether to create UnicodePathExtraField-s for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasUsedZip64"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": "\n     * Whether anything inside this archive has used a ZIP64 feature.\n     *\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zip64Mode"
      ],
      "begin_line": 248,
      "end_line": 248,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 254,
      "end_line": 257,
      "comment": "\n     * Creates a new ZIP OutputStream filtering the underlying stream.\n     * @param out the outputstream to zip\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 23)",
        "(line 256,col 9)-(line 256,col 24)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.File)",
      "begin_line": 265,
      "end_line": 284,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a File.  Will use\n     * random access if possible.\n     * @param file the file to zip to\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 30)",
        "(line 267,col 9)-(line 267,col 37)",
        "(line 268,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 16)",
        "(line 283,col 9)-(line 283,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * This method indicates whether this archive is writing to a\n     * seekable stream (i.e., to a random access file).\n     *\n     * \u003cp\u003eFor seekable streams, you don\u0027t need to calculate the CRC or\n     * uncompressed size for {@link #STORED} entries before\n     * invoking {@link #putArchiveEntry(ArchiveEntry)}.\n     * @return true if seekable\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setEncoding(java.lang.String)",
      "begin_line": 308,
      "end_line": 314,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 33)",
        "(line 310,col 9)-(line 310,col 70)",
        "(line 311,col 9)-(line 313,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag(boolean)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Whether Zip64 extensions will be used.\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Never Never},\n     * {@link #putArchiveEntry}, {@link #closeArchiveEntry}, {@link\n     * #finish} or {@link #close} may throw a {@link\n     * Zip64RequiredException} if the entry\u0027s size or the total size\n     * of the archive exceeds 4GB or there are more than 65536 entries\n     * inside the archive.  Any archive created in this mode will be\n     * readable by implementations that don\u0027t support Zip64.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Always Always},\n     * Zip64 extensions will be used for all entries.  Any archive\n     * created in this mode may be unreadable by implementations that\n     * don\u0027t support Zip64 even if all its contents would be.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#AsNeeded\n     * AsNeeded}, Zip64 extensions will transparently be used for\n     * those entries that require them.  This mode can only be used if\n     * the uncompressed size of the {@link ZipArchiveEntry} is known\n     * when calling {@link #putArchiveEntry} or the archive is written\n     * to a seekable output (i.e. you have used the {@link\n     * #ZipArchiveOutputStream(java.io.File) File-arg constructor}) -\n     * this mode is not valid when the output stream is not seekable\n     * and the uncompressed size is unknown when {@link\n     * #putArchiveEntry} is called.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf no entry inside the resulting archive requires Zip64\n     * extensions then {@link Zip64Mode#Never Never} will create the\n     * smallest archive.  {@link Zip64Mode#AsNeeded AsNeeded} will\n     * create a slightly bigger archive if the uncompressed size of\n     * any entry has initially been unknown and create an archive\n     * identical to {@link Zip64Mode#Never Never} otherwise.  {@link\n     * Zip64Mode#Always Always} will create an archive that is at\n     * least 24 bytes per entry bigger than the one {@link\n     * Zip64Mode#Never Never} would create.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to {@link Zip64Mode#AsNeeded AsNeeded} unless\n     * {@link #putArchiveEntry} is called with an entry of unknown\n     * size and data is written to a non-seekable stream - in this\n     * case the default is {@link Zip64Mode#Never Never}.\u003c/p\u003e\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 408,
      "end_line": 429,
      "comment": "\n     * {@inheritDoc}\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 27)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 38)",
        "(line 423,col 9)-(line 423,col 37)",
        "(line 424,col 9)-(line 424,col 35)",
        "(line 425,col 9)-(line 425,col 24)",
        "(line 426,col 9)-(line 426,col 24)",
        "(line 427,col 9)-(line 427,col 18)",
        "(line 428,col 9)-(line 428,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 438,
      "end_line": 468,
      "comment": "\n     * Writes all necessary data for this entry.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size exceeds 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 442,col 9)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 448,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 452,col 24)",
        "(line 454,col 9)-(line 454,col 75)",
        "(line 455,col 9)-(line 455,col 54)",
        "(line 456,col 9)-(line 456,col 38)",
        "(line 457,col 9)-(line 457,col 20)",
        "(line 459,col 9)-(line 460,col 68)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 466,col 41)",
        "(line 467,col 9)-(line 467,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater()",
      "begin_line": 473,
      "end_line": 480,
      "comment": "\n     * Ensures all bytes sent to the deflater are written to the stream.\n     ",
      "child_ranges": [
        "(line 474,col 9)-(line 479,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 488,
      "end_line": 531,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 521,col 9)",
        "(line 523,col 9)-(line 525,col 62)",
        "(line 526,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 530,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(boolean)",
      "begin_line": 538,
      "end_line": 581,
      "comment": "\n     * When using random access output, write the local file header\n     * and potentiall the ZIP64 extra containing the correct CRC and\n     * compressed/uncompressed sizes.\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 41)",
        "(line 542,col 9)-(line 542,col 39)",
        "(line 543,col 9)-(line 543,col 57)",
        "(line 544,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 590,
      "end_line": 630,
      "comment": "\n     * {@inheritDoc} \n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 594,col 9)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 600,col 9)-(line 600,col 65)",
        "(line 601,col 9)-(line 601,col 33)",
        "(line 603,col 9)-(line 603,col 33)",
        "(line 605,col 9)-(line 605,col 75)",
        "(line 606,col 9)-(line 606,col 47)",
        "(line 608,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 629,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 636,
      "end_line": 644,
      "comment": "\n     * Provides default values for compression method and last\n     * modification time.\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 639,col 9)",
        "(line 641,col 9)-(line 643,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 652,
      "end_line": 674,
      "comment": "\n     * Throws an exception if the size is unknown for a stored entry\n     * that is written to a non-seekable output or the entry is too\n     * big to be written without Zip64 extra but the mode has been set\n     * to Never.\n     ",
      "child_ranges": [
        "(line 655,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 673,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 690,
      "end_line": 696,
      "comment": "\n     * Whether to addd a Zip64 extended information extra field to the\n     * local file header.\n     *\n     * \u003cp\u003eReturns true if\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003emode is Always\u003c/li\u003e\n     * \u003cli\u003eor we already know it is going to be needed\u003c/li\u003e\n     * \u003cli\u003eor the size is unknown and we can ensure it won\u0027t hurt\n     * other implementations if we add it (i.e. we can erase its\n     * usage\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 695,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 702,
      "end_line": 704,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 714,
      "end_line": 722,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 715,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 59)",
        "(line 721,col 9)-(line 721,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 730,
      "end_line": 732,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 741,
      "end_line": 750,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 748,col 9)",
        "(line 749,col 9)-(line 749,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 759,
      "end_line": 771,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 761,col 9)-(line 761,col 52)",
        "(line 762,col 9)-(line 762,col 32)",
        "(line 763,col 9)-(line 768,col 9)",
        "(line 769,col 9)-(line 769,col 38)",
        "(line 770,col 9)-(line 770,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDeflated(byte[], int, int)",
      "begin_line": 776,
      "end_line": 797,
      "comment": "\n     * write implementation for DEFLATED entries.\n     ",
      "child_ranges": [
        "(line 778,col 9)-(line 796,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 808,
      "end_line": 814,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 810,col 9)-(line 812,col 9)",
        "(line 813,col 9)-(line 813,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 822,
      "end_line": 827,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 824,col 9)-(line 826,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 835,
      "end_line": 835,
      "comment": "\n     * local file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 839,
      "end_line": 839,
      "comment": "\n     * data descriptor signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 843,
      "end_line": 843,
      "comment": "\n     * central file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 847,
      "end_line": 847,
      "comment": "\n     * end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_SIG"
      ],
      "begin_line": 851,
      "end_line": 851,
      "comment": "\n     * ZIP64 end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_LOC_SIG"
      ],
      "begin_line": 855,
      "end_line": 855,
      "comment": "\n     * ZIP64 end of central dir locator signature\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 861,
      "end_line": 867,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 50)",
        "(line 863,col 9)-(line 866,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 874,
      "end_line": 953,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 876,col 9)-(line 876,col 64)",
        "(line 877,col 9)-(line 877,col 38)",
        "(line 879,col 9)-(line 881,col 9)",
        "(line 883,col 9)-(line 883,col 47)",
        "(line 885,col 9)-(line 885,col 26)",
        "(line 886,col 9)-(line 886,col 24)",
        "(line 889,col 9)-(line 889,col 45)",
        "(line 891,col 9)-(line 894,col 76)",
        "(line 895,col 9)-(line 895,col 24)",
        "(line 898,col 9)-(line 898,col 47)",
        "(line 899,col 9)-(line 899,col 25)",
        "(line 902,col 9)-(line 902,col 50)",
        "(line 903,col 9)-(line 903,col 24)",
        "(line 908,col 9)-(line 908,col 39)",
        "(line 909,col 9)-(line 929,col 9)",
        "(line 931,col 9)-(line 931,col 22)",
        "(line 935,col 9)-(line 935,col 50)",
        "(line 936,col 9)-(line 936,col 25)",
        "(line 939,col 9)-(line 939,col 50)",
        "(line 940,col 9)-(line 940,col 50)",
        "(line 941,col 9)-(line 941,col 25)",
        "(line 944,col 9)-(line 945,col 49)",
        "(line 946,col 9)-(line 946,col 32)",
        "(line 949,col 9)-(line 949,col 24)",
        "(line 950,col 9)-(line 950,col 32)",
        "(line 952,col 9)-(line 952,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)",
      "begin_line": 960,
      "end_line": 988,
      "comment": "\n     * Adds UnicodeExtra fields for name and file comment if mode is\n     * ALWAYS or the data cannot be encoded using the configured\n     * encoding.\n     ",
      "child_ranges": [
        "(line 963,col 9)-(line 970,col 9)",
        "(line 972,col 9)-(line 972,col 38)",
        "(line 973,col 9)-(line 987,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 995,
      "end_line": 1011,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 998,col 9)",
        "(line 999,col 9)-(line 999,col 25)",
        "(line 1000,col 9)-(line 1000,col 48)",
        "(line 1001,col 9)-(line 1001,col 33)",
        "(line 1002,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1010,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1021,
      "end_line": 1130,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte and {@link Zip64Mode #setUseZip64} is {@link\n     * Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 26)",
        "(line 1023,col 9)-(line 1023,col 24)",
        "(line 1025,col 9)-(line 1025,col 59)",
        "(line 1026,col 9)-(line 1029,col 40)",
        "(line 1031,col 9)-(line 1037,col 9)",
        "(line 1039,col 9)-(line 1039,col 57)",
        "(line 1043,col 9)-(line 1045,col 73)",
        "(line 1046,col 9)-(line 1046,col 25)",
        "(line 1048,col 9)-(line 1048,col 45)",
        "(line 1049,col 9)-(line 1049,col 70)",
        "(line 1050,col 9)-(line 1053,col 74)",
        "(line 1054,col 9)-(line 1054,col 24)",
        "(line 1057,col 9)-(line 1057,col 47)",
        "(line 1058,col 9)-(line 1058,col 25)",
        "(line 1061,col 9)-(line 1061,col 50)",
        "(line 1062,col 9)-(line 1062,col 24)",
        "(line 1067,col 9)-(line 1067,col 48)",
        "(line 1068,col 9)-(line 1075,col 9)",
        "(line 1077,col 9)-(line 1077,col 22)",
        "(line 1080,col 9)-(line 1080,col 38)",
        "(line 1082,col 9)-(line 1082,col 50)",
        "(line 1083,col 9)-(line 1083,col 25)",
        "(line 1086,col 9)-(line 1086,col 53)",
        "(line 1087,col 9)-(line 1087,col 50)",
        "(line 1088,col 9)-(line 1088,col 25)",
        "(line 1091,col 9)-(line 1091,col 38)",
        "(line 1092,col 9)-(line 1094,col 9)",
        "(line 1096,col 9)-(line 1096,col 64)",
        "(line 1098,col 9)-(line 1098,col 54)",
        "(line 1099,col 9)-(line 1099,col 25)",
        "(line 1102,col 9)-(line 1102,col 23)",
        "(line 1103,col 9)-(line 1103,col 25)",
        "(line 1106,col 9)-(line 1106,col 64)",
        "(line 1107,col 9)-(line 1107,col 25)",
        "(line 1110,col 9)-(line 1110,col 63)",
        "(line 1111,col 9)-(line 1111,col 24)",
        "(line 1114,col 9)-(line 1114,col 69)",
        "(line 1115,col 9)-(line 1115,col 24)",
        "(line 1118,col 9)-(line 1119,col 49)",
        "(line 1120,col 9)-(line 1120,col 32)",
        "(line 1123,col 9)-(line 1123,col 24)",
        "(line 1124,col 9)-(line 1124,col 32)",
        "(line 1127,col 9)-(line 1128,col 57)",
        "(line 1129,col 9)-(line 1129,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean)",
      "begin_line": 1136,
      "end_line": 1154,
      "comment": "\n     * If the entry needs Zip64 extra information inside the central\n     * directory then configure its data.\n     ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1153,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 1163,
      "end_line": 1196,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link Zip64Mode #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1164,col 9)-(line 1164,col 27)",
        "(line 1167,col 9)-(line 1167,col 23)",
        "(line 1168,col 9)-(line 1168,col 23)",
        "(line 1171,col 9)-(line 1171,col 45)",
        "(line 1172,col 9)-(line 1176,col 9)",
        "(line 1177,col 9)-(line 1180,col 9)",
        "(line 1182,col 9)-(line 1183,col 68)",
        "(line 1184,col 9)-(line 1184,col 22)",
        "(line 1185,col 9)-(line 1185,col 22)",
        "(line 1188,col 9)-(line 1188,col 68)",
        "(line 1189,col 9)-(line 1189,col 68)",
        "(line 1192,col 9)-(line 1192,col 59)",
        "(line 1193,col 9)-(line 1193,col 50)",
        "(line 1194,col 9)-(line 1195,col 49)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 1198,
      "end_line": 1198,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory()",
      "begin_line": 1206,
      "end_line": 1266,
      "comment": "\n     * Writes the \u0026quot;ZIP64 End of central dir record\u0026quot; and\n     * \u0026quot;ZIP64 End of central dir locator\u0026quot;.\n     * @throws IOException on error\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1207,col 9)-(line 1209,col 9)",
        "(line 1211,col 9)-(line 1216,col 9)",
        "(line 1218,col 9)-(line 1220,col 9)",
        "(line 1222,col 9)-(line 1222,col 30)",
        "(line 1224,col 9)-(line 1224,col 33)",
        "(line 1227,col 9)-(line 1236,col 30)",
        "(line 1239,col 9)-(line 1239,col 55)",
        "(line 1240,col 9)-(line 1240,col 55)",
        "(line 1243,col 9)-(line 1243,col 24)",
        "(line 1244,col 9)-(line 1244,col 24)",
        "(line 1247,col 9)-(line 1247,col 66)",
        "(line 1248,col 9)-(line 1248,col 22)",
        "(line 1249,col 9)-(line 1249,col 22)",
        "(line 1252,col 9)-(line 1252,col 57)",
        "(line 1253,col 9)-(line 1253,col 57)",
        "(line 1258,col 9)-(line 1258,col 37)",
        "(line 1261,col 9)-(line 1261,col 24)",
        "(line 1263,col 9)-(line 1263,col 55)",
        "(line 1265,col 9)-(line 1265,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 1273,
      "end_line": 1275,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 1284,
      "end_line": 1291,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1286,col 9)-(line 1290,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflateUntilInputIsNeeded()",
      "begin_line": 1293,
      "end_line": 1297,
      "comment": "",
      "child_ranges": [
        "(line 1294,col 9)-(line 1296,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeVersionNeededToExtractAndGeneralPurposeBits(int, boolean, boolean)",
      "begin_line": 1299,
      "end_line": 1326,
      "comment": "",
      "child_ranges": [
        "(line 1308,col 9)-(line 1308,col 53)",
        "(line 1309,col 9)-(line 1309,col 54)",
        "(line 1310,col 9)-(line 1310,col 54)",
        "(line 1311,col 9)-(line 1316,col 9)",
        "(line 1317,col 9)-(line 1319,col 9)",
        "(line 1323,col 9)-(line 1323,col 60)",
        "(line 1325,col 9)-(line 1325,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 1339,
      "end_line": 1346,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     *\n     * \u003cp\u003eMust not be used if the stream has already been closed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1342,col 9)-(line 1344,col 9)",
        "(line 1345,col 9)-(line 1345,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1354,
      "end_line": 1378,
      "comment": "\n     * Get the existing ZIP64 extended information extra field or\n     * create a new one and add it to the entry.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1356,col 9)-(line 1358,col 9)",
        "(line 1359,col 9)-(line 1359,col 28)",
        "(line 1360,col 9)-(line 1363,col 41)",
        "(line 1364,col 9)-(line 1372,col 9)",
        "(line 1375,col 9)-(line 1375,col 37)",
        "(line 1377,col 9)-(line 1377,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1386,
      "end_line": 1390,
      "comment": "\n     * Is there a ZIP64 extended information extra field for the\n     * entry?\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1387,col 9)-(line 1389,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1399,
      "end_line": 1407,
      "comment": "\n     * If the mode is AsNeeded and the entry is a compressed entry of\n     * unknown size that gets written to a non-seekable stream the\n     * change the default to Never.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1400,col 9)-(line 1405,col 9)",
        "(line 1406,col 9)-(line 1406,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1409,
      "end_line": 1413,
      "comment": "",
      "child_ranges": [
        "(line 1410,col 9)-(line 1410,col 64)",
        "(line 1411,col 9)-(line 1412,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1415,
      "end_line": 1417,
      "comment": "",
      "child_ranges": [
        "(line 1416,col 9)-(line 1416,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy()",
      "begin_line": 1426,
      "end_line": 1433,
      "comment": "\n     * Closes the underlying stream/file without finishing the\n     * archive, the result will likely be a corrupt archive.\n     *\n     * \u003cp\u003eThis method only exists to support tests that generate\n     * corrupt archives so they can clean up any temporary files.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1427,col 9)-(line 1429,col 9)",
        "(line 1430,col 9)-(line 1432,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1439,
      "end_line": 1463,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 1443,
      "end_line": 1443,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 1447,
      "end_line": 1447,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 1452,
      "end_line": 1453,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1455,
      "end_line": 1455,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 1456,
      "end_line": 1458,
      "comment": "",
      "child_ranges": [
        "(line 1457,col 13)-(line 1457,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 1459,
      "end_line": 1462,
      "comment": "",
      "child_ranges": [
        "(line 1461,col 13)-(line 1461,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1469,
      "end_line": 1504,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being written.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1470,
      "end_line": 1472,
      "comment": "",
      "child_ranges": [
        "(line 1471,col 13)-(line 1471,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 1476,
      "end_line": 1476,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 1481,
      "end_line": 1481,
      "comment": "\n         * Offset for CRC entry in the local file header data for the\n         * current entry starts here.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 1485,
      "end_line": 1485,
      "comment": "\n         * Data for local header data\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1490,
      "end_line": 1490,
      "comment": "\n         * Number of bytes read for the current entry (can\u0027t rely on\n         * Deflater#getBytesRead) when using DEFLATED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "causedUseOfZip64"
      ],
      "begin_line": 1494,
      "end_line": 1494,
      "comment": "\n         * Whether current entry was the first one using ZIP64 features.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasWritten"
      ],
      "begin_line": 1503,
      "end_line": 1503,
      "comment": "\n         * Whether write() has been called at all.\n         *\n         * \u003cp\u003eIn order to create a valid archive {@link\n         * #closeArchiveEntry closeArchiveEntry} will write an empty\n         * array to get the CRC right if nothing has been written to\n         * the stream at all.\u003c/p\u003e\n         "
    }
  ]
}