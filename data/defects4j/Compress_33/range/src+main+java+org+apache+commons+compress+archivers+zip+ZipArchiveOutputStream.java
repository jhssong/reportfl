{
  "filepath": "/tmp/Compress-33b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveOutputStream"
      ],
      "begin_line": 79,
      "end_line": 1613,
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
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * Whether to set the language encoding flag if the file name\n     * encoding is UTF-8.\n     *\n     * \u003cp\u003eDefaults to true.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setCreateUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy)",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\n     * Whether to create Unicode Extra Fields.\n     *\n     * \u003cp\u003eDefaults to NEVER.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setFallbackToUTF8(boolean)",
      "begin_line": 372,
      "end_line": 374,
      "comment": "\n     * Whether to fall back to UTF and the language encoding flag if\n     * the file name cannot be encoded using the specified encoding.\n     *\n     * \u003cp\u003eDefaults to false.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setUseZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Whether Zip64 extensions will be used.\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Never Never},\n     * {@link #putArchiveEntry}, {@link #closeArchiveEntry}, {@link\n     * #finish} or {@link #close} may throw a {@link\n     * Zip64RequiredException} if the entry\u0027s size or the total size\n     * of the archive exceeds 4GB or there are more than 65536 entries\n     * inside the archive.  Any archive created in this mode will be\n     * readable by implementations that don\u0027t support Zip64.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#Always Always},\n     * Zip64 extensions will be used for all entries.  Any archive\n     * created in this mode may be unreadable by implementations that\n     * don\u0027t support Zip64 even if all its contents would be.\u003c/p\u003e\n     *\n     * \u003cp\u003eWhen setting the mode to {@link Zip64Mode#AsNeeded\n     * AsNeeded}, Zip64 extensions will transparently be used for\n     * those entries that require them.  This mode can only be used if\n     * the uncompressed size of the {@link ZipArchiveEntry} is known\n     * when calling {@link #putArchiveEntry} or the archive is written\n     * to a seekable output (i.e. you have used the {@link\n     * #ZipArchiveOutputStream(java.io.File) File-arg constructor}) -\n     * this mode is not valid when the output stream is not seekable\n     * and the uncompressed size is unknown when {@link\n     * #putArchiveEntry} is called.\u003c/p\u003e\n     * \n     * \u003cp\u003eIf no entry inside the resulting archive requires Zip64\n     * extensions then {@link Zip64Mode#Never Never} will create the\n     * smallest archive.  {@link Zip64Mode#AsNeeded AsNeeded} will\n     * create a slightly bigger archive if the uncompressed size of\n     * any entry has initially been unknown and create an archive\n     * identical to {@link Zip64Mode#Never Never} otherwise.  {@link\n     * Zip64Mode#Always Always} will create an archive that is at\n     * least 24 bytes per entry bigger than the one {@link\n     * Zip64Mode#Never Never} would create.\u003c/p\u003e\n     *\n     * \u003cp\u003eDefaults to {@link Zip64Mode#AsNeeded AsNeeded} unless\n     * {@link #putArchiveEntry} is called with an entry of unknown\n     * size and data is written to a non-seekable stream - in this\n     * case the default is {@link Zip64Mode#Never Never}.\u003c/p\u003e\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.finish()",
      "begin_line": 430,
      "end_line": 450,
      "comment": "\n     * {@inheritDoc}\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 438,col 9)",
        "(line 440,col 9)-(line 440,col 59)",
        "(line 441,col 9)-(line 441,col 40)",
        "(line 443,col 9)-(line 443,col 70)",
        "(line 444,col 9)-(line 444,col 37)",
        "(line 445,col 9)-(line 445,col 35)",
        "(line 446,col 9)-(line 446,col 24)",
        "(line 447,col 9)-(line 447,col 24)",
        "(line 448,col 9)-(line 448,col 33)",
        "(line 449,col 9)-(line 449,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryInChunks()",
      "begin_line": 452,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 33)",
        "(line 454,col 9)-(line 454,col 100)",
        "(line 455,col 9)-(line 455,col 22)",
        "(line 456,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 474,
      "end_line": 487,
      "comment": "\n     * Writes all necessary data for this entry.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size exceeds 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 19)",
        "(line 478,col 9)-(line 478,col 24)",
        "(line 480,col 9)-(line 480,col 86)",
        "(line 481,col 9)-(line 481,col 51)",
        "(line 482,col 9)-(line 482,col 58)",
        "(line 483,col 9)-(line 483,col 75)",
        "(line 484,col 9)-(line 484,col 99)",
        "(line 485,col 9)-(line 485,col 46)",
        "(line 486,col 9)-(line 486,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeCopiedEntry(boolean)",
      "begin_line": 499,
      "end_line": 505,
      "comment": "\n     * Writes all necessary data for this entry.\n     *\n     * @throws IOException            on error\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     *                                compressed size exceeds 4 GByte and {@link #setUseZip64}\n     *                                is {@link Zip64Mode#Never}.\n     * @param phased              This entry is second phase of a 2-phase zip creation, size, compressed size and crc\n     *                            are known in ZipArchiveEntry\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 19)",
        "(line 501,col 9)-(line 501,col 48)",
        "(line 502,col 9)-(line 502,col 69)",
        "(line 503,col 9)-(line 503,col 70)",
        "(line 504,col 9)-(line 504,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.closeEntry(boolean, boolean)",
      "begin_line": 507,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 508,col 9)-(line 510,col 9)",
        "(line 512,col 9)-(line 512,col 41)",
        "(line 513,col 9)-(line 513,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.preClose()",
      "begin_line": 516,
      "end_line": 528,
      "comment": "",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 527,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addRawArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.io.InputStream)",
      "begin_line": 543,
      "end_line": 558,
      "comment": "\n     * Adds an archive entry with a raw input stream.\n     *\n     * If crc, size and compressed size are supplied on the entry, these values will be used as-is.\n     * Zip64 status is re-established based on the settings in this stream, and the supplied value\n     * is ignored.\n     *\n     * The entry is put and closed immediately.\n     *\n     * @param entry The archive entry to add\n     * @param rawStream The raw input stream of a different entry. May be compressed/encrypted.\n     * @throws IOException If copying fails\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 56)",
        "(line 546,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 554,col 71)",
        "(line 555,col 9)-(line 555,col 44)",
        "(line 556,col 9)-(line 556,col 42)",
        "(line 557,col 9)-(line 557,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flushDeflater()",
      "begin_line": 563,
      "end_line": 567,
      "comment": "\n     * Ensures all bytes sent to the deflater are written to the stream.\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 566,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleSizesAndCrc(long, long, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 575,
      "end_line": 610,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 607,col 9)",
        "(line 609,col 9)-(line 609,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.checkIfNeedsZip64(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 618,
      "end_line": 625,
      "comment": "\n     * Ensures the current entry\u0027s size and CRC information is set to\n     * the values just written, verifies it isn\u0027t too big in the\n     * Zip64Mode.Never case and returns whether the entry would\n     * require a Zip64 extra field.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 87)",
        "(line 621,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 624,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isZip64Required(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isTooLageForZip32(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 631,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.rewriteSizesAndCrc(boolean)",
      "begin_line": 640,
      "end_line": 685,
      "comment": "\n     * When using random access output, write the local file header\n     * and potentiall the ZIP64 extra containing the correct CRC and\n     * compressed/uncompressed sizes.\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 41)",
        "(line 644,col 9)-(line 644,col 39)",
        "(line 645,col 9)-(line 645,col 57)",
        "(line 646,col 9)-(line 652,col 9)",
        "(line 654,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 694,
      "end_line": 697,
      "comment": "\n     * {@inheritDoc} \n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64} \n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 696,col 9)-(line 696,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry, boolean)",
      "begin_line": 711,
      "end_line": 755,
      "comment": "\n     * Writes the headers for an archive entry to the output stream.\n     * The caller must then write the content to the stream and call\n     * {@link #closeArchiveEntry()} to complete the process.\n\n     * @param archiveEntry The archiveEntry\n     * @param phased If true size, compressedSize and crc required to be known up-front in the archiveEntry\n     * @throws ClassCastException if entry is not an instance of ZipArchiveEntry\n     * @throws Zip64RequiredException if the entry\u0027s uncompressed or\n     * compressed size is known to exceed 4 GByte and {@link #setUseZip64}\n     * is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 714,col 9)",
        "(line 716,col 9)-(line 718,col 9)",
        "(line 720,col 9)-(line 720,col 65)",
        "(line 721,col 9)-(line 721,col 33)",
        "(line 723,col 9)-(line 723,col 33)",
        "(line 725,col 9)-(line 725,col 75)",
        "(line 726,col 9)-(line 726,col 47)",
        "(line 728,col 9)-(line 748,col 9)",
        "(line 750,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setDefaults(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 761,
      "end_line": 769,
      "comment": "\n     * Provides default values for compression method and last\n     * modification time.\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 768,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.validateSizeInformation(org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 777,
      "end_line": 799,
      "comment": "\n     * Throws an exception if the size is unknown for a stored entry\n     * that is written to a non-seekable output or the entry is too\n     * big to be written without Zip64 extra but the mode has been set\n     * to Never.\n     ",
      "child_ranges": [
        "(line 780,col 9)-(line 791,col 9)",
        "(line 793,col 9)-(line 798,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.shouldAddZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.archivers.zip.Zip64Mode)",
      "begin_line": 815,
      "end_line": 821,
      "comment": "\n     * Whether to addd a Zip64 extended information extra field to the\n     * local file header.\n     *\n     * \u003cp\u003eReturns true if\u003c/p\u003e\n     *\n     * \u003cul\u003e\n     * \u003cli\u003emode is Always\u003c/li\u003e\n     * \u003cli\u003eor we already know it is going to be needed\u003c/li\u003e\n     * \u003cli\u003eor the size is unknown and we can ensure it won\u0027t hurt\n     * other implementations if we add it (i.e. we can erase its\n     * usage\u003c/li\u003e\n     * \u003c/ul\u003e\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 820,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setComment(java.lang.String)",
      "begin_line": 827,
      "end_line": 829,
      "comment": "\n     * Set the file comment.\n     * @param comment the comment\n     ",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setLevel(int)",
      "begin_line": 839,
      "end_line": 847,
      "comment": "\n     * Sets the compression level for subsequent entries.\n     *\n     * \u003cp\u003eDefault is Deflater.DEFAULT_COMPRESSION.\u003c/p\u003e\n     * @param level the compression level.\n     * @throws IllegalArgumentException if an invalid compression\n     * level is specified.\n     ",
      "child_ranges": [
        "(line 840,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 59)",
        "(line 846,col 9)-(line 846,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.setMethod(int)",
      "begin_line": 855,
      "end_line": 857,
      "comment": "\n     * Sets the default compression method for subsequent entries.\n     *\n     * \u003cp\u003eDefault is DEFLATED.\u003c/p\u003e\n     * @param method an \u003ccode\u003eint\u003c/code\u003e from java.util.zip.ZipEntry\n     ",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 866,
      "end_line": 875,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eMay return false if it is set up to use encryption or a\n     * compression method that hasn\u0027t been implemented yet.\u003c/p\u003e\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 868,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 874,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.write(byte[], int, int)",
      "begin_line": 884,
      "end_line": 892,
      "comment": "\n     * Writes bytes to ZIP entry.\n     * @param b the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 52)",
        "(line 890,col 9)-(line 890,col 98)",
        "(line 891,col 9)-(line 891,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCounted(byte[])",
      "begin_line": 899,
      "end_line": 901,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 900,col 9)-(line 900,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.copyFromZipInputStream(java.io.InputStream)",
      "begin_line": 903,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 52)",
        "(line 908,col 9)-(line 908,col 32)",
        "(line 909,col 9)-(line 909,col 19)",
        "(line 910,col 9)-(line 914,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.close()",
      "begin_line": 926,
      "end_line": 932,
      "comment": "\n     * Closes this output stream and releases any system resources\n     * associated with the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 928,col 9)-(line 930,col 9)",
        "(line 931,col 9)-(line 931,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.flush()",
      "begin_line": 940,
      "end_line": 945,
      "comment": "\n     * Flushes this output stream and forces any buffered output bytes\n     * to be written out to the stream.\n     *\n     * @exception  IOException  if an I/O error occurs.\n     ",
      "child_ranges": [
        "(line 942,col 9)-(line 944,col 9)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "LFH_SIG"
      ],
      "begin_line": 953,
      "end_line": 953,
      "comment": "\n     * local file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DD_SIG"
      ],
      "begin_line": 957,
      "end_line": 957,
      "comment": "\n     * data descriptor signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CFH_SIG"
      ],
      "begin_line": 961,
      "end_line": 961,
      "comment": "\n     * central file header signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "EOCD_SIG"
      ],
      "begin_line": 965,
      "end_line": 965,
      "comment": "\n     * end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_SIG"
      ],
      "begin_line": 969,
      "end_line": 969,
      "comment": "\n     * ZIP64 end of central dir signature\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP64_EOCD_LOC_SIG"
      ],
      "begin_line": 973,
      "end_line": 973,
      "comment": "\n     * ZIP64 end of central dir locator signature\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.deflate()",
      "begin_line": 979,
      "end_line": 981,
      "comment": "\n     * Writes next block of compressed data to the output stream.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 988,
      "end_line": 990,
      "comment": "\n     * Writes the local file header entry\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean)",
      "begin_line": 992,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 64)",
        "(line 994,col 9)-(line 994,col 38)",
        "(line 996,col 9)-(line 998,col 9)",
        "(line 1000,col 9)-(line 1000,col 86)",
        "(line 1001,col 9)-(line 1001,col 72)",
        "(line 1002,col 9)-(line 1002,col 42)",
        "(line 1003,col 9)-(line 1003,col 65)",
        "(line 1004,col 9)-(line 1004,col 34)",
        "(line 1005,col 9)-(line 1005,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createLocalFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, boolean, boolean)",
      "begin_line": 1009,
      "end_line": 1073,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 50)",
        "(line 1012,col 9)-(line 1012,col 59)",
        "(line 1013,col 9)-(line 1013,col 62)",
        "(line 1014,col 9)-(line 1014,col 35)",
        "(line 1016,col 9)-(line 1016,col 65)",
        "(line 1019,col 9)-(line 1019,col 45)",
        "(line 1021,col 9)-(line 1025,col 9)",
        "(line 1027,col 9)-(line 1027,col 109)",
        "(line 1028,col 9)-(line 1028,col 54)",
        "(line 1031,col 9)-(line 1031,col 52)",
        "(line 1033,col 9)-(line 1033,col 80)",
        "(line 1036,col 9)-(line 1042,col 9)",
        "(line 1046,col 9)-(line 1061,col 9)",
        "(line 1063,col 9)-(line 1063,col 59)",
        "(line 1066,col 9)-(line 1066,col 61)",
        "(line 1069,col 9)-(line 1069,col 95)",
        "(line 1071,col 9)-(line 1071,col 85)",
        "(line 1072,col 9)-(line 1072,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.addUnicodeExtraFields(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, boolean, java.nio.ByteBuffer)",
      "begin_line": 1081,
      "end_line": 1109,
      "comment": "\n     * Adds UnicodeExtra fields for name and file comment if mode is\n     * ALWAYS or the data cannot be encoded using the configured\n     * encoding.\n     ",
      "child_ranges": [
        "(line 1084,col 9)-(line 1091,col 9)",
        "(line 1093,col 9)-(line 1093,col 38)",
        "(line 1094,col 9)-(line 1108,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeDataDescriptor(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1116,
      "end_line": 1129,
      "comment": "\n     * Writes the data descriptor entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1117,col 9)-(line 1119,col 9)",
        "(line 1120,col 9)-(line 1120,col 29)",
        "(line 1121,col 9)-(line 1121,col 52)",
        "(line 1122,col 9)-(line 1128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1139,
      "end_line": 1142,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte and {@link Zip64Mode #setUseZip64} is {@link\n     * Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 63)",
        "(line 1141,col 9)-(line 1141,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1144,
      "end_line": 1164,
      "comment": "",
      "child_ranges": [
        "(line 1146,col 9)-(line 1146,col 47)",
        "(line 1147,col 9)-(line 1150,col 44)",
        "(line 1152,col 9)-(line 1158,col 9)",
        "(line 1161,col 9)-(line 1161,col 57)",
        "(line 1163,col 9)-(line 1163,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, long, boolean)",
      "begin_line": 1173,
      "end_line": 1251,
      "comment": "\n     * Writes the central file header entry.\n     * @param ze the entry to write\n     * @param name The encoded name\n     * @param lfhOffset Local file header offset for this file\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 53)",
        "(line 1178,col 9)-(line 1178,col 38)",
        "(line 1179,col 9)-(line 1181,col 9)",
        "(line 1183,col 9)-(line 1183,col 64)",
        "(line 1184,col 9)-(line 1184,col 59)",
        "(line 1185,col 9)-(line 1185,col 70)",
        "(line 1186,col 9)-(line 1186,col 75)",
        "(line 1187,col 9)-(line 1187,col 35)",
        "(line 1189,col 9)-(line 1189,col 65)",
        "(line 1193,col 9)-(line 1194,col 49)",
        "(line 1196,col 9)-(line 1196,col 45)",
        "(line 1197,col 9)-(line 1197,col 70)",
        "(line 1198,col 9)-(line 1198,col 101)",
        "(line 1199,col 9)-(line 1199,col 99)",
        "(line 1202,col 9)-(line 1202,col 52)",
        "(line 1206,col 9)-(line 1206,col 80)",
        "(line 1211,col 9)-(line 1211,col 50)",
        "(line 1212,col 9)-(line 1219,col 9)",
        "(line 1221,col 9)-(line 1221,col 59)",
        "(line 1224,col 9)-(line 1224,col 61)",
        "(line 1226,col 9)-(line 1226,col 61)",
        "(line 1229,col 9)-(line 1229,col 70)",
        "(line 1232,col 9)-(line 1232,col 82)",
        "(line 1235,col 9)-(line 1235,col 81)",
        "(line 1238,col 9)-(line 1238,col 71)",
        "(line 1241,col 9)-(line 1241,col 94)",
        "(line 1243,col 9)-(line 1243,col 55)",
        "(line 1244,col 9)-(line 1244,col 66)",
        "(line 1246,col 9)-(line 1246,col 51)",
        "(line 1249,col 9)-(line 1249,col 98)",
        "(line 1250,col 9)-(line 1250,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean)",
      "begin_line": 1257,
      "end_line": 1275,
      "comment": "\n     * If the entry needs Zip64 extra information inside the central\n     * directory then configure its data.\n     ",
      "child_ranges": [
        "(line 1259,col 9)-(line 1274,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeCentralDirectoryEnd()",
      "begin_line": 1284,
      "end_line": 1317,
      "comment": "\n     * Writes the \u0026quot;End of central dir record\u0026quot;.\n     * @throws IOException on error\n     * @throws Zip64RequiredException if the archive\u0027s size exceeds 4\n     * GByte or there are more than 65535 entries inside the archive\n     * and {@link Zip64Mode #setUseZip64} is {@link Zip64Mode#Never}.\n     ",
      "child_ranges": [
        "(line 1285,col 9)-(line 1285,col 31)",
        "(line 1288,col 9)-(line 1288,col 27)",
        "(line 1289,col 9)-(line 1289,col 27)",
        "(line 1292,col 9)-(line 1292,col 45)",
        "(line 1293,col 9)-(line 1297,col 9)",
        "(line 1298,col 9)-(line 1301,col 9)",
        "(line 1303,col 9)-(line 1304,col 68)",
        "(line 1305,col 9)-(line 1305,col 26)",
        "(line 1306,col 9)-(line 1306,col 26)",
        "(line 1309,col 9)-(line 1309,col 72)",
        "(line 1310,col 9)-(line 1310,col 72)",
        "(line 1313,col 9)-(line 1313,col 59)",
        "(line 1314,col 9)-(line 1314,col 53)",
        "(line 1315,col 9)-(line 1315,col 49)",
        "(line 1316,col 9)-(line 1316,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory()",
      "begin_line": 1325,
      "end_line": 1385,
      "comment": "\n     * Writes the \u0026quot;ZIP64 End of central dir record\u0026quot; and\n     * \u0026quot;ZIP64 End of central dir locator\u0026quot;.\n     * @throws IOException on error\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1326,col 9)-(line 1328,col 9)",
        "(line 1330,col 9)-(line 1335,col 9)",
        "(line 1337,col 9)-(line 1339,col 9)",
        "(line 1341,col 9)-(line 1341,col 62)",
        "(line 1343,col 9)-(line 1343,col 33)",
        "(line 1346,col 9)-(line 1355,col 30)",
        "(line 1358,col 9)-(line 1358,col 55)",
        "(line 1359,col 9)-(line 1359,col 55)",
        "(line 1362,col 9)-(line 1362,col 24)",
        "(line 1363,col 9)-(line 1363,col 24)",
        "(line 1366,col 9)-(line 1366,col 66)",
        "(line 1367,col 9)-(line 1367,col 22)",
        "(line 1368,col 9)-(line 1368,col 22)",
        "(line 1371,col 9)-(line 1371,col 57)",
        "(line 1372,col 9)-(line 1372,col 57)",
        "(line 1377,col 9)-(line 1377,col 37)",
        "(line 1380,col 9)-(line 1380,col 24)",
        "(line 1382,col 9)-(line 1382,col 55)",
        "(line 1384,col 9)-(line 1384,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[])",
      "begin_line": 1392,
      "end_line": 1394,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1393,col 9)-(line 1393,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeOut(byte[], int, int)",
      "begin_line": 1404,
      "end_line": 1407,
      "comment": "\n     * Write bytes to output or random access file.\n     * @param data the byte array to write\n     * @param offset the start position to write from\n     * @param length the number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1406,col 9)-(line 1406,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getGeneralPurposeBits(int, boolean)",
      "begin_line": 1410,
      "end_line": 1417,
      "comment": "",
      "child_ranges": [
        "(line 1411,col 9)-(line 1411,col 54)",
        "(line 1412,col 9)-(line 1412,col 54)",
        "(line 1413,col 9)-(line 1415,col 9)",
        "(line 1416,col 9)-(line 1416,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.versionNeededToExtract(int, boolean)",
      "begin_line": 1419,
      "end_line": 1428,
      "comment": "",
      "child_ranges": [
        "(line 1420,col 9)-(line 1422,col 9)",
        "(line 1425,col 9)-(line 1427,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.isDeflatedToOutputStream(int)",
      "begin_line": 1430,
      "end_line": 1432,
      "comment": "",
      "child_ranges": [
        "(line 1431,col 9)-(line 1431,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 1446,
      "end_line": 1453,
      "comment": "\n     * Creates a new zip entry taking some information from the given\n     * file and using the provided name.\n     *\n     * \u003cp\u003eThe name will be adjusted to end with a forward slash \"/\" if\n     * the file is a directory.  If the file is not a directory a\n     * potential trailing forward slash will be stripped from the\n     * entry name.\u003c/p\u003e\n     *\n     * \u003cp\u003eMust not be used if the stream has already been closed.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1449,col 9)-(line 1451,col 9)",
        "(line 1452,col 9)-(line 1452,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1461,
      "end_line": 1485,
      "comment": "\n     * Get the existing ZIP64 extended information extra field or\n     * create a new one and add it to the entry.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1463,col 9)-(line 1465,col 9)",
        "(line 1466,col 9)-(line 1466,col 28)",
        "(line 1467,col 9)-(line 1470,col 41)",
        "(line 1471,col 9)-(line 1479,col 9)",
        "(line 1482,col 9)-(line 1482,col 37)",
        "(line 1484,col 9)-(line 1484,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.hasZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1493,
      "end_line": 1497,
      "comment": "\n     * Is there a ZIP64 extended information extra field for the\n     * entry?\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1494,col 9)-(line 1496,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEffectiveZip64Mode(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1506,
      "end_line": 1514,
      "comment": "\n     * If the mode is AsNeeded and the entry is a compressed entry of\n     * unknown size that gets written to a non-seekable stream the\n     * change the default to Never.\n     *\n     * @since 1.3\n     ",
      "child_ranges": [
        "(line 1507,col 9)-(line 1512,col 9)",
        "(line 1513,col 9)-(line 1513,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getEntryEncoding(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1516,
      "end_line": 1520,
      "comment": "",
      "child_ranges": [
        "(line 1517,col 9)-(line 1517,col 64)",
        "(line 1518,col 9)-(line 1519,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.getName(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1522,
      "end_line": 1524,
      "comment": "",
      "child_ranges": [
        "(line 1523,col 9)-(line 1523,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.destroy()",
      "begin_line": 1533,
      "end_line": 1540,
      "comment": "\n     * Closes the underlying stream/file without finishing the\n     * archive, the result will likely be a corrupt archive.\n     *\n     * \u003cp\u003eThis method only exists to support tests that generate\n     * corrupt archives so they can clean up any temporary files.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 1534,col 9)-(line 1536,col 9)",
        "(line 1537,col 9)-(line 1539,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UnicodeExtraFieldPolicy",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1546,
      "end_line": 1570,
      "comment": "\n     * enum that represents the possible policies for creating Unicode\n     * extra fields.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ALWAYS"
      ],
      "begin_line": 1550,
      "end_line": 1550,
      "comment": "\n         * Always create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NEVER"
      ],
      "begin_line": 1554,
      "end_line": 1554,
      "comment": "\n         * Never create Unicode extra fields.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "NOT_ENCODEABLE"
      ],
      "begin_line": 1559,
      "end_line": 1560,
      "comment": "\n         * Create Unicode extra fields for filenames that cannot be\n         * encoded using the specified encoding.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 1562,
      "end_line": 1562,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.UnicodeExtraFieldPolicy(java.lang.String)",
      "begin_line": 1563,
      "end_line": 1565,
      "comment": "",
      "child_ranges": [
        "(line 1564,col 13)-(line 1564,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.UnicodeExtraFieldPolicy.toString()",
      "begin_line": 1566,
      "end_line": 1569,
      "comment": "",
      "child_ranges": [
        "(line 1568,col 13)-(line 1568,col 24)"
      ]
    },
    {
      "type": "class_interface",
      "name": "CurrentEntry",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 1576,
      "end_line": 1611,
      "comment": "\n     * Structure collecting information for the entry that is\n     * currently being written.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.CurrentEntry.CurrentEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 1577,
      "end_line": 1579,
      "comment": "",
      "child_ranges": [
        "(line 1578,col 13)-(line 1578,col 31)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "entry"
      ],
      "begin_line": 1583,
      "end_line": 1583,
      "comment": "\n         * Current ZIP entry.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "localDataStart"
      ],
      "begin_line": 1588,
      "end_line": 1588,
      "comment": "\n         * Offset for CRC entry in the local file header data for the\n         * current entry starts here.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "dataStart"
      ],
      "begin_line": 1592,
      "end_line": 1592,
      "comment": "\n         * Data for local header data\n         "
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 1597,
      "end_line": 1597,
      "comment": "\n         * Number of bytes read for the current entry (can\u0027t rely on\n         * Deflater#getBytesRead) when using DEFLATED.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "causedUseOfZip64"
      ],
      "begin_line": 1601,
      "end_line": 1601,
      "comment": "\n         * Whether current entry was the first one using ZIP64 features.\n         "
    },
    {
      "type": "field",
      "varNames": [
        "hasWritten"
      ],
      "begin_line": 1610,
      "end_line": 1610,
      "comment": "\n         * Whether write() has been called at all.\n         *\n         * \u003cp\u003eIn order to create a valid archive {@link\n         * #closeArchiveEntry closeArchiveEntry} will write an empty\n         * array to get the CRC right if nothing has been written to\n         * the stream at all.\u003c/p\u003e\n         "
    }
  ]
}