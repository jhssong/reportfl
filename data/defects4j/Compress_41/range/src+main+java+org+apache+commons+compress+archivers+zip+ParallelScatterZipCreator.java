{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/archivers/zip/ParallelScatterZipCreator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParallelScatterZipCreator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 264,
      "comment": "\n * Creates a zip in parallel by using multiple threadlocal {@link ScatterZipOutputStream} instances.\n * \u003cp\u003e\n * Note that this class generally makes no guarantees about the order of things written to\n * the output file. Things that need to come in a specific order (manifests, directories)\n * must be handled by the client of this class, usually by writing these things to the\n * {@link ZipArchiveOutputStream} \u003cem\u003ebefore\u003c/em\u003e calling {@link #writeTo writeTo} on this class.\u003c/p\u003e\n * \u003cp\u003e\n * The client can supply an {@link java.util.concurrent.ExecutorService}, but for reasons of\n * memory model consistency, this will be shut down by this class prior to completion.\n * \u003c/p\u003e\n * @since 1.10\n "
    },
    {
      "type": "field",
      "varNames": [
        "streams"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "es"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "backingStoreSupplier"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "futures"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "startedAt"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressionDoneAt"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "scatterDoneAt"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "DefaultBackingStoreSupplier",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier"
      ],
      "begin_line": 64,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "storeNum"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.DefaultBackingStoreSupplier.get()",
      "begin_line": 67,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 69,col 13)-(line 69,col 107)",
        "(line 70,col 13)-(line 70,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.createDeferred(org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier)",
      "begin_line": 74,
      "end_line": 79,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 85)",
        "(line 77,col 9)-(line 77,col 94)",
        "(line 78,col 9)-(line 78,col 50)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "tlScatterStreams"
      ],
      "begin_line": 81,
      "end_line": 92,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.Anonymous-4c4668e4-f459-40d6-a28a-61ba217bb4c1.initialValue()",
      "begin_line": 82,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 90,col 13)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.ParallelScatterZipCreator()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Create a ParallelScatterZipCreator with default threads, which is set to the number of available\n     * processors, as defined by {@link java.lang.Runtime#availableProcessors}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 87)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.ParallelScatterZipCreator(java.util.concurrent.ExecutorService)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Create a ParallelScatterZipCreator\n     *\n     * @param executorService The executorService to use for parallel scheduling. For technical reasons,\n     *                        this will be shut down by this class.\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 65)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.ParallelScatterZipCreator(java.util.concurrent.ExecutorService, org.apache.commons.compress.parallel.ScatterGatherBackingStoreSupplier)",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     * Create a ParallelScatterZipCreator\n     *\n     * @param executorService The executorService to use. For technical reasons, this will be shut down\n     *                        by this class.\n     * @param backingStoreSupplier The supplier of backing store which shall be used\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 57)",
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.addArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.parallel.InputStreamSupplier)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.addArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Adds an archive entry to this archive.\n     * \u003cp\u003e\n     * This method is expected to be called from a single client thread\n     * \u003c/p\u003e\n     *\n     * @param zipArchiveEntryRequestSupplier Should supply the entry to be added.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.submit(java.util.concurrent.Callable\u003cjava.lang.Object\u003e)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * Submit a callable for compression.\n     *\n     * @see ParallelScatterZipCreator#createCallable for details of if/when to use this.\n     *\n     * @param callable The callable to run, created by {@link #createCallable createCallable}, possibly wrapped by caller.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.createCallable(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.parallel.InputStreamSupplier)",
      "begin_line": 181,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 55)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 116)",
        "(line 187,col 9)-(line 193,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.Anonymous-c3d177f8-c493-4dea-b627-46a47ba2c7c5.call()",
      "begin_line": 188,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 190,col 17)-(line 190,col 79)",
        "(line 191,col 17)-(line 191,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.createCallable(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier)",
      "begin_line": 212,
      "end_line": 220,
      "comment": "\n     * Create a callable that will compress archive entry supplied by {@link ZipArchiveEntryRequestSupplier}.\n     *\n     * \u003cp\u003eThis method is expected to be called from a single client thread.\u003c/p\u003e\n     *\n     * The same as {@link #createCallable(ZipArchiveEntry, InputStreamSupplier)}, but the archive entry\n     * to be added is supplied by a {@link ZipArchiveEntryRequestSupplier}.\n     *\n     * @see #createCallable(ZipArchiveEntry, InputStreamSupplier)\n     *\n     * @param zipArchiveEntryRequestSupplier Should supply the entry to be added.\n     * @return A callable that should subsequently passed to #submit, possibly in a wrapped/adapted from. The\n     * value of this callable is not used, but any exceptions happening inside the compression\n     * will be propagated through the callable.\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 219,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.Anonymous-285b1489-a9a3-4965-b0f5-5e8038d810fa.call()",
      "begin_line": 214,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 216,col 17)-(line 216,col 93)",
        "(line 217,col 17)-(line 217,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.writeTo(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 234,
      "end_line": 254,
      "comment": "\n     * Write the contents this to the target {@link ZipArchiveOutputStream}.\n     * \u003cp\u003e\n     * It may be beneficial to write things like directories and manifest files to the targetStream\n     * before calling this method.\n     * \u003c/p\u003e\n     *\n     * @param targetStream The {@link ZipArchiveOutputStream} to receive the contents of the scatter streams\n     * @throws IOException          If writing fails\n     * @throws InterruptedException If we get interrupted\n     * @throws ExecutionException   If something happens in the parallel execution\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 22)",
        "(line 243,col 9)-(line 243,col 57)",
        "(line 246,col 9)-(line 246,col 55)",
        "(line 248,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.getStatisticsMessage()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns a message describing the overall statistics of the compression run\n     *\n     * @return A string\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 103)"
      ]
    }
  ]
}