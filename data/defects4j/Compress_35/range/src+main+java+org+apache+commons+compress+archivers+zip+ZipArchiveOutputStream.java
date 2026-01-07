{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 79,
      "end_line": 1623,
      "comment": "\n * Reimplementation of {@link java.util.zip.ZipOutputStream\n * java.util.zip.ZipOutputStream} that does handle the extended\n * functionality of this package, especially internal/external file\n * attributes and extra fields with different layouts for local file\n * data and central directory entries.\n *\n * \u003cp\u003eThis class will try to use {@link java.io.RandomAccessFile\n * RandomAccessFile} when you know that the output is going to go to a\n * file.\u003c/p\u003e\n *\n * \u003cp\u003eIf RandomAccessFile cannot be used, this implementation will use\n * a Data Descriptor to store size and CRC information for {@link\n * #DEFLATED DEFLATED} entries, this means, you don\u0027t need to\n * calculate them yourself.  Unfortunately this is not possible for\n * the {@link #STORED STORED} method, here setting the CRC and\n * uncompressed size information is required before {@link\n * #putArchiveEntry(ArchiveEntry)} can be called.\u003c/p\u003e\n *\n * \u003cp\u003eAs of Apache Commons Compress 1.3 it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries in most cases but explicit\n * control is provided via {@link #setUseZip64}.  If the stream can not\n * user RandomAccessFile and you try to write a ZipArchiveEntry of\n * unknown size then Zip64 extensions will be disabled by default.\u003c/p\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG_OFFSET"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_VERSION_NEEDED_OFFSET"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_GPB_OFFSET"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_METHOD_OFFSET"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_TIME_OFFSET"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_CRC_OFFSET"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_COMPRESSED_SIZE_OFFSET"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_ORIGINAL_SIZE_OFFSET"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_FILENAME_LENGTH_OFFSET"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_EXTRA_LENGTH_OFFSET"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_FILENAME_OFFSET"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG_OFFSET"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_VERSION_MADE_BY_OFFSET"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_VERSION_NEEDED_OFFSET"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_GPB_OFFSET"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_METHOD_OFFSET"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_TIME_OFFSET"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_CRC_OFFSET"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_COMPRESSED_SIZE_OFFSET"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_ORIGINAL_SIZE_OFFSET"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_FILENAME_LENGTH_OFFSET"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_EXTRA_LENGTH_OFFSET"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_COMMENT_LENGTH_OFFSET"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_DISK_NUMBER_OFFSET"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_INTERNAL_ATTRIBUTES_OFFSET"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_EXTERNAL_ATTRIBUTES_OFFSET"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LFH_OFFSET"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_FILENAME_OFFSET"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " indicates if this archive is finished. protected for use in Jar implementation "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATER_BLOCK_SIZE"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " \n     * Apparently Deflater.setInput gets slowed down a lot on Sun JVMs\n     * when it gets handed a really big buffer.  See\n     * https://issues.apache.org/bugzilla/show_bug.cgi?id\u003d45396\n     *\n     * Using a buffer size of 8 kB proved to be a good compromise\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATED"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Compression method for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COMPRESSION"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Default compression level for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STORED"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Compression method for stored entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENCODING"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * default encoding for file names and comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EFS_FLAG"
      ],
      "begin_line": 148,
      "end_line": 149,
      "comment": "\n     * General purpose flag, which indicates that filenames are\n     * written in UTF-8.\n     * @deprecated use {@link GeneralPurposeBit#UFT8_NAMES_FLAG} instead\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": "\n     * Current entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": "\n     * The file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": "\n     * Compression level for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasCompressionLevelChanged"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": "\n     * Has the compression level changed when compared to the last\n     * entry?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": "\n     * Default compression method for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 182,
      "end_line": 183,
      "comment": "\n     * List of ZipArchiveEntries written so far.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "streamCompressor"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cdOffset"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": "\n     * Start of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdLength"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": "\n     * Length of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": "\n     * Helper, a 0 as ZipShort.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZERO"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": "\n     * Helper, a 0 as ZipLong.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offsets"
      ],
      "begin_line": 212,
      "end_line": 213,
      "comment": "\n     * Holds the offsets of the LFH starts for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 230,
      "end_line": 231,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     *\n     * This field is of internal use and will be set in {@link\n     * #setEncoding(String)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": "\n     * This Deflater object is used for output.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": "\n     * Optional random access output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useUTF8Flag"
      ],
      "begin_line": 250,
      "end_line": 250,
      "comment": "\n     * whether to use the general purpose bit flag when writing UTF-8\n     * filenames or not.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fallbackToUTF8"
      ],
      "begin_line": 255,
      "end_line": 255,
      "comment": "\n     * Whether to encode non-encodable file names as UTF-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "createUnicodeExtraFields"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": "\n     * whether to create UnicodePathExtraField-s for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasUsedZip64"
      ],
      "begin_line": 267,
      "end_line": 267,
      "comment": "\n     * Whether anything inside this archive has used a ZIP64 feature.\n     *\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zip64Mode"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "copyBuffer"
      ],
      "begin_line": 271,
      "end_line": 271,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calendarInstance"
      ],
      "begin_line": 272,
      "end_line": 272,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 278,
      "end_line": 283,
      "comment": "\n     * Creates a new ZIP OutputStream filtering the underlying stream.\n     * @param out the outputstream to zip\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 23)",
        "(line 280,col 9)-(line 280,col 24)",
        "(line 281,col 9)-(line 281,col 40)",
        "(line 282,col 9)-(line 282,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.File)",
      "begin_line": 291,
      "end_line": 306,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a File.  Will use\n     * random access if possible.\n     * @param file the file to zip to\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 30)",
        "(line 293,col 9)-(line 293,col 37)",
        "(line 294,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 40)",
        "(line 303,col 9)-(line 303,col 62)",
        "(line 304,col 9)-(line 304,col 16)",
        "(line 305,col 9)-(line 305,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * This method indicates whether this archive is writing to a\n     * seekable stream (i.e., to a random access file).\n     *\n     * \u003cp\u003eFor seekable streams, you don\u0027t need to calculate the CRC or\n     * uncompressed size for {@link #STORED} entries before\n     * invoking {@link #putArchiveEntry(ArchiveEntry)}.\n     * @return true if seekable\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setEncoding(java.lang.String)",
      "begin_line": 330,
      "end_line": 336,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 33)",
        "(line 332,col 9)-(line 332,col 70)",
        "(line 333,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag(boolean)",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     *\n     * @param b whether to set the language encoding flag if the file\n     * name encoding is UTF-8\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     *\n     * @param b whether to create Unicode Extra Fields.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     *\n     * @param b whether to fall back to UTF and the language encoding\n     * flag if the file name cannot be encoded using the specified\n     * encoding.\n     ",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * Whether Zip64 extensions will be used.\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Never Never},\n     * {@link #putArchiveEntry}, {@link #closeArchiveEntry}, {@link\n     * #finish} or {@link #close} may throw a {@link\n     * Zip64RequiredException} if the entry\u0027s size or the total size\n     * of the archive exceeds 4GB or there are more than 65536 entries\n     * inside the archive.  Any archive created in this mode will be\n     * readable by implementations that don\u0027t support Zip64.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Always Always},\n     * Zip64 extensions will be used for all entries.  Any archive\n     * created in this mode may be unreadable by implementations that\n     * don\u0027t support Zip64 even if all its contents would be.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#AsNeeded\n     * AsNeeded}, Zip64 extensions will transparently be used for\n     * those entries that require them.  This mode can only be used if\n     * the uncompressed size of the {@link ZipArchiveEntry} is known\n     * when calling {@link #putArchiveEntry} or the archive is written\n     * to a seekable output (i.e. you have used the {@link\n     * #ZipArchiveOutputStream(java.io.File) File-arg constructor}) -\n     * this mode is not valid when the output stream is not seekable\n     * and the uncompressed size is unknown when {@link\n     * #putArchiveEntry} is called.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf no entry inside the resulting archive requires Zip64\n     * extensions then {@link Zip64Mode#Never Never} will create the\n     * smallest archive.  {@link Zip64Mode#AsNeeded AsNeeded} will\n     * create a slightly bigger archive if the uncompressed size of\n     * any entry has initially been unknown and create an archive\n     * identical to {@link Zip64Mode#Never Never} otherwise.  {@link\n     * Zip64Mode#Always Always} will create an archive that is at\n     * least 24 bytes per entry bigger than the one {@link\n     * Zip64Mode#Never Never} would create.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to {@link Zip64Mode#AsNeeded AsNeeded} unless\n     * {@link #putArchiveEntry} is called with an entry of unknown\n     * size and data is written to a non-seekable stream - in this\n     * case the default is {@link Zip64Mode#Never Never}.\u003c/p\u003e\n     *\n     * @since 1.3\n     * @param mode Whether Zip64 extensions will be used.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 440,
      "end_line": 460,
      "comment": "\n     * {@inheritDoc}\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 450,col 59)",
        "(line 451,col 9)-(line 451,col 40)",
        "(line 453,col 9)-(line 453,col 70)",
        "(line 454,col 9)-(line 454,col 37)",
        "(line 455,col 9)-(line 455,col 35)",
        "(line 456,col 9)-(line 456,col 24)",
        "(line 457,col 9)-(line 457,col 24)",
        "(line 458,col 9)-(line 458,col 33)",
        "(line 459,col 9)-(line 459,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryInChunks()",
      "begin_line": 462,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 33)",
        "(line 464,col 9)-(line 464,col 100)",
        "(line 465,col 9)-(line 465,col 22)",
        "(line 466,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 484,
      "end_line": 497,
      "comment": "\n     * Writes all necessary data for this entry.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size exceeds 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 19)",
        "(line 488,col 9)-(line 488,col 24)",
        "(line 490,col 9)-(line 490,col 86)",
        "(line 491,col 9)-(line 491,col 51)",
        "(line 492,col 9)-(line 492,col 58)",
        "(line 493,col 9)-(line 493,col 75)",
        "(line 494,col 9)-(line 494,col 99)",
        "(line 495,col 9)-(line 495,col 46)",
        "(line 496,col 9)-(line 496,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry(boolean)",
      "begin_line": 509,
      "end_line": 515,
      "comment": "\n     * Writes all necessary data for this entry.\n     *\n     * @throws IOException            on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     *                                compressed size exceeds 4 GByte and {@link #setUseZip64}\n     *                                is {@link Zip64Mode#Never}.\n     * @param phased              This entry is second phase of a 2-phase zip creation, size, compressed size and crc\n     *                            are known in ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 19)",
        "(line 511,col 9)-(line 511,col 48)",
        "(line 512,col 9)-(line 512,col 69)",
        "(line 513,col 9)-(line 513,col 70)",
        "(line 514,col 9)-(line 514,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeEntry(boolean, boolean)",
      "begin_line": 517,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 522,col 9)-(line 522,col 41)",
        "(line 523,col 9)-(line 523,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose()",
      "begin_line": 526,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 529,col 9)",
        "(line 531,col 9)-(line 533,col 9)",
        "(line 535,col 9)-(line 537,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)",
      "begin_line": 553,
      "end_line": 568,
      "comment": "\n     * Adds an archive entry with a raw input stream.\n     *\n     * If crc, size and compressed size are supplied on the entry, these values will be used as-is.\n     * Zip64 status is re-established based on the settings in this stream, and the supplied value\n     * is ignored.\n     *\n     * The entry is put and closed immediately.\n     *\n     * @param entry The archive entry to add\n     * @param rawStream The raw input stream of a different entry. May be compressed/encrypted.\n     * @throws IOException If copying fails\n     ",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 56)",
        "(line 556,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 564,col 71)",
        "(line 565,col 9)-(line 565,col 44)",
        "(line 566,col 9)-(line 566,col 42)",
        "(line 567,col 9)-(line 567,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater()",
      "begin_line": 573,
      "end_line": 577,
      "comment": "\n     * Ensures all bytes sent to the deflater are written to the stream.\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 576,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 585,
      "end_line": 620,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 619,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 628,
      "end_line": 635,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 87)",
        "(line 631,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 637,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 641,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(boolean)",
      "begin_line": 650,
      "end_line": 695,
      "comment": "\n     * When using random access output, write the local file header\n     * and potentiall the ZIP64 extra containing the correct CRC and\n     * compressed/uncompressed sizes.\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 41)",
        "(line 654,col 9)-(line 654,col 39)",
        "(line 655,col 9)-(line 655,col 57)",
        "(line 656,col 9)-(line 662,col 9)",
        "(line 664,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 694,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 704,
      "end_line": 707,
      "comment": "\n     * {@inheritDoc} \n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 706,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry, boolean)",
      "begin_line": 721,
      "end_line": 765,
      "comment": "\n     * Writes the headers for an archive entry to the output stream.\n     * The caller must then write the content to the stream and call\n     * {@link #closeArchiveEntry()} to complete the process.\n\n     * @param archiveEntry The archiveEntry\n     * @param phased If true size, compressedSize and crc required to be known up-front in the archiveEntry\n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64}\n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 724,col 9)",
        "(line 726,col 9)-(line 728,col 9)",
        "(line 730,col 9)-(line 730,col 65)",
        "(line 731,col 9)-(line 731,col 33)",
        "(line 733,col 9)-(line 733,col 33)",
        "(line 735,col 9)-(line 735,col 75)",
        "(line 736,col 9)-(line 736,col 47)",
        "(line 738,col 9)-(line 758,col 9)",
        "(line 760,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 771,
      "end_line": 779,
      "comment": "\n     * Provides default values for compression method and last\n     * modification time.\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 774,col 9)",
        "(line 776,col 9)-(line 778,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 787,
      "end_line": 809,
      "comment": "\n     * Throws an exception if the size is unknown for a stored entry\n     * that is written to a non-seekable output or the entry is too\n     * big to be written without Zip64 extra but the mode has been set\n     * to Never.\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 801,col 9)",
        "(line 803,col 9)-(line 808,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 825,
      "end_line": 831,
      "comment": "\n     * Whether to addd a Zip64 extended information extra field to the\n     * local file header.\n     *\n     * \u003cp\u003eReturns true if\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003emode is Always\u003c/li\u003e\n     * \u003cli\u003eor we already know it is going to be needed\u003c/li\u003e\n     * \u003cli\u003eor the size is unknown and we can ensure it won\u0027t hurt\n     * other implementations if we add it (i.e. we can erase its\n     * usage\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 830,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 837,
      "end_line": 839,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 849,
      "end_line": 857,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 850,col 9)-(line 854,col 9)",
        "(line 855,col 9)-(line 855,col 59)",
        "(line 856,col 9)-(line 856,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 865,
      "end_line": 867,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 876,
      "end_line": 885,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 878,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 894,
      "end_line": 902,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 898,col 9)",
        "(line 899,col 9)-(line 899,col 52)",
        "(line 900,col 9)-(line 900,col 98)",
        "(line 901,col 9)-(line 901,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(byte[])",
      "begin_line": 909,
      "end_line": 911,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.copyFromZipInputStream(java.io.InputStream)",
      "begin_line": 913,
      "end_line": 925,
      "comment": "",
      "child_ranges": [
        "(line 914,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 52)",
        "(line 918,col 9)-(line 918,col 32)",
        "(line 919,col 9)-(line 919,col 19)",
        "(line 920,col 9)-(line 924,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 936,
      "end_line": 942,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 938,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 941,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 950,
      "end_line": 955,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 952,col 9)-(line 954,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 963,
      "end_line": 963,
      "comment": "\n     * local file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 967,
      "end_line": 967,
      "comment": "\n     * data descriptor signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 971,
      "end_line": 971,
      "comment": "\n     * central file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 975,
      "end_line": 975,
      "comment": "\n     * end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_SIG"
      ],
      "begin_line": 979,
      "end_line": 979,
      "comment": "\n     * ZIP64 end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_LOC_SIG"
      ],
      "begin_line": 983,
      "end_line": 983,
      "comment": "\n     * ZIP64 end of central dir locator signature\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 989,
      "end_line": 991,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 998,
      "end_line": 1000,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean)",
      "begin_line": 1002,
      "end_line": 1016,
      "comment": "",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 64)",
        "(line 1004,col 9)-(line 1004,col 38)",
        "(line 1006,col 9)-(line 1008,col 9)",
        "(line 1010,col 9)-(line 1010,col 86)",
        "(line 1011,col 9)-(line 1011,col 72)",
        "(line 1012,col 9)-(line 1012,col 42)",
        "(line 1013,col 9)-(line 1013,col 65)",
        "(line 1014,col 9)-(line 1014,col 34)",
        "(line 1015,col 9)-(line 1015,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, boolean, boolean)",
      "begin_line": 1019,
      "end_line": 1083,
      "comment": "",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 50)",
        "(line 1022,col 9)-(line 1022,col 59)",
        "(line 1023,col 9)-(line 1023,col 62)",
        "(line 1024,col 9)-(line 1024,col 35)",
        "(line 1026,col 9)-(line 1026,col 65)",
        "(line 1029,col 9)-(line 1029,col 45)",
        "(line 1031,col 9)-(line 1035,col 9)",
        "(line 1037,col 9)-(line 1037,col 109)",
        "(line 1038,col 9)-(line 1038,col 54)",
        "(line 1041,col 9)-(line 1041,col 52)",
        "(line 1043,col 9)-(line 1043,col 80)",
        "(line 1046,col 9)-(line 1052,col 9)",
        "(line 1056,col 9)-(line 1071,col 9)",
        "(line 1073,col 9)-(line 1073,col 59)",
        "(line 1076,col 9)-(line 1076,col 61)",
        "(line 1079,col 9)-(line 1079,col 95)",
        "(line 1081,col 9)-(line 1081,col 85)",
        "(line 1082,col 9)-(line 1082,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)",
      "begin_line": 1091,
      "end_line": 1119,
      "comment": "\n     * Adds UnicodeExtra fields for name and file comment if mode is\n     * ALWAYS or the data cannot be encoded using the configured\n     * encoding.\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1101,col 9)",
        "(line 1103,col 9)-(line 1103,col 38)",
        "(line 1104,col 9)-(line 1118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1126,
      "end_line": 1139,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1127,col 9)-(line 1129,col 9)",
        "(line 1130,col 9)-(line 1130,col 29)",
        "(line 1131,col 9)-(line 1131,col 52)",
        "(line 1132,col 9)-(line 1138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1149,
      "end_line": 1152,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte and {@link Zip64Mode #setUseZip64} is {@link\n     * Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1150,col 9)-(line 1150,col 63)",
        "(line 1151,col 9)-(line 1151,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1154,
      "end_line": 1174,
      "comment": "",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 47)",
        "(line 1157,col 9)-(line 1160,col 44)",
        "(line 1162,col 9)-(line 1168,col 9)",
        "(line 1171,col 9)-(line 1171,col 57)",
        "(line 1173,col 9)-(line 1173,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, long, boolean)",
      "begin_line": 1183,
      "end_line": 1261,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @param name The encoded name\n     * @param lfhOffset Local file header offset for this file\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1185,col 53)",
        "(line 1188,col 9)-(line 1188,col 38)",
        "(line 1189,col 9)-(line 1191,col 9)",
        "(line 1193,col 9)-(line 1193,col 64)",
        "(line 1194,col 9)-(line 1194,col 59)",
        "(line 1195,col 9)-(line 1195,col 70)",
        "(line 1196,col 9)-(line 1196,col 75)",
        "(line 1197,col 9)-(line 1197,col 35)",
        "(line 1199,col 9)-(line 1199,col 65)",
        "(line 1203,col 9)-(line 1204,col 49)",
        "(line 1206,col 9)-(line 1206,col 45)",
        "(line 1207,col 9)-(line 1207,col 70)",
        "(line 1208,col 9)-(line 1208,col 101)",
        "(line 1209,col 9)-(line 1209,col 99)",
        "(line 1212,col 9)-(line 1212,col 52)",
        "(line 1216,col 9)-(line 1216,col 80)",
        "(line 1221,col 9)-(line 1221,col 50)",
        "(line 1222,col 9)-(line 1229,col 9)",
        "(line 1231,col 9)-(line 1231,col 59)",
        "(line 1234,col 9)-(line 1234,col 61)",
        "(line 1236,col 9)-(line 1236,col 61)",
        "(line 1239,col 9)-(line 1239,col 70)",
        "(line 1242,col 9)-(line 1242,col 82)",
        "(line 1245,col 9)-(line 1245,col 81)",
        "(line 1248,col 9)-(line 1248,col 71)",
        "(line 1251,col 9)-(line 1251,col 94)",
        "(line 1253,col 9)-(line 1253,col 55)",
        "(line 1254,col 9)-(line 1254,col 66)",
        "(line 1256,col 9)-(line 1256,col 53)",
        "(line 1259,col 9)-(line 1259,col 98)",
        "(line 1260,col 9)-(line 1260,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean)",
      "begin_line": 1267,
      "end_line": 1285,
      "comment": "\n     * If the entry needs Zip64 extra information inside the central\n     * directory then configure its data.\n     ",
      "child_ranges": [
        "(line 1269,col 9)-(line 1284,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 1294,
      "end_line": 1327,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link Zip64Mode #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 31)",
        "(line 1298,col 9)-(line 1298,col 27)",
        "(line 1299,col 9)-(line 1299,col 27)",
        "(line 1302,col 9)-(line 1302,col 45)",
        "(line 1303,col 9)-(line 1307,col 9)",
        "(line 1308,col 9)-(line 1311,col 9)",
        "(line 1313,col 9)-(line 1314,col 68)",
        "(line 1315,col 9)-(line 1315,col 26)",
        "(line 1316,col 9)-(line 1316,col 26)",
        "(line 1319,col 9)-(line 1319,col 72)",
        "(line 1320,col 9)-(line 1320,col 72)",
        "(line 1323,col 9)-(line 1323,col 59)",
        "(line 1324,col 9)-(line 1324,col 53)",
        "(line 1325,col 9)-(line 1325,col 49)",
        "(line 1326,col 9)-(line 1326,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory()",
      "begin_line": 1335,
      "end_line": 1395,
      "comment": "\n     * Writes the \u0026quot;ZIP64 End of central dir record\u0026quot; and\n     * \u0026quot;ZIP64 End of central dir locator\u0026quot;.\n     * @throws IOException on error\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1336,col 9)-(line 1338,col 9)",
        "(line 1340,col 9)-(line 1345,col 9)",
        "(line 1347,col 9)-(line 1349,col 9)",
        "(line 1351,col 9)-(line 1351,col 62)",
        "(line 1353,col 9)-(line 1353,col 33)",
        "(line 1356,col 9)-(line 1365,col 30)",
        "(line 1368,col 9)-(line 1368,col 55)",
        "(line 1369,col 9)-(line 1369,col 55)",
        "(line 1372,col 9)-(line 1372,col 24)",
        "(line 1373,col 9)-(line 1373,col 24)",
        "(line 1376,col 9)-(line 1376,col 66)",
        "(line 1377,col 9)-(line 1377,col 22)",
        "(line 1378,col 9)-(line 1378,col 22)",
        "(line 1381,col 9)-(line 1381,col 57)",
        "(line 1382,col 9)-(line 1382,col 57)",
        "(line 1387,col 9)-(line 1387,col 37)",
        "(line 1390,col 9)-(line 1390,col 24)",
        "(line 1392,col 9)-(line 1392,col 55)",
        "(line 1394,col 9)-(line 1394,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 1402,
      "end_line": 1404,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1403,col 9)-(line 1403,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 1414,
      "end_line": 1417,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1416,col 9)-(line 1416,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getGeneralPurposeBits(int, boolean)",
      "begin_line": 1420,
      "end_line": 1427,
      "comment": "",
      "child_ranges": [
        "(line 1421,col 9)-(line 1421,col 54)",
        "(line 1422,col 9)-(line 1422,col 54)",
        "(line 1423,col 9)-(line 1425,col 9)",
        "(line 1426,col 9)-(line 1426,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.versionNeededToExtract(int, boolean)",
      "begin_line": 1429,
      "end_line": 1438,
      "comment": "",
      "child_ranges": [
        "(line 1430,col 9)-(line 1432,col 9)",
        "(line 1435,col 9)-(line 1437,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isDeflatedToOutputStream(int)",
      "begin_line": 1440,
      "end_line": 1442,
      "comment": "",
      "child_ranges": [
        "(line 1441,col 9)-(line 1441,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 1456,
      "end_line": 1463,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     *\n     * \u003cp\u003eMust not be used if the stream has already been closed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1459,col 9)-(line 1461,col 9)",
        "(line 1462,col 9)-(line 1462,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1471,
      "end_line": 1495,
      "comment": "\n     * Get the existing ZIP64 extended information extra field or\n     * create a new one and add it to the entry.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1473,col 9)-(line 1475,col 9)",
        "(line 1476,col 9)-(line 1476,col 28)",
        "(line 1477,col 9)-(line 1480,col 41)",
        "(line 1481,col 9)-(line 1489,col 9)",
        "(line 1492,col 9)-(line 1492,col 37)",
        "(line 1494,col 9)-(line 1494,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1503,
      "end_line": 1507,
      "comment": "\n     * Is there a ZIP64 extended information extra field for the\n     * entry?\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1504,col 9)-(line 1506,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1516,
      "end_line": 1524,
      "comment": "\n     * If the mode is AsNeeded and the entry is a compressed entry of\n     * unknown size that gets written to a non-seekable stream the\n     * change the default to Never.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1517,col 9)-(line 1522,col 9)",
        "(line 1523,col 9)-(line 1523,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1526,
      "end_line": 1530,
      "comment": "",
      "child_ranges": [
        "(line 1527,col 9)-(line 1527,col 64)",
        "(line 1528,col 9)-(line 1529,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1532,
      "end_line": 1534,
      "comment": "",
      "child_ranges": [
        "(line 1533,col 9)-(line 1533,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy()",
      "begin_line": 1543,
      "end_line": 1550,
      "comment": "\n     * Closes the underlying stream/file without finishing the\n     * archive, the result will likely be a corrupt archive.\n     *\n     * \u003cp\u003eThis method only exists to support tests that generate\n     * corrupt archives so they can clean up any temporary files.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1544,col 9)-(line 1546,col 9)",
        "(line 1547,col 9)-(line 1549,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1556,
      "end_line": 1580,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 1560,
      "end_line": 1560,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 1564,
      "end_line": 1564,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 1569,
      "end_line": 1570,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1572,
      "end_line": 1572,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 1573,
      "end_line": 1575,
      "comment": "",
      "child_ranges": [
        "(line 1574,col 13)-(line 1574,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 1576,
      "end_line": 1579,
      "comment": "",
      "child_ranges": [
        "(line 1578,col 13)-(line 1578,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1586,
      "end_line": 1621,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being written.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1587,
      "end_line": 1589,
      "comment": "",
      "child_ranges": [
        "(line 1588,col 13)-(line 1588,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 1593,
      "end_line": 1593,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 1598,
      "end_line": 1598,
      "comment": "\n         * Offset for CRC entry in the local file header data for the\n         * current entry starts here.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 1602,
      "end_line": 1602,
      "comment": "\n         * Data for local header data\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1607,
      "end_line": 1607,
      "comment": "\n         * Number of bytes read for the current entry (can\u0027t rely on\n         * Deflater#getBytesRead) when using DEFLATED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "causedUseOfZip64"
      ],
      "begin_line": 1611,
      "end_line": 1611,
      "comment": "\n         * Whether current entry was the first one using ZIP64 features.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasWritten"
      ],
      "begin_line": 1620,
      "end_line": 1620,
      "comment": "\n         * Whether write() has been called at all.\n         *\n         * \u003cp\u003eIn order to create a valid archive {@link\n         * #closeArchiveEntry closeArchiveEntry} will write an empty\n         * array to get the CRC right if nothing has been written to\n         * the stream at all.\u003c/p\u003e\n         "
    }
  ]
}