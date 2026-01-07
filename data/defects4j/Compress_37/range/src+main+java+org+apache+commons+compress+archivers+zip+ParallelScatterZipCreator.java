{
  "filepath": "/tmp/Compress-37b/src/main/java/org/apache/commons/compress/archivers/zip/ParallelScatterZipCreator.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ParallelScatterZipCreator",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 54,
      "end_line": 226,
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
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.Anonymous-c9c74fb2-ecaa-4205-a47b-f68d66275810.initialValue()",
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
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.submit(java.util.concurrent.Callable\u003cjava.lang.Object\u003e)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Submit a callable for compression.\n     *\n     * @see ParallelScatterZipCreator#createCallable for details of if/when to use this.\n     *\n     * @param callable The callable to run, created by {@link #createCallable createCallable}, possibly wrapped by caller.\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.createCallable(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, org.apache.commons.compress.parallel.InputStreamSupplier)",
      "begin_line": 168,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 55)",
        "(line 170,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 116)",
        "(line 174,col 9)-(line 180,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.Anonymous-39bcbebc-8c42-43d2-847c-63825164f555.call()",
      "begin_line": 175,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 177,col 17)-(line 177,col 79)",
        "(line 178,col 17)-(line 178,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.writeTo(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream)",
      "begin_line": 196,
      "end_line": 216,
      "comment": "\n     * Write the contents this to the target {@link ZipArchiveOutputStream}.\n     * \u003cp\u003e\n     * It may be beneficial to write things like directories and manifest files to the targetStream\n     * before calling this method.\n     * \u003c/p\u003e\n     *\n     * @param targetStream The {@link ZipArchiveOutputStream} to receive the contents of the scatter streams\n     * @throws IOException          If writing fails\n     * @throws InterruptedException If we get interrupted\n     * @throws ExecutionException   If something happens in the parallel execution\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 202,col 9)",
        "(line 204,col 9)-(line 204,col 22)",
        "(line 205,col 9)-(line 205,col 57)",
        "(line 208,col 9)-(line 208,col 55)",
        "(line 210,col 9)-(line 213,col 9)",
        "(line 215,col 9)-(line 215,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ParallelScatterZipCreator.getStatisticsMessage()",
      "begin_line": 223,
      "end_line": 225,
      "comment": "\n     * Returns a message describing the overall statistics of the compression run\n     *\n     * @return A string\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 103)"
      ]
    }
  ]
}