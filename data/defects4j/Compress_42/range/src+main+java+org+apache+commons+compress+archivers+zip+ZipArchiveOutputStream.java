{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 82,
      "end_line": 1649,
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
      "end_line": 306,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a File.  Will use\n     * random access if possible.\n     * @param file the file to zip to\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 40)",
        "(line 287,col 9)-(line 287,col 30)",
        "(line 288,col 9)-(line 288,col 44)",
        "(line 289,col 9)-(line 289,col 50)",
        "(line 290,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 16)",
        "(line 304,col 9)-(line 304,col 27)",
        "(line 305,col 9)-(line 305,col 45)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.nio.channels.SeekableByteChannel)",
      "begin_line": 320,
      "end_line": 325,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a SeekableByteChannel.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to write to an in-memory archive using random\n     * access.\u003c/p\u003e\n     *\n     * @param channel the channel to zip to\n     * @throws IOException on error\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 31)",
        "(line 322,col 9)-(line 322,col 40)",
        "(line 323,col 9)-(line 323,col 65)",
        "(line 324,col 9)-(line 324,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable()",
      "begin_line": 336,
      "end_line": 338,
      "comment": "\n     * This method indicates whether this archive is writing to a\n     * seekable stream (i.e., to a random access file).\n     *\n     * \u003cp\u003eFor seekable streams, you don\u0027t need to calculate the CRC or\n     * uncompressed size for {@link #STORED} entries before\n     * invoking {@link #putArchiveEntry(ArchiveEntry)}.\n     * @return true if seekable\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setEncoding(java.lang.String)",
      "begin_line": 349,
      "end_line": 355,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 33)",
        "(line 351,col 9)-(line 351,col 70)",
        "(line 352,col 9)-(line 354,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding()",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag(boolean)",
      "begin_line": 375,
      "end_line": 377,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     *\n     * @param b whether to set the language encoding flag if the file\n     * name encoding is UTF-8\n     ",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 386,
      "end_line": 388,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     *\n     * @param b whether to create Unicode Extra Fields.\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 400,
      "end_line": 402,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     *\n     * @param b whether to fall back to UTF and the language encoding\n     * flag if the file name cannot be encoded using the specified\n     * encoding.\n     ",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 449,
      "end_line": 451,
      "comment": "\n     * Whether Zip64 extensions will be used.\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Never Never},\n     * {@link #putArchiveEntry}, {@link #closeArchiveEntry}, {@link\n     * #finish} or {@link #close} may throw a {@link\n     * Zip64RequiredException} if the entry\u0027s size or the total size\n     * of the archive exceeds 4GB or there are more than 65536 entries\n     * inside the archive.  Any archive created in this mode will be\n     * readable by implementations that don\u0027t support Zip64.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Always Always},\n     * Zip64 extensions will be used for all entries.  Any archive\n     * created in this mode may be unreadable by implementations that\n     * don\u0027t support Zip64 even if all its contents would be.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#AsNeeded\n     * AsNeeded}, Zip64 extensions will transparently be used for\n     * those entries that require them.  This mode can only be used if\n     * the uncompressed size of the {@link ZipArchiveEntry} is known\n     * when calling {@link #putArchiveEntry} or the archive is written\n     * to a seekable output (i.e. you have used the {@link\n     * #ZipArchiveOutputStream(java.io.File) File-arg constructor}) -\n     * this mode is not valid when the output stream is not seekable\n     * and the uncompressed size is unknown when {@link\n     * #putArchiveEntry} is called.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf no entry inside the resulting archive requires Zip64\n     * extensions then {@link Zip64Mode#Never Never} will create the\n     * smallest archive.  {@link Zip64Mode#AsNeeded AsNeeded} will\n     * create a slightly bigger archive if the uncompressed size of\n     * any entry has initially been unknown and create an archive\n     * identical to {@link Zip64Mode#Never Never} otherwise.  {@link\n     * Zip64Mode#Always Always} will create an archive that is at\n     * least 24 bytes per entry bigger than the one {@link\n     * Zip64Mode#Never Never} would create.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to {@link Zip64Mode#AsNeeded AsNeeded} unless\n     * {@link #putArchiveEntry} is called with an entry of unknown\n     * size and data is written to a non-seekable stream - in this\n     * case the default is {@link Zip64Mode#Never Never}.\u003c/p\u003e\n     *\n     * @since 1.3\n     * @param mode Whether Zip64 extensions will be used.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 459,
      "end_line": 479,
      "comment": "\n     * {@inheritDoc}\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 463,col 9)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 469,col 9)-(line 469,col 59)",
        "(line 470,col 9)-(line 470,col 40)",
        "(line 472,col 9)-(line 472,col 70)",
        "(line 473,col 9)-(line 473,col 37)",
        "(line 474,col 9)-(line 474,col 35)",
        "(line 475,col 9)-(line 475,col 24)",
        "(line 476,col 9)-(line 476,col 24)",
        "(line 477,col 9)-(line 477,col 33)",
        "(line 478,col 9)-(line 478,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryInChunks()",
      "begin_line": 481,
      "end_line": 494,
      "comment": "",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 39)",
        "(line 483,col 9)-(line 483,col 106)",
        "(line 484,col 9)-(line 484,col 22)",
        "(line 485,col 9)-(line 492,col 9)",
        "(line 493,col 9)-(line 493,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 503,
      "end_line": 516,
      "comment": "\n     * Writes all necessary data for this entry.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size exceeds 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 19)",
        "(line 507,col 9)-(line 507,col 24)",
        "(line 509,col 9)-(line 509,col 92)",
        "(line 510,col 9)-(line 510,col 57)",
        "(line 511,col 9)-(line 511,col 58)",
        "(line 512,col 9)-(line 512,col 75)",
        "(line 513,col 9)-(line 513,col 99)",
        "(line 514,col 9)-(line 514,col 46)",
        "(line 515,col 9)-(line 515,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry(boolean)",
      "begin_line": 528,
      "end_line": 534,
      "comment": "\n     * Writes all necessary data for this entry.\n     *\n     * @param phased              This entry is second phase of a 2-phase zip creation, size, compressed size and crc\n     *                            are known in ZipArchiveEntry\n     * @throws IOException            on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     *                                compressed size exceeds 4 GByte and {@link #setUseZip64}\n     *                                is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 19)",
        "(line 530,col 9)-(line 530,col 48)",
        "(line 531,col 9)-(line 531,col 75)",
        "(line 532,col 9)-(line 532,col 76)",
        "(line 533,col 9)-(line 533,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeEntry(boolean, boolean)",
      "begin_line": 536,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 539,col 9)",
        "(line 541,col 9)-(line 541,col 41)",
        "(line 542,col 9)-(line 542,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose()",
      "begin_line": 545,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 546,col 9)-(line 548,col 9)",
        "(line 550,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 556,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)",
      "begin_line": 572,
      "end_line": 587,
      "comment": "\n     * Adds an archive entry with a raw input stream.\n     *\n     * If crc, size and compressed size are supplied on the entry, these values will be used as-is.\n     * Zip64 status is re-established based on the settings in this stream, and the supplied value\n     * is ignored.\n     *\n     * The entry is put and closed immediately.\n     *\n     * @param entry The archive entry to add\n     * @param rawStream The raw input stream of a different entry. May be compressed/encrypted.\n     * @throws IOException If copying fails\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 62)",
        "(line 575,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 583,col 71)",
        "(line 584,col 9)-(line 584,col 44)",
        "(line 585,col 9)-(line 585,col 42)",
        "(line 586,col 9)-(line 586,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater()",
      "begin_line": 592,
      "end_line": 596,
      "comment": "\n     * Ensures all bytes sent to the deflater are written to the stream.\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 595,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 604,
      "end_line": 639,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 636,col 9)",
        "(line 638,col 9)-(line 638,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 647,
      "end_line": 654,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 87)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 653,col 9)-(line 653,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 656,
      "end_line": 658,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 660,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(boolean)",
      "begin_line": 669,
      "end_line": 714,
      "comment": "\n     * When using random access output, write the local file header\n     * and potentiall the ZIP64 extra containing the correct CRC and\n     * compressed/uncompressed sizes.\n     ",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 45)",
        "(line 673,col 9)-(line 673,col 47)",
        "(line 674,col 9)-(line 674,col 57)",
        "(line 675,col 9)-(line 681,col 9)",
        "(line 683,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 723,
      "end_line": 726,
      "comment": "\n     * {@inheritDoc} \n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry, boolean)",
      "begin_line": 740,
      "end_line": 784,
      "comment": "\n     * Writes the headers for an archive entry to the output stream.\n     * The caller must then write the content to the stream and call\n     * {@link #closeArchiveEntry()} to complete the process.\n\n     * @param archiveEntry The archiveEntry\n     * @param phased If true size, compressedSize and crc required to be known up-front in the archiveEntry\n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64}\n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 741,col 9)-(line 743,col 9)",
        "(line 745,col 9)-(line 747,col 9)",
        "(line 749,col 9)-(line 749,col 65)",
        "(line 750,col 9)-(line 750,col 33)",
        "(line 752,col 9)-(line 752,col 33)",
        "(line 754,col 9)-(line 754,col 75)",
        "(line 755,col 9)-(line 755,col 47)",
        "(line 757,col 9)-(line 777,col 9)",
        "(line 779,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 783,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 790,
      "end_line": 798,
      "comment": "\n     * Provides default values for compression method and last\n     * modification time.\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 793,col 9)",
        "(line 795,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 806,
      "end_line": 828,
      "comment": "\n     * Throws an exception if the size is unknown for a stored entry\n     * that is written to a non-seekable output or the entry is too\n     * big to be written without Zip64 extra but the mode has been set\n     * to Never.\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 820,col 9)",
        "(line 822,col 9)-(line 827,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 844,
      "end_line": 850,
      "comment": "\n     * Whether to addd a Zip64 extended information extra field to the\n     * local file header.\n     *\n     * \u003cp\u003eReturns true if\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003emode is Always\u003c/li\u003e\n     * \u003cli\u003eor we already know it is going to be needed\u003c/li\u003e\n     * \u003cli\u003eor the size is unknown and we can ensure it won\u0027t hurt\n     * other implementations if we add it (i.e. we can erase its\n     * usage\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 845,col 9)-(line 849,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 856,
      "end_line": 858,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 868,
      "end_line": 876,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 59)",
        "(line 875,col 9)-(line 875,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 884,
      "end_line": 886,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 895,
      "end_line": 904,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 913,
      "end_line": 921,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 52)",
        "(line 919,col 9)-(line 919,col 104)",
        "(line 920,col 9)-(line 920,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(byte[])",
      "begin_line": 928,
      "end_line": 930,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 929,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.copyFromZipInputStream(java.io.InputStream)",
      "begin_line": 932,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 933,col 9)-(line 935,col 9)",
        "(line 936,col 9)-(line 936,col 52)",
        "(line 937,col 9)-(line 937,col 32)",
        "(line 938,col 9)-(line 938,col 19)",
        "(line 939,col 9)-(line 943,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 955,
      "end_line": 961,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @throws  IOException  if an I/O error occurs.\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 957,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 960,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 969,
      "end_line": 974,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @throws  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 971,col 9)-(line 973,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 982,
      "end_line": 982,
      "comment": "NOSONAR"
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 986,
      "end_line": 986,
      "comment": "NOSONAR"
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 990,
      "end_line": 990,
      "comment": "NOSONAR"
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 994,
      "end_line": 994,
      "comment": "NOSONAR"
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_SIG"
      ],
      "begin_line": 998,
      "end_line": 998,
      "comment": "NOSONAR"
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_LOC_SIG"
      ],
      "begin_line": 1002,
      "end_line": 1002,
      "comment": "NOSONAR"
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1017,
      "end_line": 1019,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean)",
      "begin_line": 1021,
      "end_line": 1035,
      "comment": "",
      "child_ranges": [
        "(line 1022,col 9)-(line 1022,col 70)",
        "(line 1023,col 9)-(line 1023,col 44)",
        "(line 1025,col 9)-(line 1027,col 9)",
        "(line 1029,col 9)-(line 1029,col 86)",
        "(line 1030,col 9)-(line 1030,col 78)",
        "(line 1031,col 9)-(line 1031,col 42)",
        "(line 1032,col 9)-(line 1032,col 65)",
        "(line 1033,col 9)-(line 1033,col 34)",
        "(line 1034,col 9)-(line 1034,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, boolean, boolean)",
      "begin_line": 1038,
      "end_line": 1102,
      "comment": "",
      "child_ranges": [
        "(line 1040,col 9)-(line 1040,col 56)",
        "(line 1041,col 9)-(line 1041,col 59)",
        "(line 1042,col 9)-(line 1042,col 68)",
        "(line 1043,col 9)-(line 1043,col 41)",
        "(line 1045,col 9)-(line 1045,col 65)",
        "(line 1048,col 9)-(line 1048,col 45)",
        "(line 1050,col 9)-(line 1054,col 9)",
        "(line 1056,col 9)-(line 1056,col 115)",
        "(line 1057,col 9)-(line 1057,col 54)",
        "(line 1060,col 9)-(line 1060,col 52)",
        "(line 1062,col 9)-(line 1062,col 80)",
        "(line 1065,col 9)-(line 1071,col 9)",
        "(line 1075,col 9)-(line 1090,col 9)",
        "(line 1092,col 9)-(line 1092,col 59)",
        "(line 1095,col 9)-(line 1095,col 61)",
        "(line 1098,col 9)-(line 1098,col 95)",
        "(line 1100,col 9)-(line 1100,col 85)",
        "(line 1101,col 9)-(line 1101,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)",
      "begin_line": 1110,
      "end_line": 1138,
      "comment": "\n     * Adds UnicodeExtra fields for name and file comment if mode is\n     * ALWAYS or the data cannot be encoded using the configured\n     * encoding.\n     ",
      "child_ranges": [
        "(line 1113,col 9)-(line 1120,col 9)",
        "(line 1122,col 9)-(line 1122,col 44)",
        "(line 1123,col 9)-(line 1137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1145,
      "end_line": 1158,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1146,col 9)-(line 1148,col 9)",
        "(line 1149,col 9)-(line 1149,col 29)",
        "(line 1150,col 9)-(line 1150,col 52)",
        "(line 1151,col 9)-(line 1157,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1168,
      "end_line": 1171,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte and {@link Zip64Mode #setUseZip64} is {@link\n     * Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1169,col 9)-(line 1169,col 69)",
        "(line 1170,col 9)-(line 1170,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1173,
      "end_line": 1194,
      "comment": "",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 47)",
        "(line 1176,col 9)-(line 1180,col 49)",
        "(line 1182,col 9)-(line 1188,col 9)",
        "(line 1191,col 9)-(line 1191,col 57)",
        "(line 1193,col 9)-(line 1193,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, long, boolean)",
      "begin_line": 1203,
      "end_line": 1286,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @param name The encoded name\n     * @param lfhOffset Local file header offset for this file\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1205,col 9)-(line 1205,col 59)",
        "(line 1208,col 9)-(line 1208,col 38)",
        "(line 1209,col 9)-(line 1211,col 9)",
        "(line 1213,col 9)-(line 1213,col 70)",
        "(line 1214,col 9)-(line 1214,col 59)",
        "(line 1215,col 9)-(line 1215,col 70)",
        "(line 1216,col 9)-(line 1216,col 81)",
        "(line 1217,col 9)-(line 1217,col 41)",
        "(line 1219,col 9)-(line 1219,col 65)",
        "(line 1223,col 9)-(line 1224,col 49)",
        "(line 1226,col 9)-(line 1226,col 45)",
        "(line 1227,col 9)-(line 1227,col 70)",
        "(line 1228,col 9)-(line 1228,col 101)",
        "(line 1229,col 9)-(line 1229,col 99)",
        "(line 1232,col 9)-(line 1232,col 52)",
        "(line 1236,col 9)-(line 1236,col 80)",
        "(line 1241,col 9)-(line 1241,col 50)",
        "(line 1242,col 9)-(line 1250,col 9)",
        "(line 1252,col 9)-(line 1252,col 59)",
        "(line 1255,col 9)-(line 1255,col 61)",
        "(line 1257,col 9)-(line 1257,col 61)",
        "(line 1260,col 9)-(line 1260,col 70)",
        "(line 1263,col 9)-(line 1263,col 82)",
        "(line 1266,col 9)-(line 1266,col 81)",
        "(line 1269,col 9)-(line 1273,col 9)",
        "(line 1276,col 9)-(line 1276,col 94)",
        "(line 1278,col 9)-(line 1278,col 61)",
        "(line 1279,col 9)-(line 1279,col 66)",
        "(line 1281,col 9)-(line 1281,col 59)",
        "(line 1284,col 9)-(line 1284,col 98)",
        "(line 1285,col 9)-(line 1285,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean)",
      "begin_line": 1292,
      "end_line": 1311,
      "comment": "\n     * If the entry needs Zip64 extra information inside the central\n     * directory then configure its data.\n     ",
      "child_ranges": [
        "(line 1294,col 9)-(line 1310,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 1320,
      "end_line": 1353,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link Zip64Mode #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1321,col 9)-(line 1321,col 31)",
        "(line 1324,col 9)-(line 1324,col 27)",
        "(line 1325,col 9)-(line 1325,col 27)",
        "(line 1328,col 9)-(line 1328,col 51)",
        "(line 1329,col 9)-(line 1333,col 9)",
        "(line 1334,col 9)-(line 1337,col 9)",
        "(line 1339,col 9)-(line 1340,col 68)",
        "(line 1341,col 9)-(line 1341,col 26)",
        "(line 1342,col 9)-(line 1342,col 26)",
        "(line 1345,col 9)-(line 1345,col 72)",
        "(line 1346,col 9)-(line 1346,col 72)",
        "(line 1349,col 9)-(line 1349,col 65)",
        "(line 1350,col 9)-(line 1350,col 59)",
        "(line 1351,col 9)-(line 1351,col 49)",
        "(line 1352,col 9)-(line 1352,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory()",
      "begin_line": 1361,
      "end_line": 1421,
      "comment": "\n     * Writes the \u0026quot;ZIP64 End of central dir record\u0026quot; and\n     * \u0026quot;ZIP64 End of central dir locator\u0026quot;.\n     * @throws IOException on error\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1362,col 9)-(line 1364,col 9)",
        "(line 1366,col 9)-(line 1371,col 9)",
        "(line 1373,col 9)-(line 1375,col 9)",
        "(line 1377,col 9)-(line 1377,col 68)",
        "(line 1379,col 9)-(line 1379,col 33)",
        "(line 1382,col 9)-(line 1391,col 30)",
        "(line 1394,col 9)-(line 1394,col 55)",
        "(line 1395,col 9)-(line 1395,col 55)",
        "(line 1398,col 9)-(line 1398,col 24)",
        "(line 1399,col 9)-(line 1399,col 24)",
        "(line 1402,col 9)-(line 1402,col 72)",
        "(line 1403,col 9)-(line 1403,col 22)",
        "(line 1404,col 9)-(line 1404,col 22)",
        "(line 1407,col 9)-(line 1407,col 57)",
        "(line 1408,col 9)-(line 1408,col 57)",
        "(line 1413,col 9)-(line 1413,col 37)",
        "(line 1416,col 9)-(line 1416,col 24)",
        "(line 1418,col 9)-(line 1418,col 55)",
        "(line 1420,col 9)-(line 1420,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 1428,
      "end_line": 1430,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1429,col 9)-(line 1429,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 1440,
      "end_line": 1443,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1442,col 9)-(line 1442,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getGeneralPurposeBits(int, boolean)",
      "begin_line": 1446,
      "end_line": 1453,
      "comment": "",
      "child_ranges": [
        "(line 1447,col 9)-(line 1447,col 60)",
        "(line 1448,col 9)-(line 1448,col 54)",
        "(line 1449,col 9)-(line 1451,col 9)",
        "(line 1452,col 9)-(line 1452,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.versionNeededToExtract(int, boolean)",
      "begin_line": 1455,
      "end_line": 1464,
      "comment": "",
      "child_ranges": [
        "(line 1456,col 9)-(line 1458,col 9)",
        "(line 1461,col 9)-(line 1463,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isDeflatedToOutputStream(int)",
      "begin_line": 1466,
      "end_line": 1468,
      "comment": "",
      "child_ranges": [
        "(line 1467,col 9)-(line 1467,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 1482,
      "end_line": 1489,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     *\n     * \u003cp\u003eMust not be used if the stream has already been closed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1485,col 9)-(line 1487,col 9)",
        "(line 1488,col 9)-(line 1488,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1497,
      "end_line": 1521,
      "comment": "\n     * Get the existing ZIP64 extended information extra field or\n     * create a new one and add it to the entry.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1499,col 9)-(line 1501,col 9)",
        "(line 1502,col 9)-(line 1502,col 28)",
        "(line 1503,col 9)-(line 1506,col 41)",
        "(line 1507,col 9)-(line 1515,col 9)",
        "(line 1518,col 9)-(line 1518,col 37)",
        "(line 1520,col 9)-(line 1520,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1529,
      "end_line": 1533,
      "comment": "\n     * Is there a ZIP64 extended information extra field for the\n     * entry?\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1530,col 9)-(line 1532,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1542,
      "end_line": 1550,
      "comment": "\n     * If the mode is AsNeeded and the entry is a compressed entry of\n     * unknown size that gets written to a non-seekable stream the\n     * change the default to Never.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1543,col 9)-(line 1548,col 9)",
        "(line 1549,col 9)-(line 1549,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1552,
      "end_line": 1556,
      "comment": "",
      "child_ranges": [
        "(line 1553,col 9)-(line 1553,col 70)",
        "(line 1554,col 9)-(line 1555,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1558,
      "end_line": 1560,
      "comment": "",
      "child_ranges": [
        "(line 1559,col 9)-(line 1559,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy()",
      "begin_line": 1569,
      "end_line": 1576,
      "comment": "\n     * Closes the underlying stream/file without finishing the\n     * archive, the result will likely be a corrupt archive.\n     *\n     * \u003cp\u003eThis method only exists to support tests that generate\n     * corrupt archives so they can clean up any temporary files.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1570,col 9)-(line 1572,col 9)",
        "(line 1573,col 9)-(line 1575,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1582,
      "end_line": 1606,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 1586,
      "end_line": 1586,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 1590,
      "end_line": 1590,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 1595,
      "end_line": 1596,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1598,
      "end_line": 1598,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 1599,
      "end_line": 1601,
      "comment": "",
      "child_ranges": [
        "(line 1600,col 13)-(line 1600,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 1602,
      "end_line": 1605,
      "comment": "",
      "child_ranges": [
        "(line 1604,col 13)-(line 1604,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1612,
      "end_line": 1647,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being written.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1613,
      "end_line": 1615,
      "comment": "",
      "child_ranges": [
        "(line 1614,col 13)-(line 1614,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 1619,
      "end_line": 1619,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 1624,
      "end_line": 1624,
      "comment": "\n         * Offset for CRC entry in the local file header data for the\n         * current entry starts here.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 1628,
      "end_line": 1628,
      "comment": "\n         * Data for local header data\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1633,
      "end_line": 1633,
      "comment": "\n         * Number of bytes read for the current entry (can\u0027t rely on\n         * Deflater#getBytesRead) when using DEFLATED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "causedUseOfZip64"
      ],
      "begin_line": 1637,
      "end_line": 1637,
      "comment": "\n         * Whether current entry was the first one using ZIP64 features.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasWritten"
      ],
      "begin_line": 1646,
      "end_line": 1646,
      "comment": "\n         * Whether write() has been called at all.\n         *\n         * \u003cp\u003eIn order to create a valid archive {@link\n         * #closeArchiveEntry closeArchiveEntry} will write an empty\n         * array to get the CRC right if nothing has been written to\n         * the stream at all.\u003c/p\u003e\n         "
    }
  ]
}