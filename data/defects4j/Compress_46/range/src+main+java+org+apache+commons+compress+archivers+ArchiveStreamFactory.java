{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveStreamProvider"
      ],
      "begin_line": 89,
      "end_line": 592,
      "comment": "\n * Factory to create Archive[In|Out]putStreams from names or the first bytes of\n * the InputStream. In order to add other implementations, you should extend\n * ArchiveStreamFactory and override the appropriate methods (and call their\n * implementation from super of course).\n * \n * Compressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d Files.newOutputStream(output.toPath());\n * ArchiveOutputStream os \u003d new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);\n *\n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test1.xml\"));\n * IOUtils.copy(Files.newInputStream(file1.toPath()), os);\n * os.closeArchiveEntry();\n *\n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test2.xml\"));\n * IOUtils.copy(Files.newInputStream(file2.toPath()), os);\n * os.closeArchiveEntry();\n * os.close();\n * \u003c/pre\u003e\n *\n * Decompressing a ZIP-File:\n *\n * \u003cpre\u003e\n * final InputStream is \u003d Files.newInputStream(input.toPath());\n * ArchiveInputStream in \u003d new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, is);\n * ZipArchiveEntry entry \u003d (ZipArchiveEntry)in.getNextEntry();\n * OutputStream out \u003d Files.newOutputStream(dir.toPath().resolve(entry.getName()));\n * IOUtils.copy(in, out);\n * out.close();\n * in.close();\n * \u003c/pre\u003e\n * @Immutable provided that the deprecated method setEntryEncoding is not used.\n * @ThreadSafe even if the deprecated method setEntryEncoding is used\n "
    },
    {
      "type": "field",
      "varNames": [
        "TAR_HEADER_SIZE"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DUMP_SIGNATURE_SIZE"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SIGNATURE_SIZE"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SINGLETON"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "AR"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * Constant (value {@value}) used to identify the AR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ARJ"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Constant (value {@value}) used to identify the ARJ archive format.\n     * Not supported as an output stream type.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CPIO"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Constant (value {@value}) used to identify the CPIO archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DUMP"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Constant (value {@value}) used to identify the Unix DUMP archive format.\n     * Not supported as an output stream type.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAR"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Constant (value {@value}) used to identify the JAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAR"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * Constant used to identify the TAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Constant (value {@value}) used to identify the ZIP archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SEVEN_Z"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": "\n     * Constant (value {@value}) used to identify the 7z archive format.\n     * @since 1.8\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * Entry encoding, null for the platform default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entryEncoding"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": "\n     * Entry encoding, null for the default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "archiveInputStreamProviders"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archiveOutputStreamProviders"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.findArchiveStreamProviders()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 9)-(line 164,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.putAll(java.util.Set\u003cjava.lang.String\u003e, org.apache.commons.compress.archivers.ArchiveStreamProvider, java.util.TreeMap\u003cjava.lang.String, org.apache.commons.compress.archivers.ArchiveStreamProvider\u003e)",
      "begin_line": 167,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 171,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.serviceLoaderIterator()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.toKey(java.lang.String)",
      "begin_line": 178,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.findAvailableArchiveInputStreamProviders()",
      "begin_line": 209,
      "end_line": 221,
      "comment": "\n     * Constructs a new sorted map from input stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 220,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.Anonymous-d5ee5b2a-6e04-483f-a622-95401bb3dbc2.run()",
      "begin_line": 211,
      "end_line": 219,
      "comment": "",
      "child_ranges": [
        "(line 213,col 17)-(line 213,col 77)",
        "(line 214,col 17)-(line 214,col 79)",
        "(line 215,col 17)-(line 217,col 17)",
        "(line 218,col 17)-(line 218,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.findAvailableArchiveOutputStreamProviders()",
      "begin_line": 250,
      "end_line": 262,
      "comment": "\n     * Constructs a new sorted map from output stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 261,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.Anonymous-1df396e9-3a78-4210-a959-f55fc41739b8.run()",
      "begin_line": 252,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 254,col 17)-(line 254,col 77)",
        "(line 255,col 17)-(line 255,col 80)",
        "(line 256,col 17)-(line 258,col 17)",
        "(line 259,col 17)-(line 259,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.ArchiveStreamFactory()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Create an instance using the platform default encoding.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.ArchiveStreamFactory(java.lang.String)",
      "begin_line": 278,
      "end_line": 283,
      "comment": "\n     * Create an instance using the specified encoding.\n     *\n     * @param encoding the encoding to be used.\n     *\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 16)",
        "(line 280,col 9)-(line 280,col 33)",
        "(line 282,col 9)-(line 282,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getEntryEncoding()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Returns the encoding to use for arj, jar, zip, dump, cpio and tar\n     * files, or null for the archiver default.\n     *\n     * @return entry encoding, or null for the archiver default\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.setEntryEncoding(java.lang.String)",
      "begin_line": 305,
      "end_line": 312,
      "comment": "\n     * Sets the encoding to use for arj, jar, zip, dump, cpio and tar files. Use null for the archiver default.\n     *\n     * @param entryEncoding the entry encoding, null uses the archiver default.\n     * @since 1.5\n     * @deprecated 1.10 use {@link #ArchiveStreamFactory(String)} to specify the encoding\n     * @throws IllegalStateException if the constructor {@link #ArchiveStreamFactory(String)}\n     * was used to specify the factory encoding.\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 326,
      "end_line": 329,
      "comment": "\n     * Creates an archive input stream from an archiver name and an input stream.\n     *\n     * @param archiverName the archive name,\n     * i.e. {@value #AR}, {@value #ARJ}, {@value #ZIP}, {@value #TAR}, {@value #JAR}, {@value #CPIO}, {@value #DUMP} or {@value #SEVEN_Z}\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * read from a stream\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream, java.lang.String)",
      "begin_line": 331,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 381,col 9)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 118)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 391,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 406,
      "end_line": 409,
      "comment": "\n     * Creates an archive output stream from an archiver name and an output stream.\n     *\n     * @param archiverName the archive name,\n     * i.e. {@value #AR}, {@value #ZIP}, {@value #TAR}, {@value #JAR} or {@value #CPIO}\n     * @param out the output stream\n     * @return the archive output stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * written to a stream\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream, java.lang.String)",
      "begin_line": 411,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 422,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 454,col 119)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 459,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.io.InputStream)",
      "begin_line": 474,
      "end_line": 477,
      "comment": "\n     * Create an archive input stream from an input stream, autodetecting\n     * the archive type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     *\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * read from a stream\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.detect(java.io.InputStream)",
      "begin_line": 486,
      "end_line": 564,
      "comment": "\n     * Try to determine the type of Archiver\n     * @param in input stream\n     * @return type of archiver if found\n     * @throws ArchiveException if an archiver cannot be detected in the stream\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 489,col 9)",
        "(line 491,col 9)-(line 493,col 9)",
        "(line 495,col 9)-(line 495,col 58)",
        "(line 496,col 9)-(line 496,col 34)",
        "(line 497,col 9)-(line 497,col 33)",
        "(line 498,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 517,col 9)",
        "(line 520,col 9)-(line 520,col 61)",
        "(line 521,col 9)-(line 521,col 32)",
        "(line 522,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 530,col 9)",
        "(line 533,col 9)-(line 533,col 59)",
        "(line 534,col 9)-(line 534,col 34)",
        "(line 535,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 543,col 9)",
        "(line 546,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getArchiveInputStreamProviders()",
      "begin_line": 566,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getArchiveOutputStreamProviders()",
      "begin_line": 574,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 575,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getInputStreamArchiveNames()",
      "begin_line": 582,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getOutputStreamArchiveNames()",
      "begin_line": 587,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 65)"
      ]
    }
  ]
}