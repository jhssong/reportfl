{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 82,
      "end_line": 1648,
      "comment": "\n * Reimplementation of {@link java.util.zip.ZipOutputStream\n * java.util.zip.ZipOutputStream} that does handle the extended\n * functionality of this package, especially internal/external file\n * attributes and extra fields with different layouts for local file\n * data and central directory entries.\n *\n * \u003cp\u003eThis class will try to use {@link\n * java.nio.channels.SeekableByteChannel} when it knows that the\n * output is going to go to a file.\u003c/p\u003e\n *\n * \u003cp\u003eIf SeekableByteChannel cannot be used, this implementation will use\n * a Data Descriptor to store size and CRC information for {@link\n * #DEFLATED DEFLATED} entries, this means, you don\u0027t need to\n * calculate them yourself.  Unfortunately this is not possible for\n * the {@link #STORED STORED} method, here setting the CRC and\n * uncompressed size information is required before {@link\n * #putArchiveEntry(ArchiveEntry)} can be called.\u003c/p\u003e\n *\n * \u003cp\u003eAs of Apache Commons Compress 1.3 it transparently supports Zip64\n * extensions and thus individual entries and archives larger than 4\n * GB or with more than 65536 entries in most cases but explicit\n * control is provided via {@link #setUseZip64}.  If the stream can not\n * use SeekableByteChannel and you try to write a ZipArchiveEntry of\n * unknown size then Zip64 extensions will be disabled by default.\u003c/p\u003e\n *\n * @NotThreadSafe\n "
    },
    {
      "type": "field",
      "varNames": [
        "BUFFER_SIZE"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG_OFFSET"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_VERSION_NEEDED_OFFSET"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_GPB_OFFSET"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_METHOD_OFFSET"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_TIME_OFFSET"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_CRC_OFFSET"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_COMPRESSED_SIZE_OFFSET"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_ORIGINAL_SIZE_OFFSET"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_FILENAME_LENGTH_OFFSET"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_EXTRA_LENGTH_OFFSET"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "LFH_FILENAME_OFFSET"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG_OFFSET"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_VERSION_MADE_BY_OFFSET"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_VERSION_NEEDED_OFFSET"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_GPB_OFFSET"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_METHOD_OFFSET"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_TIME_OFFSET"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_CRC_OFFSET"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_COMPRESSED_SIZE_OFFSET"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_ORIGINAL_SIZE_OFFSET"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_FILENAME_LENGTH_OFFSET"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_EXTRA_LENGTH_OFFSET"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_COMMENT_LENGTH_OFFSET"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_DISK_NUMBER_OFFSET"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_INTERNAL_ATTRIBUTES_OFFSET"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_EXTERNAL_ATTRIBUTES_OFFSET"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_LFH_OFFSET"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "CFH_FILENAME_OFFSET"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " indicates if this archive is finished. protected for use in Jar implementation "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATED"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Compression method for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COMPRESSION"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Default compression level for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STORED"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Compression method for stored entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENCODING"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * default encoding for file names and comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EFS_FLAG"
      ],
      "begin_line": 142,
      "end_line": 143,
      "comment": "\n     * General purpose flag, which indicates that filenames are\n     * written in UTF-8.\n     * @deprecated use {@link GeneralPurposeBit#UFT8_NAMES_FLAG} instead\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": "\n     * Current entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": "\n     * The file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n     * Compression level for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasCompressionLevelChanged"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": "\n     * Has the compression level changed when compared to the last\n     * entry?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": "\n     * Default compression method for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 176,
      "end_line": 177,
      "comment": "\n     * List of ZipArchiveEntries written so far.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "streamCompressor"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cdOffset"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": "\n     * Start of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdLength"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": "\n     * Length of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": "\n     * Helper, a 0 as ZipShort.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZERO"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": "\n     * Helper, a 0 as ZipLong.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 201,
      "end_line": 201,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offsets"
      ],
      "begin_line": 206,
      "end_line": 207,
      "comment": "\n     * Holds the offsets of the LFH starts for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 224,
      "end_line": 225,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     *\n     * This field is of internal use and will be set in {@link\n     * #setEncoding(String)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 232,
      "end_line": 232,
      "comment": "\n     * This Deflater object is used for output.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "channel"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": "\n     * Optional random access output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useUTF8Flag"
      ],
      "begin_line": 244,
      "end_line": 244,
      "comment": "\n     * whether to use the general purpose bit flag when writing UTF-8\n     * filenames or not.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fallbackToUTF8"
      ],
      "begin_line": 249,
      "end_line": 249,
      "comment": "\n     * Whether to encode non-encodable file names as UTF-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "createUnicodeExtraFields"
      ],
      "begin_line": 254,
      "end_line": 254,
      "comment": "\n     * whether to create UnicodePathExtraField-s for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasUsedZip64"
      ],
      "begin_line": 261,
      "end_line": 261,
      "comment": "\n     * Whether anything inside this archive has used a ZIP64 feature.\n     *\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zip64Mode"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "copyBuffer"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calendarInstance"
      ],
      "begin_line": 266,
      "end_line": 266,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 272,
      "end_line": 277,
      "comment": "\n     * Creates a new ZIP OutputStream filtering the underlying stream.\n     * @param out the outputstream to zip\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 23)",
        "(line 274,col 9)-(line 274,col 28)",
        "(line 275,col 9)-(line 275,col 40)",
        "(line 276,col 9)-(line 276,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.File)",
      "begin_line": 285,
      "end_line": 305,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a File.  Will use\n     * random access if possible.\n     * @param file the file to zip to\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 40)",
        "(line 287,col 9)-(line 287,col 30)",
        "(line 288,col 9)-(line 288,col 44)",
        "(line 289,col 9)-(line 289,col 50)",
        "(line 290,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 16)",
        "(line 303,col 9)-(line 303,col 27)",
        "(line 304,col 9)-(line 304,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.nio.channels.SeekableByteChannel)",
      "begin_line": 319,
      "end_line": 324,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a SeekableByteChannel.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to write to an in-memory archive using random\n     * access.\u003c/p\u003e\n     *\n     * @param channel the channel to zip to\n     * @throws IOException on error\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 31)",
        "(line 321,col 9)-(line 321,col 40)",
        "(line 322,col 9)-(line 322,col 65)",
        "(line 323,col 9)-(line 323,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * This method indicates whether this archive is writing to a\n     * seekable stream (i.e., to a random access file).\n     *\n     * \u003cp\u003eFor seekable streams, you don\u0027t need to calculate the CRC or\n     * uncompressed size for {@link #STORED} entries before\n     * invoking {@link #putArchiveEntry(ArchiveEntry)}.\n     * @return true if seekable\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setEncoding(java.lang.String)",
      "begin_line": 348,
      "end_line": 354,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 33)",
        "(line 350,col 9)-(line 350,col 70)",
        "(line 351,col 9)-(line 353,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag(boolean)",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     *\n     * @param b whether to set the language encoding flag if the file\n     * name encoding is UTF-8\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     *\n     * @param b whether to create Unicode Extra Fields.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     *\n     * @param b whether to fall back to UTF and the language encoding\n     * flag if the file name cannot be encoded using the specified\n     * encoding.\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Whether Zip64 extensions will be used.\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Never Never},\n     * {@link #putArchiveEntry}, {@link #closeArchiveEntry}, {@link\n     * #finish} or {@link #close} may throw a {@link\n     * Zip64RequiredException} if the entry\u0027s size or the total size\n     * of the archive exceeds 4GB or there are more than 65536 entries\n     * inside the archive.  Any archive created in this mode will be\n     * readable by implementations that don\u0027t support Zip64.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Always Always},\n     * Zip64 extensions will be used for all entries.  Any archive\n     * created in this mode may be unreadable by implementations that\n     * don\u0027t support Zip64 even if all its contents would be.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#AsNeeded\n     * AsNeeded}, Zip64 extensions will transparently be used for\n     * those entries that require them.  This mode can only be used if\n     * the uncompressed size of the {@link ZipArchiveEntry} is known\n     * when calling {@link #putArchiveEntry} or the archive is written\n     * to a seekable output (i.e. you have used the {@link\n     * #ZipArchiveOutputStream(java.io.File) File-arg constructor}) -\n     * this mode is not valid when the output stream is not seekable\n     * and the uncompressed size is unknown when {@link\n     * #putArchiveEntry} is called.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf no entry inside the resulting archive requires Zip64\n     * extensions then {@link Zip64Mode#Never Never} will create the\n     * smallest archive.  {@link Zip64Mode#AsNeeded AsNeeded} will\n     * create a slightly bigger archive if the uncompressed size of\n     * any entry has initially been unknown and create an archive\n     * identical to {@link Zip64Mode#Never Never} otherwise.  {@link\n     * Zip64Mode#Always Always} will create an archive that is at\n     * least 24 bytes per entry bigger than the one {@link\n     * Zip64Mode#Never Never} would create.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to {@link Zip64Mode#AsNeeded AsNeeded} unless\n     * {@link #putArchiveEntry} is called with an entry of unknown\n     * size and data is written to a non-seekable stream - in this\n     * case the default is {@link Zip64Mode#Never Never}.\u003c/p\u003e\n     *\n     * @since 1.3\n     * @param mode Whether Zip64 extensions will be used.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 458,
      "end_line": 478,
      "comment": "\n     * {@inheritDoc}\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 462,col 9)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 468,col 9)-(line 468,col 59)",
        "(line 469,col 9)-(line 469,col 40)",
        "(line 471,col 9)-(line 471,col 70)",
        "(line 472,col 9)-(line 472,col 37)",
        "(line 473,col 9)-(line 473,col 35)",
        "(line 474,col 9)-(line 474,col 24)",
        "(line 475,col 9)-(line 475,col 24)",
        "(line 476,col 9)-(line 476,col 33)",
        "(line 477,col 9)-(line 477,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryInChunks()",
      "begin_line": 480,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 39)",
        "(line 482,col 9)-(line 482,col 106)",
        "(line 483,col 9)-(line 483,col 22)",
        "(line 484,col 9)-(line 491,col 9)",
        "(line 492,col 9)-(line 492,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 502,
      "end_line": 515,
      "comment": "\n     * Writes all necessary data for this entry.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size exceeds 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 19)",
        "(line 506,col 9)-(line 506,col 24)",
        "(line 508,col 9)-(line 508,col 92)",
        "(line 509,col 9)-(line 509,col 57)",
        "(line 510,col 9)-(line 510,col 58)",
        "(line 511,col 9)-(line 511,col 75)",
        "(line 512,col 9)-(line 512,col 99)",
        "(line 513,col 9)-(line 513,col 46)",
        "(line 514,col 9)-(line 514,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry(boolean)",
      "begin_line": 527,
      "end_line": 533,
      "comment": "\n     * Writes all necessary data for this entry.\n     *\n     * @param phased              This entry is second phase of a 2-phase zip creation, size, compressed size and crc\n     *                            are known in ZipArchiveEntry\n     * @throws IOException            on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     *                                compressed size exceeds 4 GByte and {@link #setUseZip64}\n     *                                is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 528,col 9)-(line 528,col 19)",
        "(line 529,col 9)-(line 529,col 48)",
        "(line 530,col 9)-(line 530,col 75)",
        "(line 531,col 9)-(line 531,col 76)",
        "(line 532,col 9)-(line 532,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeEntry(boolean, boolean)",
      "begin_line": 535,
      "end_line": 542,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 538,col 9)",
        "(line 540,col 9)-(line 540,col 41)",
        "(line 541,col 9)-(line 541,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose()",
      "begin_line": 544,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 547,col 9)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)",
      "begin_line": 571,
      "end_line": 586,
      "comment": "\n     * Adds an archive entry with a raw input stream.\n     *\n     * If crc, size and compressed size are supplied on the entry, these values will be used as-is.\n     * Zip64 status is re-established based on the settings in this stream, and the supplied value\n     * is ignored.\n     *\n     * The entry is put and closed immediately.\n     *\n     * @param entry The archive entry to add\n     * @param rawStream The raw input stream of a different entry. May be compressed/encrypted.\n     * @throws IOException If copying fails\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 62)",
        "(line 574,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 582,col 71)",
        "(line 583,col 9)-(line 583,col 44)",
        "(line 584,col 9)-(line 584,col 42)",
        "(line 585,col 9)-(line 585,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater()",
      "begin_line": 591,
      "end_line": 595,
      "comment": "\n     * Ensures all bytes sent to the deflater are written to the stream.\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 594,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 603,
      "end_line": 638,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 635,col 9)",
        "(line 637,col 9)-(line 637,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 646,
      "end_line": 653,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 87)",
        "(line 649,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 655,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 659,
      "end_line": 661,
      "comment": "",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(boolean)",
      "begin_line": 668,
      "end_line": 713,
      "comment": "\n     * When using random access output, write the local file header\n     * and potentiall the ZIP64 extra containing the correct CRC and\n     * compressed/uncompressed sizes.\n     ",
      "child_ranges": [
        "(line 670,col 9)-(line 670,col 45)",
        "(line 672,col 9)-(line 672,col 47)",
        "(line 673,col 9)-(line 673,col 57)",
        "(line 674,col 9)-(line 680,col 9)",
        "(line 682,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 712,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 722,
      "end_line": 725,
      "comment": "\n     * {@inheritDoc} \n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry, boolean)",
      "begin_line": 739,
      "end_line": 783,
      "comment": "\n     * Writes the headers for an archive entry to the output stream.\n     * The caller must then write the content to the stream and call\n     * {@link #closeArchiveEntry()} to complete the process.\n\n     * @param archiveEntry The archiveEntry\n     * @param phased If true size, compressedSize and crc required to be known up-front in the archiveEntry\n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64}\n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 740,col 9)-(line 742,col 9)",
        "(line 744,col 9)-(line 746,col 9)",
        "(line 748,col 9)-(line 748,col 65)",
        "(line 749,col 9)-(line 749,col 33)",
        "(line 751,col 9)-(line 751,col 33)",
        "(line 753,col 9)-(line 753,col 75)",
        "(line 754,col 9)-(line 754,col 47)",
        "(line 756,col 9)-(line 776,col 9)",
        "(line 778,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 789,
      "end_line": 797,
      "comment": "\n     * Provides default values for compression method and last\n     * modification time.\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 792,col 9)",
        "(line 794,col 9)-(line 796,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 805,
      "end_line": 827,
      "comment": "\n     * Throws an exception if the size is unknown for a stored entry\n     * that is written to a non-seekable output or the entry is too\n     * big to be written without Zip64 extra but the mode has been set\n     * to Never.\n     ",
      "child_ranges": [
        "(line 808,col 9)-(line 819,col 9)",
        "(line 821,col 9)-(line 826,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 843,
      "end_line": 849,
      "comment": "\n     * Whether to addd a Zip64 extended information extra field to the\n     * local file header.\n     *\n     * \u003cp\u003eReturns true if\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003emode is Always\u003c/li\u003e\n     * \u003cli\u003eor we already know it is going to be needed\u003c/li\u003e\n     * \u003cli\u003eor the size is unknown and we can ensure it won\u0027t hurt\n     * other implementations if we add it (i.e. we can erase its\n     * usage\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 844,col 9)-(line 848,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 855,
      "end_line": 857,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 867,
      "end_line": 875,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 59)",
        "(line 874,col 9)-(line 874,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 883,
      "end_line": 885,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 894,
      "end_line": 903,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 896,col 9)-(line 901,col 9)",
        "(line 902,col 9)-(line 902,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 912,
      "end_line": 920,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 914,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 52)",
        "(line 918,col 9)-(line 918,col 104)",
        "(line 919,col 9)-(line 919,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(byte[])",
      "begin_line": 927,
      "end_line": 929,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 928,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.copyFromZipInputStream(java.io.InputStream)",
      "begin_line": 931,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 932,col 9)-(line 934,col 9)",
        "(line 935,col 9)-(line 935,col 52)",
        "(line 936,col 9)-(line 936,col 32)",
        "(line 937,col 9)-(line 937,col 19)",
        "(line 938,col 9)-(line 942,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 954,
      "end_line": 960,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @throws  IOException  if an I/O error occurs.\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 968,
      "end_line": 973,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @throws  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 970,col 9)-(line 972,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 981,
      "end_line": 981,
      "comment": "\n     * local file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 985,
      "end_line": 985,
      "comment": "\n     * data descriptor signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 989,
      "end_line": 989,
      "comment": "\n     * central file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 993,
      "end_line": 993,
      "comment": "\n     * end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_SIG"
      ],
      "begin_line": 997,
      "end_line": 997,
      "comment": "\n     * ZIP64 end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_LOC_SIG"
      ],
      "begin_line": 1001,
      "end_line": 1001,
      "comment": "\n     * ZIP64 end of central dir locator signature\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 1007,
      "end_line": 1009,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1016,
      "end_line": 1018,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean)",
      "begin_line": 1020,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 1021,col 9)-(line 1021,col 70)",
        "(line 1022,col 9)-(line 1022,col 44)",
        "(line 1024,col 9)-(line 1026,col 9)",
        "(line 1028,col 9)-(line 1028,col 86)",
        "(line 1029,col 9)-(line 1029,col 78)",
        "(line 1030,col 9)-(line 1030,col 42)",
        "(line 1031,col 9)-(line 1031,col 65)",
        "(line 1032,col 9)-(line 1032,col 34)",
        "(line 1033,col 9)-(line 1033,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, boolean, boolean)",
      "begin_line": 1037,
      "end_line": 1101,
      "comment": "",
      "child_ranges": [
        "(line 1039,col 9)-(line 1039,col 56)",
        "(line 1040,col 9)-(line 1040,col 59)",
        "(line 1041,col 9)-(line 1041,col 68)",
        "(line 1042,col 9)-(line 1042,col 41)",
        "(line 1044,col 9)-(line 1044,col 65)",
        "(line 1047,col 9)-(line 1047,col 45)",
        "(line 1049,col 9)-(line 1053,col 9)",
        "(line 1055,col 9)-(line 1055,col 115)",
        "(line 1056,col 9)-(line 1056,col 54)",
        "(line 1059,col 9)-(line 1059,col 52)",
        "(line 1061,col 9)-(line 1061,col 80)",
        "(line 1064,col 9)-(line 1070,col 9)",
        "(line 1074,col 9)-(line 1089,col 9)",
        "(line 1091,col 9)-(line 1091,col 59)",
        "(line 1094,col 9)-(line 1094,col 61)",
        "(line 1097,col 9)-(line 1097,col 95)",
        "(line 1099,col 9)-(line 1099,col 85)",
        "(line 1100,col 9)-(line 1100,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)",
      "begin_line": 1109,
      "end_line": 1137,
      "comment": "\n     * Adds UnicodeExtra fields for name and file comment if mode is\n     * ALWAYS or the data cannot be encoded using the configured\n     * encoding.\n     ",
      "child_ranges": [
        "(line 1112,col 9)-(line 1119,col 9)",
        "(line 1121,col 9)-(line 1121,col 44)",
        "(line 1122,col 9)-(line 1136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1144,
      "end_line": 1157,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1145,col 9)-(line 1147,col 9)",
        "(line 1148,col 9)-(line 1148,col 29)",
        "(line 1149,col 9)-(line 1149,col 52)",
        "(line 1150,col 9)-(line 1156,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1167,
      "end_line": 1170,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte and {@link Zip64Mode #setUseZip64} is {@link\n     * Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1168,col 9)-(line 1168,col 69)",
        "(line 1169,col 9)-(line 1169,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1172,
      "end_line": 1193,
      "comment": "",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 47)",
        "(line 1175,col 9)-(line 1179,col 49)",
        "(line 1181,col 9)-(line 1187,col 9)",
        "(line 1190,col 9)-(line 1190,col 57)",
        "(line 1192,col 9)-(line 1192,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, long, boolean)",
      "begin_line": 1202,
      "end_line": 1285,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @param name The encoded name\n     * @param lfhOffset Local file header offset for this file\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1204,col 59)",
        "(line 1207,col 9)-(line 1207,col 38)",
        "(line 1208,col 9)-(line 1210,col 9)",
        "(line 1212,col 9)-(line 1212,col 70)",
        "(line 1213,col 9)-(line 1213,col 59)",
        "(line 1214,col 9)-(line 1214,col 70)",
        "(line 1215,col 9)-(line 1215,col 81)",
        "(line 1216,col 9)-(line 1216,col 41)",
        "(line 1218,col 9)-(line 1218,col 65)",
        "(line 1222,col 9)-(line 1223,col 49)",
        "(line 1225,col 9)-(line 1225,col 45)",
        "(line 1226,col 9)-(line 1226,col 70)",
        "(line 1227,col 9)-(line 1227,col 101)",
        "(line 1228,col 9)-(line 1228,col 99)",
        "(line 1231,col 9)-(line 1231,col 52)",
        "(line 1235,col 9)-(line 1235,col 80)",
        "(line 1240,col 9)-(line 1240,col 50)",
        "(line 1241,col 9)-(line 1249,col 9)",
        "(line 1251,col 9)-(line 1251,col 59)",
        "(line 1254,col 9)-(line 1254,col 61)",
        "(line 1256,col 9)-(line 1256,col 61)",
        "(line 1259,col 9)-(line 1259,col 70)",
        "(line 1262,col 9)-(line 1262,col 82)",
        "(line 1265,col 9)-(line 1265,col 81)",
        "(line 1268,col 9)-(line 1272,col 9)",
        "(line 1275,col 9)-(line 1275,col 94)",
        "(line 1277,col 9)-(line 1277,col 61)",
        "(line 1278,col 9)-(line 1278,col 66)",
        "(line 1280,col 9)-(line 1280,col 59)",
        "(line 1283,col 9)-(line 1283,col 98)",
        "(line 1284,col 9)-(line 1284,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean)",
      "begin_line": 1291,
      "end_line": 1310,
      "comment": "\n     * If the entry needs Zip64 extra information inside the central\n     * directory then configure its data.\n     ",
      "child_ranges": [
        "(line 1293,col 9)-(line 1309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 1319,
      "end_line": 1352,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link Zip64Mode #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1320,col 9)-(line 1320,col 31)",
        "(line 1323,col 9)-(line 1323,col 27)",
        "(line 1324,col 9)-(line 1324,col 27)",
        "(line 1327,col 9)-(line 1327,col 51)",
        "(line 1328,col 9)-(line 1332,col 9)",
        "(line 1333,col 9)-(line 1336,col 9)",
        "(line 1338,col 9)-(line 1339,col 68)",
        "(line 1340,col 9)-(line 1340,col 26)",
        "(line 1341,col 9)-(line 1341,col 26)",
        "(line 1344,col 9)-(line 1344,col 72)",
        "(line 1345,col 9)-(line 1345,col 72)",
        "(line 1348,col 9)-(line 1348,col 65)",
        "(line 1349,col 9)-(line 1349,col 59)",
        "(line 1350,col 9)-(line 1350,col 49)",
        "(line 1351,col 9)-(line 1351,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory()",
      "begin_line": 1360,
      "end_line": 1420,
      "comment": "\n     * Writes the \u0026quot;ZIP64 End of central dir record\u0026quot; and\n     * \u0026quot;ZIP64 End of central dir locator\u0026quot;.\n     * @throws IOException on error\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1361,col 9)-(line 1363,col 9)",
        "(line 1365,col 9)-(line 1370,col 9)",
        "(line 1372,col 9)-(line 1374,col 9)",
        "(line 1376,col 9)-(line 1376,col 68)",
        "(line 1378,col 9)-(line 1378,col 33)",
        "(line 1381,col 9)-(line 1390,col 30)",
        "(line 1393,col 9)-(line 1393,col 55)",
        "(line 1394,col 9)-(line 1394,col 55)",
        "(line 1397,col 9)-(line 1397,col 24)",
        "(line 1398,col 9)-(line 1398,col 24)",
        "(line 1401,col 9)-(line 1401,col 72)",
        "(line 1402,col 9)-(line 1402,col 22)",
        "(line 1403,col 9)-(line 1403,col 22)",
        "(line 1406,col 9)-(line 1406,col 57)",
        "(line 1407,col 9)-(line 1407,col 57)",
        "(line 1412,col 9)-(line 1412,col 37)",
        "(line 1415,col 9)-(line 1415,col 24)",
        "(line 1417,col 9)-(line 1417,col 55)",
        "(line 1419,col 9)-(line 1419,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 1427,
      "end_line": 1429,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1428,col 9)-(line 1428,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 1439,
      "end_line": 1442,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1441,col 9)-(line 1441,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getGeneralPurposeBits(int, boolean)",
      "begin_line": 1445,
      "end_line": 1452,
      "comment": "",
      "child_ranges": [
        "(line 1446,col 9)-(line 1446,col 60)",
        "(line 1447,col 9)-(line 1447,col 54)",
        "(line 1448,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1451,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.versionNeededToExtract(int, boolean)",
      "begin_line": 1454,
      "end_line": 1463,
      "comment": "",
      "child_ranges": [
        "(line 1455,col 9)-(line 1457,col 9)",
        "(line 1460,col 9)-(line 1462,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isDeflatedToOutputStream(int)",
      "begin_line": 1465,
      "end_line": 1467,
      "comment": "",
      "child_ranges": [
        "(line 1466,col 9)-(line 1466,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 1481,
      "end_line": 1488,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     *\n     * \u003cp\u003eMust not be used if the stream has already been closed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1484,col 9)-(line 1486,col 9)",
        "(line 1487,col 9)-(line 1487,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1496,
      "end_line": 1520,
      "comment": "\n     * Get the existing ZIP64 extended information extra field or\n     * create a new one and add it to the entry.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1498,col 9)-(line 1500,col 9)",
        "(line 1501,col 9)-(line 1501,col 28)",
        "(line 1502,col 9)-(line 1505,col 41)",
        "(line 1506,col 9)-(line 1514,col 9)",
        "(line 1517,col 9)-(line 1517,col 37)",
        "(line 1519,col 9)-(line 1519,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1528,
      "end_line": 1532,
      "comment": "\n     * Is there a ZIP64 extended information extra field for the\n     * entry?\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1529,col 9)-(line 1531,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1541,
      "end_line": 1549,
      "comment": "\n     * If the mode is AsNeeded and the entry is a compressed entry of\n     * unknown size that gets written to a non-seekable stream the\n     * change the default to Never.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1542,col 9)-(line 1547,col 9)",
        "(line 1548,col 9)-(line 1548,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1551,
      "end_line": 1555,
      "comment": "",
      "child_ranges": [
        "(line 1552,col 9)-(line 1552,col 70)",
        "(line 1553,col 9)-(line 1554,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1557,
      "end_line": 1559,
      "comment": "",
      "child_ranges": [
        "(line 1558,col 9)-(line 1558,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy()",
      "begin_line": 1568,
      "end_line": 1575,
      "comment": "\n     * Closes the underlying stream/file without finishing the\n     * archive, the result will likely be a corrupt archive.\n     *\n     * \u003cp\u003eThis method only exists to support tests that generate\n     * corrupt archives so they can clean up any temporary files.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1569,col 9)-(line 1571,col 9)",
        "(line 1572,col 9)-(line 1574,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1581,
      "end_line": 1605,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 1585,
      "end_line": 1585,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 1589,
      "end_line": 1589,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 1594,
      "end_line": 1595,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1597,
      "end_line": 1597,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 1598,
      "end_line": 1600,
      "comment": "",
      "child_ranges": [
        "(line 1599,col 13)-(line 1599,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 1601,
      "end_line": 1604,
      "comment": "",
      "child_ranges": [
        "(line 1603,col 13)-(line 1603,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1611,
      "end_line": 1646,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being written.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1612,
      "end_line": 1614,
      "comment": "",
      "child_ranges": [
        "(line 1613,col 13)-(line 1613,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 1618,
      "end_line": 1618,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 1623,
      "end_line": 1623,
      "comment": "\n         * Offset for CRC entry in the local file header data for the\n         * current entry starts here.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 1627,
      "end_line": 1627,
      "comment": "\n         * Data for local header data\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1632,
      "end_line": 1632,
      "comment": "\n         * Number of bytes read for the current entry (can\u0027t rely on\n         * Deflater#getBytesRead) when using DEFLATED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "causedUseOfZip64"
      ],
      "begin_line": 1636,
      "end_line": 1636,
      "comment": "\n         * Whether current entry was the first one using ZIP64 features.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasWritten"
      ],
      "begin_line": 1645,
      "end_line": 1645,
      "comment": "\n         * Whether write() has been called at all.\n         *\n         * \u003cp\u003eIn order to create a valid archive {@link\n         * #closeArchiveEntry closeArchiveEntry} will write an empty\n         * array to get the CRC right if nothing has been written to\n         * the stream at all.\u003c/p\u003e\n         "
    }
  ]
}