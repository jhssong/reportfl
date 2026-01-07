{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/changes/ChangeSetPerformer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ChangeSetPerformer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 44,
      "end_line": 283,
      "comment": "\n * Performs ChangeSet operations on a stream.\n * This class is thread safe and can be used multiple times.\n * It operates on a copy of the ChangeSet. If the ChangeSet changes,\n * a new Performer must be created.\n * \n * @ThreadSafe\n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "changes"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ChangeSetPerformer(org.apache.commons.compress.changes.ChangeSet)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * Constructs a ChangeSetPerformer with the changes from this ChangeSet\n     * @param changeSet the ChangeSet which operations are used for performing\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.perform(org.apache.commons.compress.archivers.ArchiveInputStream, org.apache.commons.compress.archivers.ArchiveOutputStream)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * Performs all changes collected in this ChangeSet on the input stream and\n     * streams the result to the output stream. Perform may be called more than once.\n     * \n     * This method finishes the stream, no other entries should be added\n     * after that.\n     * \n     * @param in\n     *            the InputStream to perform the changes on\n     * @param out\n     *            the resulting OutputStream with all modifications\n     * @throws IOException\n     *             if an read/write error occurs\n     * @return the results of this operation\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.perform(org.apache.commons.compress.archivers.zip.ZipFile, org.apache.commons.compress.archivers.ArchiveOutputStream)",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * Performs all changes collected in this ChangeSet on the ZipFile and\n     * streams the result to the output stream. Perform may be called more than once.\n     * \n     * This method finishes the stream, no other entries should be added\n     * after that.\n     * \n     * @param in\n     *            the ZipFile to perform the changes on\n     * @param out\n     *            the resulting OutputStream with all modifications\n     * @throws IOException\n     *             if an read/write error occurs\n     * @return the results of this operation\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.perform(org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator, org.apache.commons.compress.archivers.ArchiveOutputStream)",
      "begin_line": 111,
      "end_line": 176,
      "comment": "\n     * Performs all changes collected in this ChangeSet on the input entries and\n     * streams the result to the output stream.\n     * \n     * This method finishes the stream, no other entries should be added\n     * after that.\n     * \n     * @param entryIterator\n     *            the entries to perform the changes on\n     * @param out\n     *            the resulting OutputStream with all modifications\n     * @throws IOException\n     *             if an read/write error occurs\n     * @return the results of this operation\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 64)",
        "(line 116,col 9)-(line 116,col 68)",
        "(line 118,col 9)-(line 126,col 9)",
        "(line 128,col 9)-(line 160,col 9)",
        "(line 163,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 21)",
        "(line 175,col 9)-(line 175,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.isDeletedLater(java.util.Set\u003corg.apache.commons.compress.changes.Change\u003e, org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 187,
      "end_line": 204,
      "comment": "\n     * Checks if an ArchiveEntry is deleted later in the ChangeSet. This is\n     * necessary if an file is added with this ChangeSet, but later became\n     * deleted in the same set.\n     * \n     * @param entry\n     *            the entry to check\n     * @return true, if this entry has an deletion change later, false otherwise\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 46)",
        "(line 190,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.copyStream(java.io.InputStream, org.apache.commons.compress.archivers.ArchiveOutputStream, org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 218,
      "end_line": 223,
      "comment": "\n     * Copies the ArchiveEntry to the Output stream\n     * \n     * @param in\n     *            the stream to read the data from\n     * @param out\n     *            the stream to write the data to\n     * @param entry\n     *            the entry to write\n     * @throws IOException\n     *             if data cannot be read or written\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 35)",
        "(line 221,col 9)-(line 221,col 30)",
        "(line 222,col 9)-(line 222,col 32)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ArchiveEntryIterator",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 234,
      "end_line": 238,
      "comment": "\n     * Used in perform to abstract out getting entries and streams for\n     * those entries.\n     *\n     * \u003cp\u003eIterator#hasNext is not allowed to throw exceptions that\u0027s\n     * why we can\u0027t use Iterator\u0026lt;ArchiveEntry\u0026gt; directly -\n     * otherwise we\u0027d need to convert exceptions thrown in\n     * ArchiveInputStream#getNextEntry.\u003c/p\u003e\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator.hasNext()",
      "begin_line": 235,
      "end_line": 235,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator.next()",
      "begin_line": 236,
      "end_line": 236,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator.getInputStream()",
      "begin_line": 237,
      "end_line": 237,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "class_interface",
      "name": "ArchiveInputStreamIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator"
      ],
      "begin_line": 240,
      "end_line": 259,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 242,
      "end_line": 242,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "next"
      ],
      "begin_line": 243,
      "end_line": 243,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveInputStreamIterator.ArchiveInputStreamIterator(org.apache.commons.compress.archivers.ArchiveInputStream)",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 13)-(line 245,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveInputStreamIterator.hasNext()",
      "begin_line": 247,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 13)-(line 249,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveInputStreamIterator.next()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 13)-(line 253,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveInputStreamIterator.getInputStream()",
      "begin_line": 255,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 13)-(line 257,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ZipFileIterator",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.changes.ChangeSetPerformer.ArchiveEntryIterator"
      ],
      "begin_line": 261,
      "end_line": 282,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 263,
      "end_line": 263,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "nestedEnum"
      ],
      "begin_line": 264,
      "end_line": 264,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "current"
      ],
      "begin_line": 265,
      "end_line": 265,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ZipFileIterator.ZipFileIterator(org.apache.commons.compress.archivers.zip.ZipFile)",
      "begin_line": 266,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 267,col 13)-(line 267,col 25)",
        "(line 268,col 13)-(line 268,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ZipFileIterator.hasNext()",
      "begin_line": 270,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 13)-(line 272,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ZipFileIterator.next()",
      "begin_line": 274,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 13)-(line 276,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.changes.ChangeSetPerformer.ZipFileIterator.getInputStream()",
      "begin_line": 278,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 13)-(line 280,col 46)"
      ]
    }
  ]
}