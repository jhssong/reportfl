{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 79,
      "end_line": 1621,
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
        "DEFLATED"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Compression method for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_COMPRESSION"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Default compression level for deflated entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "STORED"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Compression method for stored entries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ENCODING"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * default encoding for file names and comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EFS_FLAG"
      ],
      "begin_line": 139,
      "end_line": 140,
      "comment": "\n     * General purpose flag, which indicates that filenames are\n     * written in UTF-8.\n     * @deprecated use {@link GeneralPurposeBit#UFT8_NAMES_FLAG} instead\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Current entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "comment"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * The file comment.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "level"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Compression level for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasCompressionLevelChanged"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": "\n     * Has the compression level changed when compared to the last\n     * entry?\n     "
    },
    {
      "type": "field",
      "varNames": [
        "method"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * Default compression method for next entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entries"
      ],
      "begin_line": 173,
      "end_line": 174,
      "comment": "\n     * List of ZipArchiveEntries written so far.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "streamCompressor"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "cdOffset"
      ],
      "begin_line": 181,
      "end_line": 181,
      "comment": "\n     * Start of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "cdLength"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * Length of central directory.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZERO"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * Helper, a 0 as ZipShort.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZERO"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": "\n     * Helper, a 0 as ZipLong.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ONE"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "offsets"
      ],
      "begin_line": 203,
      "end_line": 204,
      "comment": "\n     * Holds the offsets of the LFH starts for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zipEncoding"
      ],
      "begin_line": 221,
      "end_line": 222,
      "comment": "\n     * The zip encoding to use for filenames and the file comment.\n     *\n     * This field is of internal use and will be set in {@link\n     * #setEncoding(String)}.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "def"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": "\n     * This Deflater object is used for output.\n     *\n     "
    },
    {
      "type": "field",
      "varNames": [
        "raf"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": "\n     * Optional random access output.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "out"
      ],
      "begin_line": 235,
      "end_line": 235,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "useUTF8Flag"
      ],
      "begin_line": 241,
      "end_line": 241,
      "comment": "\n     * whether to use the general purpose bit flag when writing UTF-8\n     * filenames or not.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "fallbackToUTF8"
      ],
      "begin_line": 246,
      "end_line": 246,
      "comment": "\n     * Whether to encode non-encodable file names as UTF-8.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "createUnicodeExtraFields"
      ],
      "begin_line": 251,
      "end_line": 251,
      "comment": "\n     * whether to create UnicodePathExtraField-s for each entry.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "hasUsedZip64"
      ],
      "begin_line": 258,
      "end_line": 258,
      "comment": "\n     * Whether anything inside this archive has used a ZIP64 feature.\n     *\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "zip64Mode"
      ],
      "begin_line": 260,
      "end_line": 260,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "copyBuffer"
      ],
      "begin_line": 262,
      "end_line": 262,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "calendarInstance"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.OutputStream)",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\n     * Creates a new ZIP OutputStream filtering the underlying stream.\n     * @param out the outputstream to zip\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 23)",
        "(line 271,col 9)-(line 271,col 24)",
        "(line 272,col 9)-(line 272,col 40)",
        "(line 273,col 9)-(line 273,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZipArchiveOutputStream(java.io.File)",
      "begin_line": 282,
      "end_line": 297,
      "comment": "\n     * Creates a new ZIP OutputStream writing to a File.  Will use\n     * random access if possible.\n     * @param file the file to zip to\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 30)",
        "(line 284,col 9)-(line 284,col 37)",
        "(line 285,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 40)",
        "(line 294,col 9)-(line 294,col 62)",
        "(line 295,col 9)-(line 295,col 16)",
        "(line 296,col 9)-(line 296,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isSeekable()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * This method indicates whether this archive is writing to a\n     * seekable stream (i.e., to a random access file).\n     *\n     * \u003cp\u003eFor seekable streams, you don\u0027t need to calculate the CRC or\n     * uncompressed size for {@link #STORED} entries before\n     * invoking {@link #putArchiveEntry(ArchiveEntry)}.\n     * @return true if seekable\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setEncoding(java.lang.String)",
      "begin_line": 321,
      "end_line": 327,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * \u003cp\u003eFor a list of possible values see \u003ca\n     * href\u003d\"http://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\"\u003ehttp://java.sun.com/j2se/1.5.0/docs/guide/intl/encoding.doc.html\u003c/a\u003e.\n     * Defaults to UTF-8.\u003c/p\u003e\n     * @param encoding the encoding to use for file names, use null\n     * for the platform\u0027s default encoding\n     ",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 33)",
        "(line 323,col 9)-(line 323,col 70)",
        "(line 324,col 9)-(line 326,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEncoding()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * The encoding to use for filenames and the file comment.\n     *\n     * @return null if using the platform\u0027s default character encoding.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseLanguageEncodingFlag(boolean)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     *\n     * @param b whether to set the language encoding flag if the file\n     * name encoding is UTF-8\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     *\n     * @param b whether to create Unicode Extra Fields.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     *\n     * @param b whether to fall back to UTF and the language encoding\n     * flag if the file name cannot be encoded using the specified\n     * encoding.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n     * Whether Zip64 extensions will be used.\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Never Never},\n     * {@link #putArchiveEntry}, {@link #closeArchiveEntry}, {@link\n     * #finish} or {@link #close} may throw a {@link\n     * Zip64RequiredException} if the entry\u0027s size or the total size\n     * of the archive exceeds 4GB or there are more than 65536 entries\n     * inside the archive.  Any archive created in this mode will be\n     * readable by implementations that don\u0027t support Zip64.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Always Always},\n     * Zip64 extensions will be used for all entries.  Any archive\n     * created in this mode may be unreadable by implementations that\n     * don\u0027t support Zip64 even if all its contents would be.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#AsNeeded\n     * AsNeeded}, Zip64 extensions will transparently be used for\n     * those entries that require them.  This mode can only be used if\n     * the uncompressed size of the {@link ZipArchiveEntry} is known\n     * when calling {@link #putArchiveEntry} or the archive is written\n     * to a seekable output (i.e. you have used the {@link\n     * #ZipArchiveOutputStream(java.io.File) File-arg constructor}) -\n     * this mode is not valid when the output stream is not seekable\n     * and the uncompressed size is unknown when {@link\n     * #putArchiveEntry} is called.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf no entry inside the resulting archive requires Zip64\n     * extensions then {@link Zip64Mode#Never Never} will create the\n     * smallest archive.  {@link Zip64Mode#AsNeeded AsNeeded} will\n     * create a slightly bigger archive if the uncompressed size of\n     * any entry has initially been unknown and create an archive\n     * identical to {@link Zip64Mode#Never Never} otherwise.  {@link\n     * Zip64Mode#Always Always} will create an archive that is at\n     * least 24 bytes per entry bigger than the one {@link\n     * Zip64Mode#Never Never} would create.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to {@link Zip64Mode#AsNeeded AsNeeded} unless\n     * {@link #putArchiveEntry} is called with an entry of unknown\n     * size and data is written to a non-seekable stream - in this\n     * case the default is {@link Zip64Mode#Never Never}.\u003c/p\u003e\n     *\n     * @since 1.3\n     * @param mode Whether Zip64 extensions will be used.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 431,
      "end_line": 451,
      "comment": "\n     * {@inheritDoc}\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 435,col 9)",
        "(line 437,col 9)-(line 439,col 9)",
        "(line 441,col 9)-(line 441,col 59)",
        "(line 442,col 9)-(line 442,col 40)",
        "(line 444,col 9)-(line 444,col 70)",
        "(line 445,col 9)-(line 445,col 37)",
        "(line 446,col 9)-(line 446,col 35)",
        "(line 447,col 9)-(line 447,col 24)",
        "(line 448,col 9)-(line 448,col 24)",
        "(line 449,col 9)-(line 449,col 33)",
        "(line 450,col 9)-(line 450,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryInChunks()",
      "begin_line": 453,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 39)",
        "(line 455,col 9)-(line 455,col 106)",
        "(line 456,col 9)-(line 456,col 22)",
        "(line 457,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 475,
      "end_line": 488,
      "comment": "\n     * Writes all necessary data for this entry.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size exceeds 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 19)",
        "(line 479,col 9)-(line 479,col 24)",
        "(line 481,col 9)-(line 481,col 92)",
        "(line 482,col 9)-(line 482,col 57)",
        "(line 483,col 9)-(line 483,col 58)",
        "(line 484,col 9)-(line 484,col 75)",
        "(line 485,col 9)-(line 485,col 99)",
        "(line 486,col 9)-(line 486,col 46)",
        "(line 487,col 9)-(line 487,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry(boolean)",
      "begin_line": 500,
      "end_line": 506,
      "comment": "\n     * Writes all necessary data for this entry.\n     *\n     * @throws IOException            on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     *                                compressed size exceeds 4 GByte and {@link #setUseZip64}\n     *                                is {@link Zip64Mode#Never}.\n     * @param phased              This entry is second phase of a 2-phase zip creation, size, compressed size and crc\n     *                            are known in ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 19)",
        "(line 502,col 9)-(line 502,col 48)",
        "(line 503,col 9)-(line 503,col 75)",
        "(line 504,col 9)-(line 504,col 76)",
        "(line 505,col 9)-(line 505,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeEntry(boolean, boolean)",
      "begin_line": 508,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 513,col 41)",
        "(line 514,col 9)-(line 514,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose()",
      "begin_line": 517,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 522,col 9)-(line 524,col 9)",
        "(line 526,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)",
      "begin_line": 544,
      "end_line": 559,
      "comment": "\n     * Adds an archive entry with a raw input stream.\n     *\n     * If crc, size and compressed size are supplied on the entry, these values will be used as-is.\n     * Zip64 status is re-established based on the settings in this stream, and the supplied value\n     * is ignored.\n     *\n     * The entry is put and closed immediately.\n     *\n     * @param entry The archive entry to add\n     * @param rawStream The raw input stream of a different entry. May be compressed/encrypted.\n     * @throws IOException If copying fails\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 62)",
        "(line 547,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 555,col 71)",
        "(line 556,col 9)-(line 556,col 44)",
        "(line 557,col 9)-(line 557,col 42)",
        "(line 558,col 9)-(line 558,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater()",
      "begin_line": 564,
      "end_line": 568,
      "comment": "\n     * Ensures all bytes sent to the deflater are written to the stream.\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 567,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 576,
      "end_line": 611,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 579,col 9)-(line 608,col 9)",
        "(line 610,col 9)-(line 610,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 619,
      "end_line": 626,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 87)",
        "(line 622,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 625,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 628,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 632,
      "end_line": 634,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(boolean)",
      "begin_line": 641,
      "end_line": 686,
      "comment": "\n     * When using random access output, write the local file header\n     * and potentiall the ZIP64 extra containing the correct CRC and\n     * compressed/uncompressed sizes.\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 47)",
        "(line 645,col 9)-(line 645,col 39)",
        "(line 646,col 9)-(line 646,col 57)",
        "(line 647,col 9)-(line 653,col 9)",
        "(line 655,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 695,
      "end_line": 698,
      "comment": "\n     * {@inheritDoc} \n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry, boolean)",
      "begin_line": 712,
      "end_line": 756,
      "comment": "\n     * Writes the headers for an archive entry to the output stream.\n     * The caller must then write the content to the stream and call\n     * {@link #closeArchiveEntry()} to complete the process.\n\n     * @param archiveEntry The archiveEntry\n     * @param phased If true size, compressedSize and crc required to be known up-front in the archiveEntry\n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64}\n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 713,col 9)-(line 715,col 9)",
        "(line 717,col 9)-(line 719,col 9)",
        "(line 721,col 9)-(line 721,col 65)",
        "(line 722,col 9)-(line 722,col 33)",
        "(line 724,col 9)-(line 724,col 33)",
        "(line 726,col 9)-(line 726,col 75)",
        "(line 727,col 9)-(line 727,col 47)",
        "(line 729,col 9)-(line 749,col 9)",
        "(line 751,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 762,
      "end_line": 770,
      "comment": "\n     * Provides default values for compression method and last\n     * modification time.\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 765,col 9)",
        "(line 767,col 9)-(line 769,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 778,
      "end_line": 800,
      "comment": "\n     * Throws an exception if the size is unknown for a stored entry\n     * that is written to a non-seekable output or the entry is too\n     * big to be written without Zip64 extra but the mode has been set\n     * to Never.\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 792,col 9)",
        "(line 794,col 9)-(line 799,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 816,
      "end_line": 822,
      "comment": "\n     * Whether to addd a Zip64 extended information extra field to the\n     * local file header.\n     *\n     * \u003cp\u003eReturns true if\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003emode is Always\u003c/li\u003e\n     * \u003cli\u003eor we already know it is going to be needed\u003c/li\u003e\n     * \u003cli\u003eor the size is unknown and we can ensure it won\u0027t hurt\n     * other implementations if we add it (i.e. we can erase its\n     * usage\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 821,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 828,
      "end_line": 830,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 829,col 9)-(line 829,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 840,
      "end_line": 848,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 841,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 846,col 59)",
        "(line 847,col 9)-(line 847,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 856,
      "end_line": 858,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 867,
      "end_line": 876,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 869,col 9)-(line 874,col 9)",
        "(line 875,col 9)-(line 875,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 885,
      "end_line": 893,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 887,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 52)",
        "(line 891,col 9)-(line 891,col 104)",
        "(line 892,col 9)-(line 892,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(byte[])",
      "begin_line": 900,
      "end_line": 902,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.copyFromZipInputStream(java.io.InputStream)",
      "begin_line": 904,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 52)",
        "(line 909,col 9)-(line 909,col 32)",
        "(line 910,col 9)-(line 910,col 19)",
        "(line 911,col 9)-(line 915,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 927,
      "end_line": 933,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @throws  IOException  if an I/O error occurs.\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 929,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 932,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 941,
      "end_line": 946,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @throws  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 943,col 9)-(line 945,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 954,
      "end_line": 954,
      "comment": "\n     * local file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 958,
      "end_line": 958,
      "comment": "\n     * data descriptor signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 962,
      "end_line": 962,
      "comment": "\n     * central file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 966,
      "end_line": 966,
      "comment": "\n     * end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_SIG"
      ],
      "begin_line": 970,
      "end_line": 970,
      "comment": "\n     * ZIP64 end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_LOC_SIG"
      ],
      "begin_line": 974,
      "end_line": 974,
      "comment": "\n     * ZIP64 end of central dir locator signature\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 980,
      "end_line": 982,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 981,col 9)-(line 981,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 989,
      "end_line": 991,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 990,col 9)-(line 990,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean)",
      "begin_line": 993,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 70)",
        "(line 995,col 9)-(line 995,col 44)",
        "(line 997,col 9)-(line 999,col 9)",
        "(line 1001,col 9)-(line 1001,col 86)",
        "(line 1002,col 9)-(line 1002,col 78)",
        "(line 1003,col 9)-(line 1003,col 42)",
        "(line 1004,col 9)-(line 1004,col 65)",
        "(line 1005,col 9)-(line 1005,col 34)",
        "(line 1006,col 9)-(line 1006,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, boolean, boolean)",
      "begin_line": 1010,
      "end_line": 1074,
      "comment": "",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 56)",
        "(line 1013,col 9)-(line 1013,col 59)",
        "(line 1014,col 9)-(line 1014,col 68)",
        "(line 1015,col 9)-(line 1015,col 41)",
        "(line 1017,col 9)-(line 1017,col 65)",
        "(line 1020,col 9)-(line 1020,col 45)",
        "(line 1022,col 9)-(line 1026,col 9)",
        "(line 1028,col 9)-(line 1028,col 115)",
        "(line 1029,col 9)-(line 1029,col 54)",
        "(line 1032,col 9)-(line 1032,col 52)",
        "(line 1034,col 9)-(line 1034,col 80)",
        "(line 1037,col 9)-(line 1043,col 9)",
        "(line 1047,col 9)-(line 1062,col 9)",
        "(line 1064,col 9)-(line 1064,col 59)",
        "(line 1067,col 9)-(line 1067,col 61)",
        "(line 1070,col 9)-(line 1070,col 95)",
        "(line 1072,col 9)-(line 1072,col 85)",
        "(line 1073,col 9)-(line 1073,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)",
      "begin_line": 1082,
      "end_line": 1110,
      "comment": "\n     * Adds UnicodeExtra fields for name and file comment if mode is\n     * ALWAYS or the data cannot be encoded using the configured\n     * encoding.\n     ",
      "child_ranges": [
        "(line 1085,col 9)-(line 1092,col 9)",
        "(line 1094,col 9)-(line 1094,col 44)",
        "(line 1095,col 9)-(line 1109,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1117,
      "end_line": 1130,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1120,col 9)",
        "(line 1121,col 9)-(line 1121,col 29)",
        "(line 1122,col 9)-(line 1122,col 52)",
        "(line 1123,col 9)-(line 1129,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1140,
      "end_line": 1143,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte and {@link Zip64Mode #setUseZip64} is {@link\n     * Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1141,col 9)-(line 1141,col 69)",
        "(line 1142,col 9)-(line 1142,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1145,
      "end_line": 1166,
      "comment": "",
      "child_ranges": [
        "(line 1147,col 9)-(line 1147,col 47)",
        "(line 1148,col 9)-(line 1152,col 49)",
        "(line 1154,col 9)-(line 1160,col 9)",
        "(line 1163,col 9)-(line 1163,col 57)",
        "(line 1165,col 9)-(line 1165,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, long, boolean)",
      "begin_line": 1175,
      "end_line": 1258,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @param name The encoded name\n     * @param lfhOffset Local file header offset for this file\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1177,col 9)-(line 1177,col 59)",
        "(line 1180,col 9)-(line 1180,col 38)",
        "(line 1181,col 9)-(line 1183,col 9)",
        "(line 1185,col 9)-(line 1185,col 70)",
        "(line 1186,col 9)-(line 1186,col 59)",
        "(line 1187,col 9)-(line 1187,col 70)",
        "(line 1188,col 9)-(line 1188,col 81)",
        "(line 1189,col 9)-(line 1189,col 41)",
        "(line 1191,col 9)-(line 1191,col 65)",
        "(line 1195,col 9)-(line 1196,col 49)",
        "(line 1198,col 9)-(line 1198,col 45)",
        "(line 1199,col 9)-(line 1199,col 70)",
        "(line 1200,col 9)-(line 1200,col 101)",
        "(line 1201,col 9)-(line 1201,col 99)",
        "(line 1204,col 9)-(line 1204,col 52)",
        "(line 1208,col 9)-(line 1208,col 80)",
        "(line 1213,col 9)-(line 1213,col 50)",
        "(line 1214,col 9)-(line 1222,col 9)",
        "(line 1224,col 9)-(line 1224,col 59)",
        "(line 1227,col 9)-(line 1227,col 61)",
        "(line 1229,col 9)-(line 1229,col 61)",
        "(line 1232,col 9)-(line 1232,col 70)",
        "(line 1235,col 9)-(line 1235,col 82)",
        "(line 1238,col 9)-(line 1238,col 81)",
        "(line 1241,col 9)-(line 1245,col 9)",
        "(line 1248,col 9)-(line 1248,col 94)",
        "(line 1250,col 9)-(line 1250,col 61)",
        "(line 1251,col 9)-(line 1251,col 66)",
        "(line 1253,col 9)-(line 1253,col 59)",
        "(line 1256,col 9)-(line 1256,col 98)",
        "(line 1257,col 9)-(line 1257,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean)",
      "begin_line": 1264,
      "end_line": 1283,
      "comment": "\n     * If the entry needs Zip64 extra information inside the central\n     * directory then configure its data.\n     ",
      "child_ranges": [
        "(line 1266,col 9)-(line 1282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 1292,
      "end_line": 1325,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link Zip64Mode #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1293,col 9)-(line 1293,col 31)",
        "(line 1296,col 9)-(line 1296,col 27)",
        "(line 1297,col 9)-(line 1297,col 27)",
        "(line 1300,col 9)-(line 1300,col 51)",
        "(line 1301,col 9)-(line 1305,col 9)",
        "(line 1306,col 9)-(line 1309,col 9)",
        "(line 1311,col 9)-(line 1312,col 68)",
        "(line 1313,col 9)-(line 1313,col 26)",
        "(line 1314,col 9)-(line 1314,col 26)",
        "(line 1317,col 9)-(line 1317,col 72)",
        "(line 1318,col 9)-(line 1318,col 72)",
        "(line 1321,col 9)-(line 1321,col 65)",
        "(line 1322,col 9)-(line 1322,col 59)",
        "(line 1323,col 9)-(line 1323,col 49)",
        "(line 1324,col 9)-(line 1324,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory()",
      "begin_line": 1333,
      "end_line": 1393,
      "comment": "\n     * Writes the \u0026quot;ZIP64 End of central dir record\u0026quot; and\n     * \u0026quot;ZIP64 End of central dir locator\u0026quot;.\n     * @throws IOException on error\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1334,col 9)-(line 1336,col 9)",
        "(line 1338,col 9)-(line 1343,col 9)",
        "(line 1345,col 9)-(line 1347,col 9)",
        "(line 1349,col 9)-(line 1349,col 68)",
        "(line 1351,col 9)-(line 1351,col 33)",
        "(line 1354,col 9)-(line 1363,col 30)",
        "(line 1366,col 9)-(line 1366,col 55)",
        "(line 1367,col 9)-(line 1367,col 55)",
        "(line 1370,col 9)-(line 1370,col 24)",
        "(line 1371,col 9)-(line 1371,col 24)",
        "(line 1374,col 9)-(line 1374,col 72)",
        "(line 1375,col 9)-(line 1375,col 22)",
        "(line 1376,col 9)-(line 1376,col 22)",
        "(line 1379,col 9)-(line 1379,col 57)",
        "(line 1380,col 9)-(line 1380,col 57)",
        "(line 1385,col 9)-(line 1385,col 37)",
        "(line 1388,col 9)-(line 1388,col 24)",
        "(line 1390,col 9)-(line 1390,col 55)",
        "(line 1392,col 9)-(line 1392,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 1400,
      "end_line": 1402,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1401,col 9)-(line 1401,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 1412,
      "end_line": 1415,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1414,col 9)-(line 1414,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getGeneralPurposeBits(int, boolean)",
      "begin_line": 1418,
      "end_line": 1425,
      "comment": "",
      "child_ranges": [
        "(line 1419,col 9)-(line 1419,col 60)",
        "(line 1420,col 9)-(line 1420,col 54)",
        "(line 1421,col 9)-(line 1423,col 9)",
        "(line 1424,col 9)-(line 1424,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.versionNeededToExtract(int, boolean)",
      "begin_line": 1427,
      "end_line": 1436,
      "comment": "",
      "child_ranges": [
        "(line 1428,col 9)-(line 1430,col 9)",
        "(line 1433,col 9)-(line 1435,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isDeflatedToOutputStream(int)",
      "begin_line": 1438,
      "end_line": 1440,
      "comment": "",
      "child_ranges": [
        "(line 1439,col 9)-(line 1439,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 1454,
      "end_line": 1461,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     *\n     * \u003cp\u003eMust not be used if the stream has already been closed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1457,col 9)-(line 1459,col 9)",
        "(line 1460,col 9)-(line 1460,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1469,
      "end_line": 1493,
      "comment": "\n     * Get the existing ZIP64 extended information extra field or\n     * create a new one and add it to the entry.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1471,col 9)-(line 1473,col 9)",
        "(line 1474,col 9)-(line 1474,col 28)",
        "(line 1475,col 9)-(line 1478,col 41)",
        "(line 1479,col 9)-(line 1487,col 9)",
        "(line 1490,col 9)-(line 1490,col 37)",
        "(line 1492,col 9)-(line 1492,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1501,
      "end_line": 1505,
      "comment": "\n     * Is there a ZIP64 extended information extra field for the\n     * entry?\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1502,col 9)-(line 1504,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1514,
      "end_line": 1522,
      "comment": "\n     * If the mode is AsNeeded and the entry is a compressed entry of\n     * unknown size that gets written to a non-seekable stream the\n     * change the default to Never.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1515,col 9)-(line 1520,col 9)",
        "(line 1521,col 9)-(line 1521,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1524,
      "end_line": 1528,
      "comment": "",
      "child_ranges": [
        "(line 1525,col 9)-(line 1525,col 70)",
        "(line 1526,col 9)-(line 1527,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1530,
      "end_line": 1532,
      "comment": "",
      "child_ranges": [
        "(line 1531,col 9)-(line 1531,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy()",
      "begin_line": 1541,
      "end_line": 1548,
      "comment": "\n     * Closes the underlying stream/file without finishing the\n     * archive, the result will likely be a corrupt archive.\n     *\n     * \u003cp\u003eThis method only exists to support tests that generate\n     * corrupt archives so they can clean up any temporary files.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1542,col 9)-(line 1544,col 9)",
        "(line 1545,col 9)-(line 1547,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1554,
      "end_line": 1578,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 1558,
      "end_line": 1558,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 1562,
      "end_line": 1562,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 1567,
      "end_line": 1568,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1570,
      "end_line": 1570,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 1571,
      "end_line": 1573,
      "comment": "",
      "child_ranges": [
        "(line 1572,col 13)-(line 1572,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 1574,
      "end_line": 1577,
      "comment": "",
      "child_ranges": [
        "(line 1576,col 13)-(line 1576,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1584,
      "end_line": 1619,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being written.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1585,
      "end_line": 1587,
      "comment": "",
      "child_ranges": [
        "(line 1586,col 13)-(line 1586,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 1591,
      "end_line": 1591,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 1596,
      "end_line": 1596,
      "comment": "\n         * Offset for CRC entry in the local file header data for the\n         * current entry starts here.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 1600,
      "end_line": 1600,
      "comment": "\n         * Data for local header data\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1605,
      "end_line": 1605,
      "comment": "\n         * Number of bytes read for the current entry (can\u0027t rely on\n         * Deflater#getBytesRead) when using DEFLATED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "causedUseOfZip64"
      ],
      "begin_line": 1609,
      "end_line": 1609,
      "comment": "\n         * Whether current entry was the first one using ZIP64 features.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasWritten"
      ],
      "begin_line": 1618,
      "end_line": 1618,
      "comment": "\n         * Whether write() has been called at all.\n         *\n         * \u003cp\u003eIn order to create a valid archive {@link\n         * #closeArchiveEntry closeArchiveEntry} will write an empty\n         * array to get the CRC right if nothing has been written to\n         * the stream at all.\u003c/p\u003e\n         "
    }
  ]
}