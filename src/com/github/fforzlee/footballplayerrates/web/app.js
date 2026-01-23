/**
 * Liverpool FC 2025/2026 Player Stats
 * JavaScript Application (Enhanced with player photos, age, market value)
 */

// Player Data - 2025/2026 Season Statistics with additional info
const players = [
    // Goalkeepers
    {
        name: "Alisson Becker", number: 1, position: "goalkeeper",
        nationality: "巴西", nationalityCode: "BR",
        age: 33, marketValue: "35M",
        appearances: 17, goals: 0, assists: 0, cleanSheets: 6, saves: 34,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p116535.png"
    },
    {
        name: "Giorgi Mamardashvili", number: 13, position: "goalkeeper",
        nationality: "格鲁吉亚", nationalityCode: "GE",
        age: 24, marketValue: "40M",
        appearances: 11, goals: 0, assists: 0, cleanSheets: 2, saves: 25,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p493105.png"
    },

    // Defenders
    {
        name: "Virgil van Dijk", number: 4, position: "defender",
        nationality: "荷兰", nationalityCode: "NL",
        age: 34, marketValue: "35M",
        appearances: 22, goals: 2, assists: 0,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p97032.png"
    },
    {
        name: "Joe Gomez", number: 12, position: "defender",
        nationality: "英格兰", nationalityCode: "GB-ENG",
        age: 28, marketValue: "38M",
        appearances: 18, goals: 0, assists: 1,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p171314.png"
    },
    {
        name: "Ibrahima Konaté", number: 5, position: "defender",
        nationality: "法国", nationalityCode: "FR",
        age: 26, marketValue: "70M",
        appearances: 20, goals: 1, assists: 0,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p221820.png"
    },
    {
        name: "Andy Robertson", number: 26, position: "defender",
        nationality: "苏格兰", nationalityCode: "GB-SCT",
        age: 31, marketValue: "28M",
        appearances: 19, goals: 0, assists: 4,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p122798.png"
    },
    {
        name: "Conor Bradley", number: 66, position: "defender",
        nationality: "北爱尔兰", nationalityCode: "GB-NIR",
        age: 21, marketValue: "25M",
        appearances: 15, goals: 1, assists: 3,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p493747.png"
    },
    {
        name: "Jeremie Frimpong", number: 2, position: "defender",
        nationality: "荷兰", nationalityCode: "NL",
        age: 24, marketValue: "50M",
        appearances: 16, goals: 2, assists: 5,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p451340.png"
    },
    {
        name: "Milos Kerkez", number: 3, position: "defender",
        nationality: "匈牙利", nationalityCode: "HU",
        age: 21, marketValue: "45M",
        appearances: 14, goals: 0, assists: 2,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p542519.png"
    },

    // Midfielders
    {
        name: "Florian Wirtz", number: 14, position: "midfielder",
        nationality: "德国", nationalityCode: "DE",
        age: 22, marketValue: "130M",
        appearances: 21, goals: 3, assists: 1,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p491516.png"
    },
    {
        name: "Alexis Mac Allister", number: 10, position: "midfielder",
        nationality: "阿根廷", nationalityCode: "AR",
        age: 26, marketValue: "85M",
        appearances: 21, goals: 0, assists: 2,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p225321.png"
    },
    {
        name: "Dominik Szoboszlai", number: 8, position: "midfielder",
        nationality: "匈牙利", nationalityCode: "HU",
        age: 25, marketValue: "70M",
        appearances: 29, goals: 2, assists: 1,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p448344.png"
    },
    {
        name: "Ryan Gravenberch", number: 38, position: "midfielder",
        nationality: "荷兰", nationalityCode: "NL",
        age: 23, marketValue: "55M",
        appearances: 20, goals: 4, assists: 0,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p463281.png"
    },
    {
        name: "Curtis Jones", number: 17, position: "midfielder",
        nationality: "英格兰", nationalityCode: "GB-ENG",
        age: 24, marketValue: "40M",
        appearances: 18, goals: 2, assists: 3,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p210775.png"
    },
    {
        name: "Wataru Endo", number: 25, position: "midfielder",
        nationality: "日本", nationalityCode: "JP",
        age: 32, marketValue: "18M",
        appearances: 12, goals: 0, assists: 1,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p219498.png"
    },

    // Forwards
    {
        name: "Mohamed Salah", number: 11, position: "forward",
        nationality: "埃及", nationalityCode: "EG",
        age: 33, marketValue: "55M",
        appearances: 14, goals: 4, assists: 3,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p118748.png"
    },
    {
        name: "Alexander Isak", number: 9, position: "forward",
        nationality: "瑞典", nationalityCode: "SE",
        age: 26, marketValue: "110M",
        appearances: 10, goals: 2, assists: 1,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p219168.png"
    },
    {
        name: "Hugo Ekitike", number: 7, position: "forward",
        nationality: "法国", nationalityCode: "FR",
        age: 23, marketValue: "42M",
        appearances: 19, goals: 8, assists: 2,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p489290.png"
    },
    {
        name: "Cody Gakpo", number: 18, position: "forward",
        nationality: "荷兰", nationalityCode: "NL",
        age: 26, marketValue: "65M",
        appearances: 20, goals: 5, assists: 2,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p222728.png"
    },
    {
        name: "Federico Chiesa", number: 19, position: "forward",
        nationality: "意大利", nationalityCode: "IT",
        age: 28, marketValue: "30M",
        appearances: 8, goals: 1, assists: 1,
        photo: "https://resources.premierleague.com/premierleague/photos/players/250x250/p202565.png"
    }
];

// Country flag emoji mapping
const flagEmojis = {
    "BR": "🇧🇷", "GE": "🇬🇪", "NL": "🇳🇱", "GB-ENG": "🏴󠁧󠁢󠁥󠁮󠁧󠁿",
    "FR": "🇫🇷", "GB-SCT": "🏴󠁧󠁢󠁳󠁣󠁴󠁿", "GB-NIR": "🇬🇧", "HU": "🇭🇺",
    "DE": "🇩🇪", "AR": "🇦🇷", "JP": "🇯🇵", "EG": "🇪🇬",
    "SE": "🇸🇪", "IT": "🇮🇹"
};

// Position labels
const positionLabels = {
    goalkeeper: { zh: "门将", en: "Goalkeeper" },
    defender: { zh: "后卫", en: "Defender" },
    midfielder: { zh: "中场", en: "Midfielder" },
    forward: { zh: "前锋", en: "Forward" }
};

// Initialize app when DOM is ready
document.addEventListener('DOMContentLoaded', () => {
    initTabs();
    renderAllPlayers();
    renderRankings();
});

// Tab Navigation
function initTabs() {
    const tabs = document.querySelectorAll('.tab');

    tabs.forEach(tab => {
        tab.addEventListener('click', () => {
            tabs.forEach(t => t.classList.remove('active'));
            tab.classList.add('active');
            const targetId = tab.dataset.tab;
            showSection(targetId);
        });
    });
}

function showSection(sectionId) {
    const sections = document.querySelectorAll('.section');
    sections.forEach(s => s.classList.remove('active'));

    const targetSection = document.getElementById(sectionId);
    if (targetSection) {
        targetSection.classList.add('active');

        if (['forwards', 'midfielders', 'defenders', 'goalkeepers'].includes(sectionId)) {
            renderPositionSection(sectionId);
        }
    }
}

// Render all players by position
function renderAllPlayers() {
    renderPlayersByPosition('forward', 'forwards-list');
    renderPlayersByPosition('midfielder', 'midfielders-list');
    renderPlayersByPosition('defender', 'defenders-list');
    renderPlayersByPosition('goalkeeper', 'goalkeepers-list');
}

function renderPlayersByPosition(position, containerId) {
    const container = document.getElementById(containerId);
    if (!container) return;

    const filteredPlayers = players.filter(p => p.position === position);
    container.innerHTML = filteredPlayers.map(player => createPlayerCard(player)).join('');
}

function renderPositionSection(sectionId) {
    const section = document.getElementById(sectionId);
    if (!section) return;

    const positionMap = {
        forwards: 'forward',
        midfielders: 'midfielder',
        defenders: 'defender',
        goalkeepers: 'goalkeeper'
    };

    const position = positionMap[sectionId];
    const filteredPlayers = players.filter(p => p.position === position);
    const label = positionLabels[position];

    section.innerHTML = `
        <div class="position-group">
            <h2 class="position-title">
                <span class="position-icon">${getPositionIcon(position)}</span>
                ${label.zh} ${label.en}
            </h2>
            <div class="players-grid">
                ${filteredPlayers.map(player => createPlayerCard(player)).join('')}
            </div>
        </div>
    `;
}

function getPositionIcon(position) {
    const icons = {
        forward: '⚡',
        midfielder: '🎯',
        defender: '🛡️',
        goalkeeper: '🧤'
    };
    return icons[position] || '⚽';
}

function getFlag(code) {
    return flagEmojis[code] || '🏳️';
}

// Create player card HTML with jersey number avatar, age, market value
function createPlayerCard(player) {
    const isGoalkeeper = player.position === 'goalkeeper';
    const cardClass = isGoalkeeper ? 'player-card goalkeeper' : 'player-card';

    const stats = isGoalkeeper
        ? `
            <div class="stat-item">
                <div class="stat-value">${player.appearances}</div>
                <div class="stat-label">出场</div>
            </div>
            <div class="stat-item">
                <div class="stat-value">${player.cleanSheets}</div>
                <div class="stat-label">零封</div>
            </div>
            <div class="stat-item">
                <div class="stat-value">${player.saves}</div>
                <div class="stat-label">扑救</div>
            </div>
        `
        : `
            <div class="stat-item">
                <div class="stat-value">${player.appearances}</div>
                <div class="stat-label">出场</div>
            </div>
            <div class="stat-item">
                <div class="stat-value">${player.goals}</div>
                <div class="stat-label">进球</div>
            </div>
            <div class="stat-item">
                <div class="stat-value">${player.assists}</div>
                <div class="stat-label">助攻</div>
            </div>
        `;

    return `
        <div class="${cardClass}">
            <div class="player-avatar-section">
                <div class="player-avatar">
                    <span class="avatar-number">${player.number}</span>
                </div>
            </div>
            <div class="player-info">
                <div class="player-header">
                    <span class="player-name">${player.name}</span>
                </div>
                <div class="player-meta">
                    <span class="player-nationality">${getFlag(player.nationalityCode)} ${player.nationality}</span>
                    <span class="player-age">${player.age}岁</span>
                </div>
                <div class="player-value">💰 €${player.marketValue}</div>
                <div class="player-stats">
                    ${stats}
                </div>
            </div>
        </div>
    `;
}

// Render Rankings
function renderRankings() {
    renderTopScorers();
    renderTopAssisters();
    renderTopContributors();
}

function renderTopScorers() {
    const container = document.getElementById('scorers-list');
    if (!container) return;

    const outfieldPlayers = players.filter(p => p.position !== 'goalkeeper');
    const topScorers = [...outfieldPlayers]
        .sort((a, b) => b.goals - a.goals)
        .slice(0, 5);

    container.innerHTML = topScorers.map((player, index) =>
        createRankingItem(player, index + 1, player.goals, '球')
    ).join('');
}

function renderTopAssisters() {
    const container = document.getElementById('assisters-list');
    if (!container) return;

    const outfieldPlayers = players.filter(p => p.position !== 'goalkeeper');
    const topAssisters = [...outfieldPlayers]
        .sort((a, b) => b.assists - a.assists)
        .slice(0, 5);

    container.innerHTML = topAssisters.map((player, index) =>
        createRankingItem(player, index + 1, player.assists, '次')
    ).join('');
}

function renderTopContributors() {
    const container = document.getElementById('contributors-list');
    if (!container) return;

    const outfieldPlayers = players.filter(p => p.position !== 'goalkeeper');
    const topContributors = [...outfieldPlayers]
        .map(p => ({ ...p, contributions: p.goals + p.assists }))
        .sort((a, b) => b.contributions - a.contributions)
        .slice(0, 5);

    container.innerHTML = topContributors.map((player, index) =>
        createRankingItem(player, index + 1, player.contributions, '次')
    ).join('');
}

function createRankingItem(player, rank, stat, unit) {
    const isGoalkeeper = player.position === 'goalkeeper';
    const badgeClass = isGoalkeeper ? 'ranking-badge goalkeeper' : 'ranking-badge';

    return `
        <div class="ranking-item">
            <div class="ranking-position">${rank}</div>
            <div class="${badgeClass}">
                <span class="badge-number">${player.number}</span>
            </div>
            <div class="ranking-info">
                <div class="ranking-name">${player.name}</div>
                <div class="ranking-position-text">${getFlag(player.nationalityCode)} ${positionLabels[player.position].zh}</div>
            </div>
            <div class="ranking-stat">${stat}${unit}</div>
        </div>
    `;
}
