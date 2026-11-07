;
        rec(0, 0, "", word, list);
        return list;
    }

    static void rec(int ind, int count, String res, String word, List<String> list) {
        if (ind == word.length()) {
            if (count > 0) {
                res += count;
            }
            list.add(res);
            return;
        }

        rec(ind + 1, count + 1, res, word, list);

        if (count > 0) {
            res += count;
        }

        rec(ind + 1, 0, res + word.charAt(ind), word, list);
    }
}
