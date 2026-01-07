{
  "filepath": "/tmp/Compress-3b/src/main/java/org/apache/commons/compress/changes/ChangeSetPerformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetPerformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 176,
      "comment": "\n * Performs ChangeSet operations on a stream.\n * This class is thread safe and can be used multiple times.\n * It operates on a copy of the ChangeSet. If the ChangeSet changes,\n * a new Performer must be created.\n * \n * @ThreadSafe\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "changes"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ChangeSetPerformer(org.apache.commons.compress.changes.ChangeSet)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Constructs a ChangeSetPerformer with the changes from this ChangeSet\n     * @param changeSet the ChangeSet which operations are used for performing\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.perform(org.apache.commons.compress.archivers.ArchiveInputStream, org.apache.commons.compress.archivers.ArchiveOutputStream)",
      "begin_line": 64,
      "end_line": 127,
      "comment": "\n     * Performs all changes collected in this ChangeSet on the input stream and\n     * streams the result to the output stream. Perform may be called more than once.\n     * \n     * @param in\n     *            the InputStream to perform the changes on\n     * @param out\n     *            the resulting OutputStream with all modifications\n     * @throws IOException\n     *             if an read/write error occurs\n     * @return the results of this operation\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 58)",
        "(line 68,col 9)-(line 68,col 52)",
        "(line 70,col 9)-(line 78,col 9)",
        "(line 80,col 9)-(line 80,col 34)",
        "(line 81,col 9)-(line 111,col 9)",
        "(line 114,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater(java.util.Set, org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 138,
      "end_line": 156,
      "comment": "\n     * Checks if an ArchiveEntry is deleted later in the ChangeSet. This is\n     * necessary if an file is added with this ChangeSet, but later became\n     * deleted in the same set.\n     * \n     * @param entry\n     *            the entry to check\n     * @return true, if this entry has an deletion change later, false otherwise\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 40)",
        "(line 141,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.copyStream(java.io.InputStream, org.apache.commons.compress.archivers.ArchiveOutputStream, org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 170,
      "end_line": 175,
      "comment": "\n     * Copies the ArchiveEntry to the Output stream\n     * \n     * @param in\n     *            the stream to read the data from\n     * @param out\n     *            the stream to write the data to\n     * @param entry\n     *            the entry to write\n     * @throws IOException\n     *             if data cannot be read or written\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 35)",
        "(line 173,col 9)-(line 173,col 30)",
        "(line 174,col 9)-(line 174,col 32)"
      ]
    }
  ]
}