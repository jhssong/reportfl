{
  "filepath": "/tmp/Cli-21b/src/test/org/apache/commons/cli2/application/LsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "LsTest",
      "is_interface": false,
      "parent_types": [
        "junit.framework.TestCase"
      ],
      "begin_line": 128,
      "end_line": 224,
      "comment": "\n * \u003cp\u003eTest the \u003ccode\u003els\u003c/code\u003e command. Duplicated Option types are not\n * tested e.g. -a and -d are the same Option type.\u003c/p\u003e\n *\n * \u003cp\u003eThe following is the man output for \u0027ls\u0027. See\n * \u003ca href\u003d\"http://www.rt.com/man/ls.1.html\"\u003ehttp://www.rt.com/man/ls.1.html\u003c/a\u003e.\u003c/p\u003e\n *\n * \u003cpre\u003e\n *  LS(1) FSF LS(1)\n *\n *  NAME ls - list directory contents\n *\n *  SYNOPSIS ls [OPTION]... [FILE]...\n *\n *  DESCRIPTION List information about the FILEs (the current directory by default). Sort entries alphabetically if none of -cftuSUX nor --sort.\n *\n *  -a, --all do not hide entries starting with .\n *\n *  -A, --almost-all do not list implied . and ..\n *\n *  -b, --escape print octal escapes for nongraphic characters\n *\n *  --block-size\u003dSIZE use SIZE-byte blocks\n *\n *  -B, --ignore-backups do not list implied entries ending with ~ -c sort by change time; with -l: show ctime -C list entries by columns\n *\n *  --color[\u003dWHEN] control whether color is used to distinguish file types. WHEN may be `never\u0027, `always\u0027, or `auto\u0027\n *\n *  -d, --directory list directory entries instead of contents\n *\n *  -D, --dired generate output designed for Emacs\u0027 dired mode -f do not sort, enable -aU, disable -lst\n *\n *  -F, --classify append indicator (one of /\u003d@|*) to entries\n *\n *  --format\u003dWORD across -x, commas -m, horizontal -x, long -l, sin- gle-column -1, verbose -l, vertical -C\n *\n *  --full-time list both full date and full time -g (ignored)\n *\n *  -G, --no-group inhibit display of group information\n *\n *  -h, --human-readable print sizes in human readable format (e.g., 1K 234M 2G)\n *\n *  -H, --si likewise, but use powers of 1000 not 1024\n *\n *  --indicator-style\u003dWORD append indicator with style WORD to entry names: none (default), classify (-F), file-type (-p)\n *\n *  -i, --inode print index number of each file\n *\n *  -I, --ignore\u003dPATTERN do not list implied entries matching shell PATTERN\n *\n *  -k, --kilobytes like --block-size\u003d1024 -l use a long listing format\n *\n *  -L, --dereference list entries pointed to by symbolic links -m fill width with a comma separated list of entries\n *\n *  -n, --numeric-uid-gid list numeric UIDs and GIDs instead of names\n *\n *  -N, --literal print raw entry names (don\u0027t treat e.g. control characters specially) -o use long listing format without group info\n *\n *  -p, --file-type append indicator (one of /\u003d@|) to entries\n *\n *  -q, --hide-control-chars print ? instead of non graphic characters\n *\n *  --show-control-chars show non graphic characters as-is (default)\n *\n *  -Q, --quote-name enclose entry names in double quotes\n *\n *  --quoting-style\u003dWORD use quoting style WORD for entry names: literal, shell, shell-always, c, escape\n *\n *  -r, --reverse reverse order while sorting\n *\n *  -R, --recursive list subdirectories recursively\n *\n *  -s, --size print size of each file, in blocks -S sort by file size\n *\n *  --sort\u003dWORD extension -X, none -U, size -S, time -t, version -v status -c, time -t, atime -u, access -u, use -u\n *\n *  --time\u003dWORD show time as WORD instead of modification time: atime, access, use, ctime or status; use specified time as sort key if --sort\u003dtime -t sort by modification time\n *\n *  -T, --tabsize\u003dCOLS assume tab stops at each COLS instead of 8 -u sort by last access time; with -l: show atime -U do not sort; list entries in directory order -v sort by version\n *\n *  -w, --width\u003dCOLS assume screen width instead of current value -x list entries by lines instead of by columns -X sort alphabetically by entry extension -1 list one file per line\n *\n *  --help display this help and exit\n *\n *  --version output version information and exit\n *\n *  By default, color is not used to distinguish types of files. That is equivalent to using --color\u003dnone. Using the --color option without the optional WHEN argument is equivalent to using --color\u003dalways. With --color\u003dauto, color codes are output only if standard output is con- nected to a terminal (tty).\n * \u003c/pre\u003e\n *\n * @author Rob Oxspring\n * @author John Keyes\n "
    },
    {
      "type": "field",
      "varNames": [
        "oBuilder"
      ],
      "begin_line": 131,
      "end_line": 132,
      "comment": " Option Builder "
    },
    {
      "type": "field",
      "varNames": [
        "aBuilder"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Argument Builder "
    },
    {
      "type": "field",
      "varNames": [
        "gBuilder"
      ],
      "begin_line": 138,
      "end_line": 138,
      "comment": " Group Builder "
    },
    {
      "type": "field",
      "varNames": [
        "options"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.application.LsTest.suite()",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 43)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.cli2.application.LsTest.LsTest(java.lang.String)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Required ctor.\n     *\n     * @param name\n     *            the name of the TestCase\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.application.LsTest.setUp()",
      "begin_line": 156,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 157,col 9)-(line 210,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.cli2.application.LsTest.testLs()",
      "begin_line": 213,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 216,col 33)",
        "(line 217,col 9)-(line 218,col 78)",
        "(line 220,col 9)-(line 220,col 51)",
        "(line 221,col 9)-(line 221,col 58)",
        "(line 222,col 9)-(line 222,col 56)"
      ]
    }
  ]
}